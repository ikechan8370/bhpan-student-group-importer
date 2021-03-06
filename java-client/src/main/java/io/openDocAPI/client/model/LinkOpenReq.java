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
 * LinkOpenReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class LinkOpenReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("open")
  private Boolean open = null;

  @SerializedName("endtime")
  private Long endtime = null;

  @SerializedName("perm")
  private Long perm = null;

  @SerializedName("limittimes")
  private Long limittimes = null;

  public LinkOpenReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 待开启外链的对象gns路径
   * @return docid
  **/
  @Schema(required = true, description = "待开启外链的对象gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkOpenReq open(Boolean open) {
    this.open = open;
    return this;
  }

   /**
   * 如果true，返回密码，false，密码空
   * @return open
  **/
  @Schema(description = "如果true，返回密码，false，密码空")
  public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public LinkOpenReq endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

   /**
   * 到期时间，单位：微秒
   * @return endtime
  **/
  @Schema(description = "到期时间，单位：微秒")
  public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public LinkOpenReq perm(Long perm) {
    this.perm = perm;
    return this;
  }

   /**
   * 权限值，值域为[1,7]，具体说明参见开启外链中的描述
   * @return perm
  **/
  @Schema(description = "权限值，值域为[1,7]，具体说明参见开启外链中的描述")
  public Long getPerm() {
    return perm;
  }

  public void setPerm(Long perm) {
    this.perm = perm;
  }

  public LinkOpenReq limittimes(Long limittimes) {
    this.limittimes = limittimes;
    return this;
  }

   /**
   * 外链使用次数。  -1为无限制  
   * @return limittimes
  **/
  @Schema(description = "外链使用次数。  -1为无限制  ")
  public Long getLimittimes() {
    return limittimes;
  }

  public void setLimittimes(Long limittimes) {
    this.limittimes = limittimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkOpenReq linkOpenReq = (LinkOpenReq) o;
    return Objects.equals(this.docid, linkOpenReq.docid) &&
        Objects.equals(this.open, linkOpenReq.open) &&
        Objects.equals(this.endtime, linkOpenReq.endtime) &&
        Objects.equals(this.perm, linkOpenReq.perm) &&
        Objects.equals(this.limittimes, linkOpenReq.limittimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, open, endtime, perm, limittimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkOpenReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
    sb.append("    limittimes: ").append(toIndentedString(limittimes)).append("\n");
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
