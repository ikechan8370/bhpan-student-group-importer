# FileOsuploadpartReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文件的gns路径（创建协议返回） | 
**rev** | **String** | 文件版本号 | 
**uploadid** | **String** | Multiupload事件Id | 
**parts** | **String** | 需要鉴权的数据块号，支持两种格式的组合，组合时以逗号分隔：  - 以“-”连接的数据块区间  - 单独的数据块号  - 如：1-100,2,3,4,23-120,130,288  - 数据块号最小为1，最大为10000。  - 根据parts参数的请求形式，可以批量申请上传数据的请求，减少上传文件时的请求次数。   | 
**reqhost** | **String** | 向存储服务器上传数据时的请求地址 |  [optional]
**usehttps** | **Boolean** | 上传是否使用https，默认为true |  [optional]
