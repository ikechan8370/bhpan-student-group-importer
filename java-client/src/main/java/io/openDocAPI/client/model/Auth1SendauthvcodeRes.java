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
 * Auth1SendauthvcodeRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Auth1SendauthvcodeRes {
  @SerializedName("authway")
  private String authway = null;

  @SerializedName("sendinterval")
  private Long sendinterval = null;

  @SerializedName("isduplicatesended")
  private Boolean isduplicatesended = null;

  public Auth1SendauthvcodeRes authway(String authway) {
    this.authway = authway;
    return this;
  }

   /**
   * 用户手机号
   * @return authway
  **/
  @Schema(required = true, description = "用户手机号")
  public String getAuthway() {
    return authway;
  }

  public void setAuthway(String authway) {
    this.authway = authway;
  }

  public Auth1SendauthvcodeRes sendinterval(Long sendinterval) {
    this.sendinterval = sendinterval;
    return this;
  }

   /**
   * 短信发送验证码的间隔（单位/秒）
   * @return sendinterval
  **/
  @Schema(required = true, description = "短信发送验证码的间隔（单位/秒）")
  public Long getSendinterval() {
    return sendinterval;
  }

  public void setSendinterval(Long sendinterval) {
    this.sendinterval = sendinterval;
  }

  public Auth1SendauthvcodeRes isduplicatesended(Boolean isduplicatesended) {
    this.isduplicatesended = isduplicatesended;
    return this;
  }

   /**
   * 是否重复发送了 true表示在时间间隔内重复发送了 false表示未重复发送
   * @return isduplicatesended
  **/
  @Schema(required = true, description = "是否重复发送了 true表示在时间间隔内重复发送了 false表示未重复发送")
  public Boolean isIsduplicatesended() {
    return isduplicatesended;
  }

  public void setIsduplicatesended(Boolean isduplicatesended) {
    this.isduplicatesended = isduplicatesended;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1SendauthvcodeRes auth1SendauthvcodeRes = (Auth1SendauthvcodeRes) o;
    return Objects.equals(this.authway, auth1SendauthvcodeRes.authway) &&
        Objects.equals(this.sendinterval, auth1SendauthvcodeRes.sendinterval) &&
        Objects.equals(this.isduplicatesended, auth1SendauthvcodeRes.isduplicatesended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authway, sendinterval, isduplicatesended);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1SendauthvcodeRes {\n");
    
    sb.append("    authway: ").append(toIndentedString(authway)).append("\n");
    sb.append("    sendinterval: ").append(toIndentedString(sendinterval)).append("\n");
    sb.append("    isduplicatesended: ").append(toIndentedString(isduplicatesended)).append("\n");
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
