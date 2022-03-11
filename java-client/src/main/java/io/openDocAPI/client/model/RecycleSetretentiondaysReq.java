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
 * RecycleSetretentiondaysReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class RecycleSetretentiondaysReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("days")
  private Long days = null;

  public RecycleSetretentiondaysReq docid(String docid) {
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

  public RecycleSetretentiondaysReq days(Long days) {
    this.days = days;
    return this;
  }

   /**
   * 保留天数
   * @return days
  **/
  @Schema(required = true, description = "保留天数")
  public Long getDays() {
    return days;
  }

  public void setDays(Long days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecycleSetretentiondaysReq recycleSetretentiondaysReq = (RecycleSetretentiondaysReq) o;
    return Objects.equals(this.docid, recycleSetretentiondaysReq.docid) &&
        Objects.equals(this.days, recycleSetretentiondaysReq.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecycleSetretentiondaysReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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