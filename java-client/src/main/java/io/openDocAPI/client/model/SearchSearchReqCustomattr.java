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
 * SearchSearchReqCustomattr
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class SearchSearchReqCustomattr {
  @SerializedName("attr")
  private Long attr = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("level")
  private Long level = null;

  @SerializedName("value")
  private Long value = null;

  @SerializedName("rvalue")
  private Long rvalue = null;

  @SerializedName("lvalue")
  private Long lvalue = null;

  public SearchSearchReqCustomattr attr(Long attr) {
    this.attr = attr;
    return this;
  }

   /**
   * 自定义属性id，customattr内每个对象必须有attr
   * @return attr
  **/
  @Schema(description = "自定义属性id，customattr内每个对象必须有attr")
  public Long getAttr() {
    return attr;
  }

  public void setAttr(Long attr) {
    this.attr = attr;
  }

  public SearchSearchReqCustomattr condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * 自定义属性搜索条件，customattr内每个对象必须有condition，可以为：  “&#x3D;”，需要给出value  “&gt;”，需要给出value  “&lt;”，需要给出value  “[]”，需要给出lvalue，rvalue，搜索符合 [lvalue, rvalue] 范围内的记录  
   * @return condition
  **/
  @Schema(description = "自定义属性搜索条件，customattr内每个对象必须有condition，可以为：  “=”，需要给出value  “>”，需要给出value  “<”，需要给出value  “[]”，需要给出lvalue，rvalue，搜索符合 [lvalue, rvalue] 范围内的记录  ")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public SearchSearchReqCustomattr level(Long level) {
    this.level = level;
    return this;
  }

   /**
   * 层级自定义属性的值的层数  默认为0，表示非层级属性  
   * @return level
  **/
  @Schema(description = "层级自定义属性的值的层数  默认为0，表示非层级属性  ")
  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public SearchSearchReqCustomattr value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * 自定义属性搜索关键词id或数值，condition为“&#x3D;”、 “&gt;”、 “&lt;”时需要该项值
   * @return value
  **/
  @Schema(description = "自定义属性搜索关键词id或数值，condition为“=”、 “>”、 “<”时需要该项值")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public SearchSearchReqCustomattr rvalue(Long rvalue) {
    this.rvalue = rvalue;
    return this;
  }

   /**
   * 自定义属性搜索数值，condition为”[]”时需要该项值
   * @return rvalue
  **/
  @Schema(description = "自定义属性搜索数值，condition为”[]”时需要该项值")
  public Long getRvalue() {
    return rvalue;
  }

  public void setRvalue(Long rvalue) {
    this.rvalue = rvalue;
  }

  public SearchSearchReqCustomattr lvalue(Long lvalue) {
    this.lvalue = lvalue;
    return this;
  }

   /**
   * 自定义属性搜索数值，condition为”[]”时需要该项值
   * @return lvalue
  **/
  @Schema(description = "自定义属性搜索数值，condition为”[]”时需要该项值")
  public Long getLvalue() {
    return lvalue;
  }

  public void setLvalue(Long lvalue) {
    this.lvalue = lvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSearchReqCustomattr searchSearchReqCustomattr = (SearchSearchReqCustomattr) o;
    return Objects.equals(this.attr, searchSearchReqCustomattr.attr) &&
        Objects.equals(this.condition, searchSearchReqCustomattr.condition) &&
        Objects.equals(this.level, searchSearchReqCustomattr.level) &&
        Objects.equals(this.value, searchSearchReqCustomattr.value) &&
        Objects.equals(this.rvalue, searchSearchReqCustomattr.rvalue) &&
        Objects.equals(this.lvalue, searchSearchReqCustomattr.lvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attr, condition, level, value, rvalue, lvalue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSearchReqCustomattr {\n");
    
    sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    rvalue: ").append(toIndentedString(rvalue)).append("\n");
    sb.append("    lvalue: ").append(toIndentedString(lvalue)).append("\n");
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
