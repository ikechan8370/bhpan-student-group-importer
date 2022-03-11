package co.d201.bhpanconnect.utils;

import io.openDocAPI.client.ApiClient;
import io.openDocAPI.client.ApiException;
import io.openDocAPI.client.Configuration;
import io.openDocAPI.client.api.DefaultApi;
import io.openDocAPI.client.model.Auth1GetnewReq;
import io.openDocAPI.client.model.Auth1GetnewRes;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;
import org.apache.tomcat.util.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

@UtilityClass
public class AnyshareUtils {
    /**
     * 一些群组权限
     */
    public Long none = 0x00000000L;
    public Long show = 0x00000001L;
    public Long preview = 0x00000002L;
    public Long download = 0x00000004L;
    public Long create = 0x00000008L;
    public Long edit = 0x00000010L;
    public Long delete = 0x00000020L;
    public Long copy = 0x00000040L;

    /**
     * 获取anyshare api instance
     * @param username 用户名
     * @param password 未加密的密码
     * @return api instance
     * @throws NoSuchPaddingException
     * @throws IllegalBlockSizeException
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws BadPaddingException
     * @throws InvalidKeyException
     * @throws ApiException
     */
    public DefaultApi getApiInstance(String username, String password) throws NoSuchPaddingException, IllegalBlockSizeException, IOException, NoSuchAlgorithmException, InvalidKeySpecException, BadPaddingException, InvalidKeyException, ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient().setBasePath("https://bhpan.buaa.edu.cn/api/v1");
        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Auth1GetnewReq body = new Auth1GetnewReq().account(username).password(encryptPassword(password));
        Auth1GetnewRes result = apiInstance.auth1GetnewPost(body);
        defaultClient.setAccessToken(result.getTokenid());
        return apiInstance;
    }

    /**
     * 加密密码，anyshare默认登录对密码要求加密，要求"采用rsa加密的RSA_PKCS1_PADDING填充，并将加密的结果base64编码。"
     * @param rawPassword 原始的未加密密码
     * @return 加密后的密码
     * @throws IOException
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    private String encryptPassword(String rawPassword) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        // 这个公钥来自学校网盘官网
        InputStream inputStream = AnyshareUtils.class.getClassLoader().getResourceAsStream("anyshare_pub.key");
//        InputStream inputStream = new ClassPathResource("/anyshare_pub.key").getInputStream();
        String pubKeyStr = StreamUtils.copyToString(inputStream, Charset.defaultCharset());
        String publicKeyPEM = pubKeyStr
                .replace("-----BEGIN PUBLIC KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace("-----END PUBLIC KEY-----", "");
        byte[] encoded = Base64.decodeBase64(publicKeyPEM);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(encoded);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").
                generatePublic(x509EncodedKeySpec);
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", new BouncyCastleProvider());
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        byte[] bytes = cipher.doFinal(rawPassword.getBytes(StandardCharsets.UTF_8));
        return Base64.encodeBase64String(bytes);
    }
}
