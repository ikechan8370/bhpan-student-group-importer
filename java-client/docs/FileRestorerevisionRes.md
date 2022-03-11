# FileRestorerevisionRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**editor** | **String** | 版本编辑者名称 | 
**modified** | **Long** | UTC时间，此为还原产生新版本时的服务器时间 | 
**clientMtime** | **Long** | 如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值   | 
**name** | **String** | 版本所对应文件的名称 | 
**rev** | **String** | 新的版本号 | 
