# FileOsdownloadRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**needWatermark** | **Boolean** | 是否是下载水印文件 | 
**authrequest** | **List&lt;String&gt;** | - authrequest[0]：请求方法 - authrequest[1]：资源URL - authrequest[2]（如果存在）及以后项为http请求的headers，如自定义date，Content-type等，格式为“key: value” | 
**clientMtime** | **Long** | 由客户端设置的文件本地修改时间 下载第0块时返回，若未设置，返回modified的值 | 
**editor** | **String** | 编辑者名称， UTF8编码 | 
**modified** | **Long** | 上传时间， UTC时间，此为上传版本时的服务器时间 | 
**name** | **String** | 文件的当前名称，UTF8编码 | 
**rev** | **String** | 文件版本号 | 
**size** | **Long** | 当前下载版本的总大小 | 
