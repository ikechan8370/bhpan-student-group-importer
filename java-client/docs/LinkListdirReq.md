# LinkListdirReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | **String** | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 | 
**password** | **String** | 密码 | 
**docid** | **String** | 文件gns路径，通过文件夹外链访问子目录时，需要该参数，默认为空 |  [optional]
**by** | **String** | 指定按哪个字段排序  若不指定，默认按docid升序排序  说明：  name，按文件名称（中文按拼音）排序  size，按大小排序（目录按name升序）  time，按服务器修改时间排序   |  [optional]
**sort** | **String** | 升序还是降序，默认为升序  说明：  asc，升序  desc，降序   |  [optional]
