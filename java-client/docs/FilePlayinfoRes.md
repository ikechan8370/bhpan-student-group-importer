# FilePlayinfoRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **Long** | 转码状态:    0 未开始转码；1 正在转码；2转码完成   | 
**odstat** | **Long** | 原始画质（音质）：0无此分辨率；1已转码 | 
**sdstat** | **Long** | 标清：0无此分辨率；1已转码 | 
**docid** | **String** | 转码文件的唯一标识id，转码完成至少一种分辨率，认为完成转码，返回转码文件的id | 
**remainingTime** | **Long** | 转码剩余时间（秒），status为1时返回 |  [optional]
