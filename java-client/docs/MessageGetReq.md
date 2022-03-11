# MessageGetReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stamp** | **Long** | 通知的时间 (unix utc ms)的起始点，可由上一次get提供。第一次get，值为0表示所有 |  [optional]
**sort** | **String** | 返回结果的排序方式。asc：按照消息生成时间升序排列；desc：按照消息生成时间降序排列；默认按照升序排列，即新消息在后面。 |  [optional]
