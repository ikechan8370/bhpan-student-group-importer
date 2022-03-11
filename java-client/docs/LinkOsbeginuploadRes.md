# LinkOsbeginuploadRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authrequest** | **List&lt;String&gt;** | - authrequest[0]：请求方法  - authrequest[1]: 待上传的资源URL  - authrequest[2]及以后项：请求头，格式为“key: value”；若请求时reqmethod的值为“POST”，则为POST表单域的项，格式为“key: value”   | 
**docid** | **String** | 文件的gns路径 | 
**name** | **String** | 文件名称，UTF8编码，创建版本时返回 | 
**rev** | **String** | 文件版本号 | 
