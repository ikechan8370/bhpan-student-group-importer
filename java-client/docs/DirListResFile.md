# DirListResFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 目录中文件/目录的gns路径 | 
**name** | **String** | 目录中文件/目录的名称，UTF8编码 | 
**rev** | **String** | 目录中文件版本号或目录数据变化标识 | 
**size** | **Long** | 目录中文件的大小，目录大小为-1 | 
**createTime** | **Long** | 目录/文件创建的服务端时间 | 
**creator** | **String** | 目录/文件创建者 | 
**modified** | **Long** | 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间 | 
**editor** | **String** | 目录修改者/文件编辑者 | 
**clientMtime** | **Long** | 如果是文件，返回由客户端设置的文件本地修改时间    若未设置，返回modified的值   |  [optional]
**csflevel** | **Long** | 文件密级  - 0：默认值，创建文件时文件密级设为创建者密级，覆盖版本时不改变密级  - 5~15：正常密级  - 0x7FFF：空密级   | 
**attr** | **Long** | 总共32位，右下角表示最低位，左上角表示最高位，如：    0&lt;sub&gt;32&lt;/sub&gt;000,0000,0000,0000&lt;sub&gt;17&lt;/sub&gt;    0&lt;sub&gt;16&lt;/sub&gt;000,0000,0000,0000&lt;sub&gt;1&lt;/sub&gt;  - 1：只读（用户针对访问对象是否是只读属性）  - 2：锁定（表示访问对象是否被锁定）  - 3：允许显示  - 4：拒绝显示  - 5：允许预览  - 6：拒绝预览  - 7：允许下载  - 8：拒绝下载  - 9：允许新建  - 10：拒绝新建  - 11：允许修改  - 12：拒绝修改  - 13：允许删除  - 14：拒绝删除  - 15：允许复制  - 16：拒绝复制     第25位到28位表示该用户的密级    可能为以下值：    0101(5)~1111(15)    attr中带上用户的密级是方便客户端探测到用户的密级变化，从而探测到新的文件（因为密级变大或者变小，看到的文件会变多或变少）   |  [optional]
**duedate** | **Long** | 文件到期提醒时间 |  [optional]
