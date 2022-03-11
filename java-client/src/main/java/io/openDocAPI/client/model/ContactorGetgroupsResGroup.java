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
 * ContactorGetgroupsResGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class ContactorGetgroupsResGroup {
  @SerializedName("id")
  private String id = null;

  @SerializedName("groupname")
  private String groupname = null;

  @SerializedName("count")
  private Long count = null;

  public ContactorGetgroupsResGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 分组id
   * @return id
  **/
  @Schema(required = true, description = "分组id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContactorGetgroupsResGroup groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

   /**
   * 分组名
   * @return groupname
  **/
  @Schema(required = true, description = "分组名")
  public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  public ContactorGetgroupsResGroup count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * 分组下联系人个数
   * @return count
  **/
  @Schema(required = true, description = "分组下联系人个数")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactorGetgroupsResGroup contactorGetgroupsResGroup = (ContactorGetgroupsResGroup) o;
    return Objects.equals(this.id, contactorGetgroupsResGroup.id) &&
        Objects.equals(this.groupname, contactorGetgroupsResGroup.groupname) &&
        Objects.equals(this.count, contactorGetgroupsResGroup.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupname, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactorGetgroupsResGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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