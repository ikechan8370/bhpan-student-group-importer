# LinkPreviewossReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | **String** | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 | 
**password** | **String** | 密码 | 
**docid** | **String** | 文件gns路径，通过文件夹外链进行文档预览时，需要该参数，默认为空 |  [optional]
**type** | **String** | 需要预览的转换文件类型  默认参数pdf，获取转换后pdf文件的链接  （参数html，获取转换后html打包文件的链接，需单独部署html转换服务器）   |  [optional]
**reqhost** | **String** | 从存储服务器下载数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | 是否使用https下载数据，默认为true |  [optional]
