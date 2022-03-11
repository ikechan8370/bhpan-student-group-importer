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
 * 注 1：目前支持的格式为：pdf、wps、doc、docx、et、xls、xlsx、dps、ppt、pptx、txt  注 2：首次预览时会进行转换，会返回提交转换的错误码，需要循环重试，直到发生错误或者返回二进制数据  
 */
@Schema(description = "注 1：目前支持的格式为：pdf、wps、doc、docx、et、xls、xlsx、dps、ppt、pptx、txt  注 2：首次预览时会进行转换，会返回提交转换的错误码，需要循环重试，直到发生错误或者返回二进制数据  ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class LinkPreviewossReq {
  @SerializedName("link")
  private String link = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("docid")
  private String docid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("reqhost")
  private String reqhost = null;

  @SerializedName("usehttps")
  private Boolean usehttps = null;

  public LinkPreviewossReq link(String link) {
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

  public LinkPreviewossReq password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 密码
   * @return password
  **/
  @Schema(required = true, description = "密码")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LinkPreviewossReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文件gns路径，通过文件夹外链进行文档预览时，需要该参数，默认为空
   * @return docid
  **/
  @Schema(description = "文件gns路径，通过文件夹外链进行文档预览时，需要该参数，默认为空")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkPreviewossReq type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 需要预览的转换文件类型  默认参数pdf，获取转换后pdf文件的链接  （参数html，获取转换后html打包文件的链接，需单独部署html转换服务器）  
   * @return type
  **/
  @Schema(description = "需要预览的转换文件类型  默认参数pdf，获取转换后pdf文件的链接  （参数html，获取转换后html打包文件的链接，需单独部署html转换服务器）  ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LinkPreviewossReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

   /**
   * 从存储服务器下载数据时的请求地址
   * @return reqhost
  **/
  @Schema(description = "从存储服务器下载数据时的请求地址")
  public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public LinkPreviewossReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

   /**
   * 是否使用https下载数据，默认为true
   * @return usehttps
  **/
  @Schema(description = "是否使用https下载数据，默认为true")
  public Boolean isUsehttps() {
    return usehttps;
  }

  public void setUsehttps(Boolean usehttps) {
    this.usehttps = usehttps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPreviewossReq linkPreviewossReq = (LinkPreviewossReq) o;
    return Objects.equals(this.link, linkPreviewossReq.link) &&
        Objects.equals(this.password, linkPreviewossReq.password) &&
        Objects.equals(this.docid, linkPreviewossReq.docid) &&
        Objects.equals(this.type, linkPreviewossReq.type) &&
        Objects.equals(this.reqhost, linkPreviewossReq.reqhost) &&
        Objects.equals(this.usehttps, linkPreviewossReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, password, docid, type, reqhost, usehttps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPreviewossReq {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reqhost: ").append(toIndentedString(reqhost)).append("\n");
    sb.append("    usehttps: ").append(toIndentedString(usehttps)).append("\n");
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