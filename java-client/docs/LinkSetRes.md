# LinkSetRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endtime** | **Long** | 到期时间  | 
**link** | **String** | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 | 
**password** | **String** | 空表示没有 | 
**perm** | **Long** | 权限值，值域为[1,7]，具体说明参见开启外链中的描述 | 
**limittimes** | **Long** | 外链使用次数。  -1为无限制   | 
**result** | **Long** | 0，请求已生效，返回为最新信息    1，请求正在审核，返回为更改前信息   | 
