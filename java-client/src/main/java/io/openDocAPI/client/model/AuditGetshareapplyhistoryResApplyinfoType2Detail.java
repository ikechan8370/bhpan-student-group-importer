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
public class AuditGetshareapplyhistoryResApplyinfoType2Detail {
  @SerializedName("accessLimit")
  private Long accessLimit = null;

  @SerializedName("auditmsg")
  private String auditmsg = null;

  @SerializedName("endtime")
  private Long endtime = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("optype")
  private Long optype = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("perm")
  private Long perm = null;

  @SerializedName("watermarkConfig")
  private String watermarkConfig = null;

  public AuditGetshareapplyhistoryResApplyinfoType2Detail accessLimit(Long accessLimit) {
    this.accessLimit = accessLimit;
    return this;
  }

   /**
   * 最大访问次数，-1表示不限制
   * @return accessLimit
  **/
  @Schema(required = true, description = "最大访问次数，-1表示不限制")
  public Long getAccessLimit() {
    return accessLimit;
  }

  public void setAccessLimit(Long accessLimit) {
    this.accessLimit = accessLimit;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail auditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
    return this;
  }

   /**
   * 审核说明
   * @return auditmsg
  **/
  @Schema(required = true, description = "审核说明")
  public String getAuditmsg() {
    return auditmsg;
  }

  public void setAuditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail endtime(Long endtime) {
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

  public AuditGetshareapplyhistoryResApplyinfoType2Detail link(String link) {
    this.link = link;
    return this;
  }

   /**
   * 外链唯一标识
   * @return link
  **/
  @Schema(required = true, description = "外链唯一标识")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail optype(Long optype) {
    this.optype = optype;
    return this;
  }

   /**
   * 外链操作类型  1表示新增  2表示编辑
   * @return optype
  **/
  @Schema(required = true, description = "外链操作类型  1表示新增  2表示编辑")
  public Long getOptype() {
    return optype;
  }

  public void setOptype(Long optype) {
    this.optype = optype;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 访问密码
   * @return password
  **/
  @Schema(required = true, description = "访问密码")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail perm(Long perm) {
    this.perm = perm;
    return this;
  }

   /**
   * 外链权限
   * @return perm
  **/
  @Schema(required = true, description = "外链权限")
  public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public AuditGetshareapplyhistoryResApplyinfoType2Detail watermarkConfig(String watermarkConfig) {
    this.watermarkConfig = watermarkConfig;
    return this;
  }

   /**
   * 水印配置信息
   * @return watermarkConfig
  **/
  @Schema(required = true, description = "水印配置信息")
  public String getWatermarkConfig() {
    return watermarkConfig;
  }

  public void setWatermarkConfig(String watermarkConfig) {
    this.watermarkConfig = watermarkConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetshareapplyhistoryResApplyinfoType2Detail auditGetshareapplyhistoryResApplyinfoType2Detail = (AuditGetshareapplyhistoryResApplyinfoType2Detail) o;
    return Objects.equals(this.accessLimit, auditGetshareapplyhistoryResApplyinfoType2Detail.accessLimit) &&
        Objects.equals(this.auditmsg, auditGetshareapplyhistoryResApplyinfoType2Detail.auditmsg) &&
        Objects.equals(this.endtime, auditGetshareapplyhistoryResApplyinfoType2Detail.endtime) &&
        Objects.equals(this.link, auditGetshareapplyhistoryResApplyinfoType2Detail.link) &&
        Objects.equals(this.optype, auditGetshareapplyhistoryResApplyinfoType2Detail.optype) &&
        Objects.equals(this.password, auditGetshareapplyhistoryResApplyinfoType2Detail.password) &&
        Objects.equals(this.perm, auditGetshareapplyhistoryResApplyinfoType2Detail.perm) &&
        Objects.equals(this.watermarkConfig, auditGetshareapplyhistoryResApplyinfoType2Detail.watermarkConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLimit, auditmsg, endtime, link, optype, password, perm, watermarkConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapplyhistoryResApplyinfoType2Detail {\n");
    
    sb.append("    accessLimit: ").append(toIndentedString(accessLimit)).append("\n");
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    optype: ").append(toIndentedString(optype)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    watermarkConfig: ").append(toIndentedString(watermarkConfig)).append("\n");
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
