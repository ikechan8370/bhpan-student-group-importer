# FavoritesListResItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文件/目录的gns路径 | 
**name** | **String** | 文件/目录的名称 | 
**path** | **String** | 文件/目录的name路径 | 
**size** | **Long** | 文件的大小，目录大小为-1 | 
**creator** | **String** | 文件/目录创建者  | 
**createTime** | **Long** | 文件/目录创建时间 | 
**editor** | **String** | 文件/文件编辑者 | 
**modified** | **Long** | 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间 | 
**clientMtime** | **Long** | 如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值   |  [optional]
