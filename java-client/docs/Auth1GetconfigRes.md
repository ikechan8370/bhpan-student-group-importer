# Auth1GetconfigRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | API版本，如6.0.8    当前主版本为6；    当前次版本从0开始，若次版本发生变化，则意味着本版本的API不再向下兼容；    当小版本的格式发生变化，代表服务端升级，但API仍然向下兼容。 | 
**autoLockRemind** | **Boolean** | 是否开启文件锁提醒，默认开启 | 
**cadPluginThreshold** | **Long** | 浩辰CAD使用大图插件的临界值 | 
**csfLevelEnum** | [**Auth1GetconfigResCsflevelenum**](Auth1GetconfigResCsflevelenum.md) |  | 
**deviceInfo** | [**Auth1GetconfigResDeviceinfo**](Auth1GetconfigResDeviceinfo.md) |  | 
**dualfactorAuthServerStatus** | [**Auth1GetconfigResDualfactorauthserverstatus**](Auth1GetconfigResDualfactorauthserverstatus.md) |  | 
**enableDocComment** | **Boolean** | 是否开启文件评论功能 | 
**enableDocDueRemind** | **Boolean** | 是否开启文件到期提醒 | 
**enableExitPwd** | **Boolean** | 是否使用退出口令 | 
**enableInvitationShare** | **Boolean** | 是否开启共享邀请链接  true表示开启  false表示关闭 | 
**enableLinkAccessCode** | **Boolean** | 是否启用提取码 true表示启用 false 表示不启用 | 
**enableMessageNotify** | **Boolean** | 是否启用消息通知功能 | 
**enableOutlinkWatermark** | **Boolean** | 是否允许用户设置外链水印 | 
**enableSecretMode** | **Boolean** | 是否开启涉密模式  true表示开启  false表示关闭 | 
**enableSetFolderSecurityLevel** | **Boolean** | 是否允许设置文件夹密级 | 
**enableStrongPwd** | **Boolean** | 是否开启强密码配置 | 
**entrydocViewConfig** | **Long** | Default: 2 返回入口文档视图模式 1 代表旧视图 2 代表新视图（默认） | 
**extapp** | [**Auth1GetconfigResExtapp**](Auth1GetconfigResExtapp.md) |  | 
**fileCrawlStatus** | **Boolean** | 是否开启文件抓取 | 
**forbidOstype** | **String** | 按bit位计算  IOS &#x3D; 1  ANDROID &#x3D; 2  WINDOWSPHONE &#x3D; 3  WINDOWS &#x3D; 4  MACOSX &#x3D; 5  WEB &#x3D; 6  MOBILEWEB &#x3D; 7 | 
**https** | **Boolean** | 客户端是否使用https | 
**idCardLoginStatus** | **Boolean** | 是否使用身份证登录 | 
**internalLinkPrefix** | **String** | 内链地址的前缀 | 
**limitRateConfig** | [**Auth1GetconfigResLimitrateconfig**](Auth1GetconfigResLimitrateconfig.md) |  | 
**onlyShareToUser** | **Boolean** | 是否只允许共享给用户 | 
**serverVersion** | **String** | 服务器版本信息 | 
**showKnowledgePage** | **Long** | 是否显示知识主页 | 
**strongPwdLength** | **Long** | 强密码最小长度 | 
**tagMaxNum** | **Long** | 标签的最大数量 | 
**thirdPwdModifyUrl** | **String** | 第三方用户密码修改地址 | 
**vcodeLoginConfig** | [**Auth1GetconfigResVcodelonginconfig**](Auth1GetconfigResVcodelonginconfig.md) |  | 
**windowsAdSso** | [**Auth1GetconfigResWindowsadsso**](Auth1GetconfigResWindowsadsso.md) |  | 
**thirdauth** | [**Auth1GetconfigResThirdauth**](Auth1GetconfigResThirdauth.md) |  |  [optional]
**thirdCsfsysConfig** | [**Auth1GetconfigResThirdcsfsysconfig**](Auth1GetconfigResThirdcsfsysconfig.md) |  |  [optional]
**customeApplicationConfig** | **String** | 定制化的客户应用配置，用于给客户端做定制化功能的开关，格式为Json字符串。如：{\&quot;appid\&quot;: \&quot;CUFE\&quot;} |  [optional]
**oemconfig** | [**Auth1GetconfigResOemconfig**](Auth1GetconfigResOemconfig.md) |  | 
**smtpServerExists** | **Boolean** | SMTP服务器是否配置 | 
