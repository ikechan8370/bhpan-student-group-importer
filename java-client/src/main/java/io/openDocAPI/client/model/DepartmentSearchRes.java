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
import io.openDocAPI.client.model.DepartmentSearchResDepinfo;
import io.openDocAPI.client.model.DepartmentSearchResUserInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DepartmentSearchRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DepartmentSearchRes {
  @SerializedName("userinfos")
  private List<DepartmentSearchResUserInfo> userinfos = new ArrayList<DepartmentSearchResUserInfo>();

  @SerializedName("depinfos")
  private List<DepartmentSearchResDepinfo> depinfos = new ArrayList<DepartmentSearchResDepinfo>();

  public DepartmentSearchRes userinfos(List<DepartmentSearchResUserInfo> userinfos) {
    this.userinfos = userinfos;
    return this;
  }

  public DepartmentSearchRes addUserinfosItem(DepartmentSearchResUserInfo userinfosItem) {
    this.userinfos.add(userinfosItem);
    return this;
  }

   /**
   * 用户信息
   * @return userinfos
  **/
  @Schema(required = true, description = "用户信息")
  public List<DepartmentSearchResUserInfo> getUserinfos() {
    return userinfos;
  }

  public void setUserinfos(List<DepartmentSearchResUserInfo> userinfos) {
    this.userinfos = userinfos;
  }

  public DepartmentSearchRes depinfos(List<DepartmentSearchResDepinfo> depinfos) {
    this.depinfos = depinfos;
    return this;
  }

  public DepartmentSearchRes addDepinfosItem(DepartmentSearchResDepinfo depinfosItem) {
    this.depinfos.add(depinfosItem);
    return this;
  }

   /**
   * 部门信息
   * @return depinfos
  **/
  @Schema(required = true, description = "部门信息")
  public List<DepartmentSearchResDepinfo> getDepinfos() {
    return depinfos;
  }

  public void setDepinfos(List<DepartmentSearchResDepinfo> depinfos) {
    this.depinfos = depinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentSearchRes departmentSearchRes = (DepartmentSearchRes) o;
    return Objects.equals(this.userinfos, departmentSearchRes.userinfos) &&
        Objects.equals(this.depinfos, departmentSearchRes.depinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userinfos, depinfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentSearchRes {\n");
    
    sb.append("    userinfos: ").append(toIndentedString(userinfos)).append("\n");
    sb.append("    depinfos: ").append(toIndentedString(depinfos)).append("\n");
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
