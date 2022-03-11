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
import io.openDocAPI.client.model.MessageGetResMsgBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MessageGetResMsgType23
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class MessageGetResMsgType23 extends MessageGetResMsgBase {
  @SerializedName("antivirusadmin")
  private String antivirusadmin = null;

  @SerializedName("antivirusop")
  private Long antivirusop = null;

  public MessageGetResMsgType23 antivirusadmin(String antivirusadmin) {
    this.antivirusadmin = antivirusadmin;
    return this;
  }

   /**
   * 防病毒管理员
   * @return antivirusadmin
  **/
  @Schema(required = true, description = "防病毒管理员")
  public String getAntivirusadmin() {
    return antivirusadmin;
  }

  public void setAntivirusadmin(String antivirusadmin) {
    this.antivirusadmin = antivirusadmin;
  }

  public MessageGetResMsgType23 antivirusop(Long antivirusop) {
    this.antivirusop = antivirusop;
    return this;
  }

   /**
   * 杀毒类型   1 表示隔离  2表示修复
   * @return antivirusop
  **/
  @Schema(required = true, description = "杀毒类型   1 表示隔离  2表示修复")
  public Long getAntivirusop() {
    return antivirusop;
  }

  public void setAntivirusop(Long antivirusop) {
    this.antivirusop = antivirusop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType23 messageGetResMsgType23 = (MessageGetResMsgType23) o;
    return Objects.equals(this.antivirusadmin, messageGetResMsgType23.antivirusadmin) &&
        Objects.equals(this.antivirusop, messageGetResMsgType23.antivirusop) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antivirusadmin, antivirusop, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType23 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    antivirusadmin: ").append(toIndentedString(antivirusadmin)).append("\n");
    sb.append("    antivirusop: ").append(toIndentedString(antivirusop)).append("\n");
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
