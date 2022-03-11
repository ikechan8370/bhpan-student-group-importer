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
 * AuditPublishdocRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class AuditPublishdocRes {
  @SerializedName("applyid")
  private String applyid = null;

  @SerializedName("audittype")
  private Long audittype = null;

  @SerializedName("result")
  private String result = null;

  public AuditPublishdocRes applyid(String applyid) {
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

  public AuditPublishdocRes audittype(Long audittype) {
    this.audittype = audittype;
    return this;
  }

   /**
   * 流程审核模式
   * @return audittype
  **/
  @Schema(required = true, description = "流程审核模式")
  public Long getAudittype() {
    return audittype;
  }

  public void setAudittype(Long audittype) {
    this.audittype = audittype;
  }

  public AuditPublishdocRes result(String result) {
    this.result = result;
    return this;
  }

   /**
   * 操作结果
   * @return result
  **/
  @Schema(required = true, description = "操作结果")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditPublishdocRes auditPublishdocRes = (AuditPublishdocRes) o;
    return Objects.equals(this.applyid, auditPublishdocRes.applyid) &&
        Objects.equals(this.audittype, auditPublishdocRes.audittype) &&
        Objects.equals(this.result, auditPublishdocRes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyid, audittype, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditPublishdocRes {\n");
    
    sb.append("    applyid: ").append(toIndentedString(applyid)).append("\n");
    sb.append("    audittype: ").append(toIndentedString(audittype)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
