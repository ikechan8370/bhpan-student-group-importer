# LinkPlayinfoReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**definition** | **String** | 视频画质（音频音质），为空默认为原始画质  有效值：空； od；sd  对于视频，od表示原始画质，sd表示标清；对于音频，sd请求无效 |  [optional]
**link** | **String** | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 | 
**password** | **String** | 密码 | 
**docid** | **String** | 文件gns路径，通过文件夹外链在线播放时，需要该参数，默认为空 |  [optional]
**rev** | **String** | 版本号，为空默认获取最新版本 |  [optional]
