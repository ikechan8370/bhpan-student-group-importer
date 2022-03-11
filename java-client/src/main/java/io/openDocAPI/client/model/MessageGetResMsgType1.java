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
import io.openDocAPI.client.model.MessageGetResMsgBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MessageGetResMsgType1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class MessageGetResMsgType1 extends MessageGetResMsgBase {
  @SerializedName("allowvalue")
  private Long allowvalue = null;

  @SerializedName("denyvalue")
  private Long denyvalue = null;

  @SerializedName("end")
  private Long end = null;

  public MessageGetResMsgType1 allowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
    return this;
  }

   /**
   * 允许的权限值，按bit为存储，参考权限获取
   * @return allowvalue
  **/
  @Schema(required = true, description = "允许的权限值，按bit为存储，参考权限获取")
  public Long getAllowvalue() {
    return allowvalue;
  }

  public void setAllowvalue(Long allowvalue) {
    this.allowvalue = allowvalue;
  }

  public MessageGetResMsgType1 denyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
    return this;
  }

   /**
   * 拒绝的权限值，按bit为存储，参考权限获取
   * @return denyvalue
  **/
  @Schema(required = true, description = "拒绝的权限值，按bit为存储，参考权限获取")
  public Long getDenyvalue() {
    return denyvalue;
  }

  public void setDenyvalue(Long denyvalue) {
    this.denyvalue = denyvalue;
  }

  public MessageGetResMsgType1 end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * 有效到期时间 (unix utc 精确到微秒)  -1 无限期
   * @return end
  **/
  @Schema(required = true, description = "有效到期时间 (unix utc 精确到微秒)  -1 无限期")
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgType1 messageGetResMsgType1 = (MessageGetResMsgType1) o;
    return Objects.equals(this.allowvalue, messageGetResMsgType1.allowvalue) &&
        Objects.equals(this.denyvalue, messageGetResMsgType1.denyvalue) &&
        Objects.equals(this.end, messageGetResMsgType1.end) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowvalue, denyvalue, end, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowvalue: ").append(toIndentedString(allowvalue)).append("\n");
    sb.append("    denyvalue: ").append(toIndentedString(denyvalue)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
