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
 * 限速配置信息
 */
@Schema(description = "限速配置信息")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Auth1GetconfigResLimitrateconfig {
  @SerializedName("isenabled")
  private Boolean isenabled = null;

  @SerializedName("limittype")
  private Long limittype = null;

  public Auth1GetconfigResLimitrateconfig isenabled(Boolean isenabled) {
    this.isenabled = isenabled;
    return this;
  }

   /**
   * 是否开启网络限速
   * @return isenabled
  **/
  @Schema(required = true, description = "是否开启网络限速")
  public Boolean isIsenabled() {
    return isenabled;
  }

  public void setIsenabled(Boolean isenabled) {
    this.isenabled = isenabled;
  }

  public Auth1GetconfigResLimitrateconfig limittype(Long limittype) {
    this.limittype = limittype;
    return this;
  }

   /**
   * 限速类型 0 用户级别限速 1 用户组总体限速
   * @return limittype
  **/
  @Schema(required = true, description = "限速类型 0 用户级别限速 1 用户组总体限速")
  public Long getLimittype() {
    return limittype;
  }

  public void setLimittype(Long limittype) {
    this.limittype = limittype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetconfigResLimitrateconfig auth1GetconfigResLimitrateconfig = (Auth1GetconfigResLimitrateconfig) o;
    return Objects.equals(this.isenabled, auth1GetconfigResLimitrateconfig.isenabled) &&
        Objects.equals(this.limittype, auth1GetconfigResLimitrateconfig.limittype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isenabled, limittype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetconfigResLimitrateconfig {\n");
    
    sb.append("    isenabled: ").append(toIndentedString(isenabled)).append("\n");
    sb.append("    limittype: ").append(toIndentedString(limittype)).append("\n");
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