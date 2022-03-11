# MessageGetResMsgBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessorname** | **String** | 接收者名字，如果是外链，为空字符串 | 
**accessortype** | [**AccessortypeEnum**](#AccessortypeEnum) | 表示访问者类型 | 
**csf** | **Long** | 文件密级，5~15，文件夹为0 | 
**id** | **String** | 此条消息的唯一标识 | 
**isdir** | **Boolean** | 是否为文件夹 | 
**isread** | **Boolean** | 消息是否已读 | 
**sender** | **String** | 发送者名字 | 
**time** | **Long** | 共享操作的时间(unix utc ns) | 
**type** | **Long** | 此条消息的类型  1. 开启共享  2. 关闭共享  3. 设置所有者  4. 取消所有者  5. 开启共享申请  6. 关闭共享申请  7. 设置所有者申请  8. 取消所有者申请  9. 开启外链申请  10. 开启共享审核结果  11. 关闭共享审核结果  12. 开启所有者审核结果  13. 关闭所有者审核结果  14. 开启外链审核结果  15. 待审流程消息  16. 流程进度消息   17. 流程结果消息  18. 简单消息  19. 提交密级申请消息  20. 密级申请审核结果  21. 隔离消息  22. 隔离被还原消息  23. 杀毒消息  24. 创建文档收集任务消息  25. 文档收发变更消息  26. 文档收发提醒消息  27. 取消文档收发任务消息  28. 文件到期通知消息  29. 短信验证码发送  30. 继承变更申请消息  31. 继承变更审核结果 | 
**url** | **String** | 内链，相对地址 | 

<a name="AccessortypeEnum"></a>
## Enum: AccessortypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
DEPARTMENT | &quot;department&quot;
CONTACTOR | &quot;contactor&quot;
