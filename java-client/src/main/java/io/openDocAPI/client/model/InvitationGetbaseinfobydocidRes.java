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
 * InvitationGetbaseinfobydocidRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class InvitationGetbaseinfobydocidRes {
  @SerializedName("invitationendtime")
  private Long invitationendtime = null;

  @SerializedName("invitationid")
  private String invitationid = null;

  @SerializedName("perm")
  private Long perm = null;

  @SerializedName("permendtime")
  private Long permendtime = null;

  public InvitationGetbaseinfobydocidRes invitationendtime(Long invitationendtime) {
    this.invitationendtime = invitationendtime;
    return this;
  }

   /**
   * 邀请链接到期时间，如果为-1，表示无限期
   * @return invitationendtime
  **/
  @Schema(required = true, description = "邀请链接到期时间，如果为-1，表示无限期")
  public Long getInvitationendtime() {
    return invitationendtime;
  }

  public void setInvitationendtime(Long invitationendtime) {
    this.invitationendtime = invitationendtime;
  }

  public InvitationGetbaseinfobydocidRes invitationid(String invitationid) {
    this.invitationid = invitationid;
    return this;
  }

   /**
   * 邀请链接唯一标识
   * @return invitationid
  **/
  @Schema(required = true, description = "邀请链接唯一标识")
  public String getInvitationid() {
    return invitationid;
  }

  public void setInvitationid(String invitationid) {
    this.invitationid = invitationid;
  }

  public InvitationGetbaseinfobydocidRes perm(Long perm) {
    this.perm = perm;
    return this;
  }

   /**
   * 权限值
   * @return perm
  **/
  @Schema(required = true, description = "权限值")
  public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public InvitationGetbaseinfobydocidRes permendtime(Long permendtime) {
    this.permendtime = permendtime;
    return this;
  }

   /**
   * 权限到期时间，如果为-1，表示无限期
   * @return permendtime
  **/
  @Schema(required = true, description = "权限到期时间，如果为-1，表示无限期")
  public Long getPermendtime() {
    return permendtime;
  }

  public void setPermendtime(Long permendtime) {
    this.permendtime = permendtime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationGetbaseinfobydocidRes invitationGetbaseinfobydocidRes = (InvitationGetbaseinfobydocidRes) o;
    return Objects.equals(this.invitationendtime, invitationGetbaseinfobydocidRes.invitationendtime) &&
        Objects.equals(this.invitationid, invitationGetbaseinfobydocidRes.invitationid) &&
        Objects.equals(this.perm, invitationGetbaseinfobydocidRes.perm) &&
        Objects.equals(this.permendtime, invitationGetbaseinfobydocidRes.permendtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitationendtime, invitationid, perm, permendtime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationGetbaseinfobydocidRes {\n");
    
    sb.append("    invitationendtime: ").append(toIndentedString(invitationendtime)).append("\n");
    sb.append("    invitationid: ").append(toIndentedString(invitationid)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    permendtime: ").append(toIndentedString(permendtime)).append("\n");
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