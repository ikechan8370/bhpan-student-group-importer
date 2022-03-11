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
import java.util.ArrayList;
import java.util.List;
/**
 * DirAddtagsRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DirAddtagsRes {
  @SerializedName("tag_max_num")
  private Long tagMaxNum = null;

  @SerializedName("unsettagnum")
  private Long unsettagnum = null;

  @SerializedName("unsettags")
  private List<String> unsettags = new ArrayList<String>();

  public DirAddtagsRes tagMaxNum(Long tagMaxNum) {
    this.tagMaxNum = tagMaxNum;
    return this;
  }

   /**
   * 允许目录拥有的标签的最大数量
   * @return tagMaxNum
  **/
  @Schema(required = true, description = "允许目录拥有的标签的最大数量")
  public Long getTagMaxNum() {
    return tagMaxNum;
  }

  public void setTagMaxNum(Long tagMaxNum) {
    this.tagMaxNum = tagMaxNum;
  }

  public DirAddtagsRes unsettagnum(Long unsettagnum) {
    this.unsettagnum = unsettagnum;
    return this;
  }

   /**
   * 由于标签数量限制未设置成功的标签数
   * @return unsettagnum
  **/
  @Schema(required = true, description = "由于标签数量限制未设置成功的标签数")
  public Long getUnsettagnum() {
    return unsettagnum;
  }

  public void setUnsettagnum(Long unsettagnum) {
    this.unsettagnum = unsettagnum;
  }

  public DirAddtagsRes unsettags(List<String> unsettags) {
    this.unsettags = unsettags;
    return this;
  }

  public DirAddtagsRes addUnsettagsItem(String unsettagsItem) {
    this.unsettags.add(unsettagsItem);
    return this;
  }

   /**
   * 未设置成功的标签数组
   * @return unsettags
  **/
  @Schema(required = true, description = "未设置成功的标签数组")
  public List<String> getUnsettags() {
    return unsettags;
  }

  public void setUnsettags(List<String> unsettags) {
    this.unsettags = unsettags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirAddtagsRes dirAddtagsRes = (DirAddtagsRes) o;
    return Objects.equals(this.tagMaxNum, dirAddtagsRes.tagMaxNum) &&
        Objects.equals(this.unsettagnum, dirAddtagsRes.unsettagnum) &&
        Objects.equals(this.unsettags, dirAddtagsRes.unsettags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagMaxNum, unsettagnum, unsettags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirAddtagsRes {\n");
    
    sb.append("    tagMaxNum: ").append(toIndentedString(tagMaxNum)).append("\n");
    sb.append("    unsettagnum: ").append(toIndentedString(unsettagnum)).append("\n");
    sb.append("    unsettags: ").append(toIndentedString(unsettags)).append("\n");
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