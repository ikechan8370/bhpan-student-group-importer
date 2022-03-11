# FileOsenduploadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crc32** | **String** | 文件的CRC32校验码 |  [optional]
**docid** | **String** | 文件gns路径（创建协议返回） | 
**md5** | **String** | 文件MD5值 |  [optional]
**sliceMd5** | **String** | 文件的slice_md5 |  [optional]
**rev** | **String** | 文件版本号 | 
**csflevel** | **Long** | 文件密级，仅上传定密时需要设置  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级   |  [optional]
**editedrev** | **String** | 表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”；   |  [optional]
