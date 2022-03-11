# AutolockLockReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docid** | **String** | 文件id | 
**force** | **Boolean** | 是否强制获取锁，默认为false  false：不强制获取锁  true：强制获取锁 |  [optional]
**expiretime** | **Long** | 文件锁有效期限，默认为使用服务器可配置的超期间隔进行定期清理  -1：永久有效 |  [optional]
