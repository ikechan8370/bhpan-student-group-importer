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
 * 联系人信息
 */
@Schema(description = "联系人信息")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class ContactorSearchpersonsResUserinfo {
  @SerializedName("account")
  private String account = null;

  @SerializedName("groupid")
  private String groupid = null;

  @SerializedName("groupname")
  private String groupname = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("userid")
  private String userid = null;

  public ContactorSearchpersonsResUserinfo account(String account) {
    this.account = account;
    return this;
  }

   /**
   * 用户名
   * @return account
  **/
  @Schema(required = true, description = "用户名")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public ContactorSearchpersonsResUserinfo groupid(String groupid) {
    this.groupid = groupid;
    return this;
  }

   /**
   * 联系人组id
   * @return groupid
  **/
  @Schema(required = true, description = "联系人组id")
  public String getGroupid() {
    return groupid;
  }

  public void setGroupid(String groupid) {
    this.groupid = groupid;
  }

  public ContactorSearchpersonsResUserinfo groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

   /**
   * 联系人组名
   * @return groupname
  **/
  @Schema(required = true, description = "联系人组名")
  public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  public ContactorSearchpersonsResUserinfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 显示名
   * @return name
  **/
  @Schema(required = true, description = "显示名")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactorSearchpersonsResUserinfo userid(String userid) {
    this.userid = userid;
    return this;
  }

   /**
   * 用户id
   * @return userid
  **/
  @Schema(required = true, description = "用户id")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorSearchpersonsResUserinfo contactorSearchpersonsResUserinfo = (ContactorSearchpersonsResUserinfo) o;
    return Objects.equals(this.account, contactorSearchpersonsResUserinfo.account) &&
        Objects.equals(this.groupid, contactorSearchpersonsResUserinfo.groupid) &&
        Objects.equals(this.groupname, contactorSearchpersonsResUserinfo.groupname) &&
        Objects.equals(this.name, contactorSearchpersonsResUserinfo.name) &&
        Objects.equals(this.userid, contactorSearchpersonsResUserinfo.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, groupid, groupname, name, userid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorSearchpersonsResUserinfo {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
