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
 * 具体的申请信息，根据apptype，所包含的字段不同
 */
@Schema(description = "具体的申请信息，根据apptype，所包含的字段不同")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class AuditGetshareapplyhistoryResApplyinfoType6Detail {
  @SerializedName("auditmsg")
  private String auditmsg = null;

  @SerializedName("inherit")
  private Boolean inherit = null;

  public AuditGetshareapplyhistoryResApplyinfoType6Detail auditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
    return this;
  }

   /**
   * 审核说明
   * @return auditmsg
  **/
  @Schema(required = true, description = "审核说明")
  public String getAuditmsg() {
    return auditmsg;
  }

  public void setAuditmsg(String auditmsg) {
    this.auditmsg = auditmsg;
  }

  public AuditGetshareapplyhistoryResApplyinfoType6Detail inherit(Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

   /**
   * 是否启用继承  false表示禁用  true表示启用
   * @return inherit
  **/
  @Schema(required = true, description = "是否启用继承  false表示禁用  true表示启用")
  public Boolean isInherit() {
    return inherit;
  }

  public void setInherit(Boolean inherit) {
    this.inherit = inherit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditGetshareapplyhistoryResApplyinfoType6Detail auditGetshareapplyhistoryResApplyinfoType6Detail = (AuditGetshareapplyhistoryResApplyinfoType6Detail) o;
    return Objects.equals(this.auditmsg, auditGetshareapplyhistoryResApplyinfoType6Detail.auditmsg) &&
        Objects.equals(this.inherit, auditGetshareapplyhistoryResApplyinfoType6Detail.inherit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditmsg, inherit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditGetshareapplyhistoryResApplyinfoType6Detail {\n");
    
    sb.append("    auditmsg: ").append(toIndentedString(auditmsg)).append("\n");
    sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
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