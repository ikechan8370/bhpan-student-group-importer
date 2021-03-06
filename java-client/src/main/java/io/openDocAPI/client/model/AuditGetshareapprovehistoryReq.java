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
 * AuditGetshareapprovehistoryReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class AuditGetshareapprovehistoryReq {
  @SerializedName("start")
  private Long start = null;

  @SerializedName("limit")
  private Long limit = null;

  @SerializedName("type")
  private Long type = null;

  public AuditGetshareapprovehistoryReq start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * 分页开始号，从0开始
   * @return start
  **/
  @Schema(required = true, description = "分页开始号，从0开始")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public AuditGetshareapprovehistoryReq limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * 条数，表示取多少条记录，-1表示不限制
   * @return limit
  **/
  @Schema(required = true, description = "条数，表示取多少条记录，-1表示不限制")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public AuditGetshareapprovehistoryReq type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * 用于标识具体获取哪种申请历史, 默认为0  0 表示获取共享申请历史和定密申请历史  1 表示获取共享申请历史(包括共享、外链、所有者和更改继承申请历史)  2 表示获取定密申请历史
   * @return type
  **/
  @Schema(required = true, description = "用于标识具体获取哪种申请历史, 默认为0  0 表示获取共享申请历史和定密申请历史  1 表示获取共享申请历史(包括共享、外链、所有者和更改继承申请历史)  2 表示获取定密申请历史")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetshareapprovehistoryReq auditGetshareapprovehistoryReq = (AuditGetshareapprovehistoryReq) o;
    return Objects.equals(this.start, auditGetshareapprovehistoryReq.start) &&
        Objects.equals(this.limit, auditGetshareapprovehistoryReq.limit) &&
        Objects.equals(this.type, auditGetshareapprovehistoryReq.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapprovehistoryReq {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
