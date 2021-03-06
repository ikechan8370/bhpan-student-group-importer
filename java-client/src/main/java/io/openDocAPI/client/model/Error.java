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
 * 如果接口调用返回的http状态码为非200系列，则表示发生异常，会返回错误码信息，具体参见错误码说明章节
 */
@Schema(description = "如果接口调用返回的http状态码为非200系列，则表示发生异常，会返回错误码信息，具体参见错误码说明章节")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Error {
  @SerializedName("errcode")
  private Long errcode = null;

  @SerializedName("errmsg")
  private String errmsg = null;

  @SerializedName("causemsg")
  private String causemsg = null;

  public Error errcode(Long errcode) {
    this.errcode = errcode;
    return this;
  }

   /**
   * 错误码
   * @return errcode
  **/
  @Schema(required = true, description = "错误码")
  public Long getErrcode() {
    return errcode;
  }

  public void setErrcode(Long errcode) {
    this.errcode = errcode;
  }

  public Error errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 错误描述，与错误码对应
   * @return errmsg
  **/
  @Schema(required = true, description = "错误描述，与错误码对应")
  public String getErrmsg() {
    return errmsg;
  }

  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  public Error causemsg(String causemsg) {
    this.causemsg = causemsg;
    return this;
  }

   /**
   * 错误原因，底层错误信息，仅用于研发排错，客户端不应使用此字段内容
   * @return causemsg
  **/
  @Schema(required = true, description = "错误原因，底层错误信息，仅用于研发排错，客户端不应使用此字段内容")
  public String getCausemsg() {
    return causemsg;
  }

  public void setCausemsg(String causemsg) {
    this.causemsg = causemsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errcode, error.errcode) &&
        Objects.equals(this.errmsg, error.errmsg) &&
        Objects.equals(this.causemsg, error.causemsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errcode, errmsg, causemsg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errcode: ").append(toIndentedString(errcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    causemsg: ").append(toIndentedString(causemsg)).append("\n");
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
