# AuditGetpendingapprovalsResApplyinfoBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applyid** | **String** | 申请记录id | 
**docid** | **String** | 文档gns路径 | 
**docname** | **String** | 文档名称 | 
**apptype** | **Long** | 申请类型  1表示共享申请  2表示外链申请  3表示所有者申请  5表示更改密级申请  6 表示更改继承申请 | 
**isdir** | **Boolean** | 是否为文件夹 | 
**csflevel** | **Long** | 文件密级,5~15，如果是文件夹，则为0 | 
**sharername** | **String** | 共享者名称 | 
**createdate** | **Long** | 申请时间（微秒时间戳） | 
