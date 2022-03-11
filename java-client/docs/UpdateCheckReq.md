# UpdateCheckReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | [**PlatformEnum**](#PlatformEnum) | 客户端对应的平台 | 
**arch** | **String** | 客户端的操作系统架构，现在windows只支持“x86”和“x64”， mac平台忽略该字段 | 
**version** | **String** | 客户端程序的版本，为3.5.3.244形式（主版本号，小版本号，修订号，构建号） | 

<a name="PlatformEnum"></a>
## Enum: PlatformEnum
Name | Value
---- | -----
WINDOWS | &quot;windows&quot;
MAC | &quot;mac&quot;
