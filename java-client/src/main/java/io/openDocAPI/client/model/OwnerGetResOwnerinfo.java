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
 * OwnerGetResOwnerinfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class OwnerGetResOwnerinfo {
  @SerializedName("userid")
  private String userid = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("inheritpath")
  private String inheritpath = null;

  @SerializedName("csflevel")
  private Long csflevel = null;

  public OwnerGetResOwnerinfo userid(String userid) {
    this.userid = userid;
    return this;
  }

   /**
   * 用户ID
   * @return userid
  **/
  @Schema(required = true, description = "用户ID")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public OwnerGetResOwnerinfo account(String account) {
    this.account = account;
    return this;
  }

   /**
   * 用户登录账号
   * @return account
  **/
  @Schema(required = true, description = "用户登录账号")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public OwnerGetResOwnerinfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 用户的显示名称
   * @return name
  **/
  @Schema(required = true, description = "用户的显示名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OwnerGetResOwnerinfo inheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
    return this;
  }

   /**
   * 所有者的继承路径
   * @return inheritpath
  **/
  @Schema(required = true, description = "所有者的继承路径")
  public String getInheritpath() {
    return inheritpath;
  }

  public void setInheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
  }

  public OwnerGetResOwnerinfo csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

   /**
   * 用户密级
   * @return csflevel
  **/
  @Schema(required = true, description = "用户密级")
  public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerGetResOwnerinfo ownerGetResOwnerinfo = (OwnerGetResOwnerinfo) o;
    return Objects.equals(this.userid, ownerGetResOwnerinfo.userid) &&
        Objects.equals(this.account, ownerGetResOwnerinfo.account) &&
        Objects.equals(this.name, ownerGetResOwnerinfo.name) &&
        Objects.equals(this.inheritpath, ownerGetResOwnerinfo.inheritpath) &&
        Objects.equals(this.csflevel, ownerGetResOwnerinfo.csflevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, account, name, inheritpath, csflevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerGetResOwnerinfo {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inheritpath: ").append(toIndentedString(inheritpath)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
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
