# LinkGetRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 文件名 | 
**size** | **Long** | 文件大小 | 
**modified** | **Long** | 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间 | 
**perm** | **Long** | 按位存储的权限值（返回的是十进制），获取该值后，需要转化成二级制，检查对应的位码是否被设置。  右数第一位表示该外链可以被预览  右数第二位表示该外链可以被下载  右数第三位表示该外链可以上传文件  例如：返回1表示只能被预览  返回2表示只能被下载  返回4表示只能上传文件  返回3表示可被预览和下载   | 
**endtime** | **Long** | 到期时间，单位：微秒 | 
**usrdisplayname** | **String** | 用户显示名 | 
**usrloginname** | **String** | 用户登录名 | 
**clientMtime** | **Integer** | 客户端设置的文件本地修改时间 | 
**docid** | **String** | 文档ID | 
