# AuditGetshareapplyhistoryResApplyinfoBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approveindex** | **Long** | 结合auditorname,小于等于该值的表示审批通过的审核员，从0开始 | 
**auditornames** | **List&lt;String&gt;** | 提交审核时，所有能看到该申请记录的审核员的名称  auditornames[approveindex]表示审核通过的审核员如auditornames[vetoindex]表示否决的审核员  approveindex 和 vetoindex 都为 -1 表示免审核 | 
**csflevel** | **Long** | 文件密级，5~15，如果是文件夹，则为0 | 
**docname** | **String** | 文档名称 | 
**isdir** | **Boolean** | 是否为文件夹 | 
**requestdate** | **Long** | 申请时间（微秒时间戳） | 
**vetoindex** | **Long** | 结合auditorname，该位置表示否决的人在auditornames中的位置，从0开始，  -1表示没有人否决 | 
**apptype** | **Long** | 申请类型  1表示共享申请  2表示外链申请  3表示所有者申请  5更改密级申请  6表示更改继承申请 | 
