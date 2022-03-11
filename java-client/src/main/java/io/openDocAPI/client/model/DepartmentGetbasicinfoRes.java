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
 * DepartmentGetbasicinfoRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DepartmentGetbasicinfoRes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  public DepartmentGetbasicinfoRes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 部门名称
   * @return name
  **/
  @Schema(required = true, description = "部门名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DepartmentGetbasicinfoRes path(String path) {
    this.path = path;
    return this;
  }

   /**
   * 部门路径
   * @return path
  **/
  @Schema(required = true, description = "部门路径")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentGetbasicinfoRes departmentGetbasicinfoRes = (DepartmentGetbasicinfoRes) o;
    return Objects.equals(this.name, departmentGetbasicinfoRes.name) &&
        Objects.equals(this.path, departmentGetbasicinfoRes.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentGetbasicinfoRes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
