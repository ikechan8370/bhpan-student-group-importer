# FileDuploadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientMtime** | **Long** | 由客户端设置的文件本地修改时间 |  [optional]
**crc32** | **String** | 文件的CRC32校验码，如果为空文件, 此字段为空 | 
**docid** | **String** | gns（全局名字空间）路径，创建或者列举协议返回    说明：如果name不为空，gns为待创建文件的父目录gns；否则为文件的gns。   | 
**length** | **Long** | 整个文件的长度，如果为空文件, 此字段为空 | 
**md5** | **String** | 文件MD5值，如果为空文件, 此字段为空 | 
**name** | **String** | 文件名称，UTF8编码    说明：1、如果为空，在父目录文件下生成版本；2、如果不为空，在父目录下创建文件，同时生成版本   |  [optional]
**ondup** | **Long** | 仅当name不为空时才会生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖   |  [optional]
**csflevel** | **Long** | 文件密级  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级   |  [optional]
