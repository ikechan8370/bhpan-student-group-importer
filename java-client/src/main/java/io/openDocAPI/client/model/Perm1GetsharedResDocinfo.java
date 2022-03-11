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
 * Perm1GetsharedResDocinfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Perm1GetsharedResDocinfo {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("client_mtime")
  private Long clientMtime = null;

  @SerializedName("accessor_names")
  private String accessorNames = null;

  public Perm1GetsharedResDocinfo docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文档id
   * @return docid
  **/
  @Schema(required = true, description = "文档id")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public Perm1GetsharedResDocinfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * 文档路径
   * @return path
  **/
  @Schema(required = true, description = "文档路径")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Perm1GetsharedResDocinfo size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * 文件大小，文件夹则为-1
   * @return size
  **/
  @Schema(required = true, description = "文件大小，文件夹则为-1")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Perm1GetsharedResDocinfo clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

   /**
   * 如果是文件，返回由客户端设置的文件本地修改时间；若未设置，返回modified的值
   * @return clientMtime
  **/
  @Schema(required = true, description = "如果是文件，返回由客户端设置的文件本地修改时间；若未设置，返回modified的值")
  public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public Perm1GetsharedResDocinfo accessorNames(String accessorNames) {
    this.accessorNames = accessorNames;
    return this;
  }

   /**
   * 访问者名称，存在多个访问者时用\&quot;,\&quot;进行分隔
   * @return accessorNames
  **/
  @Schema(required = true, description = "访问者名称，存在多个访问者时用\",\"进行分隔")
  public String getAccessorNames() {
    return accessorNames;
  }

  public void setAccessorNames(String accessorNames) {
    this.accessorNames = accessorNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1GetsharedResDocinfo perm1GetsharedResDocinfo = (Perm1GetsharedResDocinfo) o;
    return Objects.equals(this.docid, perm1GetsharedResDocinfo.docid) &&
        Objects.equals(this.path, perm1GetsharedResDocinfo.path) &&
        Objects.equals(this.size, perm1GetsharedResDocinfo.size) &&
        Objects.equals(this.clientMtime, perm1GetsharedResDocinfo.clientMtime) &&
        Objects.equals(this.accessorNames, perm1GetsharedResDocinfo.accessorNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, path, size, clientMtime, accessorNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1GetsharedResDocinfo {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    accessorNames: ").append(toIndentedString(accessorNames)).append("\n");
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
