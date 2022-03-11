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
 * LinkListdirResFile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class LinkListdirResFile {
  @SerializedName("client_mtime")
  private Long clientMtime = null;

  @SerializedName("docid")
  private String docid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rev")
  private String rev = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("modified")
  private Long modified = null;

  public LinkListdirResFile clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

   /**
   * 如果是文件，返回由客户端设置的文件本地修改时间  若未设置，返回modified的值  
   * @return clientMtime
  **/
  @Schema(required = true, description = "如果是文件，返回由客户端设置的文件本地修改时间  若未设置，返回modified的值  ")
  public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public LinkListdirResFile docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 目录中文件/目录的gns路径
   * @return docid
  **/
  @Schema(required = true, description = "目录中文件/目录的gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkListdirResFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 目录中文件/目录的名称，UTF8编码
   * @return name
  **/
  @Schema(required = true, description = "目录中文件/目录的名称，UTF8编码")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LinkListdirResFile rev(String rev) {
    this.rev = rev;
    return this;
  }

   /**
   * 目录中文件版本号或目录数据变化标识
   * @return rev
  **/
  @Schema(required = true, description = "目录中文件版本号或目录数据变化标识")
  public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public LinkListdirResFile size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * 目录中文件的大小，目录大小为-1
   * @return size
  **/
  @Schema(required = true, description = "目录中文件的大小，目录大小为-1")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public LinkListdirResFile modified(Long modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间
   * @return modified
  **/
  @Schema(required = true, description = "目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间")
  public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkListdirResFile linkListdirResFile = (LinkListdirResFile) o;
    return Objects.equals(this.clientMtime, linkListdirResFile.clientMtime) &&
        Objects.equals(this.docid, linkListdirResFile.docid) &&
        Objects.equals(this.name, linkListdirResFile.name) &&
        Objects.equals(this.rev, linkListdirResFile.rev) &&
        Objects.equals(this.size, linkListdirResFile.size) &&
        Objects.equals(this.modified, linkListdirResFile.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientMtime, docid, name, rev, size, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkListdirResFile {\n");
    
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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