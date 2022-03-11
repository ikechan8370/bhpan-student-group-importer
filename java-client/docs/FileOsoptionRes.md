# FileOsoptionRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partminsize** | **Long** | 大文件分片上传，除最后一块外，其它分片的最小值；当partminsize小于等于4M时，可按照4M分块；当partminsize大于4M时，分块的大小必须大于等于partminsize。 | 
**partmaxsize** | **Long** | 大文件分片上传，除最后一块外，其它分片的最大值 | 
**partmaxnum** | **Long** | 大文件分片上传，最大的分片数量 | 
