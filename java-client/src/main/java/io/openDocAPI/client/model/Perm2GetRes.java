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
import io.openDocAPI.client.model.Perm2GetResPerminfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Perm2GetRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Perm2GetRes {
  @SerializedName("perminfos")
  private List<Perm2GetResPerminfo> perminfos = new ArrayList<Perm2GetResPerminfo>();

  @SerializedName("inherit")
  private Boolean inherit = null;

  public Perm2GetRes perminfos(List<Perm2GetResPerminfo> perminfos) {
    this.perminfos = perminfos;
    return this;
  }

  public Perm2GetRes addPerminfosItem(Perm2GetResPerminfo perminfosItem) {
    this.perminfos.add(perminfosItem);
    return this;
  }

   /**
   * 权限配置条目数组
   * @return perminfos
  **/
  @Schema(required = true, description = "权限配置条目数组")
  public List<Perm2GetResPerminfo> getPerminfos() {
    return perminfos;
  }

  public void setPerminfos(List<Perm2GetResPerminfo> perminfos) {
    this.perminfos = perminfos;
  }

  public Perm2GetRes inherit(Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

   /**
   * 启用继承：true，上级所有权限对该对象及下级对象有效  禁用继承：false，上级所有权限对该对象及下级对象无效
   * @return inherit
  **/
  @Schema(required = true, description = "启用继承：true，上级所有权限对该对象及下级对象有效  禁用继承：false，上级所有权限对该对象及下级对象无效")
  public Boolean isInherit() {
    return inherit;
  }

  public void setInherit(Boolean inherit) {
    this.inherit = inherit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm2GetRes perm2GetRes = (Perm2GetRes) o;
    return Objects.equals(this.perminfos, perm2GetRes.perminfos) &&
        Objects.equals(this.inherit, perm2GetRes.inherit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perminfos, inherit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm2GetRes {\n");
    
    sb.append("    perminfos: ").append(toIndentedString(perminfos)).append("\n");
    sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
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