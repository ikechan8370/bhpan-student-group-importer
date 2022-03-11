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
import io.openDocAPI.client.model.UserGetResDirectdeptinfo;
import io.openDocAPI.client.model.UserGetResRoleinfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UserGetRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class UserGetRes {
  @SerializedName("userid")
  private String userid = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mail")
  private String mail = null;

  @SerializedName("csflevel")
  private Long csflevel = null;

  @SerializedName("leakproofvalue")
  private Long leakproofvalue = null;

  @SerializedName("pwdcontrol")
  private Long pwdcontrol = null;

  @SerializedName("usertype")
  private Long usertype = null;

  @SerializedName("directdepinfos")
  private List<UserGetResDirectdeptinfo> directdepinfos = new ArrayList<UserGetResDirectdeptinfo>();

  @SerializedName("needsecondauth")
  private Boolean needsecondauth = null;

  @SerializedName("freezestatus")
  private Boolean freezestatus = null;

  @SerializedName("agreedtotermsofuse")
  private Boolean agreedtotermsofuse = null;

  @SerializedName("ismanager")
  private Boolean ismanager = null;

  @SerializedName("telnumber")
  private String telnumber = null;

  @SerializedName("needrealnameauth")
  private Boolean needrealnameauth = null;

  @SerializedName("roletypes")
  private List<Long> roletypes = new ArrayList<Long>();

  @SerializedName("roleinfos")
  private List<UserGetResRoleinfo> roleinfos = new ArrayList<UserGetResRoleinfo>();

  public UserGetRes userid(String userid) {
    this.userid = userid;
    return this;
  }

   /**
   * 用户唯一标识
   * @return userid
  **/
  @Schema(required = true, description = "用户唯一标识")
  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public UserGetRes account(String account) {
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

  public UserGetRes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 用户显示名
   * @return name
  **/
  @Schema(required = true, description = "用户显示名")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserGetRes mail(String mail) {
    this.mail = mail;
    return this;
  }

   /**
   * 用户邮箱地址
   * @return mail
  **/
  @Schema(required = true, description = "用户邮箱地址")
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public UserGetRes csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

   /**
   * 用户密级，5~15
   * @return csflevel
  **/
  @Schema(required = true, description = "用户密级，5~15")
  public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public UserGetRes leakproofvalue(Long leakproofvalue) {
    this.leakproofvalue = leakproofvalue;
    return this;
  }

   /**
   * 防泄密配置  0表示不允许打印，也不允许拷屏  1表示允许打印  2表示允许拷屏  3表示允许打印/拷屏
   * @return leakproofvalue
  **/
  @Schema(required = true, description = "防泄密配置  0表示不允许打印，也不允许拷屏  1表示允许打印  2表示允许拷屏  3表示允许打印/拷屏")
  public Long getLeakproofvalue() {
    return leakproofvalue;
  }

  public void setLeakproofvalue(Long leakproofvalue) {
    this.leakproofvalue = leakproofvalue;
  }

  public UserGetRes pwdcontrol(Long pwdcontrol) {
    this.pwdcontrol = pwdcontrol;
    return this;
  }

   /**
   * 是否开启管控密码  1 表示开启  0 表示关闭
   * @return pwdcontrol
  **/
  @Schema(required = true, description = "是否开启管控密码  1 表示开启  0 表示关闭")
  public Long getPwdcontrol() {
    return pwdcontrol;
  }

  public void setPwdcontrol(Long pwdcontrol) {
    this.pwdcontrol = pwdcontrol;
  }

  public UserGetRes usertype(Long usertype) {
    this.usertype = usertype;
    return this;
  }

   /**
   * 用户类型  1 表示本地用户  2 表示域用户  3 表示第三方认证用户
   * @return usertype
  **/
  @Schema(required = true, description = "用户类型  1 表示本地用户  2 表示域用户  3 表示第三方认证用户")
  public Long getUsertype() {
    return usertype;
  }

  public void setUsertype(Long usertype) {
    this.usertype = usertype;
  }

  public UserGetRes directdepinfos(List<UserGetResDirectdeptinfo> directdepinfos) {
    this.directdepinfos = directdepinfos;
    return this;
  }

  public UserGetRes addDirectdepinfosItem(UserGetResDirectdeptinfo directdepinfosItem) {
    this.directdepinfos.add(directdepinfosItem);
    return this;
  }

   /**
   * 用户的多个直属部门信息
   * @return directdepinfos
  **/
  @Schema(required = true, description = "用户的多个直属部门信息")
  public List<UserGetResDirectdeptinfo> getDirectdepinfos() {
    return directdepinfos;
  }

  public void setDirectdepinfos(List<UserGetResDirectdeptinfo> directdepinfos) {
    this.directdepinfos = directdepinfos;
  }

  public UserGetRes needsecondauth(Boolean needsecondauth) {
    this.needsecondauth = needsecondauth;
    return this;
  }

   /**
   * 是否需要二次认证
   * @return needsecondauth
  **/
  @Schema(required = true, description = "是否需要二次认证")
  public Boolean isNeedsecondauth() {
    return needsecondauth;
  }

  public void setNeedsecondauth(Boolean needsecondauth) {
    this.needsecondauth = needsecondauth;
  }

  public UserGetRes freezestatus(Boolean freezestatus) {
    this.freezestatus = freezestatus;
    return this;
  }

   /**
   * 冻结状态 true：冻结 false：未冻结
   * @return freezestatus
  **/
  @Schema(required = true, description = "冻结状态 true：冻结 false：未冻结")
  public Boolean isFreezestatus() {
    return freezestatus;
  }

  public void setFreezestatus(Boolean freezestatus) {
    this.freezestatus = freezestatus;
  }

  public UserGetRes agreedtotermsofuse(Boolean agreedtotermsofuse) {
    this.agreedtotermsofuse = agreedtotermsofuse;
    return this;
  }

   /**
   * 同意使用协议状态 true：同意  false：未同意
   * @return agreedtotermsofuse
  **/
  @Schema(required = true, description = "同意使用协议状态 true：同意  false：未同意")
  public Boolean isAgreedtotermsofuse() {
    return agreedtotermsofuse;
  }

  public void setAgreedtotermsofuse(Boolean agreedtotermsofuse) {
    this.agreedtotermsofuse = agreedtotermsofuse;
  }

  public UserGetRes ismanager(Boolean ismanager) {
    this.ismanager = ismanager;
    return this;
  }

   /**
   * 是否为组织管理员
   * @return ismanager
  **/
  @Schema(required = true, description = "是否为组织管理员")
  public Boolean isIsmanager() {
    return ismanager;
  }

  public void setIsmanager(Boolean ismanager) {
    this.ismanager = ismanager;
  }

  public UserGetRes telnumber(String telnumber) {
    this.telnumber = telnumber;
    return this;
  }

   /**
   * 用户手机号
   * @return telnumber
  **/
  @Schema(required = true, description = "用户手机号")
  public String getTelnumber() {
    return telnumber;
  }

  public void setTelnumber(String telnumber) {
    this.telnumber = telnumber;
  }

  public UserGetRes needrealnameauth(Boolean needrealnameauth) {
    this.needrealnameauth = needrealnameauth;
    return this;
  }

   /**
   * 用户是否需实名认证 true：需要 false : 不需要
   * @return needrealnameauth
  **/
  @Schema(required = true, description = "用户是否需实名认证 true：需要 false : 不需要")
  public Boolean isNeedrealnameauth() {
    return needrealnameauth;
  }

  public void setNeedrealnameauth(Boolean needrealnameauth) {
    this.needrealnameauth = needrealnameauth;
  }

  public UserGetRes roletypes(List<Long> roletypes) {
    this.roletypes = roletypes;
    return this;
  }

  public UserGetRes addRoletypesItem(Long roletypesItem) {
    this.roletypes.add(roletypesItem);
    return this;
  }

   /**
   * 所属角色，整数数组，每个整数表示不同的角色  1：表示文档审核员  [1]
   * @return roletypes
  **/
  @Schema(required = true, description = "所属角色，整数数组，每个整数表示不同的角色  1：表示文档审核员  [1]")
  public List<Long> getRoletypes() {
    return roletypes;
  }

  public void setRoletypes(List<Long> roletypes) {
    this.roletypes = roletypes;
  }

  public UserGetRes roleinfos(List<UserGetResRoleinfo> roleinfos) {
    this.roleinfos = roleinfos;
    return this;
  }

  public UserGetRes addRoleinfosItem(UserGetResRoleinfo roleinfosItem) {
    this.roleinfos.add(roleinfosItem);
    return this;
  }

   /**
   * 用户角色信息
   * @return roleinfos
  **/
  @Schema(required = true, description = "用户角色信息")
  public List<UserGetResRoleinfo> getRoleinfos() {
    return roleinfos;
  }

  public void setRoleinfos(List<UserGetResRoleinfo> roleinfos) {
    this.roleinfos = roleinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetRes userGetRes = (UserGetRes) o;
    return Objects.equals(this.userid, userGetRes.userid) &&
        Objects.equals(this.account, userGetRes.account) &&
        Objects.equals(this.name, userGetRes.name) &&
        Objects.equals(this.mail, userGetRes.mail) &&
        Objects.equals(this.csflevel, userGetRes.csflevel) &&
        Objects.equals(this.leakproofvalue, userGetRes.leakproofvalue) &&
        Objects.equals(this.pwdcontrol, userGetRes.pwdcontrol) &&
        Objects.equals(this.usertype, userGetRes.usertype) &&
        Objects.equals(this.directdepinfos, userGetRes.directdepinfos) &&
        Objects.equals(this.needsecondauth, userGetRes.needsecondauth) &&
        Objects.equals(this.freezestatus, userGetRes.freezestatus) &&
        Objects.equals(this.agreedtotermsofuse, userGetRes.agreedtotermsofuse) &&
        Objects.equals(this.ismanager, userGetRes.ismanager) &&
        Objects.equals(this.telnumber, userGetRes.telnumber) &&
        Objects.equals(this.needrealnameauth, userGetRes.needrealnameauth) &&
        Objects.equals(this.roletypes, userGetRes.roletypes) &&
        Objects.equals(this.roleinfos, userGetRes.roleinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, account, name, mail, csflevel, leakproofvalue, pwdcontrol, usertype, directdepinfos, needsecondauth, freezestatus, agreedtotermsofuse, ismanager, telnumber, needrealnameauth, roletypes, roleinfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetRes {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    leakproofvalue: ").append(toIndentedString(leakproofvalue)).append("\n");
    sb.append("    pwdcontrol: ").append(toIndentedString(pwdcontrol)).append("\n");
    sb.append("    usertype: ").append(toIndentedString(usertype)).append("\n");
    sb.append("    directdepinfos: ").append(toIndentedString(directdepinfos)).append("\n");
    sb.append("    needsecondauth: ").append(toIndentedString(needsecondauth)).append("\n");
    sb.append("    freezestatus: ").append(toIndentedString(freezestatus)).append("\n");
    sb.append("    agreedtotermsofuse: ").append(toIndentedString(agreedtotermsofuse)).append("\n");
    sb.append("    ismanager: ").append(toIndentedString(ismanager)).append("\n");
    sb.append("    telnumber: ").append(toIndentedString(telnumber)).append("\n");
    sb.append("    needrealnameauth: ").append(toIndentedString(needrealnameauth)).append("\n");
    sb.append("    roletypes: ").append(toIndentedString(roletypes)).append("\n");
    sb.append("    roleinfos: ").append(toIndentedString(roleinfos)).append("\n");
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