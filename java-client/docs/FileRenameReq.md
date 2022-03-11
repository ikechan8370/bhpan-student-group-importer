# FileRenameReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 要重命名的文件gns路径 | 
**name** | **String** | 重命名成功后的新文件名，UTF8编码 | 
**ondup** | **Long** | - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名   |  [optional]
