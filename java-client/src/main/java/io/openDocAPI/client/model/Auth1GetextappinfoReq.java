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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Auth1GetextappinfoReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Auth1GetextappinfoReq {
  @SerializedName("apptype")
  private Long apptype = null;

  @SerializedName("params")
  private Map<String, Object> params = new HashMap<String, Object>();

  public Auth1GetextappinfoReq apptype(Long apptype) {
    this.apptype = apptype;
    return this;
  }

   /**
   * 外部应用标识
   * @return apptype
  **/
  @Schema(required = true, description = "外部应用标识")
  public Long getApptype() {
    return apptype;
  }

  public void setApptype(Long apptype) {
    this.apptype = apptype;
  }

  public Auth1GetextappinfoReq params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  public Auth1GetextappinfoReq putParamsItem(String key, Object paramsItem) {
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * 应用系统相关配置
   * @return params
  **/
  @Schema(required = true, description = "应用系统相关配置")
  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth1GetextappinfoReq auth1GetextappinfoReq = (Auth1GetextappinfoReq) o;
    return Objects.equals(this.apptype, auth1GetextappinfoReq.apptype) &&
        Objects.equals(this.params, auth1GetextappinfoReq.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apptype, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth1GetextappinfoReq {\n");
    
    sb.append("    apptype: ").append(toIndentedString(apptype)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
