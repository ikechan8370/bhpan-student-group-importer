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
 * SearchSearchResResponseDoc
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class SearchSearchResResponseDoc {
  @SerializedName("basename")
  private String basename = null;

  @SerializedName("csflevel")
  private Long csflevel = null;

  @SerializedName("modified")
  private Long modified = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("parentpath")
  private String parentpath = null;

  @SerializedName("ext")
  private String ext = null;

  @SerializedName("docid")
  private String docid = null;

  @SerializedName("editor")
  private String editor = null;

  @SerializedName("access")
  private Long access = null;

  @SerializedName("sharer")
  private String sharer = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("objtype")
  private Long objtype = null;

  public SearchSearchResResponseDoc basename(String basename) {
    this.basename = basename;
    return this;
  }

   /**
   * 文件名（不包括扩展名）
   * @return basename
  **/
  @Schema(required = true, description = "文件名（不包括扩展名）")
  public String getBasename() {
    return basename;
  }

  public void setBasename(String basename) {
    this.basename = basename;
  }

  public SearchSearchResResponseDoc csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

   /**
   * 文件密级
   * @return csflevel
  **/
  @Schema(required = true, description = "文件密级")
  public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public SearchSearchResResponseDoc modified(Long modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 文件修改时间
   * @return modified
  **/
  @Schema(description = "文件修改时间")
  public Long getModified() {
    return modified;
  }

  public void setModified(Long modified) {
    this.modified = modified;
  }

  public SearchSearchResResponseDoc size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * 文件大小
   * @return size
  **/
  @Schema(required = true, description = "文件大小")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public SearchSearchResResponseDoc parentpath(String parentpath) {
    this.parentpath = parentpath;
    return this;
  }

   /**
   * 父目录
   * @return parentpath
  **/
  @Schema(required = true, description = "父目录")
  public String getParentpath() {
    return parentpath;
  }

  public void setParentpath(String parentpath) {
    this.parentpath = parentpath;
  }

  public SearchSearchResResponseDoc ext(String ext) {
    this.ext = ext;
    return this;
  }

   /**
   * 文件扩展名
   * @return ext
  **/
  @Schema(description = "文件扩展名")
  public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public SearchSearchResResponseDoc docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * gns路径
   * @return docid
  **/
  @Schema(required = true, description = "gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public SearchSearchResResponseDoc editor(String editor) {
    this.editor = editor;
    return this;
  }

   /**
   * 文件创建者
   * @return editor
  **/
  @Schema(description = "文件创建者")
  public String getEditor() {
    return editor;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public SearchSearchResResponseDoc access(Long access) {
    this.access = access;
    return this;
  }

   /**
   * 是否有权限访问，1为有权限，0为无权限
   * @return access
  **/
  @Schema(required = true, description = "是否有权限访问，1为有权限，0为无权限")
  public Long getAccess() {
    return access;
  }

  public void setAccess(Long access) {
    this.access = access;
  }

  public SearchSearchResResponseDoc sharer(String sharer) {
    this.sharer = sharer;
    return this;
  }

   /**
   * 发现者名称：如果有返回且不为空，说明该文档是发现文档
   * @return sharer
  **/
  @Schema(description = "发现者名称：如果有返回且不为空，说明该文档是发现文档")
  public String getSharer() {
    return sharer;
  }

  public void setSharer(String sharer) {
    this.sharer = sharer;
  }

  public SearchSearchResResponseDoc tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SearchSearchResResponseDoc addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 版本的标签字符串数组
   * @return tags
  **/
  @Schema(description = "版本的标签字符串数组")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SearchSearchResResponseDoc created(String created) {
    this.created = created;
    return this;
  }

   /**
   * 文档创建时间
   * @return created
  **/
  @Schema(required = true, description = "文档创建时间")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public SearchSearchResResponseDoc creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * 文档创建者
   * @return creator
  **/
  @Schema(required = true, description = "文档创建者")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public SearchSearchResResponseDoc objtype(Long objtype) {
    this.objtype = objtype;
    return this;
  }

   /**
   * 文档类型，1 为文件 2为目录  注：6.0.4版本后新建的文件索引才有该字段。  未重建索引时，请勿用作判断条件。  
   * @return objtype
  **/
  @Schema(description = "文档类型，1 为文件 2为目录  注：6.0.4版本后新建的文件索引才有该字段。  未重建索引时，请勿用作判断条件。  ")
  public Long getObjtype() {
    return objtype;
  }

  public void setObjtype(Long objtype) {
    this.objtype = objtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchResResponseDoc searchSearchResResponseDoc = (SearchSearchResResponseDoc) o;
    return Objects.equals(this.basename, searchSearchResResponseDoc.basename) &&
        Objects.equals(this.csflevel, searchSearchResResponseDoc.csflevel) &&
        Objects.equals(this.modified, searchSearchResResponseDoc.modified) &&
        Objects.equals(this.size, searchSearchResResponseDoc.size) &&
        Objects.equals(this.parentpath, searchSearchResResponseDoc.parentpath) &&
        Objects.equals(this.ext, searchSearchResResponseDoc.ext) &&
        Objects.equals(this.docid, searchSearchResResponseDoc.docid) &&
        Objects.equals(this.editor, searchSearchResResponseDoc.editor) &&
        Objects.equals(this.access, searchSearchResResponseDoc.access) &&
        Objects.equals(this.sharer, searchSearchResResponseDoc.sharer) &&
        Objects.equals(this.tags, searchSearchResResponseDoc.tags) &&
        Objects.equals(this.created, searchSearchResResponseDoc.created) &&
        Objects.equals(this.creator, searchSearchResResponseDoc.creator) &&
        Objects.equals(this.objtype, searchSearchResResponseDoc.objtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basename, csflevel, modified, size, parentpath, ext, docid, editor, access, sharer, tags, created, creator, objtype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchResResponseDoc {\n");
    
    sb.append("    basename: ").append(toIndentedString(basename)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    parentpath: ").append(toIndentedString(parentpath)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    sharer: ").append(toIndentedString(sharer)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    objtype: ").append(toIndentedString(objtype)).append("\n");
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
