# LinkSetReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 待修改外链的对象gns路径 | 
**open** | **Boolean** | 如果true，返回密码，false，密码空 | 
**endtime** | **Long** | 到期时间，单位：微秒   | 
**perm** | **Long** | 权限值，值域为[1,7]，具体说明参见开启外链中的描述 | 
**limittimes** | **Long** | 外链使用次数。    -1为无限制，不传默认-1   |  [optional]
