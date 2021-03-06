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
 * FavoritesListResItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class FavoritesListResItem {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("create_time")
  private Long createTime = null;

  @SerializedName("editor")
  private String editor = null;

  @SerializedName("modified")
  private Long modified = null;

  @SerializedName("client_mtime")
  private Long clientMtime = null;

  public FavoritesListResItem docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文件/目录的gns路径
   * @return docid
  **/
  @Schema(required = true, description = "文件/目录的gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FavoritesListResItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 文件/目录的名称
   * @return name
  **/
  @Schema(required = true, description = "文件/目录的名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FavoritesListResItem path(String path) {
    this.path = path;
    return this;
  }

   /**
   * 文件/目录的name路径
   * @return path
  **/
  @Schema(required = true, description = "文件/目录的name路径")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FavoritesListResItem size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * 文件的大小，目录大小为-1
   * @return size
  **/
  @Schema(required = true, description = "文件的大小，目录大小为-1")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FavoritesListResItem creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * 文件/目录创建者 
   * @return creator
  **/
  @Schema(required = true, description = "文件/目录创建者 ")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public FavoritesListResItem createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 文件/目录创建时间
   * @return createTime
  **/
  @Schema(required = true, description = "文件/目录创建时间")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public FavoritesListResItem editor(String editor) {
    this.editor = editor;
    return this;
  }

   /**
   * 文件/文件编辑者
   * @return editor
  **/
  @Schema(required = true, description = "文件/文件编辑者")
  public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FavoritesListResItem modified(Long modified) {
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

  public FavoritesListResItem clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

   /**
   * 如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  
   * @return clientMtime
  **/
  @Schema(description = "如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值  ")
  public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoritesListResItem favoritesListResItem = (FavoritesListResItem) o;
    return Objects.equals(this.docid, favoritesListResItem.docid) &&
        Objects.equals(this.name, favoritesListResItem.name) &&
        Objects.equals(this.path, favoritesListResItem.path) &&
        Objects.equals(this.size, favoritesListResItem.size) &&
        Objects.equals(this.creator, favoritesListResItem.creator) &&
        Objects.equals(this.createTime, favoritesListResItem.createTime) &&
        Objects.equals(this.editor, favoritesListResItem.editor) &&
        Objects.equals(this.modified, favoritesListResItem.modified) &&
        Objects.equals(this.clientMtime, favoritesListResItem.clientMtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, path, size, creator, createTime, editor, modified, clientMtime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoritesListResItem {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
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
