/*
 * 6.0-OpenDoc_API-文档访问
 * API to access AnyShare    如有任何疑问，可到开发者社区提问：https://developers.aishu.cn  # Authentication  - 调用需要鉴权的API，必须将token放在HTTP header中：\"Authorization: Bearer ACCESS_TOKEN\"  - 对于GET请求，除了将token放在HTTP header中，也可以将token放在URL query string中：\"tokenid=ACCESS_TOKEN\"  
 *
 * OpenAPI spec version: 6.0.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.openDocAPI.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.openDocAPI.client.model.Auth1ExtloginclientReqDeviceinfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Auth1ExtloginclientReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Auth1ExtloginclientReq {
  @SerializedName("account")
  private String account = null;

  @SerializedName("appid")
  private String appid = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("deviceinfo")
  private Auth1ExtloginclientReqDeviceinfo deviceinfo = null;

  public Auth1ExtloginclientReq account(String account) {
    this.account = account;
    return this;
  }

   /**
   * 用户登录账号（不能使用admin登录）
   * @return account
  **/
  @Schema(required = true, description = "用户登录账号（不能使用admin登录）")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Auth1ExtloginclientReq appid(String appid) {
    this.appid = appid;
    return this;
  }

   /**
   * 爱数分配给第三方系统的应用id
   * @return appid
  **/
  @Schema(required = true, description = "爱数分配给第三方系统的应用id")
  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public Auth1ExtloginclientReq key(String key) {
    this.key = key;
    return this;
  }

   /**
   * 组合appid，appkey，account后进行md5算法后得到（不区分大小写）  例如：  appid&#x3D;eisoo  appkey&#x3D;ae217ce4-bf33-11e9-aa67-665056af7572  account&#x3D;xiaoming  key&#x3D;md5(eisooae217ce4-bf33-11e9-aa67-665056af7572xiaoming)
   * @return key
  **/
  @Schema(required = true, description = "组合appid，appkey，account后进行md5算法后得到（不区分大小写）  例如：  appid=eisoo  appkey=ae217ce4-bf33-11e9-aa67-665056af7572  account=xiaoming  key=md5(eisooae217ce4-bf33-11e9-aa67-665056af7572xiaoming)")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Auth1ExtloginclientReq deviceinfo(Auth1ExtloginclientReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
    return this;
  }

   /**
   * Get deviceinfo
   * @return deviceinfo
  **/
  @Schema(description = "")
  public Auth1ExtloginclientReqDeviceinfo getDeviceinfo() {
    return deviceinfo;
  }

  public void setDeviceinfo(Auth1ExtloginclientReqDeviceinfo deviceinfo) {
    this.deviceinfo = deviceinfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1ExtloginclientReq auth1ExtloginclientReq = (Auth1ExtloginclientReq) o;
    return Objects.equals(this.account, auth1ExtloginclientReq.account) &&
        Objects.equals(this.appid, auth1ExtloginclientReq.appid) &&
        Objects.equals(this.key, auth1ExtloginclientReq.key) &&
        Objects.equals(this.deviceinfo, auth1ExtloginclientReq.deviceinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, appid, key, deviceinfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1ExtloginclientReq {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    deviceinfo: ").append(toIndentedString(deviceinfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
