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
 * MessageGetResMsgBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-28T09:01:49.177Z[Etc/UTC]")
public class MessageGetResMsgBase {
  @SerializedName("accessorname")
  private String accessorname = null;

  /**
   * 表示访问者类型
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

  @SerializedName("csf")
  private Long csf = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isdir")
  private Boolean isdir = null;

  @SerializedName("isread")
  private Boolean isread = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("type")
  private Long type = null;

  @SerializedName("url")
  private String url = null;

  public MessageGetResMsgBase accessorname(String accessorname) {
    this.accessorname = accessorname;
    return this;
  }

   /**
   * 接收者名字，如果是外链，为空字符串
   * @return accessorname
  **/
  @Schema(required = true, description = "接收者名字，如果是外链，为空字符串")
  public String getAccessorname() {
    return accessorname;
  }

  public void setAccessorname(String accessorname) {
    this.accessorname = accessorname;
  }

  public MessageGetResMsgBase accessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
    return this;
  }

   /**
   * 表示访问者类型
   * @return accessortype
  **/
  @Schema(required = true, description = "表示访问者类型")
  public AccessortypeEnum getAccessortype() {
    return accessortype;
  }

  public void setAccessortype(AccessortypeEnum accessortype) {
    this.accessortype = accessortype;
  }

  public MessageGetResMsgBase csf(Long csf) {
    this.csf = csf;
    return this;
  }

   /**
   * 文件密级，5~15，文件夹为0
   * @return csf
  **/
  @Schema(required = true, description = "文件密级，5~15，文件夹为0")
  public Long getCsf() {
    return csf;
  }

  public void setCsf(Long csf) {
    this.csf = csf;
  }

  public MessageGetResMsgBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 此条消息的唯一标识
   * @return id
  **/
  @Schema(required = true, description = "此条消息的唯一标识")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageGetResMsgBase isdir(Boolean isdir) {
    this.isdir = isdir;
    return this;
  }

   /**
   * 是否为文件夹
   * @return isdir
  **/
  @Schema(required = true, description = "是否为文件夹")
  public Boolean isIsdir() {
    return isdir;
  }

  public void setIsdir(Boolean isdir) {
    this.isdir = isdir;
  }

  public MessageGetResMsgBase isread(Boolean isread) {
    this.isread = isread;
    return this;
  }

   /**
   * 消息是否已读
   * @return isread
  **/
  @Schema(required = true, description = "消息是否已读")
  public Boolean isIsread() {
    return isread;
  }

  public void setIsread(Boolean isread) {
    this.isread = isread;
  }

  public MessageGetResMsgBase sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * 发送者名字
   * @return sender
  **/
  @Schema(required = true, description = "发送者名字")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public MessageGetResMsgBase time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * 共享操作的时间(unix utc ns)
   * @return time
  **/
  @Schema(required = true, description = "共享操作的时间(unix utc ns)")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MessageGetResMsgBase type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * 此条消息的类型  1. 开启共享  2. 关闭共享  3. 设置所有者  4. 取消所有者  5. 开启共享申请  6. 关闭共享申请  7. 设置所有者申请  8. 取消所有者申请  9. 开启外链申请  10. 开启共享审核结果  11. 关闭共享审核结果  12. 开启所有者审核结果  13. 关闭所有者审核结果  14. 开启外链审核结果  15. 待审流程消息  16. 流程进度消息   17. 流程结果消息  18. 简单消息  19. 提交密级申请消息  20. 密级申请审核结果  21. 隔离消息  22. 隔离被还原消息  23. 杀毒消息  24. 创建文档收集任务消息  25. 文档收发变更消息  26. 文档收发提醒消息  27. 取消文档收发任务消息  28. 文件到期通知消息  29. 短信验证码发送  30. 继承变更申请消息  31. 继承变更审核结果
   * @return type
  **/
  @Schema(required = true, description = "此条消息的类型  1. 开启共享  2. 关闭共享  3. 设置所有者  4. 取消所有者  5. 开启共享申请  6. 关闭共享申请  7. 设置所有者申请  8. 取消所有者申请  9. 开启外链申请  10. 开启共享审核结果  11. 关闭共享审核结果  12. 开启所有者审核结果  13. 关闭所有者审核结果  14. 开启外链审核结果  15. 待审流程消息  16. 流程进度消息   17. 流程结果消息  18. 简单消息  19. 提交密级申请消息  20. 密级申请审核结果  21. 隔离消息  22. 隔离被还原消息  23. 杀毒消息  24. 创建文档收集任务消息  25. 文档收发变更消息  26. 文档收发提醒消息  27. 取消文档收发任务消息  28. 文件到期通知消息  29. 短信验证码发送  30. 继承变更申请消息  31. 继承变更审核结果")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public MessageGetResMsgBase url(String url) {
    this.url = url;
    return this;
  }

   /**
   * 内链，相对地址
   * @return url
  **/
  @Schema(required = true, description = "内链，相对地址")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageGetResMsgBase messageGetResMsgBase = (MessageGetResMsgBase) o;
    return Objects.equals(this.accessorname, messageGetResMsgBase.accessorname) &&
        Objects.equals(this.accessortype, messageGetResMsgBase.accessortype) &&
        Objects.equals(this.csf, messageGetResMsgBase.csf) &&
        Objects.equals(this.id, messageGetResMsgBase.id) &&
        Objects.equals(this.isdir, messageGetResMsgBase.isdir) &&
        Objects.equals(this.isread, messageGetResMsgBase.isread) &&
        Objects.equals(this.sender, messageGetResMsgBase.sender) &&
        Objects.equals(this.time, messageGetResMsgBase.time) &&
        Objects.equals(this.type, messageGetResMsgBase.type) &&
        Objects.equals(this.url, messageGetResMsgBase.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorname, accessortype, csf, id, isdir, isread, sender, time, type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageGetResMsgBase {\n");
    
    sb.append("    accessorname: ").append(toIndentedString(accessorname)).append("\n");
    sb.append("    accessortype: ").append(toIndentedString(accessortype)).append("\n");
    sb.append("    csf: ").append(toIndentedString(csf)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isdir: ").append(toIndentedString(isdir)).append("\n");
    sb.append("    isread: ").append(toIndentedString(isread)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
