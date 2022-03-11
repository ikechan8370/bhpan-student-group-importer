# Auth1GetconfigResOemconfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowauthlowcsfuser** | **Boolean** | 权限配置，是否允许给密级低于文件密级的用户配置权限 | 
**allowowner** | **Boolean** | 权限配置，是否允许配置所有者 | 
**cadpreview** | **Boolean** | 是否启用CAD预览服务 | 
**clearcache** | **Boolean** | 客户端退出时，是否强制清除缓存 | 
**clientlogouttime** | **Long** | 客户端超时退出时间，单位为分钟  -1表示不开启超时退出  其它值表示多少分钟后退出  例如30表示30分钟超时后退出 | 
**defaultpermexpireddays** | **Long** | 客户端配置权限时，默认权限有效天数  -1为无限期 | 
**enableclientmanuallogin** | **Boolean** | 是否允许AnyShare客户端手动登录 | 
**enablecsflevel** | **Boolean** | 是否开启更改密级审核  true表示开启  false表示关闭 | 
**enablefiletransferlimit** | **Boolean** | 是否开启文件传输限制功能 | 
**enablehttplinkaudit** | **Boolean** | 是否开启http共享审核  true表示开启  false表示关闭 | 
**enableonedrive** | **Boolean** | 是否启用onedrive跳转，默认为false | 
**enableshareaudit** | **Boolean** | 是否开启共享审核  true表示开启  false表示关闭 | 
**enableuseragreement** | **Boolean** | 是否显示用户协议，默认为false | 
**hidecachesetting** | **Boolean** | 客户端是否隐藏缓存设置 | 
**indefiniteperm** | **Boolean** | 权限配置，截至时间是否支持无限期 | 
**maxpassexpireddays** | **Long** | 密码配置，密码允许的最大过期天数  -1为永久 | 
**owasurl** | **String** | OWAS的预览url，如果未配置则为空字符串 | 
**rememberpass** | **Boolean** | 登录配置，是否允许记住用户名和密码 | 
**sursenpreview** | **Boolean** | 是否开启gd/sep预览 | 
**wopiurl** | **String** | WOPI的url，如果未配置则为空字符串 | 
**cadtool** | **String** | 配置的转换服务类型，cadpreview为true时返回 \&quot;mx\&quot;为梦想CAD \&quot;hc\&quot;为浩辰CAD |  [optional]
**cadurl** | **String** | CAD服务器地址 cadpreview为true，且cadtool为\&quot;hc\&quot;时返回 |  [optional]
