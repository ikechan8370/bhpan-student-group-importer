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
 * FileOsuploadpartReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class FileOsuploadpartReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("rev")
  private String rev = null;

  @SerializedName("uploadid")
  private String uploadid = null;

  @SerializedName("parts")
  private String parts = null;

  @SerializedName("reqhost")
  private String reqhost = null;

  @SerializedName("usehttps")
  private Boolean usehttps = null;

  public FileOsuploadpartReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文件的gns路径（创建协议返回）
   * @return docid
  **/
  @Schema(required = true, description = "文件的gns路径（创建协议返回）")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsuploadpartReq rev(String rev) {
    this.rev = rev;
    return this;
  }

   /**
   * 文件版本号
   * @return rev
  **/
  @Schema(required = true, description = "文件版本号")
  public String getRev() {
    return rev;
  }

  public void setRev(String rev) {
    this.rev = rev;
  }

  public FileOsuploadpartReq uploadid(String uploadid) {
    this.uploadid = uploadid;
    return this;
  }

   /**
   * Multiupload事件Id
   * @return uploadid
  **/
  @Schema(required = true, description = "Multiupload事件Id")
  public String getUploadid() {
    return uploadid;
  }

  public void setUploadid(String uploadid) {
    this.uploadid = uploadid;
  }

  public FileOsuploadpartReq parts(String parts) {
    this.parts = parts;
    return this;
  }

   /**
   * 需要鉴权的数据块号，支持两种格式的组合，组合时以逗号分隔：  - 以“-”连接的数据块区间  - 单独的数据块号  - 如：1-100,2,3,4,23-120,130,288  - 数据块号最小为1，最大为10000。  - 根据parts参数的请求形式，可以批量申请上传数据的请求，减少上传文件时的请求次数。  
   * @return parts
  **/
  @Schema(required = true, description = "需要鉴权的数据块号，支持两种格式的组合，组合时以逗号分隔：  - 以“-”连接的数据块区间  - 单独的数据块号  - 如：1-100,2,3,4,23-120,130,288  - 数据块号最小为1，最大为10000。  - 根据parts参数的请求形式，可以批量申请上传数据的请求，减少上传文件时的请求次数。  ")
  public String getParts() {
    return parts;
  }

  public void setParts(String parts) {
    this.parts = parts;
  }

  public FileOsuploadpartReq reqhost(String reqhost) {
    this.reqhost = reqhost;
    return this;
  }

   /**
   * 向存储服务器上传数据时的请求地址
   * @return reqhost
  **/
  @Schema(description = "向存储服务器上传数据时的请求地址")
  public String getReqhost() {
    return reqhost;
  }

  public void setReqhost(String reqhost) {
    this.reqhost = reqhost;
  }

  public FileOsuploadpartReq usehttps(Boolean usehttps) {
    this.usehttps = usehttps;
    return this;
  }

   /**
   * 上传是否使用https，默认为true
   * @return usehttps
  **/
  @Schema(description = "上传是否使用https，默认为true")
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
    FileOsuploadpartReq fileOsuploadpartReq = (FileOsuploadpartReq) o;
    return Objects.equals(this.docid, fileOsuploadpartReq.docid) &&
        Objects.equals(this.rev, fileOsuploadpartReq.rev) &&
        Objects.equals(this.uploadid, fileOsuploadpartReq.uploadid) &&
        Objects.equals(this.parts, fileOsuploadpartReq.parts) &&
        Objects.equals(this.reqhost, fileOsuploadpartReq.reqhost) &&
        Objects.equals(this.usehttps, fileOsuploadpartReq.usehttps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, rev, uploadid, parts, reqhost, usehttps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsuploadpartReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    uploadid: ").append(toIndentedString(uploadid)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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
