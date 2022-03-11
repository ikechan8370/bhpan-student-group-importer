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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Auth1GetbyticketRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Auth1GetbyticketRes {
  @SerializedName("userid")
  private String userid = null;

  @SerializedName("tokenid")
  private String tokenid = null;

  @SerializedName("expires")
  private Long expires = null;

  public Auth1GetbyticketRes userid(String userid) {
    this.userid = userid;
    return this;
  }

   /**
   * 唯一标识用户的ID
   * @return userid
  **/
  @Schema(required = true, description = "唯一标识用户的ID")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public Auth1GetbyticketRes tokenid(String tokenid) {
    this.tokenid = tokenid;
    return this;
  }

   /**
   * 与userid一起验证请求的合法性
   * @return tokenid
  **/
  @Schema(required = true, description = "与userid一起验证请求的合法性")
  public String getTokenid() {
    return tokenid;
  }

  public void setTokenid(String tokenid) {
    this.tokenid = tokenid;
  }

  public Auth1GetbyticketRes expires(Long expires) {
    this.expires = expires;
    return this;
  }

   /**
   * 获取到的token的有效期，单位为秒
   * @return expires
  **/
  @Schema(required = true, description = "获取到的token的有效期，单位为秒")
  public Long getExpires() {
    return expires;
  }

  public void setExpires(Long expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetbyticketRes auth1GetbyticketRes = (Auth1GetbyticketRes) o;
    return Objects.equals(this.userid, auth1GetbyticketRes.userid) &&
        Objects.equals(this.tokenid, auth1GetbyticketRes.tokenid) &&
        Objects.equals(this.expires, auth1GetbyticketRes.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, tokenid, expires);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetbyticketRes {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    tokenid: ").append(toIndentedString(tokenid)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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
