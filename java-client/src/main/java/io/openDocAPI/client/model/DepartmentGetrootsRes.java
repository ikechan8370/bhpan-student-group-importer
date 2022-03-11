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
import io.openDocAPI.client.model.DepartmentGetrootsResDepinfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DepartmentGetrootsRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DepartmentGetrootsRes {
  @SerializedName("depinfos")
  private List<DepartmentGetrootsResDepinfo> depinfos = null;

  public DepartmentGetrootsRes depinfos(List<DepartmentGetrootsResDepinfo> depinfos) {
    this.depinfos = depinfos;
    return this;
  }

  public DepartmentGetrootsRes addDepinfosItem(DepartmentGetrootsResDepinfo depinfosItem) {
    if (this.depinfos == null) {
      this.depinfos = new ArrayList<DepartmentGetrootsResDepinfo>();
    }
    this.depinfos.add(depinfosItem);
    return this;
  }

   /**
   * 部门信息
   * @return depinfos
  **/
  @Schema(description = "部门信息")
  public List<DepartmentGetrootsResDepinfo> getDepinfos() {
    return depinfos;
  }

  public void setDepinfos(List<DepartmentGetrootsResDepinfo> depinfos) {
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
    DepartmentGetrootsRes departmentGetrootsRes = (DepartmentGetrootsRes) o;
    return Objects.equals(this.depinfos, departmentGetrootsRes.depinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depinfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetrootsRes {\n");
    
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