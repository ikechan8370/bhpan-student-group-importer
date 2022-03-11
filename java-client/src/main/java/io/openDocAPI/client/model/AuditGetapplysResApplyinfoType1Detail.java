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
 * 具体的申请信息，根据apptype，所包含的字段不同
 */
@Schema(description = "具体的申请信息，根据apptype，所包含的字段不同")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class AuditGetapplysResApplyinfoType1Detail {
  @SerializedName("accessorid")
  private String accessorid = null;

  @SerializedName("accessorname")
  private String accessorname = null;

  @SerializedName("accessortype")
  private Long accessortype = null;

  @SerializedName("allowvalue")
  private Long allowvalue = null;

  @SerializedName("denyvalue")
  private Long denyvalue = null;

  @SerializedName("endtime")
  private Long endtime = null;

  @SerializedName("optype")
  private Long optype = null;

  public AuditGetapplysResApplyinfoType1Detail accessorid(String accessorid) {
    this.accessorid = accessorid;
    return this;
  }

   /**
   * 访问者id
   * @return accessorid
  **/
  @Schema(required = true, description = "访问者id")
  public String getAccessorid() {
    return accessorid;
  }

  public void setAccessorid(String accessorid) {
    this.accessorid = accessorid;
  }

  public AuditGetapplysResApplyinfoType1Detail accessorname(String accessorname) {
    this.accessorname = accessorname;
    return this;
  }

   /**
   * 访问者名称
   * @return accessorname
  **/
  @Schema(required = true, description = "访问者名称")
  public String getAccessorname() {
    return accessorname;
  }

  public void setAccessorname(String accessorname) {
    this.accessorname = accessorname;
  }

  public AuditGetapplysResApplyinfoType1Detail accessortype(Long accessortype) {
    this.accessortype = accessortype;
    return this;
  }

   /**
   * 访问者类型
   * @return accessortype
  **/
  @Schema(required = true, description = "访问者类型")
  public Long getAccessortype() {
    return accessortype;
  }

  public void setAccessortype(Long accessortype) {
    this.accessortype = accessortype;
  }

  public AuditGetapplysResApplyinfoType1Detail allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

   /**
   * 允许权限值
   * @return allowvalue
  **/
  @Schema(required = true, description = "允许权限值")
  public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public AuditGetapplysResApplyinfoType1Detail denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

   /**
   * 拒绝的权限值
   * @return denyvalue
  **/
  @Schema(required = true, description = "拒绝的权限值")
  public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }

  public AuditGetapplysResApplyinfoType1Detail endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

   /**
   * 截止时间
   * @return endtime
  **/
  @Schema(required = true, description = "截止时间")
  public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public AuditGetapplysResApplyinfoType1Detail optype(Long optype) {
    this.optype = optype;
    return this;
  }

   /**
   * 权限操作类型  1表示新增  2表示编辑  3表示删除
   * @return optype
  **/
  @Schema(required = true, description = "权限操作类型  1表示新增  2表示编辑  3表示删除")
  public Long getOptype() {
    return optype;
  }

  public void setOptype(Long optype) {
    this.optype = optype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetapplysResApplyinfoType1Detail auditGetapplysResApplyinfoType1Detail = (AuditGetapplysResApplyinfoType1Detail) o;
    return Objects.equals(this.accessorid, auditGetapplysResApplyinfoType1Detail.accessorid) &&
        Objects.equals(this.accessorname, auditGetapplysResApplyinfoType1Detail.accessorname) &&
        Objects.equals(this.accessortype, auditGetapplysResApplyinfoType1Detail.accessortype) &&
        Objects.equals(this.allowvalue, auditGetapplysResApplyinfoType1Detail.allowvalue) &&
        Objects.equals(this.denyvalue, auditGetapplysResApplyinfoType1Detail.denyvalue) &&
        Objects.equals(this.endtime, auditGetapplysResApplyinfoType1Detail.endtime) &&
        Objects.equals(this.optype, auditGetapplysResApplyinfoType1Detail.optype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorid, accessorname, accessortype, allowvalue, denyvalue, endtime, optype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetapplysResApplyinfoType1Detail {\n");
    
    sb.append("    accessorid: ").append(toIndentedString(accessorid)).append("\n");
    sb.append("    accessorname: ").append(toIndentedString(accessorname)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    optype: ").append(toIndentedString(optype)).append("\n");
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
