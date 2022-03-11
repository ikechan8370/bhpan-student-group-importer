# AutolockGetlockedfileinfosReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **Long** | 开始位置，默认为0 |  [optional]
**limit** | **Long** | 分页条数，默认为-1，返回start后面的所有记录 |  [optional]
**name** | **String** | 按照文件名查找，默认为空，不进行过滤 |  [optional]
**locker** | **String** | 按照锁定者查找，默认为空，不进行过滤 |  [optional]
