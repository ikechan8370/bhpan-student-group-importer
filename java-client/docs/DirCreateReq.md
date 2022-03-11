# DirCreateReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 待创建目录的父目录gns路径 | 
**name** | **String** | 目录名称，UTF8编码 | 
**ondup** | **Long** | 默认值 ：1  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖   |  [optional]
