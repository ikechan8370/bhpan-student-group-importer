# SearchSearchResResponseDoc

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basename** | **String** | 文件名（不包括扩展名） | 
**csflevel** | **Long** | 文件密级 | 
**modified** | **Long** | 文件修改时间 |  [optional]
**size** | **Long** | 文件大小 | 
**parentpath** | **String** | 父目录 | 
**ext** | **String** | 文件扩展名 |  [optional]
**docid** | **String** | gns路径 | 
**editor** | **String** | 文件创建者 |  [optional]
**access** | **Long** | 是否有权限访问，1为有权限，0为无权限 | 
**sharer** | **String** | 发现者名称：如果有返回且不为空，说明该文档是发现文档 |  [optional]
**tags** | **List&lt;String&gt;** | 版本的标签字符串数组 |  [optional]
**created** | **String** | 文档创建时间 | 
**creator** | **String** | 文档创建者 | 
**objtype** | **Long** | 文档类型，1 为文件 2为目录  注：6.0.4版本后新建的文件索引才有该字段。  未重建索引时，请勿用作判断条件。   |  [optional]
