# AuditGetapprovehistoryResApplyinfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approveindex** | **Long** | 结合auditorname,小于等于该值的表示审批通过的审核员，从0开始 | 
**auditornames** | **List&lt;String&gt;** | 提交审核时，所有能看到该申请记录的审核员的名称  [0, approveindex]表示审核通过的审核员列表，-1表示没有审核员通过  如果vetoindex不为-1，则auditornames[vetoindex]表示否决的审核员  剩下的为未参与审核的 | 
**audittype** | **Long** | 审核模式  1表示同级审核  2表示汇签审核  3表示逐级审核 | 
**csflevel** | **Long** | 文件密级，5~15，如果是文件夹，则为0 | 
**docname** | **String** | 文档名称 | 
**isdir** | **Boolean** | 是否为文件夹 | 
**processname** | **String** | 流程名称 | 
**requestdate** | **Long** | 申请时间（微秒时间戳） | 
**requesterName** | **String** | 申请者名称 | 
**vetoindex** | **Long** | 结合auditorname，该位置表示否决的人在auditornames中的位置，从0开始，  -1表示没有人否决 | 
