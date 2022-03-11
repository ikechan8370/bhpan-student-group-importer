# LinkOsbeginuploadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | **String** | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 | 
**clientMtime** | **Long** | 由客户端设置的文件本地修改时间 |  [optional]
**docid** | **String** | gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns   |  [optional]
**length** | **Long** | 整个文件的长度，支持最大5G | 
**name** | **String** | 文件名称，UTF8编码  - 创建文件时， name为文件名；  - 编辑文件时（文件生成新版本），参数为空   |  [optional]
**password** | **String** | 密码 | 
**ondup** | **Long** | 默认为1。  1:检查是否重命名，重名则抛异常  3:如果重名冲突，自动覆盖   |  [optional]
**reqmethod** | **String** | 向存储服务器上传数据时的请求方法。  默认为“PUT”；参数值“POST”表示使用POST表单的方式上传   |  [optional]
**reqhost** | **String** | 向存储服务器上传数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | 上传是否使用https，默认为true，只对一体机自有对象存储EOSS生效 |  [optional]
