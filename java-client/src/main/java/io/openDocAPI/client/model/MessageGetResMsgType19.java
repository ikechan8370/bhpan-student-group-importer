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
 * MessageGetResMsgType19
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class MessageGetResMsgType19 extends MessageGetResMsgBase {
  @SerializedName("applycsflevel")
  private Long applycsflevel = null;

  public MessageGetResMsgType19 applycsflevel(Long applycsflevel) {
    this.applycsflevel = applycsflevel;
    return this;
  }

   /**
   * 所申请的密级
   * @return applycsflevel
  **/
  @Schema(required = true, description = "所申请的密级")
  public Long getApplycsflevel() {
    return applycsflevel;
  }

  public void setApplycsflevel(Long applycsflevel) {
    this.applycsflevel = applycsflevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType19 messageGetResMsgType19 = (MessageGetResMsgType19) o;
    return Objects.equals(this.applycsflevel, messageGetResMsgType19.applycsflevel) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applycsflevel, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType19 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    applycsflevel: ").append(toIndentedString(applycsflevel)).append("\n");
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
