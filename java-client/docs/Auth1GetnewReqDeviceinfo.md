# Auth1GetnewReqDeviceinfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | 设备名称 |  [optional]
**ostype** | **Long** | 操作系统类型  0：Unknown  1：IOS  2：Android  3：Windows phone  4：Windows  5：MacOSX  6：Web  7：MobileWeb |  [optional]
**devicetype** | **String** | 设备硬件类型，自定义。如：  iphone5s  ipad  联想一体机  mac |  [optional]
**udid** | **String** | 设备唯一标识号，  windows下取mac地址  ios取udid  web为空 |  [optional]
**version** | **String** | 客户端程序的版本  Windows： 5.0.11.253形式（主版本号，小版本号，修订号，构建号）  IOS：2.3.1.1  Android：4.2.2.222 |  [optional]
