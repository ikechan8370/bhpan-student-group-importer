# FileRevisionsResItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rev** | **String** | 版本号 | 
**name** | **String** | 版本所对应文件的最新名称 | 
**editor** | **String** | 版本编辑者名称 | 
**modified** | **Long** | 版本上传时间，UTC时间，此为上传版本时记录的服务器时间 | 
**size** | **Long** | 版本的大小 | 
**clientMtime** | **Long** | 由客户端设置的文件本地修改时间    若未设置，返回modified的值   | 
