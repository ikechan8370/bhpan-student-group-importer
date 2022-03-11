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
import io.openDocAPI.client.model.SearchSearchResResponseDoc;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * 文档相关信息和下次请求的边界值
 */
@Schema(description = "文档相关信息和下次请求的边界值")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class SearchSearchResResponse {
  @SerializedName("next")
  private String next = null;

  @SerializedName("docs")
  private List<SearchSearchResResponseDoc> docs = new ArrayList<SearchSearchResResponseDoc>();

  @SerializedName("hits")
  private Long hits = null;

  public SearchSearchResResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * 返回下次发起请求的start
   * @return next
  **/
  @Schema(required = true, description = "返回下次发起请求的start")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public SearchSearchResResponse docs(List<SearchSearchResResponseDoc> docs) {
    this.docs = docs;
    return this;
  }

  public SearchSearchResResponse addDocsItem(SearchSearchResResponseDoc docsItem) {
    this.docs.add(docsItem);
    return this;
  }

   /**
   * 返回各个文档的信息
   * @return docs
  **/
  @Schema(required = true, description = "返回各个文档的信息")
  public List<SearchSearchResResponseDoc> getDocs() {
    return docs;
  }

  public void setDocs(List<SearchSearchResResponseDoc> docs) {
    this.docs = docs;
  }

  public SearchSearchResResponse hits(Long hits) {
    this.hits = hits;
    return this;
  }

   /**
   * 返回检索命中总数（查询第一页时返回）
   * @return hits
  **/
  @Schema(description = "返回检索命中总数（查询第一页时返回）")
  public Long getHits() {
    return hits;
  }

  public void setHits(Long hits) {
    this.hits = hits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchResResponse searchSearchResResponse = (SearchSearchResResponse) o;
    return Objects.equals(this.next, searchSearchResResponse.next) &&
        Objects.equals(this.docs, searchSearchResResponse.docs) &&
        Objects.equals(this.hits, searchSearchResResponse.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, docs, hits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchResResponse {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
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