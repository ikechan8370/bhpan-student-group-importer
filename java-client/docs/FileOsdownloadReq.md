# FileOsdownloadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文档id | 
**rev** | **String** | 文件版本号，为空默认下载最新版本 |  [optional]
**authtype** | **String** | 默认为空，在header中包含鉴权，否则在url中包含鉴权。QUERY_STRING，url中包含鉴权 |  [optional]
**reqhost** | **String** | 从存储服务器下载数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | 是否使用https下载，默认为true；使用亚马逊AWS S3时，参数usehttps的设置无效，统一使用https |  [optional]
**savename** | **String** | 使用QUERY_STRING方式下载时（浏览器），可以设置要保存的文件名 |  [optional]
