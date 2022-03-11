# LinkCopyReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destparent** | **String** | 目标父对象的gns路径，无法复制到原位置的子目录下 | 
**docid** | **String** | gns路径，通过文件夹外链复制其中的子对象时，需要该参数，默认为空 |  [optional]
**link** | **String** | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 | 
**password** | **String** | 密码 | 
**ondup** | **Long** | 1:检查是否重命名，重名则抛异常  2:默认值，如果重名冲突，自动重名  3:如果重名冲突，自动覆盖   |  [optional]
