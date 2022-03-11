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
 * RecycleListReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class RecycleListReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("name")
  private List<String> name = null;

  @SerializedName("by")
  private String by = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("path")
  private List<String> path = null;

  @SerializedName("editor")
  private List<String> editor = null;

  @SerializedName("start")
  private Long start = null;

  @SerializedName("limit")
  private Long limit = null;

  public RecycleListReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 个人文档或者文档库的gns路径
   * @return docid
  **/
  @Schema(required = true, description = "个人文档或者文档库的gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public RecycleListReq name(List<String> name) {
    this.name = name;
    return this;
  }

  public RecycleListReq addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * 按照文件名查找，默认为空，不进行过滤
   * @return name
  **/
  @Schema(description = "按照文件名查找，默认为空，不进行过滤")
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public RecycleListReq by(String by) {
    this.by = by;
    return this;
  }

   /**
   * 指定按哪个字段排序  若不指定，默认按docid升序排序  说明：  name，按文件名称（中文按拼音）排序  type，按文件类型排序（目录按name升序）  time，按删除时间排序  
   * @return by
  **/
  @Schema(description = "指定按哪个字段排序  若不指定，默认按docid升序排序  说明：  name，按文件名称（中文按拼音）排序  type，按文件类型排序（目录按name升序）  time，按删除时间排序  ")
  public String getBy() {
    return by;
  }

  public void setBy(String by) {
    this.by = by;
  }

  public RecycleListReq sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * 升序还是降序，默认为升序  说明：  asc，升序  desc，降序  
   * @return sort
  **/
  @Schema(description = "升序还是降序，默认为升序  说明：  asc，升序  desc，降序  ")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public RecycleListReq path(List<String> path) {
    this.path = path;
    return this;
  }

  public RecycleListReq addPathItem(String pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<String>();
    }
    this.path.add(pathItem);
    return this;
  }

   /**
   * 按照原位置查找，默认为空，不进行过滤
   * @return path
  **/
  @Schema(description = "按照原位置查找，默认为空，不进行过滤")
  public List<String> getPath() {
    return path;
  }

  public void setPath(List<String> path) {
    this.path = path;
  }

  public RecycleListReq editor(List<String> editor) {
    this.editor = editor;
    return this;
  }

  public RecycleListReq addEditorItem(String editorItem) {
    if (this.editor == null) {
      this.editor = new ArrayList<String>();
    }
    this.editor.add(editorItem);
    return this;
  }

   /**
   * 按照删除者查找，默认为空，不进行过滤
   * @return editor
  **/
  @Schema(description = "按照删除者查找，默认为空，不进行过滤")
  public List<String> getEditor() {
    return editor;
  }

  public void setEditor(List<String> editor) {
    this.editor = editor;
  }

  public RecycleListReq start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * 开始位置，默认为0
   * @return start
  **/
  @Schema(description = "开始位置，默认为0")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public RecycleListReq limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * 分页条数，默认为-1，返回start后面的所有记录
   * @return limit
  **/
  @Schema(description = "分页条数，默认为-1，返回start后面的所有记录")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecycleListReq recycleListReq = (RecycleListReq) o;
    return Objects.equals(this.docid, recycleListReq.docid) &&
        Objects.equals(this.name, recycleListReq.name) &&
        Objects.equals(this.by, recycleListReq.by) &&
        Objects.equals(this.sort, recycleListReq.sort) &&
        Objects.equals(this.path, recycleListReq.path) &&
        Objects.equals(this.editor, recycleListReq.editor) &&
        Objects.equals(this.start, recycleListReq.start) &&
        Objects.equals(this.limit, recycleListReq.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, by, sort, path, editor, start, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleListReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
