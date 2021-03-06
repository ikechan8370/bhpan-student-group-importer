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
 * AuditApproveReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class AuditApproveReq {
  @SerializedName("applyid")
  private String applyid = null;

  @SerializedName("result")
  private Boolean result = null;

  @SerializedName("msg")
  private String msg = null;

  public AuditApproveReq applyid(String applyid) {
    this.applyid = applyid;
    return this;
  }

   /**
   * 申请记录id
   * @return applyid
  **/
  @Schema(required = true, description = "申请记录id")
  public String getApplyid() {
    return applyid;
  }

  public void setApplyid(String applyid) {
    this.applyid = applyid;
  }

  public AuditApproveReq result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * true表示通过 false表示拒绝 null表示拒绝
   * @return result
  **/
  @Schema(required = true, description = "true表示通过 false表示拒绝 null表示拒绝")
  public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public AuditApproveReq msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * 审核说明
   * @return msg
  **/
  @Schema(required = true, description = "审核说明")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditApproveReq auditApproveReq = (AuditApproveReq) o;
    return Objects.equals(this.applyid, auditApproveReq.applyid) &&
        Objects.equals(this.result, auditApproveReq.result) &&
        Objects.equals(this.msg, auditApproveReq.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyid, result, msg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditApproveReq {\n");
    
    sb.append("    applyid: ").append(toIndentedString(applyid)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
