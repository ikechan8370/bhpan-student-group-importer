# Entrydoc2GetResDocinfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attr** | **Long** | 总共32位，右下角表示最低位，左上角表示最高位，如：    0&lt;sub&gt;32&lt;/sub&gt;000,0000,0000,0000&lt;sub&gt;17&lt;/sub&gt;    0&lt;sub&gt;16&lt;/sub&gt;000,0000,0000,0000&lt;sub&gt;1&lt;/sub&gt;  - 1：只读（用户针对访问对象是否是只读属性）  - 2：锁定（表示访问对象是否被锁定）  - 3：允许显示  - 4：拒绝显示  - 5：允许预览  - 6：拒绝预览  - 7：允许下载  - 8：拒绝下载  - 9：允许新建  - 10：拒绝新建  - 11：允许修改  - 12：拒绝修改  - 13：允许删除  - 14：拒绝删除  - 15：允许复制  - 16：拒绝复制     第25位到28位表示该用户的密级    可能为以下值：    0101(5)~1111(15)    attr中带上用户的密级是方便客户端探测到用户的密级变化，从而探测到新的文件（因为密级变大或者变小，看到的文件会变多或变少）   | 
**createTime** | **Long** | 目录创建的服务端时间 | 
**creator** | **String** | 创建者名称 | 
**displayorder** | **Long** | 排序权重，-1表示未设置 | 
**docid** | **String** | 文档库id | 
**doctype** | **Long** | 文档库类型：  1：个人文档库  2：个人群组文档库  3：自定义文档库  4：共享个人文档库  5：归档库  6：共享个人群组文档库   | 
**downloadwatermark** | **Boolean** | 是否需要下载水印 | 
**duedate** | **Long** | 到期时间，-1表示未设置 | 
**editor** | **String** | 修改者名称 | 
**modified** | **Long** | 目录修改时间/文件上传时间，UTC时间，此为文件上传到服务器时间 | 
**name** | **String** | 文档库名称 | 
**rev** | **String** | 文档库变化标识 | 
**siteinfo** | [**Entrydoc2GetResDocinfoSiteinfo**](Entrydoc2GetResDocinfoSiteinfo.md) |  | 
**size** | **Long** | -1表示文件夹 | 
**typename** | **String** | 文档库类型名称 | 
