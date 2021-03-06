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
import java.util.ArrayList;
import java.util.List;
/**
 * AuditGetapprovehistoryResApplyinfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class AuditGetapprovehistoryResApplyinfo {
  @SerializedName("approveindex")
  private Long approveindex = null;

  @SerializedName("auditornames")
  private List<String> auditornames = new ArrayList<String>();

  @SerializedName("audittype")
  private Long audittype = null;

  @SerializedName("csflevel")
  private Long csflevel = null;

  @SerializedName("docname")
  private String docname = null;

  @SerializedName("isdir")
  private Boolean isdir = null;

  @SerializedName("processname")
  private String processname = null;

  @SerializedName("requestdate")
  private Long requestdate = null;

  @SerializedName("requesterName")
  private String requesterName = null;

  @SerializedName("vetoindex")
  private Long vetoindex = null;

  public AuditGetapprovehistoryResApplyinfo approveindex(Long approveindex) {
    this.approveindex = approveindex;
    return this;
  }

   /**
   * 结合auditorname,小于等于该值的表示审批通过的审核员，从0开始
   * @return approveindex
  **/
  @Schema(required = true, description = "结合auditorname,小于等于该值的表示审批通过的审核员，从0开始")
  public Long getApproveindex() {
    return approveindex;
  }

  public void setApproveindex(Long approveindex) {
    this.approveindex = approveindex;
  }

  public AuditGetapprovehistoryResApplyinfo auditornames(List<String> auditornames) {
    this.auditornames = auditornames;
    return this;
  }

  public AuditGetapprovehistoryResApplyinfo addAuditornamesItem(String auditornamesItem) {
    this.auditornames.add(auditornamesItem);
    return this;
  }

   /**
   * 提交审核时，所有能看到该申请记录的审核员的名称  [0, approveindex]表示审核通过的审核员列表，-1表示没有审核员通过  如果vetoindex不为-1，则auditornames[vetoindex]表示否决的审核员  剩下的为未参与审核的
   * @return auditornames
  **/
  @Schema(required = true, description = "提交审核时，所有能看到该申请记录的审核员的名称  [0, approveindex]表示审核通过的审核员列表，-1表示没有审核员通过  如果vetoindex不为-1，则auditornames[vetoindex]表示否决的审核员  剩下的为未参与审核的")
  public List<String> getAuditornames() {
    return auditornames;
  }

  public void setAuditornames(List<String> auditornames) {
    this.auditornames = auditornames;
  }

  public AuditGetapprovehistoryResApplyinfo audittype(Long audittype) {
    this.audittype = audittype;
    return this;
  }

   /**
   * 审核模式  1表示同级审核  2表示汇签审核  3表示逐级审核
   * @return audittype
  **/
  @Schema(required = true, description = "审核模式  1表示同级审核  2表示汇签审核  3表示逐级审核")
  public Long getAudittype() {
    return audittype;
  }

  public void setAudittype(Long audittype) {
    this.audittype = audittype;
  }

  public AuditGetapprovehistoryResApplyinfo csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

   /**
   * 文件密级，5~15，如果是文件夹，则为0
   * @return csflevel
  **/
  @Schema(required = true, description = "文件密级，5~15，如果是文件夹，则为0")
  public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public AuditGetapprovehistoryResApplyinfo docname(String docname) {
    this.docname = docname;
    return this;
  }

   /**
   * 文档名称
   * @return docname
  **/
  @Schema(required = true, description = "文档名称")
  public String getDocname() {
    return docname;
  }

  public void setDocname(String docname) {
    this.docname = docname;
  }

  public AuditGetapprovehistoryResApplyinfo isdir(Boolean isdir) {
    this.isdir = isdir;
    return this;
  }

   /**
   * 是否为文件夹
   * @return isdir
  **/
  @Schema(required = true, description = "是否为文件夹")
  public Boolean isIsdir() {
    return isdir;
  }

  public void setIsdir(Boolean isdir) {
    this.isdir = isdir;
  }

  public AuditGetapprovehistoryResApplyinfo processname(String processname) {
    this.processname = processname;
    return this;
  }

   /**
   * 流程名称
   * @return processname
  **/
  @Schema(required = true, description = "流程名称")
  public String getProcessname() {
    return processname;
  }

  public void setProcessname(String processname) {
    this.processname = processname;
  }

  public AuditGetapprovehistoryResApplyinfo requestdate(Long requestdate) {
    this.requestdate = requestdate;
    return this;
  }

   /**
   * 申请时间（微秒时间戳）
   * @return requestdate
  **/
  @Schema(required = true, description = "申请时间（微秒时间戳）")
  public Long getRequestdate() {
    return requestdate;
  }

  public void setRequestdate(Long requestdate) {
    this.requestdate = requestdate;
  }

  public AuditGetapprovehistoryResApplyinfo requesterName(String requesterName) {
    this.requesterName = requesterName;
    return this;
  }

   /**
   * 申请者名称
   * @return requesterName
  **/
  @Schema(required = true, description = "申请者名称")
  public String getRequesterName() {
    return requesterName;
  }

  public void setRequesterName(String requesterName) {
    this.requesterName = requesterName;
  }

  public AuditGetapprovehistoryResApplyinfo vetoindex(Long vetoindex) {
    this.vetoindex = vetoindex;
    return this;
  }

   /**
   * 结合auditorname，该位置表示否决的人在auditornames中的位置，从0开始，  -1表示没有人否决
   * @return vetoindex
  **/
  @Schema(required = true, description = "结合auditorname，该位置表示否决的人在auditornames中的位置，从0开始，  -1表示没有人否决")
  public Long getVetoindex() {
    return vetoindex;
  }

  public void setVetoindex(Long vetoindex) {
    this.vetoindex = vetoindex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetapprovehistoryResApplyinfo auditGetapprovehistoryResApplyinfo = (AuditGetapprovehistoryResApplyinfo) o;
    return Objects.equals(this.approveindex, auditGetapprovehistoryResApplyinfo.approveindex) &&
        Objects.equals(this.auditornames, auditGetapprovehistoryResApplyinfo.auditornames) &&
        Objects.equals(this.audittype, auditGetapprovehistoryResApplyinfo.audittype) &&
        Objects.equals(this.csflevel, auditGetapprovehistoryResApplyinfo.csflevel) &&
        Objects.equals(this.docname, auditGetapprovehistoryResApplyinfo.docname) &&
        Objects.equals(this.isdir, auditGetapprovehistoryResApplyinfo.isdir) &&
        Objects.equals(this.processname, auditGetapprovehistoryResApplyinfo.processname) &&
        Objects.equals(this.requestdate, auditGetapprovehistoryResApplyinfo.requestdate) &&
        Objects.equals(this.requesterName, auditGetapprovehistoryResApplyinfo.requesterName) &&
        Objects.equals(this.vetoindex, auditGetapprovehistoryResApplyinfo.vetoindex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approveindex, auditornames, audittype, csflevel, docname, isdir, processname, requestdate, requesterName, vetoindex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetapprovehistoryResApplyinfo {\n");
    
    sb.append("    approveindex: ").append(toIndentedString(approveindex)).append("\n");
    sb.append("    auditornames: ").append(toIndentedString(auditornames)).append("\n");
    sb.append("    audittype: ").append(toIndentedString(audittype)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    docname: ").append(toIndentedString(docname)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
    sb.append("    processname: ").append(toIndentedString(processname)).append("\n");
    sb.append("    requestdate: ").append(toIndentedString(requestdate)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
    sb.append("    vetoindex: ").append(toIndentedString(vetoindex)).append("\n");
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
