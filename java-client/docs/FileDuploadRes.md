# FileDuploadRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **Boolean** | 秒传是否成功,如果为false，忽略其它字段 | 
**docid** | **String** | 文件的gns路径 |  [optional]
**editor** | **String** | 编辑者名称，UTF8编码，秒传成功则返回 |  [optional]
**modified** | **Long** | 上传时间，UTC时间，此为上传版本时的服务器时间，秒传成功则返回 |  [optional]
**name** | **String** | 文件名称，UTF8编码 |  [optional]
**rev** | **String** | 文件版本号 |  [optional]
