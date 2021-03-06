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
import io.openDocAPI.client.model.FileSetfilecustomattributeReqAttribute;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FileSetfilecustomattributeReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class FileSetfilecustomattributeReq {
  @SerializedName("docid")
  private String docid = null;

  @SerializedName("attribute")
  private List<FileSetfilecustomattributeReqAttribute> attribute = new ArrayList<FileSetfilecustomattributeReqAttribute>();

  public FileSetfilecustomattributeReq docid(String docid) {
    this.docid = docid;
    return this;
  }

   /**
   * 文件gns路径
   * @return docid
  **/
  @Schema(description = "文件gns路径")
  public String getDocid() {
    return docid;
  }

  public void setDocid(String docid) {
    this.docid = docid;
  }

  public FileSetfilecustomattributeReq attribute(List<FileSetfilecustomattributeReqAttribute> attribute) {
    this.attribute = attribute;
    return this;
  }

  public FileSetfilecustomattributeReq addAttributeItem(FileSetfilecustomattributeReqAttribute attributeItem) {
    this.attribute.add(attributeItem);
    return this;
  }

   /**
   * 属性值数组
   * @return attribute
  **/
  @Schema(required = true, description = "属性值数组")
  public List<FileSetfilecustomattributeReqAttribute> getAttribute() {
    return attribute;
  }

  public void setAttribute(List<FileSetfilecustomattributeReqAttribute> attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSetfilecustomattributeReq fileSetfilecustomattributeReq = (FileSetfilecustomattributeReq) o;
    return Objects.equals(this.docid, fileSetfilecustomattributeReq.docid) &&
        Objects.equals(this.attribute, fileSetfilecustomattributeReq.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docid, attribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSetfilecustomattributeReq {\n");
    
    sb.append("    docid: ").append(toIndentedString(docid)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
