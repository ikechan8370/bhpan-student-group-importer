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
import io.openDocAPI.client.model.Perm1GetsharedResDocinfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Perm1GetsharedRes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Perm1GetsharedRes {
  @SerializedName("docinfos")
  private List<Perm1GetsharedResDocinfo> docinfos = new ArrayList<Perm1GetsharedResDocinfo>();

  public Perm1GetsharedRes docinfos(List<Perm1GetsharedResDocinfo> docinfos) {
    this.docinfos = docinfos;
    return this;
  }

  public Perm1GetsharedRes addDocinfosItem(Perm1GetsharedResDocinfo docinfosItem) {
    this.docinfos.add(docinfosItem);
    return this;
  }

   /**
   * 用户已共享的文档信息
   * @return docinfos
  **/
  @Schema(required = true, description = "用户已共享的文档信息")
  public List<Perm1GetsharedResDocinfo> getDocinfos() {
    return docinfos;
  }

  public void setDocinfos(List<Perm1GetsharedResDocinfo> docinfos) {
    this.docinfos = docinfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1GetsharedRes perm1GetsharedRes = (Perm1GetsharedRes) o;
    return Objects.equals(this.docinfos, perm1GetsharedRes.docinfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docinfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1GetsharedRes {\n");
    
    sb.append("    docinfos: ").append(toIndentedString(docinfos)).append("\n");
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