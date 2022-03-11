# Auth1ExtloginclientReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | 用户登录账号（不能使用admin登录） | 
**appid** | **String** | 爱数分配给第三方系统的应用id | 
**key** | **String** | 组合appid，appkey，account后进行md5算法后得到（不区分大小写）  例如：  appid&#x3D;eisoo  appkey&#x3D;ae217ce4-bf33-11e9-aa67-665056af7572  account&#x3D;xiaoming  key&#x3D;md5(eisooae217ce4-bf33-11e9-aa67-665056af7572xiaoming) | 
**deviceinfo** | [**Auth1ExtloginclientReqDeviceinfo**](Auth1ExtloginclientReqDeviceinfo.md) |  |  [optional]
