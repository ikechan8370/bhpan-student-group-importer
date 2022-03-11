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
import io.openDocAPI.client.model.Entrydoc2GetuserquotaResQuotainfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Entrydoc2GetuserquotaRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Entrydoc2GetuserquotaRes {
  @SerializedName("quotainfos")
  private List<Entrydoc2GetuserquotaResQuotainfo> quotainfos = new ArrayList<Entrydoc2GetuserquotaResQuotainfo>();

  public Entrydoc2GetuserquotaRes quotainfos(List<Entrydoc2GetuserquotaResQuotainfo> quotainfos) {
    this.quotainfos = quotainfos;
    return this;
  }

  public Entrydoc2GetuserquotaRes addQuotainfosItem(Entrydoc2GetuserquotaResQuotainfo quotainfosItem) {
    this.quotainfos.add(quotainfosItem);
    return this;
  }

   /**
   * 表示多个配额信息
   * @return quotainfos
  **/
  @Schema(required = true, description = "表示多个配额信息")
  public List<Entrydoc2GetuserquotaResQuotainfo> getQuotainfos() {
    return quotainfos;
  }

  public void setQuotainfos(List<Entrydoc2GetuserquotaResQuotainfo> quotainfos) {
    this.quotainfos = quotainfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entrydoc2GetuserquotaRes entrydoc2GetuserquotaRes = (Entrydoc2GetuserquotaRes) o;
    return Objects.equals(this.quotainfos, entrydoc2GetuserquotaRes.quotainfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotainfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entrydoc2GetuserquotaRes {\n");
    
    sb.append("    quotainfos: ").append(toIndentedString(quotainfos)).append("\n");
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
