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
 * LinkOpfilesReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class LinkOpfilesReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("start")
  private Long start = null;

  @SerializedName("limit")
  private Long limit = null;

  public LinkOpfilesReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 外链文件或文件夹gns路径（getlinked协议返回）
   * @return docid
  **/
  @Schema(required = true, description = "外链文件或文件夹gns路径（getlinked协议返回）")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOpfilesReq start(Long start) {
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

  public LinkOpfilesReq limit(Long limit) {
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
    LinkOpfilesReq linkOpfilesReq = (LinkOpfilesReq) o;
    return Objects.equals(this.docid, linkOpfilesReq.docid) &&
        Objects.equals(this.start, linkOpfilesReq.start) &&
        Objects.equals(this.limit, linkOpfilesReq.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, start, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpfilesReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
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