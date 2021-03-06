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
 * DeviceGetstatusRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class DeviceGetstatusRes {
  @SerializedName("eraseflag")
  private Long eraseflag = null;

  @SerializedName("disableflag")
  private Long disableflag = null;

  public DeviceGetstatusRes eraseflag(Long eraseflag) {
    this.eraseflag = eraseflag;
    return this;
  }

   /**
   * 数据擦除状态  0表示正常  1表示正在请求擦除
   * @return eraseflag
  **/
  @Schema(required = true, description = "数据擦除状态  0表示正常  1表示正在请求擦除")
  public Long getEraseflag() {
    return eraseflag;
  }

  public void setEraseflag(Long eraseflag) {
    this.eraseflag = eraseflag;
  }

  public DeviceGetstatusRes disableflag(Long disableflag) {
    this.disableflag = disableflag;
    return this;
  }

   /**
   * 设备禁用状态  0表示正常  1表示处于禁用状态
   * @return disableflag
  **/
  @Schema(required = true, description = "设备禁用状态  0表示正常  1表示处于禁用状态")
  public Long getDisableflag() {
    return disableflag;
  }

  public void setDisableflag(Long disableflag) {
    this.disableflag = disableflag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceGetstatusRes deviceGetstatusRes = (DeviceGetstatusRes) o;
    return Objects.equals(this.eraseflag, deviceGetstatusRes.eraseflag) &&
        Objects.equals(this.disableflag, deviceGetstatusRes.disableflag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eraseflag, disableflag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGetstatusRes {\n");
    
    sb.append("    eraseflag: ").append(toIndentedString(eraseflag)).append("\n");
    sb.append("    disableflag: ").append(toIndentedString(disableflag)).append("\n");
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
