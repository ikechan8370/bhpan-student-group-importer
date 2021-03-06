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
 * QuarantineListResItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class QuarantineListResItem {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentpath")
  private String parentpath = null;

  @SerializedName("appealexpiredtime")
  private Long appealexpiredtime = null;

  @SerializedName("status")
  private Long status = null;

  public QuarantineListResItem docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文件位于隔离区的docid
   * @return docid
  **/
  @Schema(required = true, description = "文件位于隔离区的docid")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public QuarantineListResItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 文件被隔离时最新名字
   * @return name
  **/
  @Schema(required = true, description = "文件被隔离时最新名字")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QuarantineListResItem parentpath(String parentpath) {
    this.parentpath = parentpath;
    return this;
  }

   /**
   * 文件被隔离时所在路径
   * @return parentpath
  **/
  @Schema(required = true, description = "文件被隔离时所在路径")
  public String getParentpath() {
    return parentpath;
  }

  public void setParentpath(String parentpath) {
    this.parentpath = parentpath;
  }

  public QuarantineListResItem appealexpiredtime(Long appealexpiredtime) {
    this.appealexpiredtime = appealexpiredtime;
    return this;
  }

   /**
   * 文件申诉保护到期日（UNIX时间戳）
   * @return appealexpiredtime
  **/
  @Schema(required = true, description = "文件申诉保护到期日（UNIX时间戳）")
  public Long getAppealexpiredtime() {
    return appealexpiredtime;
  }

  public void setAppealexpiredtime(Long appealexpiredtime) {
    this.appealexpiredtime = appealexpiredtime;
  }

  public QuarantineListResItem status(Long status) {
    this.status = status;
    return this;
  }

   /**
   * 文件状态：  - 1 未申诉  - 2 已申诉  - 3 已否决  
   * @return status
  **/
  @Schema(required = true, description = "文件状态：  - 1 未申诉  - 2 已申诉  - 3 已否决  ")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuarantineListResItem quarantineListResItem = (QuarantineListResItem) o;
    return Objects.equals(this.docid, quarantineListResItem.docid) &&
        Objects.equals(this.name, quarantineListResItem.name) &&
        Objects.equals(this.parentpath, quarantineListResItem.parentpath) &&
        Objects.equals(this.appealexpiredtime, quarantineListResItem.appealexpiredtime) &&
        Objects.equals(this.status, quarantineListResItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, name, parentpath, appealexpiredtime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuarantineListResItem {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentpath: ").append(toIndentedString(parentpath)).append("\n");
    sb.append("    appealexpiredtime: ").append(toIndentedString(appealexpiredtime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
