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
 * Perm2SetReqPerminfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Perm2SetReqPerminfo {
  @SerializedName("accessorid")
  private String accessorid = null;

  /**
   * 访问者类型
   */
  @JsonAdapter(AccessortypeEnum.Adapter.class)
  public enum AccessortypeEnum {
    USER("user"),
    DEPARTMENT("department"),
    CONTACTOR("contactor");

    private String value;

    AccessortypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AccessortypeEnum fromValue(String text) {
      for (AccessortypeEnum b : AccessortypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccessortypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessortypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessortypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessortypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("accessortype")
  private AccessortypeEnum accessortype = null;

  @SerializedName("denyvalue")
  private Long denyvalue = null;

  @SerializedName("allowvalue")
  private Long allowvalue = null;

  @SerializedName("endtime")
  private Long endtime = null;

  @SerializedName("inheritpath")
  private String inheritpath = null;

  public Perm2SetReqPerminfo accessorid(String accessorid) {
    this.accessorid = accessorid;
    return this;
  }

   /**
   * 访问者id，可能是用户、部门、联系人
   * @return accessorid
  **/
  @Schema(required = true, description = "访问者id，可能是用户、部门、联系人")
  public String getAccessorid() {
    return accessorid;
  }

  public void setAccessorid(String accessorid) {
    this.accessorid = accessorid;
  }

  public Perm2SetReqPerminfo accessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
    return this;
  }

   /**
   * 访问者类型
   * @return accessortype
  **/
  @Schema(required = true, description = "访问者类型")
  public AccessortypeEnum getAccessortype() {
    return accessortype;
  }

  public void setAccessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
  }

  public Perm2SetReqPerminfo denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

   /**
   * 拒绝权限  权限值，按bit位存储  0x00000000，未设置  0x00000001，显示  0x00000002，预览  0x00000004，下载  0x00000008，新建  0x00000010，修改  0x00000020，删除  0x00000040，复制  
   * @return denyvalue
  **/
  @Schema(required = true, description = "拒绝权限  权限值，按bit位存储  0x00000000，未设置  0x00000001，显示  0x00000002，预览  0x00000004，下载  0x00000008，新建  0x00000010，修改  0x00000020，删除  0x00000040，复制  ")
  public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }

  public Perm2SetReqPerminfo allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

   /**
   * 允许权限，值与denyvalue相同
   * @return allowvalue
  **/
  @Schema(required = true, description = "允许权限，值与denyvalue相同")
  public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public Perm2SetReqPerminfo endtime(Long endtime) {
    this.endtime = endtime;
    return this;
  }

   /**
   * 权限到期时间，单位：微秒，-1表示无限期
   * @return endtime
  **/
  @Schema(required = true, description = "权限到期时间，单位：微秒，-1表示无限期")
  public Long getEndtime() {
    return endtime;
  }

  public void setEndtime(Long endtime) {
    this.endtime = endtime;
  }

  public Perm2SetReqPerminfo inheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
    return this;
  }

   /**
   * 值为非空字符串时，忽略该条权限
   * @return inheritpath
  **/
  @Schema(description = "值为非空字符串时，忽略该条权限")
  public String getInheritpath() {
    return inheritpath;
  }

  public void setInheritpath(String inheritpath) {
    this.inheritpath = inheritpath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm2SetReqPerminfo perm2SetReqPerminfo = (Perm2SetReqPerminfo) o;
    return Objects.equals(this.accessorid, perm2SetReqPerminfo.accessorid) &&
        Objects.equals(this.accessortype, perm2SetReqPerminfo.accessortype) &&
        Objects.equals(this.denyvalue, perm2SetReqPerminfo.denyvalue) &&
        Objects.equals(this.allowvalue, perm2SetReqPerminfo.allowvalue) &&
        Objects.equals(this.endtime, perm2SetReqPerminfo.endtime) &&
        Objects.equals(this.inheritpath, perm2SetReqPerminfo.inheritpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorid, accessortype, denyvalue, allowvalue, endtime, inheritpath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm2SetReqPerminfo {\n");
    
    sb.append("    accessorid: ").append(toIndentedString(accessorid)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    endtime: ").append(toIndentedString(endtime)).append("\n");
    sb.append("    inheritpath: ").append(toIndentedString(inheritpath)).append("\n");
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