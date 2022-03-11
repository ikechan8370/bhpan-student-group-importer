# AuditGetdocapprovalsResApplyinfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applyid** | **String** | 申请记录id | 
**applymsg** | **String** | 发起流程时的理由 | 
**auditornames** | **List&lt;String&gt;** | 审核员的名称  [0, auditprogress）表示已审核过的名称  [auditprogress, ]表示尚未审核过的名称 | 
**auditprogress** | **Long** | 审核进度，表示当前审核员在auditornames中的位置  同级审核，该字段为0  汇签审核，逐级审核，参考auditornames | 
**audittype** | **Long** | 审核模式  1表示同级审核  2表示汇签审核  3表示逐级审核 | 
**createdate** | **Long** | 申请时间（微秒时间戳） | 
**csflevel** | **Long** | 文件密级,5~15，如果是文件夹，则为0 | 
**docid** | **String** | 文档gns路径 | 
**docname** | **String** | 文档名称 | 
**isdir** | **Boolean** | 是否为文件夹 | 
**processname** | **String** | 流程名称 | 
**creatorname** | **String** | 申请者名称 | 
