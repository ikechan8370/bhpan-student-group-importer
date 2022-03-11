# FileSetappmetadataReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appid** | **String** | 应用 id，由控制台配置后分配 | 
**appmetadata** | **Map&lt;String, String&gt;** | - json 格式的应用元数据集合，key-value string 的形式 - appmetadata 中只允许 key-value string，对于 value 为 integer、boolen、array 等情况，要求把值转为 string。非 key-value string 的值会被忽略 | 
**docid** | **String** | 文件gns路径（列举协议返回） | 
