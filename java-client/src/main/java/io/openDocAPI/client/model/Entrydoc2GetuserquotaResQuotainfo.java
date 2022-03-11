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
 * Entrydoc2GetuserquotaResQuotainfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Entrydoc2GetuserquotaResQuotainfo {
  @SerializedName("doctype")
  private Long doctype = null;

  @SerializedName("typename")
  private String typename = null;

  @SerializedName("docid")
  private String docid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("quota")
  private Long quota = null;

  @SerializedName("used")
  private Long used = null;

  public Entrydoc2GetuserquotaResQuotainfo doctype(Long doctype) {
    this.doctype = doctype;
    return this;
  }

   /**
   * 文档库类型：  1：个人文档库  2：个人群组文档库  
   * @return doctype
  **/
  @Schema(required = true, description = "文档库类型：  1：个人文档库  2：个人群组文档库  ")
  public Long getDoctype() {
    return doctype;
  }

  public void setDoctype(Long doctype) {
    this.doctype = doctype;
  }

  public Entrydoc2GetuserquotaResQuotainfo typename(String typename) {
    this.typename = typename;
    return this;
  }

   /**
   * 文档库类型名称
   * @return typename
  **/
  @Schema(required = true, description = "文档库类型名称")
  public String getTypename() {
    return typename;
  }

  public void setTypename(String typename) {
    this.typename = typename;
  }

  public Entrydoc2GetuserquotaResQuotainfo docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文档库id
   * @return docid
  **/
  @Schema(required = true, description = "文档库id")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public Entrydoc2GetuserquotaResQuotainfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 文档库名称
   * @return name
  **/
  @Schema(required = true, description = "文档库名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Entrydoc2GetuserquotaResQuotainfo quota(Long quota) {
    this.quota = quota;
    return this;
  }

   /**
   * 配额
   * @return quota
  **/
  @Schema(required = true, description = "配额")
  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public Entrydoc2GetuserquotaResQuotainfo used(Long used) {
    this.used = used;
    return this;
  }

   /**
   * 已用空间
   * @return used
  **/
  @Schema(required = true, description = "已用空间")
  public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetuserquotaResQuotainfo entrydoc2GetuserquotaResQuotainfo = (Entrydoc2GetuserquotaResQuotainfo) o;
    return Objects.equals(this.doctype, entrydoc2GetuserquotaResQuotainfo.doctype) &&
        Objects.equals(this.typename, entrydoc2GetuserquotaResQuotainfo.typename) &&
        Objects.equals(this.docid, entrydoc2GetuserquotaResQuotainfo.docid) &&
        Objects.equals(this.name, entrydoc2GetuserquotaResQuotainfo.name) &&
        Objects.equals(this.quota, entrydoc2GetuserquotaResQuotainfo.quota) &&
        Objects.equals(this.used, entrydoc2GetuserquotaResQuotainfo.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctype, typename, docid, name, quota, used);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetuserquotaResQuotainfo {\n");
    
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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