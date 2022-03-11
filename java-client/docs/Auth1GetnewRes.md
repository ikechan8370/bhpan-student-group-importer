# Auth1GetnewRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **String** | 唯一标识用户的ID | 
**tokenid** | **String** | 与userid一起验证请求的合法性 | 
**needmodifypassword** | **Boolean** | True表示该用户需要修改密码后才能登陆  False表示该用户不需要修改密码 | 
**expires** | **Long** | 获取到的token的有效期，单位为秒 | 
