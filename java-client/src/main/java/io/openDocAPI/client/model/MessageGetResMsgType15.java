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
 * MessageGetResMsgType15
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class MessageGetResMsgType15 extends MessageGetResMsgBase {
  @SerializedName("docaudittype")
  private Long docaudittype = null;

  @SerializedName("previousauditor")
  private String previousauditor = null;

  @SerializedName("processname")
  private String processname = null;

  @SerializedName("requestername")
  private String requestername = null;

  public MessageGetResMsgType15 docaudittype(Long docaudittype) {
    this.docaudittype = docaudittype;
    return this;
  }

   /**
   * 审核模式
   * @return docaudittype
  **/
  @Schema(required = true, description = "审核模式")
  public Long getDocaudittype() {
    return docaudittype;
  }

  public void setDocaudittype(Long docaudittype) {
    this.docaudittype = docaudittype;
  }

  public MessageGetResMsgType15 previousauditor(String previousauditor) {
    this.previousauditor = previousauditor;
    return this;
  }

   /**
   * 上一级审核员名称，如果为“”，表示没有上级审核员
   * @return previousauditor
  **/
  @Schema(required = true, description = "上一级审核员名称，如果为“”，表示没有上级审核员")
  public String getPreviousauditor() {
    return previousauditor;
  }

  public void setPreviousauditor(String previousauditor) {
    this.previousauditor = previousauditor;
  }

  public MessageGetResMsgType15 processname(String processname) {
    this.processname = processname;
    return this;
  }

   /**
   * 文档流程名称
   * @return processname
  **/
  @Schema(required = true, description = "文档流程名称")
  public String getProcessname() {
    return processname;
  }

  public void setProcessname(String processname) {
    this.processname = processname;
  }

  public MessageGetResMsgType15 requestername(String requestername) {
    this.requestername = requestername;
    return this;
  }

   /**
   * 流程申请者名称
   * @return requestername
  **/
  @Schema(required = true, description = "流程申请者名称")
  public String getRequestername() {
    return requestername;
  }

  public void setRequestername(String requestername) {
    this.requestername = requestername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType15 messageGetResMsgType15 = (MessageGetResMsgType15) o;
    return Objects.equals(this.docaudittype, messageGetResMsgType15.docaudittype) &&
        Objects.equals(this.previousauditor, messageGetResMsgType15.previousauditor) &&
        Objects.equals(this.processname, messageGetResMsgType15.processname) &&
        Objects.equals(this.requestername, messageGetResMsgType15.requestername) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docaudittype, previousauditor, processname, requestername, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType15 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    docaudittype: ").append(toIndentedString(docaudittype)).append("\n");
    sb.append("    previousauditor: ").append(toIndentedString(previousauditor)).append("\n");
    sb.append("    processname: ").append(toIndentedString(processname)).append("\n");
    sb.append("    requestername: ").append(toIndentedString(requestername)).append("\n");
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
