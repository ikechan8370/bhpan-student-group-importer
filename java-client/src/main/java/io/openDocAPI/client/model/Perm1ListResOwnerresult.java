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
 * Perm1ListResOwnerresult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class Perm1ListResOwnerresult {
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

  @SerializedName("accessorname")
  private String accessorname = null;

  public Perm1ListResOwnerresult accessorid(String accessorid) {
    this.accessorid = accessorid;
    return this;
  }

   /**
   * 访问者id
   * @return accessorid
  **/
  @Schema(required = true, description = "访问者id")
  public String getAccessorid() {
    return accessorid;
  }

  public void setAccessorid(String accessorid) {
    this.accessorid = accessorid;
  }

  public Perm1ListResOwnerresult accessortype(AccessortypeEnum accessortype) {
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

  public Perm1ListResOwnerresult accessorname(String accessorname) {
    this.accessorname = accessorname;
    return this;
  }

   /**
   * 访问者的名称
   * @return accessorname
  **/
  @Schema(required = true, description = "访问者的名称")
  public String getAccessorname() {
    return accessorname;
  }

  public void setAccessorname(String accessorname) {
    this.accessorname = accessorname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Perm1ListResOwnerresult perm1ListResOwnerresult = (Perm1ListResOwnerresult) o;
    return Objects.equals(this.accessorid, perm1ListResOwnerresult.accessorid) &&
        Objects.equals(this.accessortype, perm1ListResOwnerresult.accessortype) &&
        Objects.equals(this.accessorname, perm1ListResOwnerresult.accessorname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorid, accessortype, accessorname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Perm1ListResOwnerresult {\n");
    
    sb.append("    accessorid: ").append(toIndentedString(accessorid)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    accessorname: ").append(toIndentedString(accessorname)).append("\n");
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
