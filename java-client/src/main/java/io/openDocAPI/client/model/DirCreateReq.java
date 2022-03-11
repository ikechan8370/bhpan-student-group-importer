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
 * DirCreateReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DirCreateReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ondup")
  private Long ondup = null;

  public DirCreateReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 待创建目录的父目录gns路径
   * @return docid
  **/
  @Schema(required = true, description = "待创建目录的父目录gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public DirCreateReq name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 目录名称，UTF8编码
   * @return name
  **/
  @Schema(required = true, description = "目录名称，UTF8编码")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DirCreateReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

   /**
   * 默认值 ：1  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @Schema(description = "默认值 ：1  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  ")
  public Long getOndup() {
    return ondup;
  }

  public void setOndup(Long ondup) {
    this.ondup = ondup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirCreateReq dirCreateReq = (DirCreateReq) o;
    return Objects.equals(this.docid, dirCreateReq.docid) &&
        Objects.equals(this.name, dirCreateReq.name) &&
        Objects.equals(this.ondup, dirCreateReq.ondup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, ondup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirCreateReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ondup: ").append(toIndentedString(ondup)).append("\n");
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
