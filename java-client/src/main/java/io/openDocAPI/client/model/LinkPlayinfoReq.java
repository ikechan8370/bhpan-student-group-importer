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
 * LinkPlayinfoReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class LinkPlayinfoReq {
  @SerializedName("definition")
  private String definition = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("docid")
  private String docid = null;

  @SerializedName("rev")
  private String rev = null;

  public LinkPlayinfoReq definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * 视频画质（音频音质），为空默认为原始画质  有效值：空； od；sd  对于视频，od表示原始画质，sd表示标清；对于音频，sd请求无效
   * @return definition
  **/
  @Schema(description = "视频画质（音频音质），为空默认为原始画质  有效值：空； od；sd  对于视频，od表示原始画质，sd表示标清；对于音频，sd请求无效")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public LinkPlayinfoReq link(String link) {
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

  public LinkPlayinfoReq password(String password) {
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

  public LinkPlayinfoReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文件gns路径，通过文件夹外链在线播放时，需要该参数，默认为空
   * @return docid
  **/
  @Schema(description = "文件gns路径，通过文件夹外链在线播放时，需要该参数，默认为空")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public LinkPlayinfoReq rev(String rev) {
    this.rev = rev;
    return this;
  }

   /**
   * 版本号，为空默认获取最新版本
   * @return rev
  **/
  @Schema(description = "版本号，为空默认获取最新版本")
  public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPlayinfoReq linkPlayinfoReq = (LinkPlayinfoReq) o;
    return Objects.equals(this.definition, linkPlayinfoReq.definition) &&
        Objects.equals(this.link, linkPlayinfoReq.link) &&
        Objects.equals(this.password, linkPlayinfoReq.password) &&
        Objects.equals(this.docid, linkPlayinfoReq.docid) &&
        Objects.equals(this.rev, linkPlayinfoReq.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, link, password, docid, rev);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPlayinfoReq {\n");
    
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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
