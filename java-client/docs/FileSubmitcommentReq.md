# FileSubmitcommentReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文件gns路径（列举协议返回） | 
**answertoid** | **String** | 被回复者id  |  [optional]
**score** | **Long** | 评分    评论模式mode 为 2 或 3 时（包含评分功能），需要此项    默认为 -1，表示无评分   |  [optional]
**comment** | **String** | 评论内容    评论模式mode 为 1 或 3 时（包含评论功能），需要此项    默认为空   |  [optional]
