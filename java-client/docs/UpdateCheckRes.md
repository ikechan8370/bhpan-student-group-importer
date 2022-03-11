# UpdateCheckRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **String** | 客户端是否需要更新 “ok”表示客户端版本是最新的 “optional”表示客户端可选择更新 “forced”表示客户端必须进行更新 | 
**latest** | **String** | 可用客户端安装包的版本信息，如3.5.4.244形式 | 
**ostype** | **Long** | 可用客户端安装包对应的ostype | 
**downloadurl** | **String** | 可用客户端安装包的相对下载路径，需要加上服务器的ip后才能进行下载 | 
**size** | **Long** | 可用客户端安装包的大小 | 
