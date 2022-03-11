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
 * MessageGetResMsgType17
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class MessageGetResMsgType17 extends MessageGetResMsgBase {
  @SerializedName("auditmsg")
  private String auditmsg = null;

  @SerializedName("auditorname")
  private String auditorname = null;

  @SerializedName("auditresult")
  private Boolean auditresult = null;

  @SerializedName("docaudittype")
  private Long docaudittype = null;

  @SerializedName("processname")
  private String processname = null;

  public MessageGetResMsgType17 auditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
    return this;
  }

   /**
   * 审核意见
   * @return auditmsg
  **/
  @Schema(required = true, description = "审核意见")
  public String getAuditmsg() {
    return auditmsg;
  }

  public void setAuditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
  }

  public MessageGetResMsgType17 auditorname(String auditorname) {
    this.auditorname = auditorname;
    return this;
  }

   /**
   * 审核员名字
   * @return auditorname
  **/
  @Schema(required = true, description = "审核员名字")
  public String getAuditorname() {
    return auditorname;
  }

  public void setAuditorname(String auditorname) {
    this.auditorname = auditorname;
  }

  public MessageGetResMsgType17 auditresult(Boolean auditresult) {
    this.auditresult = auditresult;
    return this;
  }

   /**
   * 审核结果 true表示通过 false表示拒绝
   * @return auditresult
  **/
  @Schema(required = true, description = "审核结果 true表示通过 false表示拒绝")
  public Boolean isAuditresult() {
    return auditresult;
  }

  public void setAuditresult(Boolean auditresult) {
    this.auditresult = auditresult;
  }

  public MessageGetResMsgType17 docaudittype(Long docaudittype) {
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

  public MessageGetResMsgType17 processname(String processname) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType17 messageGetResMsgType17 = (MessageGetResMsgType17) o;
    return Objects.equals(this.auditmsg, messageGetResMsgType17.auditmsg) &&
        Objects.equals(this.auditorname, messageGetResMsgType17.auditorname) &&
        Objects.equals(this.auditresult, messageGetResMsgType17.auditresult) &&
        Objects.equals(this.docaudittype, messageGetResMsgType17.docaudittype) &&
        Objects.equals(this.processname, messageGetResMsgType17.processname) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditmsg, auditorname, auditresult, docaudittype, processname, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType17 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
    sb.append("    auditorname: ").append(toIndentedString(auditorname)).append("\n");
    sb.append("    auditresult: ").append(toIndentedString(auditresult)).append("\n");
    sb.append("    docaudittype: ").append(toIndentedString(docaudittype)).append("\n");
    sb.append("    processname: ").append(toIndentedString(processname)).append("\n");
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