# FileOsuploadrefreshReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文件gns路径（创建协议返回） | 
**rev** | **String** | 文件版本号 | 
**length** | **Long** | 默认为-1；    不为-1时，更新版本的length为参数值；   |  [optional]
**multiupload** | **Boolean** | - 默认为false  - 参数为true，返回大文件分片上传需要的uploadid  - 如果multiupload为false，length支持最大5G |  [optional]
**reqmethod** | **String** | 采用单文件上传方式向存储服务器上传数据时的请求方法。    默认为“PUT”；参数值“POST”表示使用POST表单的方式上传   |  [optional]
**reqhost** | **String** | 向存储服务器上传数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | - 上传是否使用https，默认为true - 该参数只对一体机自有对象存储EOSS生效 |  [optional]
