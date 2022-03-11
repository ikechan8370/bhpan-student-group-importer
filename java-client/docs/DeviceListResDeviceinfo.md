# DeviceListResDeviceinfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 设备名称 | 
**ostype** | **Long** | 操作系统类型  0：Unknown  1：IOS  2：Android  3：Windows phone  4：Windows  5：MacOSX  6：Web  7：MobileWeb | 
**devicetype** | **String** | 设备硬件类型，自定义，例如：  iphone5s  ipad  联想一体机  mac | 
**udid** | **String** | 设备唯一标识号 | 
**lastloginip** | **String** | 上次登录ip | 
**lastlogintime** | **Long** | 上次登录时间 | 
**eraseflag** | **Long** | 缓存数据擦除状态  0表示正常  1表示正在请求擦除 | 
**lasterasetime** | **Long** | 上次成功清除缓存的时间 | 
**disableflag** | **Long** | 设备禁用状态  0表示未禁用  1表示已禁用 | 
**loginflag** | **Long** | 设备登录状态  0表示未登录  1表示已登录 | 
**bindflag** | **Long** | 设备绑定状态  0表示未绑定  1表示已绑定 | 
