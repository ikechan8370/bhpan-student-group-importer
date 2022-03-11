# DirRenameReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 要重命名的目录的gns路径 | 
**name** | **String** | 该目录的新名称，UTF8编码 | 
**ondup** | **Long** | - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名   |  [optional]
