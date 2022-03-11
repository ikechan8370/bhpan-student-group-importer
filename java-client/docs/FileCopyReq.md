# FileCopyReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 要复制的文件gns路径 | 
**destparent** | **String** | 目标父对象的gns路径 | 
**ondup** | **Long** | - 1:检查是否重命名，重名则抛异常  - 2:默认值，如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖   |  [optional]
