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
 * LinkSetRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class LinkSetRes {
  @SerializedName("endtime")
  private Long endtime = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("perm")
  private Long perm = null;

  @SerializedName("limittimes")
  private Long limittimes = null;

  @SerializedName("result")
  private Long result = null;

  public LinkSetRes endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

   /**
   * 到期时间 
   * @return endtime
  **/
  @Schema(required = true, description = "到期时间 ")
  public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public LinkSetRes link(String link) {
    this.link = link;
    return this;
  }

   /**
   * 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0
   * @return link
  **/
  @Schema(required = true, description = "外链唯一标识，如FC5E038D38A57032085441E7FE7010B0")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LinkSetRes password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 空表示没有
   * @return password
  **/
  @Schema(required = true, description = "空表示没有")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LinkSetRes perm(Long perm) {
    this.perm = perm;
    return this;
  }

   /**
   * 权限值，值域为[1,7]，具体说明参见开启外链中的描述
   * @return perm
  **/
  @Schema(required = true, description = "权限值，值域为[1,7]，具体说明参见开启外链中的描述")
  public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public LinkSetRes limittimes(Long limittimes) {
    this.limittimes = limittimes;
    return this;
  }

   /**
   * 外链使用次数。  -1为无限制  
   * @return limittimes
  **/
  @Schema(required = true, description = "外链使用次数。  -1为无限制  ")
  public Long getLimittimes() {
    return limittimes;
  }

  public void setLimittimes(Long limittimes) {
    this.limittimes = limittimes;
  }

  public LinkSetRes result(Long result) {
    this.result = result;
    return this;
  }

   /**
   * 0，请求已生效，返回为最新信息    1，请求正在审核，返回为更改前信息  
   * @return result
  **/
  @Schema(required = true, description = "0，请求已生效，返回为最新信息    1，请求正在审核，返回为更改前信息  ")
  public Long getResult() {
    return result;
  }

  public void setResult(Long result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSetRes linkSetRes = (LinkSetRes) o;
    return Objects.equals(this.endtime, linkSetRes.endtime) &&
        Objects.equals(this.link, linkSetRes.link) &&
        Objects.equals(this.password, linkSetRes.password) &&
        Objects.equals(this.perm, linkSetRes.perm) &&
        Objects.equals(this.limittimes, linkSetRes.limittimes) &&
        Objects.equals(this.result, linkSetRes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endtime, link, password, perm, limittimes, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSetRes {\n");
    
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    limittimes: ").append(toIndentedString(limittimes)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
