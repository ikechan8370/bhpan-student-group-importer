# Perm2SetReqPerminfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessorid** | **String** | 访问者id，可能是用户、部门、联系人 | 
**accessortype** | [**AccessortypeEnum**](#AccessortypeEnum) | 访问者类型 | 
**denyvalue** | **Long** | 拒绝权限  权限值，按bit位存储  0x00000000，未设置  0x00000001，显示  0x00000002，预览  0x00000004，下载  0x00000008，新建  0x00000010，修改  0x00000020，删除  0x00000040，复制   | 
**allowvalue** | **Long** | 允许权限，值与denyvalue相同 | 
**endtime** | **Long** | 权限到期时间，单位：微秒，-1表示无限期 | 
**inheritpath** | **String** | 值为非空字符串时，忽略该条权限 |  [optional]

<a name="AccessortypeEnum"></a>
## Enum: AccessortypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
DEPARTMENT | &quot;department&quot;
CONTACTOR | &quot;contactor&quot;
