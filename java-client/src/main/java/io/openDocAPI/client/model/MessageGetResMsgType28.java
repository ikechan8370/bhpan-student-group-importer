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
 * MessageGetResMsgType28
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class MessageGetResMsgType28 extends MessageGetResMsgBase {
  @SerializedName("duedate")
  private Long duedate = null;

  @SerializedName("remindcontent")
  private String remindcontent = null;

  public MessageGetResMsgType28 duedate(Long duedate) {
    this.duedate = duedate;
    return this;
  }

   /**
   * 到期时间
   * @return duedate
  **/
  @Schema(required = true, description = "到期时间")
  public Long getDuedate() {
    return duedate;
  }

  public void setDuedate(Long duedate) {
    this.duedate = duedate;
  }

  public MessageGetResMsgType28 remindcontent(String remindcontent) {
    this.remindcontent = remindcontent;
    return this;
  }

   /**
   * 消息内容
   * @return remindcontent
  **/
  @Schema(required = true, description = "消息内容")
  public String getRemindcontent() {
    return remindcontent;
  }

  public void setRemindcontent(String remindcontent) {
    this.remindcontent = remindcontent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType28 messageGetResMsgType28 = (MessageGetResMsgType28) o;
    return Objects.equals(this.duedate, messageGetResMsgType28.duedate) &&
        Objects.equals(this.remindcontent, messageGetResMsgType28.remindcontent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duedate, remindcontent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType28 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    remindcontent: ").append(toIndentedString(remindcontent)).append("\n");
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
