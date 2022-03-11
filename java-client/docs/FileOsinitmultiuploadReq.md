# FileOsinitmultiuploadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | gns（全局名字空间）路径，创建或者列举协议返回  - 创建文件时， gns为待创建文件的父目录gns；  - 编辑文件时（文件生成新版本），gns为所编辑文件的gns；   | 
**length** | **Long** | 整个文件的长度 | 
**name** | **String** | 文件名称，UTF8编码  - 创建文件时， name为文件名；  - 编辑文件时（文件生成新版本），参数为空；   |  [optional]
**clientMtime** | **Long** | 由客户端设置的文件本地修改时间    创建新版本（rev为空或name为为空）时，写入版本   |  [optional]
**ondup** | **Long** | 当name不为空时生效  - 1:检查是否重命名，重名则抛异常  - 2:如果重名冲突，自动重名  - 3:如果重名冲突，自动覆盖   |  [optional]
**csflevel** | **Long** | 文件密级预检查，要设置密级必须在osendupload中设置  - 0：默认值，不检查密级  - 5~15：正常密级  - 0x7FFF：空密级   |  [optional]
**editedrev** | **String** | 表示编辑文件时，基于文件的哪个版本（版本ID）进行编辑，默认为空。  - 如果为空，不检查是否基于文件的最新版本进行编辑；  - 如果不为空，若所编辑的版本ID不是服务器上文件的最新版本，则上传报错。错误码403203，“所编辑文件的版本与服务端文件最新版本不一致”；   |  [optional]
