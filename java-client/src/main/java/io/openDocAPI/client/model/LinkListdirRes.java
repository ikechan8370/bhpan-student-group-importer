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
import io.openDocAPI.client.model.LinkListdirResDir;
import io.openDocAPI.client.model.LinkListdirResFile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LinkListdirRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class LinkListdirRes {
  @SerializedName("dirs")
  private List<LinkListdirResDir> dirs = new ArrayList<LinkListdirResDir>();

  @SerializedName("files")
  private List<LinkListdirResFile> files = new ArrayList<LinkListdirResFile>();

  public LinkListdirRes dirs(List<LinkListdirResDir> dirs) {
    this.dirs = dirs;
    return this;
  }

  public LinkListdirRes addDirsItem(LinkListdirResDir dirsItem) {
    this.dirs.add(dirsItem);
    return this;
  }

   /**
   * 文件夹信息
   * @return dirs
  **/
  @Schema(required = true, description = "文件夹信息")
  public List<LinkListdirResDir> getDirs() {
    return dirs;
  }

  public void setDirs(List<LinkListdirResDir> dirs) {
    this.dirs = dirs;
  }

  public LinkListdirRes files(List<LinkListdirResFile> files) {
    this.files = files;
    return this;
  }

  public LinkListdirRes addFilesItem(LinkListdirResFile filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * 文件信息
   * @return files
  **/
  @Schema(required = true, description = "文件信息")
  public List<LinkListdirResFile> getFiles() {
    return files;
  }

  public void setFiles(List<LinkListdirResFile> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkListdirRes linkListdirRes = (LinkListdirRes) o;
    return Objects.equals(this.dirs, linkListdirRes.dirs) &&
        Objects.equals(this.files, linkListdirRes.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dirs, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkListdirRes {\n");
    
    sb.append("    dirs: ").append(toIndentedString(dirs)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
