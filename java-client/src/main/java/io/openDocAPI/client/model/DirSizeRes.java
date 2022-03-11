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
 * DirSizeRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DirSizeRes {
  @SerializedName("dirnum")
  private Long dirnum = null;

  @SerializedName("filenum")
  private Long filenum = null;

  @SerializedName("recyclesize")
  private Long recyclesize = null;

  @SerializedName("totalsize")
  private Long totalsize = null;

  public DirSizeRes dirnum(Long dirnum) {
    this.dirnum = dirnum;
    return this;
  }

   /**
   * 总目录数
   * @return dirnum
  **/
  @Schema(required = true, description = "总目录数")
  public Long getDirnum() {
    return dirnum;
  }

  public void setDirnum(Long dirnum) {
    this.dirnum = dirnum;
  }

  public DirSizeRes filenum(Long filenum) {
    this.filenum = filenum;
    return this;
  }

   /**
   * 总文件数
   * @return filenum
  **/
  @Schema(required = true, description = "总文件数")
  public Long getFilenum() {
    return filenum;
  }

  public void setFilenum(Long filenum) {
    this.filenum = filenum;
  }

  public DirSizeRes recyclesize(Long recyclesize) {
    this.recyclesize = recyclesize;
    return this;
  }

   /**
   * 回收站大小，如果docid不为CID或者回收站对象的gns，recyclesize返回-1
   * @return recyclesize
  **/
  @Schema(required = true, description = "回收站大小，如果docid不为CID或者回收站对象的gns，recyclesize返回-1")
  public Long getRecyclesize() {
    return recyclesize;
  }

  public void setRecyclesize(Long recyclesize) {
    this.recyclesize = recyclesize;
  }

  public DirSizeRes totalsize(Long totalsize) {
    this.totalsize = totalsize;
    return this;
  }

   /**
   * 总大小
   * @return totalsize
  **/
  @Schema(required = true, description = "总大小")
  public Long getTotalsize() {
    return totalsize;
  }

  public void setTotalsize(Long totalsize) {
    this.totalsize = totalsize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirSizeRes dirSizeRes = (DirSizeRes) o;
    return Objects.equals(this.dirnum, dirSizeRes.dirnum) &&
        Objects.equals(this.filenum, dirSizeRes.filenum) &&
        Objects.equals(this.recyclesize, dirSizeRes.recyclesize) &&
        Objects.equals(this.totalsize, dirSizeRes.totalsize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirnum, filenum, recyclesize, totalsize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirSizeRes {\n");
    
    sb.append("    dirnum: ").append(toIndentedString(dirnum)).append("\n");
    sb.append("    filenum: ").append(toIndentedString(filenum)).append("\n");
    sb.append("    recyclesize: ").append(toIndentedString(recyclesize)).append("\n");
    sb.append("    totalsize: ").append(toIndentedString(totalsize)).append("\n");
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