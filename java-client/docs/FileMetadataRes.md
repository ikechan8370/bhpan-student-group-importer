# FileMetadataRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientMtime** | **Long** | 由客户端设置的文件本地修改时间    若未设置，返回modified的值   | 
**editor** | **String** | 文件版本上传编辑者名称，UTF8编码 | 
**modified** | **Long** | 文件版本上传时间，UTC时间，此为上传版本时的服务器时间 | 
**name** | **String** | 文件版本上传时文件名称，UTF8编码 | 
**rev** | **String** | 文件版本ID | 
**site** | **String** | 文件版本的归属站点 | 
**size** | **Long** | 文件版本的大小 | 
**tags** | **List&lt;String&gt;** | 版本的标签，字符串数组 | 
**needdownloadwatermark** | **Boolean** | 用户下载文件对象时，是否需要下载水印 | 
**docid** | **String** | 文件docid | 
