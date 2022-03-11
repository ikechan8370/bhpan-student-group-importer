# FilePreduploadReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**length** | **Long** | 整个文件的长度 | 
**sliceMd5** | **String** | - 校验段校验码 - 如果文件大于200KB，slice_md5为文件的前200KB的MD5值 - 如果文件小于等于200KB，slice_md5为整个文件的MD5值 - 如果是空文件，slilce为空。 | 
