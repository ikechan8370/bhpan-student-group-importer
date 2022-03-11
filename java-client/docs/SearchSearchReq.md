# SearchSearchReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customattr** | [**List&lt;SearchSearchReqCustomattr&gt;**](SearchSearchReqCustomattr.md) | 自定义属性搜索条件数组 |  [optional]
**ext** | **List&lt;String&gt;** | 搜索匹配后缀，以点开头（例如”.doc”） |  [optional]
**keys** | **String** | 搜索关键字  默认按照短语搜索，需要单独搜索的关键字用“%20”分割   |  [optional]
**range** | **List&lt;String&gt;** | 指定的某个目录下，具体为gns路径（例如gns://XXX/_*），  搜索所有目录：传空  搜索某个目录及子目录：gns://XXX/_*  搜索仅某个目录下文件：gns://XXX/   |  [optional]
**rows** | **Long** | 请求返回的查询记录条数，如果返回的条数少于当前值，则表示服务端已无更多数据无需再取 | 
**start** | **Long** | 第一页从0开始，往后的页传入回复消息中的next | 
**tags** | **List&lt;String&gt;** | 欲搜索的标签字符串数组 |  [optional]
**hl** | **Boolean** | 是否需要返回高亮内容，默认true   返回形式：\&quot;&lt;em&gt;&lt;/em&gt;\&quot;   |  [optional]
**style** | **Long** | 为0，查找range下的有权限文件  为1，查找range下有权限文件和发现共享文件  为2，查找range下的发现共享文件   |  [optional]
**doctype** | **Long** | 为1，查找文件  为2，查找文件夹  为3，查找文件&amp;文件夹  默认3   |  [optional]
**keysfields** | **List&lt;String&gt;** | 搜索关键字所在字段（仅当keys不为空时有效），数组中有效元素为”basename”,”content”。 [”basename”]表示匹配文件名；[”content”]表示匹配文件内容；[”basename”, ”content”]表示匹配全文 |  [optional]
**sort** | **String** | 排序规则：默认为按相关度排序  按文件大小升序为”size”,降序为”-size”；  按修改时间升序为”modified”,降序为”-modified”；  按创建时间升序为”created”,降序为”-created”；   |  [optional]
**size** | [**SearchSearchReqSize**](SearchSearchReqSize.md) |  |  [optional]
**createtime** | [**SearchSearchReqCreatetime**](SearchSearchReqCreatetime.md) |  |  [optional]
**modifytime** | [**SearchSearchReqModifytime**](SearchSearchReqModifytime.md) |  |  [optional]
