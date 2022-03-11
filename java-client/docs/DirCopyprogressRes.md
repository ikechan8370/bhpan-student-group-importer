# DirCopyprogressRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **Boolean** | 是否查询成功，如果没有找到，可能是复制任务不存在或者已经完成 | 
**filecount** | **Long** | 如果查询成功，返回总文件个数 |  [optional]
**dircount** | **Long** | 如果查询成功，返回总目录个数 |  [optional]
**filecopied** | **Long** | 如果查询成功，返回已复制的文件个数 |  [optional]
**dircopied** | **Long** | 如果查询成功，返回已复制的目录个数 |  [optional]
**size** | **Long** | 如果查询成功，返回总大小 |  [optional]
**sizecopied** | **Long** | 如果查询成功，返回已复制的大小 |  [optional]
**filecopying** | **String** | 如果查询成功，返回正在复制的文件名 |  [optional]
**source** | **String** | 如果查询成功，返回复制源位置的父目录名称，如果为根目录，返回空 |  [optional]
**destination** | **String** | 如果查询成功，返回复制目标父目录的名称 |  [optional]
