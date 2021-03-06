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
 * FileMetadataRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class FileMetadataRes {
  @SerializedName("client_mtime")
  private Long clientMtime = null;

  @SerializedName("editor")
  private String editor = null;

  @SerializedName("modified")
  private Long modified = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rev")
  private String rev = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("needdownloadwatermark")
  private Boolean needdownloadwatermark = null;

  @SerializedName("docid")
  private String docid = null;

  public FileMetadataRes clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

   /**
   * 由客户端设置的文件本地修改时间    若未设置，返回modified的值  
   * @return clientMtime
  **/
  @Schema(required = true, description = "由客户端设置的文件本地修改时间    若未设置，返回modified的值  ")
  public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public FileMetadataRes editor(String editor) {
    this.editor = editor;
    return this;
  }

   /**
   * 文件版本上传编辑者名称，UTF8编码
   * @return editor
  **/
  @Schema(required = true, description = "文件版本上传编辑者名称，UTF8编码")
  public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public FileMetadataRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 文件版本上传时间，UTC时间，此为上传版本时的服务器时间
   * @return modified
  **/
  @Schema(required = true, description = "文件版本上传时间，UTC时间，此为上传版本时的服务器时间")
  public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public FileMetadataRes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 文件版本上传时文件名称，UTF8编码
   * @return name
  **/
  @Schema(required = true, description = "文件版本上传时文件名称，UTF8编码")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileMetadataRes rev(String rev) {
    this.rev = rev;
    return this;
  }

   /**
   * 文件版本ID
   * @return rev
  **/
  @Schema(required = true, description = "文件版本ID")
  public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileMetadataRes site(String site) {
    this.site = site;
    return this;
  }

   /**
   * 文件版本的归属站点
   * @return site
  **/
  @Schema(required = true, description = "文件版本的归属站点")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public FileMetadataRes size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * 文件版本的大小
   * @return size
  **/
  @Schema(required = true, description = "文件版本的大小")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FileMetadataRes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FileMetadataRes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 版本的标签，字符串数组
   * @return tags
  **/
  @Schema(required = true, description = "版本的标签，字符串数组")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FileMetadataRes needdownloadwatermark(Boolean needdownloadwatermark) {
    this.needdownloadwatermark = needdownloadwatermark;
    return this;
  }

   /**
   * 用户下载文件对象时，是否需要下载水印
   * @return needdownloadwatermark
  **/
  @Schema(required = true, description = "用户下载文件对象时，是否需要下载水印")
  public Boolean isNeeddownloadwatermark() {
    return needdownloadwatermark;
  }

  public void setNeeddownloadwatermark(Boolean needdownloadwatermark) {
    this.needdownloadwatermark = needdownloadwatermark;
  }

  public FileMetadataRes docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文件docid
   * @return docid
  **/
  @Schema(required = true, description = "文件docid")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMetadataRes fileMetadataRes = (FileMetadataRes) o;
    return Objects.equals(this.clientMtime, fileMetadataRes.clientMtime) &&
        Objects.equals(this.editor, fileMetadataRes.editor) &&
        Objects.equals(this.modified, fileMetadataRes.modified) &&
        Objects.equals(this.name, fileMetadataRes.name) &&
        Objects.equals(this.rev, fileMetadataRes.rev) &&
        Objects.equals(this.site, fileMetadataRes.site) &&
        Objects.equals(this.size, fileMetadataRes.size) &&
        Objects.equals(this.tags, fileMetadataRes.tags) &&
        Objects.equals(this.needdownloadwatermark, fileMetadataRes.needdownloadwatermark) &&
        Objects.equals(this.docid, fileMetadataRes.docid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientMtime, editor, modified, name, rev, site, size, tags, needdownloadwatermark, docid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMetadataRes {\n");
    
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    needdownloadwatermark: ").append(toIndentedString(needdownloadwatermark)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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
