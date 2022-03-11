# FileGetcommentRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **Long** | 评论模式  - 0:未启用评论和评分  - 1:只启用评论  - 2:只启用评分  - 3:同时启用评论和评分   | 
**averagescore** | **Double** | 总评分    mode 为 2 或 3 时，返回此项   |  [optional]
**hasscored** | **Boolean** | 用户是否已经评分    mode 为 2 或 3 时，返回此项   |  [optional]
**comments** | [**List&lt;FileGetcommentResComments&gt;**](FileGetcommentResComments.md) | 评论内容的数组    mode 不为 0 时，返回此项   |  [optional]
