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
 * UpdateCheckRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class UpdateCheckRes {
  @SerializedName("result")
  private String result = null;

  @SerializedName("latest")
  private String latest = null;

  @SerializedName("ostype")
  private Long ostype = null;

  @SerializedName("downloadurl")
  private String downloadurl = null;

  @SerializedName("size")
  private Long size = null;

  public UpdateCheckRes result(String result) {
    this.result = result;
    return this;
  }

   /**
   * 客户端是否需要更新 “ok”表示客户端版本是最新的 “optional”表示客户端可选择更新 “forced”表示客户端必须进行更新
   * @return result
  **/
  @Schema(required = true, description = "客户端是否需要更新 “ok”表示客户端版本是最新的 “optional”表示客户端可选择更新 “forced”表示客户端必须进行更新")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public UpdateCheckRes latest(String latest) {
    this.latest = latest;
    return this;
  }

   /**
   * 可用客户端安装包的版本信息，如3.5.4.244形式
   * @return latest
  **/
  @Schema(required = true, description = "可用客户端安装包的版本信息，如3.5.4.244形式")
  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public UpdateCheckRes ostype(Long ostype) {
    this.ostype = ostype;
    return this;
  }

   /**
   * 可用客户端安装包对应的ostype
   * @return ostype
  **/
  @Schema(required = true, description = "可用客户端安装包对应的ostype")
  public Long getOstype() {
    return ostype;
  }

  public void setOstype(Long ostype) {
    this.ostype = ostype;
  }

  public UpdateCheckRes downloadurl(String downloadurl) {
    this.downloadurl = downloadurl;
    return this;
  }

   /**
   * 可用客户端安装包的相对下载路径，需要加上服务器的ip后才能进行下载
   * @return downloadurl
  **/
  @Schema(required = true, description = "可用客户端安装包的相对下载路径，需要加上服务器的ip后才能进行下载")
  public String getDownloadurl() {
    return downloadurl;
  }

  public void setDownloadurl(String downloadurl) {
    this.downloadurl = downloadurl;
  }

  public UpdateCheckRes size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * 可用客户端安装包的大小
   * @return size
  **/
  @Schema(required = true, description = "可用客户端安装包的大小")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCheckRes updateCheckRes = (UpdateCheckRes) o;
    return Objects.equals(this.result, updateCheckRes.result) &&
        Objects.equals(this.latest, updateCheckRes.latest) &&
        Objects.equals(this.ostype, updateCheckRes.ostype) &&
        Objects.equals(this.downloadurl, updateCheckRes.downloadurl) &&
        Objects.equals(this.size, updateCheckRes.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, latest, ostype, downloadurl, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCheckRes {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    ostype: ").append(toIndentedString(ostype)).append("\n");
    sb.append("    downloadurl: ").append(toIndentedString(downloadurl)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
