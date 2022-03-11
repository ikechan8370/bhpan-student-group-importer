# FileOscompleteuploadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文件的gns路径（创建协议返回） | 
**rev** | **String** | 文件版本号 | 
**uploadid** | **String** | Multiupload事件Id | 
**reqhost** | **String** | 向存储服务器上传数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | 上传是否使用https，默认为true |  [optional]
**partinfo** | [**FileOscompleteuploadReqPartinfo**](FileOscompleteuploadReqPartinfo.md) |  | 
