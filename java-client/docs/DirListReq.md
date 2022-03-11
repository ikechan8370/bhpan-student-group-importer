# DirListReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 要浏览的目录的gns路径 | 
**by** | **String** | 指定按哪个字段排序    若不指定，默认按docid升序排序    说明：  - name，按文件名称（中文按拼音）排序  - size，按大小排序（目录按name升序）  - time，按服务器修改时间排序   |  [optional]
**sort** | **String** | 升序还是降序，默认为升序    说明：  - asc，升序  - desc，降序   |  [optional]
**attr** | **Boolean** | 默认为false,即不取文件或者目录属性信息,    为true时,则取文件或者目录的属性信息   |  [optional]
