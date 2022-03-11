# FileOsuploadrefreshRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uploadid** | **String** | 标识本次Multipart Upload事件 |  [optional]
**authrequest** | **List&lt;String&gt;** | - authrequest[0]：请求方法  - authrequest[1]: 待上传的资源URL  - authrequest[2]及以后项：请求头；若请求时reqmethod的值为“POST”，则为POST表单域的项，格式为“key: value” |  [optional]
