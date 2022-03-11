# FileGetcommentResComments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | 评论id | 
**commentator** | **String** | 评论人 | 
**commentatorid** | **String** | 评论人id | 
**answerto** | **String** | 被回复者，无被回复者时，该项为空    mode 为 1 或 3 时，返回此项   | 
**score** | **Long** | 评分    mode 为 2 或 3 时，返回此项    默认为-1，表示未评分   | 
**comment** | **String** | 评论内容    mode 为 1 或 3 时，返回此项    默认为空，表示无评分内容   | 
**time** | **Long** | 评论的时间戳，UTC时间，精确到微秒 | 
