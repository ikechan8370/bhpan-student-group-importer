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
 * DirCreateRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DirCreateRes {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("rev")
  private String rev = null;

  @SerializedName("modified")
  private Long modified = null;

  @SerializedName("create_time")
  private Long createTime = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("editor")
  private String editor = null;

  @SerializedName("name")
  private String name = null;

  public DirCreateRes docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 创建的目录的gns路径
   * @return docid
  **/
  @Schema(required = true, description = "创建的目录的gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirCreateRes rev(String rev) {
    this.rev = rev;
    return this;
  }

   /**
   * 数据变化标识
   * @return rev
  **/
  @Schema(required = true, description = "数据变化标识")
  public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public DirCreateRes modified(Long modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 创建时间，UTC时间，此为服务器时间
   * @return modified
  **/
  @Schema(required = true, description = "创建时间，UTC时间，此为服务器时间")
  public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public DirCreateRes createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 目录创建的服务端时间
   * @return createTime
  **/
  @Schema(required = true, description = "目录创建的服务端时间")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public DirCreateRes creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * 目录创建者
   * @return creator
  **/
  @Schema(required = true, description = "目录创建者")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public DirCreateRes editor(String editor) {
    this.editor = editor;
    return this;
  }

   /**
   * 目录修改者
   * @return editor
  **/
  @Schema(required = true, description = "目录修改者")
  public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public DirCreateRes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * UTF8编码，仅当ondup为2时才返回
   * @return name
  **/
  @Schema(description = "UTF8编码，仅当ondup为2时才返回")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirCreateRes dirCreateRes = (DirCreateRes) o;
    return Objects.equals(this.docid, dirCreateRes.docid) &&
        Objects.equals(this.rev, dirCreateRes.rev) &&
        Objects.equals(this.modified, dirCreateRes.modified) &&
        Objects.equals(this.createTime, dirCreateRes.createTime) &&
        Objects.equals(this.creator, dirCreateRes.creator) &&
        Objects.equals(this.editor, dirCreateRes.editor) &&
        Objects.equals(this.name, dirCreateRes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, modified, createTime, creator, editor, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCreateRes {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
