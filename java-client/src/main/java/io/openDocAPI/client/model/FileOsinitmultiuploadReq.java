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
 * FileOsinitmultiuploadReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class FileOsinitmultiuploadReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("length")
  private Long length = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("client_mtime")
  private Long clientMtime = null;

  @SerializedName("ondup")
  private Long ondup = null;

  @SerializedName("csflevel")
  private Long csflevel = null;

  @SerializedName("editedrev")
  private String editedrev = null;

  public FileOsinitmultiuploadReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns；  
   * @return docid
  **/
  @Schema(required = true, description = "gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns；  ")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileOsinitmultiuploadReq length(Long length) {
    this.length = length;
    return this;
  }

   /**
   * 整个文件的长度
   * @return length
  **/
  @Schema(required = true, description = "整个文件的长度")
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public FileOsinitmultiuploadReq name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 文件名称，UTF8编码  - 创建文件时， name为文件名；  - 编辑文件时（文件生成新版本），参数为空；  
   * @return name
  **/
  @Schema(description = "文件名称，UTF8编码  - 创建文件时， name为文件名；  - 编辑文件时（文件生成新版本），参数为空；  ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileOsinitmultiuploadReq clientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
    return this;
  }

   /**
   * 由客户端设置的文件本地修改时间    创建新版本（rev为空或name为为空）时，写入版本  
   * @return clientMtime
  **/
  @Schema(description = "由客户端设置的文件本地修改时间    创建新版本（rev为空或name为为空）时，写入版本  ")
  public Long getClientMtime() {
    return clientMtime;
  }

  public void setClientMtime(Long clientMtime) {
    this.clientMtime = clientMtime;
  }

  public FileOsinitmultiuploadReq ondup(Long ondup) {
    this.ondup = ondup;
    return this;
  }

   /**
   * 当name不为空时生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  
   * @return ondup
  **/
  @Schema(description = "当name不为空时生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖  ")
  public Long getOndup() {
    return ondup;
  }

  public void setOndup(Long ondup) {
    this.ondup = ondup;
  }

  public FileOsinitmultiuploadReq csflevel(Long csflevel) {
    this.csflevel = csflevel;
    return this;
  }

   /**
   * 文件密级预检查，要设置密级必须在osendupload中设置  - 0：默认值，不检查密级  - 5~15：正常密级  - 0x7FFF：空密级  
   * @return csflevel
  **/
  @Schema(description = "文件密级预检查，要设置密级必须在osendupload中设置  - 0：默认值，不检查密级  - 5~15：正常密级  - 0x7FFF：空密级  ")
  public Long getCsflevel() {
    return csflevel;
  }

  public void setCsflevel(Long csflevel) {
    this.csflevel = csflevel;
  }

  public FileOsinitmultiuploadReq editedrev(String editedrev) {
    this.editedrev = editedrev;
    return this;
  }

   /**
   * 表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”；  
   * @return editedrev
  **/
  @Schema(description = "表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”；  ")
  public String getEditedrev() {
    return editedrev;
  }

  public void setEditedrev(String editedrev) {
    this.editedrev = editedrev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileOsinitmultiuploadReq fileOsinitmultiuploadReq = (FileOsinitmultiuploadReq) o;
    return Objects.equals(this.docid, fileOsinitmultiuploadReq.docid) &&
        Objects.equals(this.length, fileOsinitmultiuploadReq.length) &&
        Objects.equals(this.name, fileOsinitmultiuploadReq.name) &&
        Objects.equals(this.clientMtime, fileOsinitmultiuploadReq.clientMtime) &&
        Objects.equals(this.ondup, fileOsinitmultiuploadReq.ondup) &&
        Objects.equals(this.csflevel, fileOsinitmultiuploadReq.csflevel) &&
        Objects.equals(this.editedrev, fileOsinitmultiuploadReq.editedrev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, length, name, clientMtime, ondup, csflevel, editedrev);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileOsinitmultiuploadReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientMtime: ").append(toIndentedString(clientMtime)).append("\n");
    sb.append("    ondup: ").append(toIndentedString(ondup)).append("\n");
    sb.append("    csflevel: ").append(toIndentedString(csflevel)).append("\n");
    sb.append("    editedrev: ").append(toIndentedString(editedrev)).append("\n");
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