# UserGetRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **String** | 用户唯一标识 | 
**account** | **String** | 用户登录账号 | 
**name** | **String** | 用户显示名 | 
**mail** | **String** | 用户邮箱地址 | 
**csflevel** | **Long** | 用户密级，5~15 | 
**leakproofvalue** | **Long** | 防泄密配置  0表示不允许打印，也不允许拷屏  1表示允许打印  2表示允许拷屏  3表示允许打印/拷屏 | 
**pwdcontrol** | **Long** | 是否开启管控密码  1 表示开启  0 表示关闭 | 
**usertype** | **Long** | 用户类型  1 表示本地用户  2 表示域用户  3 表示第三方认证用户 | 
**directdepinfos** | [**List&lt;UserGetResDirectdeptinfo&gt;**](UserGetResDirectdeptinfo.md) | 用户的多个直属部门信息 | 
**needsecondauth** | **Boolean** | 是否需要二次认证 | 
**freezestatus** | **Boolean** | 冻结状态 true：冻结 false：未冻结 | 
**agreedtotermsofuse** | **Boolean** | 同意使用协议状态 true：同意  false：未同意 | 
**ismanager** | **Boolean** | 是否为组织管理员 | 
**telnumber** | **String** | 用户手机号 | 
**needrealnameauth** | **Boolean** | 用户是否需实名认证 true：需要 false : 不需要 | 
**roletypes** | **List&lt;Long&gt;** | 所属角色，整数数组，每个整数表示不同的角色  1：表示文档审核员  [1] | 
**roleinfos** | [**List&lt;UserGetResRoleinfo&gt;**](UserGetResRoleinfo.md) | 用户角色信息 | 
