# RecycleListReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 个人文档或者文档库的gns路径 | 
**name** | **List&lt;String&gt;** | 按照文件名查找，默认为空，不进行过滤 |  [optional]
**by** | **String** | 指定按哪个字段排序  若不指定，默认按docid升序排序  说明：  name，按文件名称（中文按拼音）排序  type，按文件类型排序（目录按name升序）  time，按删除时间排序   |  [optional]
**sort** | **String** | 升序还是降序，默认为升序  说明：  asc，升序  desc，降序   |  [optional]
**path** | **List&lt;String&gt;** | 按照原位置查找，默认为空，不进行过滤 |  [optional]
**editor** | **List&lt;String&gt;** | 按照删除者查找，默认为空，不进行过滤 |  [optional]
**start** | **Long** | 开始位置，默认为0 |  [optional]
**limit** | **Long** | 分页条数，默认为-1，返回start后面的所有记录 |  [optional]
