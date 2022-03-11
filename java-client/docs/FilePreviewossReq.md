# FilePreviewossReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文件gns路径（列举协议返回） | 
**rev** | **String** | 版本号，为空默认获取最新版本 |  [optional]
**type** | **String** | 需要预览的转换文件类型  默认参数pdf，获取转换后pdf文件的链接  （参数html，获取转换后html打包文件的链接，需单独部署html转换服务器）   |  [optional]
**reqhost** | **String** | 从存储服务器下载数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | 是否使用https下载数据，默认为true |  [optional]
**watermark** | **Boolean** | 是否增加水印，默认为true |  [optional]
