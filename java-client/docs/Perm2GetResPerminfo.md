# Perm2GetResPerminfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inheritdocid** | **String** | 权限继承docid | 
**inheritpath** | **String** | 权限继承路径 | 
**accessorid** | **String** | 访问者id，可能是用户、部门、联系人 | 
**accessorname** | **String** | 访问者名字 | 
**accessorcsflevel** | **Long** | 访问者密级 | 
**accessortype** | [**AccessortypeEnum**](#AccessortypeEnum) | 访问者类型 | 
**denyvalue** | **Long** | 拒绝权限  权限值，按bit位存储  0x00000000，未设置  0x00000001，显示  0x00000002，预览  0x00000004，下载  0x00000008，新建  0x00000010，修改  0x00000020，删除  0x00000040，复制   | 
**allowvalue** | **Long** | 允许权限，值与denyvalue相同 | 
**createtime** | **Long** | 权限创建时间 | 
**modifytime** | **Long** | 权限修改时间 | 
**endtime** | **Long** | 权限到期时间，单位：微秒，-1表示无限期 | 

<a name="AccessortypeEnum"></a>
## Enum: AccessortypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
DEPARTMENT | &quot;department&quot;
CONTACTOR | &quot;contactor&quot;
