# LinkOsdownloadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | **String** | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 | 
**password** | **String** | 密码 | 
**docid** | **String** | 文件gns路径，通过文件夹外链下载文件时，需要该参数，默认为空 |  [optional]
**reqhost** | **String** | 从存储服务器下载数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | 是否使用https下载，默认为true,使用亚马逊AWS S3时，参数usehttps的设置无效，统一使用https。 |  [optional]
**savename** | **String** | 要保存的文件名 |  [optional]
