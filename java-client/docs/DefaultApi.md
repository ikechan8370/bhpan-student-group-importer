# DefaultApi

All URIs are relative to *https://{host}:{port}/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditApprovePost**](DefaultApi.md#auditApprovePost) | **POST** /audit/approve | 共享审核
[**auditApprovedocPost**](DefaultApi.md#auditApprovedocPost) | **POST** /audit/approvedoc | 流程审核
[**auditGetapplyhistoryPost**](DefaultApi.md#auditGetapplyhistoryPost) | **POST** /audit/getapplyhistory | 获取流程申请历史
[**auditGetapplyhistorycountPost**](DefaultApi.md#auditGetapplyhistorycountPost) | **POST** /audit/getapplyhistorycount | 获取流程申请历史总数
[**auditGetapplysPost**](DefaultApi.md#auditGetapplysPost) | **POST** /audit/getapplys | 获取我的共享申请
[**auditGetapprovehistoryPost**](DefaultApi.md#auditGetapprovehistoryPost) | **POST** /audit/getapprovehistory | 获取流程审核历史
[**auditGetapprovehistorycountPost**](DefaultApi.md#auditGetapprovehistorycountPost) | **POST** /audit/getapprovehistorycount | 获取流程审核历史数量
[**auditGetdocapplysPost**](DefaultApi.md#auditGetdocapplysPost) | **POST** /audit/getdocapplys | 获取申请中的流程信息
[**auditGetdocapprovalsPost**](DefaultApi.md#auditGetdocapprovalsPost) | **POST** /audit/getdocapprovals | 获取待审核的流程信息
[**auditGetdocprocessesPost**](DefaultApi.md#auditGetdocprocessesPost) | **POST** /audit/getdocprocesses | 获取所有流程信息
[**auditGetpendingapprovalsPost**](DefaultApi.md#auditGetpendingapprovalsPost) | **POST** /audit/getpendingapprovals | 获取待审核的共享申请
[**auditGetpendingapprovalscountsPost**](DefaultApi.md#auditGetpendingapprovalscountsPost) | **POST** /audit/getpendingapprovalscounts | 获取待审核的申请数
[**auditGetshareapplyhistoryPost**](DefaultApi.md#auditGetshareapplyhistoryPost) | **POST** /audit/getshareapplyhistory | 获取共享申请历史
[**auditGetshareapplyhistorycountPost**](DefaultApi.md#auditGetshareapplyhistorycountPost) | **POST** /audit/getshareapplyhistorycount | 获取共享申请历史数量
[**auditGetshareapprovehistoryPost**](DefaultApi.md#auditGetshareapprovehistoryPost) | **POST** /audit/getshareapprovehistory | 获取共享审核历史
[**auditGetshareapprovehistorycountPost**](DefaultApi.md#auditGetshareapprovehistorycountPost) | **POST** /audit/getshareapprovehistorycount | 获取共享审核历史总数
[**auditPublishdocPost**](DefaultApi.md#auditPublishdocPost) | **POST** /audit/publishdoc | 发起流程申请
[**auth1CheckuninstallpwdPost**](DefaultApi.md#auth1CheckuninstallpwdPost) | **POST** /auth1/checkuninstallpwd | PC客户端卸载输入口令
[**auth1ExtloginclientPost**](DefaultApi.md#auth1ExtloginclientPost) | **POST** /auth1/extloginclient | 登录（信任的第三方应用appid）
[**auth1GetbyadsessionPost**](DefaultApi.md#auth1GetbyadsessionPost) | **POST** /auth1/getbyadsession | 登录（使用windows登录凭据）
[**auth1GetbythirdpartyPost**](DefaultApi.md#auth1GetbythirdpartyPost) | **POST** /auth1/getbythirdparty | 登录（使用第三方凭证）
[**auth1GetbyticketPost**](DefaultApi.md#auth1GetbyticketPost) | **POST** /auth1/getbyticket | 登录（西电ticket）
[**auth1GetconfigPost**](DefaultApi.md#auth1GetconfigPost) | **POST** /auth1/getconfig | 获取服务器配置信息
[**auth1GetextappinfoPost**](DefaultApi.md#auth1GetextappinfoPost) | **POST** /auth1/getextappinfo | 登录外部应用（集成到anyshare）
[**auth1GetnewPost**](DefaultApi.md#auth1GetnewPost) | **POST** /auth1/getnew | 登录（标准）
[**auth1GetoauthinfoPost**](DefaultApi.md#auth1GetoauthinfoPost) | **POST** /auth1/getoauthinfo | 获取OAuth信息
[**auth1GetvcodePost**](DefaultApi.md#auth1GetvcodePost) | **POST** /auth1/getvcode | 获取验证码
[**auth1LogoutPost**](DefaultApi.md#auth1LogoutPost) | **POST** /auth1/logout | 登出
[**auth1ModifypasswordPost**](DefaultApi.md#auth1ModifypasswordPost) | **POST** /auth1/modifypassword | 修改用户密码
[**auth1RefreshtokenPost**](DefaultApi.md#auth1RefreshtokenPost) | **POST** /auth1/refreshtoken | 刷新身份凭证有效期
[**auth1RevoketokenPost**](DefaultApi.md#auth1RevoketokenPost) | **POST** /auth1/revoketoken | 回收身份凭证
[**auth1SelfregistrationPost**](DefaultApi.md#auth1SelfregistrationPost) | **POST** /auth1/selfregistration | 用户自注册
[**auth1SendauthvcodePost**](DefaultApi.md#auth1SendauthvcodePost) | **POST** /auth1/sendauthvcode | 发送短信验证码（双因子登录）
[**auth1ValidatesecuritydevicePost**](DefaultApi.md#auth1ValidatesecuritydevicePost) | **POST** /auth1/validatesecuritydevice | 二次安全设备认证
[**autolockGetdirlockinfoPost**](DefaultApi.md#autolockGetdirlockinfoPost) | **POST** /autolock/getdirlockinfo | 获取文件夹锁信息
[**autolockGetlockedfileinfosPost**](DefaultApi.md#autolockGetlockedfileinfosPost) | **POST** /autolock/getlockedfileinfos | 获取当前用户锁信息
[**autolockGetlockinfoPost**](DefaultApi.md#autolockGetlockinfoPost) | **POST** /autolock/getlockinfo | 获取文件锁信息
[**autolockLockPost**](DefaultApi.md#autolockLockPost) | **POST** /autolock/lock | 锁定文件
[**autolockRefreshPost**](DefaultApi.md#autolockRefreshPost) | **POST** /autolock/refresh | 刷新文件锁
[**autolockTrylockPost**](DefaultApi.md#autolockTrylockPost) | **POST** /autolock/trylock | 尝试锁定文件
[**autolockUnlockPost**](DefaultApi.md#autolockUnlockPost) | **POST** /autolock/unlock | 解锁文件
[**configGetPost**](DefaultApi.md#configGetPost) | **POST** /config/get | 获取配置信息
[**configGetdocwatermarkconfigPost**](DefaultApi.md#configGetdocwatermarkconfigPost) | **POST** /config/getdocwatermarkconfig | 获取文件水印配置信息
[**configGetoemconfigbysectionPost**](DefaultApi.md#configGetoemconfigbysectionPost) | **POST** /config/getoemconfigbysection | 获取OEM配置信息
[**contactorAddgroupPost**](DefaultApi.md#contactorAddgroupPost) | **POST** /contactor/addgroup | 添加联系人组
[**contactorAddpersonsPost**](DefaultApi.md#contactorAddpersonsPost) | **POST** /contactor/addpersons | 添加联系人至联系人组
[**contactorDeletegroupPost**](DefaultApi.md#contactorDeletegroupPost) | **POST** /contactor/deletegroup | 删除联系人组
[**contactorDeletepersonsPost**](DefaultApi.md#contactorDeletepersonsPost) | **POST** /contactor/deletepersons | 删除联系人组中的联系人
[**contactorEditgroupPost**](DefaultApi.md#contactorEditgroupPost) | **POST** /contactor/editgroup | 编辑联系人组
[**contactorGetPost**](DefaultApi.md#contactorGetPost) | **POST** /contactor/get | 获取分组下所有联系人
[**contactorGetgroupsPost**](DefaultApi.md#contactorGetgroupsPost) | **POST** /contactor/getgroups | 获取所有联系人分组
[**contactorGetpersonsPost**](DefaultApi.md#contactorGetpersonsPost) | **POST** /contactor/getpersons | 获取联系人组中的联系人
[**contactorSearchPost**](DefaultApi.md#contactorSearchPost) | **POST** /contactor/search | 在联系人组搜索用户和联系人组信息
[**contactorSearchcountPost**](DefaultApi.md#contactorSearchcountPost) | **POST** /contactor/searchcount | 搜索用户和联系人组信息总数
[**contactorSearchpersonsPost**](DefaultApi.md#contactorSearchpersonsPost) | **POST** /contactor/searchpersons | 搜索联系人组中的联系人
[**departmentGetbasicinfoPost**](DefaultApi.md#departmentGetbasicinfoPost) | **POST** /department/getbasicinfo | 获取部门基本信息
[**departmentGetrootsPost**](DefaultApi.md#departmentGetrootsPost) | **POST** /department/getroots | 获取用户所能访问的根部门信息
[**departmentGetsubdepsPost**](DefaultApi.md#departmentGetsubdepsPost) | **POST** /department/getsubdeps | 获取子部门信息
[**departmentGetsubusersPost**](DefaultApi.md#departmentGetsubusersPost) | **POST** /department/getsubusers | 获取部门下的子用户信息
[**departmentSearchPost**](DefaultApi.md#departmentSearchPost) | **POST** /department/search | 在组织下搜索用户和部门信息
[**departmentSearchcountPost**](DefaultApi.md#departmentSearchcountPost) | **POST** /department/searchcount | 在组织下搜索获取搜索数目
[**deviceDisablePost**](DefaultApi.md#deviceDisablePost) | **POST** /device/disable | 禁用设备
[**deviceEnablePost**](DefaultApi.md#deviceEnablePost) | **POST** /device/enable | 启用设备
[**deviceErasePost**](DefaultApi.md#deviceErasePost) | **POST** /device/erase | 擦除缓存
[**deviceGetstatusPost**](DefaultApi.md#deviceGetstatusPost) | **POST** /device/getstatus | 获取设备状态（mobile）
[**deviceListPost**](DefaultApi.md#deviceListPost) | **POST** /device/list | 获取所有设备信息
[**deviceOnerasesucPost**](DefaultApi.md#deviceOnerasesucPost) | **POST** /device/onerasesuc | 通知AnyShare缓存擦除成功（mobile）
[**dirAddtagPost**](DefaultApi.md#dirAddtagPost) | **POST** /dir/addtag | 添加目录标签
[**dirAddtagsPost**](DefaultApi.md#dirAddtagsPost) | **POST** /dir/addtags | 添加目录多个标签
[**dirAttributePost**](DefaultApi.md#dirAttributePost) | **POST** /dir/attribute | 获取目录属性协议
[**dirCheckwatermarkPost**](DefaultApi.md#dirCheckwatermarkPost) | **POST** /dir/checkwatermark | 检查是否需要下载水印
[**dirCopyPost**](DefaultApi.md#dirCopyPost) | **POST** /dir/copy | 复制目录协议
[**dirCopyprogressPost**](DefaultApi.md#dirCopyprogressPost) | **POST** /dir/copyprogress | 复制目录进度查询协议
[**dirCreatePost**](DefaultApi.md#dirCreatePost) | **POST** /dir/create | 创建目录协议
[**dirCreatemultileveldirPost**](DefaultApi.md#dirCreatemultileveldirPost) | **POST** /dir/createmultileveldir | 创建多级目录协议
[**dirDeletePost**](DefaultApi.md#dirDeletePost) | **POST** /dir/delete | 删除目录协议
[**dirDeletetagPost**](DefaultApi.md#dirDeletetagPost) | **POST** /dir/deletetag | 删除目录标签
[**dirGetsuggestnamePost**](DefaultApi.md#dirGetsuggestnamePost) | **POST** /dir/getsuggestname | 获取创建目录的建议名称
[**dirIsfileoutboxPost**](DefaultApi.md#dirIsfileoutboxPost) | **POST** /dir/isfileoutbox | 检查是否是发件箱协议
[**dirListPost**](DefaultApi.md#dirListPost) | **POST** /dir/list | 浏览目录协议
[**dirMovePost**](DefaultApi.md#dirMovePost) | **POST** /dir/move | 移动目录协议
[**dirRenamePost**](DefaultApi.md#dirRenamePost) | **POST** /dir/rename | 重命名目录协议
[**dirSetcsflevelPost**](DefaultApi.md#dirSetcsflevelPost) | **POST** /dir/setcsflevel | 设置目录密级
[**dirSizePost**](DefaultApi.md#dirSizePost) | **POST** /dir/size | 获取目录大小协议
[**efastV1FileGetcsfinfoPost**](DefaultApi.md#efastV1FileGetcsfinfoPost) | **POST** /efast/v1/file/getcsfinfo | 获取文件定密信息
[**entrydoc2GetPost**](DefaultApi.md#entrydoc2GetPost) | **POST** /entrydoc2/get | 获取文档库
[**entrydoc2GetdocinfoPost**](DefaultApi.md#entrydoc2GetdocinfoPost) | **POST** /entrydoc2/getdocinfo | 获取文档库信息
[**entrydoc2GetdocquotaPost**](DefaultApi.md#entrydoc2GetdocquotaPost) | **POST** /entrydoc2/getdocquota | 获取文档库配额
[**entrydoc2GetmanagedPost**](DefaultApi.md#entrydoc2GetmanagedPost) | **POST** /entrydoc2/getmanaged | 获取用户管理的文档库
[**entrydoc2GetuserquotaPost**](DefaultApi.md#entrydoc2GetuserquotaPost) | **POST** /entrydoc2/getuserquota | 获取用户配额
[**favoritesAddPost**](DefaultApi.md#favoritesAddPost) | **POST** /favorites/add | 添加收藏
[**favoritesCheckPost**](DefaultApi.md#favoritesCheckPost) | **POST** /favorites/check | 批量查询收藏状态
[**favoritesDeletePost**](DefaultApi.md#favoritesDeletePost) | **POST** /favorites/delete | 删除收藏
[**favoritesListPost**](DefaultApi.md#favoritesListPost) | **POST** /favorites/list | 获取收藏列表
[**fileAddtagPost**](DefaultApi.md#fileAddtagPost) | **POST** /file/addtag | 添加文件标签
[**fileAddtagsPost**](DefaultApi.md#fileAddtagsPost) | **POST** /file/addtags | 添加文件多个标签
[**fileAttributePost**](DefaultApi.md#fileAttributePost) | **POST** /file/attribute | 获取文件属性协议
[**fileBatchdownloadPost**](DefaultApi.md#fileBatchdownloadPost) | **POST** /file/batchdownload | 文件及文件夹批量下载
[**fileConvertpathPost**](DefaultApi.md#fileConvertpathPost) | **POST** /file/convertpath | 转换路径协议
[**fileCopyPost**](DefaultApi.md#fileCopyPost) | **POST** /file/copy | 复制文件协议
[**fileCustomattributevaluePost**](DefaultApi.md#fileCustomattributevaluePost) | **POST** /file/customattributevalue | 获取属性属性值
[**fileDeletePost**](DefaultApi.md#fileDeletePost) | **POST** /file/delete | 删除文件协议
[**fileDeletecommentPost**](DefaultApi.md#fileDeletecommentPost) | **POST** /file/deletecomment | 删除文件评论
[**fileDeletetagPost**](DefaultApi.md#fileDeletetagPost) | **POST** /file/deletetag | 删除文件标签
[**fileDuploadPost**](DefaultApi.md#fileDuploadPost) | **POST** /file/dupload | 秒传文件协议
[**fileGetappmetadataPost**](DefaultApi.md#fileGetappmetadataPost) | **POST** /file/getappmetadata | 获取应用元数据
[**fileGetcommentPost**](DefaultApi.md#fileGetcommentPost) | **POST** /file/getcomment | 获取文件评论
[**fileGetfilecustomattributePost**](DefaultApi.md#fileGetfilecustomattributePost) | **POST** /file/getfilecustomattribute | 获取文件自定义属性
[**fileGetinfobypathPost**](DefaultApi.md#fileGetinfobypathPost) | **POST** /file/getinfobypath | 由名字路径获取对象信息协议
[**fileGetsuggestnamePost**](DefaultApi.md#fileGetsuggestnamePost) | **POST** /file/getsuggestname | 获取上传文件的建议名称
[**fileMetadataPost**](DefaultApi.md#fileMetadataPost) | **POST** /file/metadata | 获取元数据协议
[**fileMovePost**](DefaultApi.md#fileMovePost) | **POST** /file/move | 移动文件协议
[**fileOpstatisticsPost**](DefaultApi.md#fileOpstatisticsPost) | **POST** /file/opstatistics | 批量获取文件操作统计
[**fileOsbeginuploadPost**](DefaultApi.md#fileOsbeginuploadPost) | **POST** /file/osbeginupload | 开始上传文件协议
[**fileOscompleteuploadPost**](DefaultApi.md#fileOscompleteuploadPost) | **POST** /file/oscompleteupload | 上传大文件的分块完成协议
[**fileOsdownloadPost**](DefaultApi.md#fileOsdownloadPost) | **POST** /file/osdownload | 下载文件协议
[**fileOsenduploadPost**](DefaultApi.md#fileOsenduploadPost) | **POST** /file/osendupload | 上传文件完成协议
[**fileOsinitmultiuploadPost**](DefaultApi.md#fileOsinitmultiuploadPost) | **POST** /file/osinitmultiupload | 开始上传大文件协议
[**fileOsoptionPost**](DefaultApi.md#fileOsoptionPost) | **POST** /file/osoption | 对象存储的选项值
[**fileOsuploadpartPost**](DefaultApi.md#fileOsuploadpartPost) | **POST** /file/osuploadpart | 上传大文件的分块协议
[**fileOsuploadrefreshPost**](DefaultApi.md#fileOsuploadrefreshPost) | **POST** /file/osuploadrefresh | 上传文件更新协议
[**filePlayGet**](DefaultApi.md#filePlayGet) | **GET** /file/play | 在线播放协议
[**filePlayinfoPost**](DefaultApi.md#filePlayinfoPost) | **POST** /file/playinfo | 在线播放请求协议
[**filePlaythumbnailGet**](DefaultApi.md#filePlaythumbnailGet) | **GET** /file/playthumbnail | 获取视频缩略图协议
[**filePreduploadPost**](DefaultApi.md#filePreduploadPost) | **POST** /file/predupload | 秒传校验码协议
[**filePreviewossPost**](DefaultApi.md#filePreviewossPost) | **POST** /file/previewoss | 文档预览协议
[**fileRenamePost**](DefaultApi.md#fileRenamePost) | **POST** /file/rename | 重命名文件协议
[**fileRestorerevisionPost**](DefaultApi.md#fileRestorerevisionPost) | **POST** /file/restorerevision | 还原文件历史版本协议
[**fileRevisionsPost**](DefaultApi.md#fileRevisionsPost) | **POST** /file/revisions | 获取文件历史版本协议
[**fileSendPost**](DefaultApi.md#fileSendPost) | **POST** /file/send | 发送文件协议
[**fileSetappmetadataPost**](DefaultApi.md#fileSetappmetadataPost) | **POST** /file/setappmetadata | 设置应用元数据
[**fileSetcsflevelPost**](DefaultApi.md#fileSetcsflevelPost) | **POST** /file/setcsflevel | 设置文件密级
[**fileSetfilecustomattributePost**](DefaultApi.md#fileSetfilecustomattributePost) | **POST** /file/setfilecustomattribute | 设置文件属性值
[**fileSubmitcommentPost**](DefaultApi.md#fileSubmitcommentPost) | **POST** /file/submitcomment | 提交文件评论
[**fileThumbnailGet**](DefaultApi.md#fileThumbnailGet) | **GET** /file/thumbnail | 图片缩略图协议
[**finderDisablePost**](DefaultApi.md#finderDisablePost) | **POST** /finder/disable | 关闭文档发现状态
[**finderEnablePost**](DefaultApi.md#finderEnablePost) | **POST** /finder/enable | 开启文档发现状态
[**finderGetenabledPost**](DefaultApi.md#finderGetenabledPost) | **POST** /finder/getenabled | 获取用户开启发现的文档
[**finderGetstatusPost**](DefaultApi.md#finderGetstatusPost) | **POST** /finder/getstatus | 获取文档发现状态
[**groupdocAddPost**](DefaultApi.md#groupdocAddPost) | **POST** /groupdoc/add | 创建群组文档
[**groupdocDeletePost**](DefaultApi.md#groupdocDeletePost) | **POST** /groupdoc/delete | 删除群组
[**groupdocEditPost**](DefaultApi.md#groupdocEditPost) | **POST** /groupdoc/edit | 编辑群组名称
[**groupdocEditquotaPost**](DefaultApi.md#groupdocEditquotaPost) | **POST** /groupdoc/editquota | 编辑群组配额
[**invitationClosePost**](DefaultApi.md#invitationClosePost) | **POST** /invitation/close | 关闭共享邀请链接
[**invitationGetPost**](DefaultApi.md#invitationGetPost) | **POST** /invitation/get | 获取共享邀请信息
[**invitationGetbaseinfobydocidPost**](DefaultApi.md#invitationGetbaseinfobydocidPost) | **POST** /invitation/getbaseinfobydocid | 获取共享邀请基本信息
[**invitationGetnoteinfobydocidPost**](DefaultApi.md#invitationGetnoteinfobydocidPost) | **POST** /invitation/getnoteinfobydocid | 获取共享邀请图片备注信息
[**invitationJoinPost**](DefaultApi.md#invitationJoinPost) | **POST** /invitation/join | 加入共享邀请
[**invitationOpenPost**](DefaultApi.md#invitationOpenPost) | **POST** /invitation/open | 开启共享邀请链接
[**invitationSetbaseinfoPost**](DefaultApi.md#invitationSetbaseinfoPost) | **POST** /invitation/setbaseinfo | 设置共享邀请基本信息
[**invitationSetnoteinfoPost**](DefaultApi.md#invitationSetnoteinfoPost) | **POST** /invitation/setnoteinfo | 设置共享邀请图片备注信息
[**linkBatchdownloadPost**](DefaultApi.md#linkBatchdownloadPost) | **POST** /link/batchdownload | 文件及文件夹批量下载
[**linkCheckpermPost**](DefaultApi.md#linkCheckpermPost) | **POST** /link/checkperm | 权限检查
[**linkCheckwatermarkPost**](DefaultApi.md#linkCheckwatermarkPost) | **POST** /link/checkwatermark | 检查是否需要水印
[**linkClosePost**](DefaultApi.md#linkClosePost) | **POST** /link/close | 关闭外链
[**linkCopyPost**](DefaultApi.md#linkCopyPost) | **POST** /link/copy | 复制协议
[**linkCopyprogressPost**](DefaultApi.md#linkCopyprogressPost) | **POST** /link/copyprogress | 复制目录进度查询协议
[**linkGetPost**](DefaultApi.md#linkGetPost) | **POST** /link/get | 获取外链文件信息
[**linkGetdetailPost**](DefaultApi.md#linkGetdetailPost) | **POST** /link/getdetail | 获取外链开启信息
[**linkGetinfoPost**](DefaultApi.md#linkGetinfoPost) | **POST** /link/getinfo | 获取外链信息
[**linkGetlinkedPost**](DefaultApi.md#linkGetlinkedPost) | **POST** /link/getlinked | 获取我的外链
[**linkListdirPost**](DefaultApi.md#linkListdirPost) | **POST** /link/listdir | 浏览目录
[**linkOpenPost**](DefaultApi.md#linkOpenPost) | **POST** /link/open | 开启外链
[**linkOpfilesPost**](DefaultApi.md#linkOpfilesPost) | **POST** /link/opfiles | 获取被访问文件列表
[**linkOpstatisticsPost**](DefaultApi.md#linkOpstatisticsPost) | **POST** /link/opstatistics | 获取文件访问详情
[**linkOsbeginuploadPost**](DefaultApi.md#linkOsbeginuploadPost) | **POST** /link/osbeginupload | 开始上传文件
[**linkOsdownloadPost**](DefaultApi.md#linkOsdownloadPost) | **POST** /link/osdownload | 获取文件
[**linkOsenduploadPost**](DefaultApi.md#linkOsenduploadPost) | **POST** /link/osendupload | 上传文件完成
[**linkPlayGet**](DefaultApi.md#linkPlayGet) | **GET** /link/play | 在线播放
[**linkPlayinfoPost**](DefaultApi.md#linkPlayinfoPost) | **POST** /link/playinfo | 在线播放请求
[**linkPlaythumbnailGet**](DefaultApi.md#linkPlaythumbnailGet) | **GET** /link/playthumbnail | 获取视频缩略图
[**linkPreviewossPost**](DefaultApi.md#linkPreviewossPost) | **POST** /link/previewoss | 文档预览
[**linkSetPost**](DefaultApi.md#linkSetPost) | **POST** /link/set | 修改外链
[**linkThumbnailGet**](DefaultApi.md#linkThumbnailGet) | **GET** /link/thumbnail | 缩略图预览
[**messageGetPost**](DefaultApi.md#messageGetPost) | **POST** /message/get | 获取消息通知
[**messageRead2Post**](DefaultApi.md#messageRead2Post) | **POST** /message/read2 | 确认消息通知
[**messageSendmailPost**](DefaultApi.md#messageSendmailPost) | **POST** /message/sendmail | 邮件发送
[**ownerAddPost**](DefaultApi.md#ownerAddPost) | **POST** /owner/add | 添加所有者
[**ownerCheckPost**](DefaultApi.md#ownerCheckPost) | **POST** /owner/check | 检查是否是所有者
[**ownerDeletePost**](DefaultApi.md#ownerDeletePost) | **POST** /owner/delete | 删除所有者
[**ownerGetPost**](DefaultApi.md#ownerGetPost) | **POST** /owner/get | 获取所有者
[**ownerSetPost**](DefaultApi.md#ownerSetPost) | **POST** /owner/set | 设置所有者
[**perm1CheckPost**](DefaultApi.md#perm1CheckPost) | **POST** /perm1/check | 检查单个权限
[**perm1CheckallPost**](DefaultApi.md#perm1CheckallPost) | **POST** /perm1/checkall | 检查所有权限
[**perm1GetexternallinktemplatePost**](DefaultApi.md#perm1GetexternallinktemplatePost) | **POST** /perm1/getexternallinktemplate | 获取外链共享模板
[**perm1GetinternallinktemplatePost**](DefaultApi.md#perm1GetinternallinktemplatePost) | **POST** /perm1/getinternallinktemplate | 获取内链共享模板
[**perm1GetsharedPost**](DefaultApi.md#perm1GetsharedPost) | **POST** /perm1/getshared | 获取用户已共享的文档
[**perm1GetsharedocconfigPost**](DefaultApi.md#perm1GetsharedocconfigPost) | **POST** /perm1/getsharedocconfig | 获取共享文档开关配置
[**perm1ListPost**](DefaultApi.md#perm1ListPost) | **POST** /perm1/list | 展示各访问者的最终权限
[**perm2GetPost**](DefaultApi.md#perm2GetPost) | **POST** /perm2/get | 获取权限配置
[**perm2SetPost**](DefaultApi.md#perm2SetPost) | **POST** /perm2/set | 设置权限配置
[**quarantineAppealPost**](DefaultApi.md#quarantineAppealPost) | **POST** /quarantine/appeal | 浏览协议
[**quarantineListPost**](DefaultApi.md#quarantineListPost) | **POST** /quarantine/list | 浏览协议
[**quarantineListreversionPost**](DefaultApi.md#quarantineListreversionPost) | **POST** /quarantine/listreversion | 获取版本协议
[**quarantinePreviewPost**](DefaultApi.md#quarantinePreviewPost) | **POST** /quarantine/preview | 获取版本协议
[**recycleDeletePost**](DefaultApi.md#recycleDeletePost) | **POST** /recycle/delete | 删除回收站资源协议
[**recycleGetretentiondaysPost**](DefaultApi.md#recycleGetretentiondaysPost) | **POST** /recycle/getretentiondays | 获取回收站保留天数
[**recycleGetsuggestnamePost**](DefaultApi.md#recycleGetsuggestnamePost) | **POST** /recycle/getsuggestname | 获取回收站还原后的建议名称协议
[**recycleListPost**](DefaultApi.md#recycleListPost) | **POST** /recycle/list | 浏览回收站资源协议
[**recycleRestorePost**](DefaultApi.md#recycleRestorePost) | **POST** /recycle/restore | 还原回收站资源协议
[**recycleSetretentiondaysPost**](DefaultApi.md#recycleSetretentiondaysPost) | **POST** /recycle/setretentiondays | 设置回收站保留天数
[**redirectGethostinfoPost**](DefaultApi.md#redirectGethostinfoPost) | **POST** /redirect/gethostinfo | 获取webclient地址信息
[**searchCustomattributePost**](DefaultApi.md#searchCustomattributePost) | **POST** /search/customattribute | 获取自定义属性协议
[**searchSearchPost**](DefaultApi.md#searchSearchPost) | **POST** /search/search | 搜索协议
[**searchTagsuggestPost**](DefaultApi.md#searchTagsuggestPost) | **POST** /search/tagsuggest/ | 标签补全协议
[**updateCheckPost**](DefaultApi.md#updateCheckPost) | **POST** /update/check | 检查客户端是否需要更新
[**updateDownloadPost**](DefaultApi.md#updateDownloadPost) | **POST** /update/download | 下载客户端升级包
[**userAgreedtotermsofusePost**](DefaultApi.md#userAgreedtotermsofusePost) | **POST** /user/agreedtotermsofuse | 同意用户使用协议
[**userGetPost**](DefaultApi.md#userGetPost) | **POST** /user/get | 获取userid对应的用户信息
[**userGetbasicinfoPost**](DefaultApi.md#userGetbasicinfoPost) | **POST** /user/getbasicinfo | 获取用户基本信息

<a name="auditApprovePost"></a>
# **auditApprovePost**
> AuditApproveRes auditApprovePost(body)

共享审核

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditApproveReq body = new AuditApproveReq(); // AuditApproveReq | 
try {
    AuditApproveRes result = apiInstance.auditApprovePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditApproveReq**](AuditApproveReq.md)|  |

### Return type

[**AuditApproveRes**](AuditApproveRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditApprovedocPost"></a>
# **auditApprovedocPost**
> AuditApprovedocRes auditApprovedocPost(body)

流程审核

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditApprovedocReq body = new AuditApprovedocReq(); // AuditApprovedocReq | 
try {
    AuditApprovedocRes result = apiInstance.auditApprovedocPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditApprovedocPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditApprovedocReq**](AuditApprovedocReq.md)|  |

### Return type

[**AuditApprovedocRes**](AuditApprovedocRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditGetapplyhistoryPost"></a>
# **auditGetapplyhistoryPost**
> AuditGetapplyhistoryRes auditGetapplyhistoryPost(body)

获取流程申请历史

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditGetapplyhistoryReq body = new AuditGetapplyhistoryReq(); // AuditGetapplyhistoryReq | 
try {
    AuditGetapplyhistoryRes result = apiInstance.auditGetapplyhistoryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetapplyhistoryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditGetapplyhistoryReq**](AuditGetapplyhistoryReq.md)|  |

### Return type

[**AuditGetapplyhistoryRes**](AuditGetapplyhistoryRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditGetapplyhistorycountPost"></a>
# **auditGetapplyhistorycountPost**
> AuditGetapplyhistorycountRes auditGetapplyhistorycountPost()

获取流程申请历史总数

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetapplyhistorycountRes result = apiInstance.auditGetapplyhistorycountPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetapplyhistorycountPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetapplyhistorycountRes**](AuditGetapplyhistorycountRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditGetapplysPost"></a>
# **auditGetapplysPost**
> AuditGetapplysRes auditGetapplysPost(body)

获取我的共享申请

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditGetapplysReq body = new AuditGetapplysReq(); // AuditGetapplysReq | 
try {
    AuditGetapplysRes result = apiInstance.auditGetapplysPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetapplysPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditGetapplysReq**](AuditGetapplysReq.md)|  |

### Return type

[**AuditGetapplysRes**](AuditGetapplysRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditGetapprovehistoryPost"></a>
# **auditGetapprovehistoryPost**
> AuditGetapprovehistoryRes auditGetapprovehistoryPost(body)

获取流程审核历史

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditGetapprovehistoryReq body = new AuditGetapprovehistoryReq(); // AuditGetapprovehistoryReq | 
try {
    AuditGetapprovehistoryRes result = apiInstance.auditGetapprovehistoryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetapprovehistoryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditGetapprovehistoryReq**](AuditGetapprovehistoryReq.md)|  |

### Return type

[**AuditGetapprovehistoryRes**](AuditGetapprovehistoryRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditGetapprovehistorycountPost"></a>
# **auditGetapprovehistorycountPost**
> AuditGetapprovehistorycountRes auditGetapprovehistorycountPost()

获取流程审核历史数量

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetapprovehistorycountRes result = apiInstance.auditGetapprovehistorycountPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetapprovehistorycountPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetapprovehistorycountRes**](AuditGetapprovehistorycountRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditGetdocapplysPost"></a>
# **auditGetdocapplysPost**
> AuditGetdocapplysRes auditGetdocapplysPost()

获取申请中的流程信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetdocapplysRes result = apiInstance.auditGetdocapplysPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetdocapplysPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetdocapplysRes**](AuditGetdocapplysRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditGetdocapprovalsPost"></a>
# **auditGetdocapprovalsPost**
> AuditGetdocapprovalsRes auditGetdocapprovalsPost()

获取待审核的流程信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetdocapprovalsRes result = apiInstance.auditGetdocapprovalsPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetdocapprovalsPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetdocapprovalsRes**](AuditGetdocapprovalsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditGetdocprocessesPost"></a>
# **auditGetdocprocessesPost**
> AuditGetdocprocessesRes auditGetdocprocessesPost()

获取所有流程信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetdocprocessesRes result = apiInstance.auditGetdocprocessesPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetdocprocessesPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetdocprocessesRes**](AuditGetdocprocessesRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditGetpendingapprovalsPost"></a>
# **auditGetpendingapprovalsPost**
> AuditGetpendingapprovalsRes auditGetpendingapprovalsPost(body)

获取待审核的共享申请

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditGetpendingapprovalsReq body = new AuditGetpendingapprovalsReq(); // AuditGetpendingapprovalsReq | 
try {
    AuditGetpendingapprovalsRes result = apiInstance.auditGetpendingapprovalsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetpendingapprovalsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditGetpendingapprovalsReq**](AuditGetpendingapprovalsReq.md)|  |

### Return type

[**AuditGetpendingapprovalsRes**](AuditGetpendingapprovalsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditGetpendingapprovalscountsPost"></a>
# **auditGetpendingapprovalscountsPost**
> AuditGetpendingapprovalscountsRes auditGetpendingapprovalscountsPost()

获取待审核的申请数

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetpendingapprovalscountsRes result = apiInstance.auditGetpendingapprovalscountsPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetpendingapprovalscountsPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetpendingapprovalscountsRes**](AuditGetpendingapprovalscountsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditGetshareapplyhistoryPost"></a>
# **auditGetshareapplyhistoryPost**
> AuditGetpendingapprovalsRes auditGetshareapplyhistoryPost(body)

获取共享申请历史

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditGetpendingapprovalsReq body = new AuditGetpendingapprovalsReq(); // AuditGetpendingapprovalsReq | 
try {
    AuditGetpendingapprovalsRes result = apiInstance.auditGetshareapplyhistoryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetshareapplyhistoryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditGetpendingapprovalsReq**](AuditGetpendingapprovalsReq.md)|  |

### Return type

[**AuditGetpendingapprovalsRes**](AuditGetpendingapprovalsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditGetshareapplyhistorycountPost"></a>
# **auditGetshareapplyhistorycountPost**
> AuditGetshareapplyhistorycountRes auditGetshareapplyhistorycountPost()

获取共享申请历史数量

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetshareapplyhistorycountRes result = apiInstance.auditGetshareapplyhistorycountPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetshareapplyhistorycountPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetshareapplyhistorycountRes**](AuditGetshareapplyhistorycountRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditGetshareapprovehistoryPost"></a>
# **auditGetshareapprovehistoryPost**
> AuditGetshareapprovehistoryRes auditGetshareapprovehistoryPost(body)

获取共享审核历史

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditGetshareapprovehistoryReq body = new AuditGetshareapprovehistoryReq(); // AuditGetshareapprovehistoryReq | 
try {
    AuditGetshareapprovehistoryRes result = apiInstance.auditGetshareapprovehistoryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetshareapprovehistoryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditGetshareapprovehistoryReq**](AuditGetshareapprovehistoryReq.md)|  |

### Return type

[**AuditGetshareapprovehistoryRes**](AuditGetshareapprovehistoryRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditGetshareapprovehistorycountPost"></a>
# **auditGetshareapprovehistorycountPost**
> AuditGetshareapprovehistorycountRes auditGetshareapprovehistorycountPost()

获取共享审核历史总数

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    AuditGetshareapprovehistorycountRes result = apiInstance.auditGetshareapprovehistorycountPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditGetshareapprovehistorycountPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditGetshareapprovehistorycountRes**](AuditGetshareapprovehistorycountRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditPublishdocPost"></a>
# **auditPublishdocPost**
> AuditPublishdocRes auditPublishdocPost(body)

发起流程申请

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AuditPublishdocReq body = new AuditPublishdocReq(); // AuditPublishdocReq | 
try {
    AuditPublishdocRes result = apiInstance.auditPublishdocPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditPublishdocPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditPublishdocReq**](AuditPublishdocReq.md)|  |

### Return type

[**AuditPublishdocRes**](AuditPublishdocRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1CheckuninstallpwdPost"></a>
# **auth1CheckuninstallpwdPost**
> Auth1CheckuninstallpwdRes auth1CheckuninstallpwdPost(body)

PC客户端卸载输入口令

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1CheckuninstallpwdReq body = new Auth1CheckuninstallpwdReq(); // Auth1CheckuninstallpwdReq | 
try {
    Auth1CheckuninstallpwdRes result = apiInstance.auth1CheckuninstallpwdPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1CheckuninstallpwdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1CheckuninstallpwdReq**](Auth1CheckuninstallpwdReq.md)|  |

### Return type

[**Auth1CheckuninstallpwdRes**](Auth1CheckuninstallpwdRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1ExtloginclientPost"></a>
# **auth1ExtloginclientPost**
> Auth1ExtloginclientRes auth1ExtloginclientPost(body)

登录（信任的第三方应用appid）

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1ExtloginclientReq body = new Auth1ExtloginclientReq(); // Auth1ExtloginclientReq | 
try {
    Auth1ExtloginclientRes result = apiInstance.auth1ExtloginclientPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1ExtloginclientPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1ExtloginclientReq**](Auth1ExtloginclientReq.md)|  |

### Return type

[**Auth1ExtloginclientRes**](Auth1ExtloginclientRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1GetbyadsessionPost"></a>
# **auth1GetbyadsessionPost**
> Auth1GetbyadsessionRes auth1GetbyadsessionPost(body)

登录（使用windows登录凭据）

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1GetbyadsessionReq body = new Auth1GetbyadsessionReq(); // Auth1GetbyadsessionReq | 
try {
    Auth1GetbyadsessionRes result = apiInstance.auth1GetbyadsessionPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetbyadsessionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1GetbyadsessionReq**](Auth1GetbyadsessionReq.md)|  |

### Return type

[**Auth1GetbyadsessionRes**](Auth1GetbyadsessionRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1GetbythirdpartyPost"></a>
# **auth1GetbythirdpartyPost**
> Auth1GetbythirdpartyRes auth1GetbythirdpartyPost(body)

登录（使用第三方凭证）

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1GetbythirdpartyReq body = new Auth1GetbythirdpartyReq(); // Auth1GetbythirdpartyReq | 
try {
    Auth1GetbythirdpartyRes result = apiInstance.auth1GetbythirdpartyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetbythirdpartyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1GetbythirdpartyReq**](Auth1GetbythirdpartyReq.md)|  |

### Return type

[**Auth1GetbythirdpartyRes**](Auth1GetbythirdpartyRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1GetbyticketPost"></a>
# **auth1GetbyticketPost**
> Auth1GetbyticketRes auth1GetbyticketPost(body)

登录（西电ticket）

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1GetbyticketReq body = new Auth1GetbyticketReq(); // Auth1GetbyticketReq | 
try {
    Auth1GetbyticketRes result = apiInstance.auth1GetbyticketPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetbyticketPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1GetbyticketReq**](Auth1GetbyticketReq.md)|  |

### Return type

[**Auth1GetbyticketRes**](Auth1GetbyticketRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1GetconfigPost"></a>
# **auth1GetconfigPost**
> Auth1GetconfigRes auth1GetconfigPost()

获取服务器配置信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Auth1GetconfigRes result = apiInstance.auth1GetconfigPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetconfigPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Auth1GetconfigRes**](Auth1GetconfigRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auth1GetextappinfoPost"></a>
# **auth1GetextappinfoPost**
> Auth1GetextappinfoRes auth1GetextappinfoPost(body)

登录外部应用（集成到anyshare）

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1GetextappinfoReq body = new Auth1GetextappinfoReq(); // Auth1GetextappinfoReq | 
try {
    Auth1GetextappinfoRes result = apiInstance.auth1GetextappinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetextappinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1GetextappinfoReq**](Auth1GetextappinfoReq.md)|  |

### Return type

[**Auth1GetextappinfoRes**](Auth1GetextappinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1GetnewPost"></a>
# **auth1GetnewPost**
> Auth1GetnewRes auth1GetnewPost(body)

登录（标准）

备注：默认获取到的token有效期为1小时。  密码加密方式：目前采用rsa加密的RSA_PKCS1_PADDING填充，并将加密的结果base64编码。  公钥文件：随本文档一同发出，或者邮件索取。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1GetnewReq body = new Auth1GetnewReq(); // Auth1GetnewReq | 
try {
    Auth1GetnewRes result = apiInstance.auth1GetnewPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetnewPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1GetnewReq**](Auth1GetnewReq.md)|  |

### Return type

[**Auth1GetnewRes**](Auth1GetnewRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1GetoauthinfoPost"></a>
# **auth1GetoauthinfoPost**
> Auth1GetoauthinfoRes auth1GetoauthinfoPost()

获取OAuth信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Auth1GetoauthinfoRes result = apiInstance.auth1GetoauthinfoPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetoauthinfoPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Auth1GetoauthinfoRes**](Auth1GetoauthinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auth1GetvcodePost"></a>
# **auth1GetvcodePost**
> Auth1GetvcodeRes auth1GetvcodePost(body)

获取验证码

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1GetvcodeReq body = new Auth1GetvcodeReq(); // Auth1GetvcodeReq | 
try {
    Auth1GetvcodeRes result = apiInstance.auth1GetvcodePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1GetvcodePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1GetvcodeReq**](Auth1GetvcodeReq.md)|  |

### Return type

[**Auth1GetvcodeRes**](Auth1GetvcodeRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1LogoutPost"></a>
# **auth1LogoutPost**
> auth1LogoutPost(body)

登出

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1LogoutReq body = new Auth1LogoutReq(); // Auth1LogoutReq | 
try {
    apiInstance.auth1LogoutPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1LogoutPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1LogoutReq**](Auth1LogoutReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1ModifypasswordPost"></a>
# **auth1ModifypasswordPost**
> auth1ModifypasswordPost(body, sign)

修改用户密码

备注：用户旧密码和新密码采用RSA加密

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1ModifypasswordReq body = new Auth1ModifypasswordReq(); // Auth1ModifypasswordReq | 
String sign = "sign_example"; // String | 签名
try {
    apiInstance.auth1ModifypasswordPost(body, sign);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1ModifypasswordPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1ModifypasswordReq**](Auth1ModifypasswordReq.md)|  |
 **sign** | **String**| 签名 | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1RefreshtokenPost"></a>
# **auth1RefreshtokenPost**
> Auth1RefreshtokenRes auth1RefreshtokenPost(body)

刷新身份凭证有效期

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1RefreshtokenReq body = new Auth1RefreshtokenReq(); // Auth1RefreshtokenReq | 
try {
    Auth1RefreshtokenRes result = apiInstance.auth1RefreshtokenPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1RefreshtokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1RefreshtokenReq**](Auth1RefreshtokenReq.md)|  |

### Return type

[**Auth1RefreshtokenRes**](Auth1RefreshtokenRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1RevoketokenPost"></a>
# **auth1RevoketokenPost**
> auth1RevoketokenPost(body)

回收身份凭证

回收身份凭证，主要用于移动端退出登陆时，回收永久token

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1RevoketokenReq body = new Auth1RevoketokenReq(); // Auth1RevoketokenReq | 
try {
    apiInstance.auth1RevoketokenPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1RevoketokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1RevoketokenReq**](Auth1RevoketokenReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1SelfregistrationPost"></a>
# **auth1SelfregistrationPost**
> Auth1SelfregistrationRes auth1SelfregistrationPost(body)

用户自注册

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1SelfregistrationReq body = new Auth1SelfregistrationReq(); // Auth1SelfregistrationReq | 
try {
    Auth1SelfregistrationRes result = apiInstance.auth1SelfregistrationPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1SelfregistrationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1SelfregistrationReq**](Auth1SelfregistrationReq.md)|  |

### Return type

[**Auth1SelfregistrationRes**](Auth1SelfregistrationRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1SendauthvcodePost"></a>
# **auth1SendauthvcodePost**
> Auth1SendauthvcodeRes auth1SendauthvcodePost(body)

发送短信验证码（双因子登录）

备注：向用户发送登录验证码

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1SendauthvcodeReq body = new Auth1SendauthvcodeReq(); // Auth1SendauthvcodeReq | 
try {
    Auth1SendauthvcodeRes result = apiInstance.auth1SendauthvcodePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1SendauthvcodePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1SendauthvcodeReq**](Auth1SendauthvcodeReq.md)|  |

### Return type

[**Auth1SendauthvcodeRes**](Auth1SendauthvcodeRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auth1ValidatesecuritydevicePost"></a>
# **auth1ValidatesecuritydevicePost**
> Auth1ValidatesecuritydeviceRes auth1ValidatesecuritydevicePost(body)

二次安全设备认证

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Auth1ValidatesecuritydeviceReq body = new Auth1ValidatesecuritydeviceReq(); // Auth1ValidatesecuritydeviceReq | 
try {
    Auth1ValidatesecuritydeviceRes result = apiInstance.auth1ValidatesecuritydevicePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auth1ValidatesecuritydevicePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Auth1ValidatesecuritydeviceReq**](Auth1ValidatesecuritydeviceReq.md)|  |

### Return type

[**Auth1ValidatesecuritydeviceRes**](Auth1ValidatesecuritydeviceRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autolockGetdirlockinfoPost"></a>
# **autolockGetdirlockinfoPost**
> AutolockGetdirlockinfoRes autolockGetdirlockinfoPost(body)

获取文件夹锁信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AutolockGetdirlockinfoReq body = new AutolockGetdirlockinfoReq(); // AutolockGetdirlockinfoReq | 
try {
    AutolockGetdirlockinfoRes result = apiInstance.autolockGetdirlockinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autolockGetdirlockinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutolockGetdirlockinfoReq**](AutolockGetdirlockinfoReq.md)|  |

### Return type

[**AutolockGetdirlockinfoRes**](AutolockGetdirlockinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autolockGetlockedfileinfosPost"></a>
# **autolockGetlockedfileinfosPost**
> AutolockGetlockedfileinfosRes autolockGetlockedfileinfosPost(body)

获取当前用户锁信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AutolockGetlockedfileinfosReq body = new AutolockGetlockedfileinfosReq(); // AutolockGetlockedfileinfosReq | 
try {
    AutolockGetlockedfileinfosRes result = apiInstance.autolockGetlockedfileinfosPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autolockGetlockedfileinfosPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutolockGetlockedfileinfosReq**](AutolockGetlockedfileinfosReq.md)|  |

### Return type

[**AutolockGetlockedfileinfosRes**](AutolockGetlockedfileinfosRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autolockGetlockinfoPost"></a>
# **autolockGetlockinfoPost**
> AutolockGetlockinfoRes autolockGetlockinfoPost(body)

获取文件锁信息

备注：只有在文件被锁定的情况下，才会返回有效的lockerid、lockeraccount、  lockname等信息。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AutolockGetlockinfoReq body = new AutolockGetlockinfoReq(); // AutolockGetlockinfoReq | 
try {
    AutolockGetlockinfoRes result = apiInstance.autolockGetlockinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autolockGetlockinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutolockGetlockinfoReq**](AutolockGetlockinfoReq.md)|  |

### Return type

[**AutolockGetlockinfoRes**](AutolockGetlockinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autolockLockPost"></a>
# **autolockLockPost**
> autolockLockPost(body)

锁定文件

文件只能被一个具有写权限的用户锁定。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AutolockLockReq body = new AutolockLockReq(); // AutolockLockReq | 
try {
    apiInstance.autolockLockPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autolockLockPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutolockLockReq**](AutolockLockReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autolockRefreshPost"></a>
# **autolockRefreshPost**
> AutolockRefreshRes autolockRefreshPost(body)

刷新文件锁

刷新文件锁的最后访问时间。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AutolockRefreshReq body = new AutolockRefreshReq(); // AutolockRefreshReq | 
try {
    AutolockRefreshRes result = apiInstance.autolockRefreshPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autolockRefreshPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutolockRefreshReq**](AutolockRefreshReq.md)|  |

### Return type

[**AutolockRefreshRes**](AutolockRefreshRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autolockTrylockPost"></a>
# **autolockTrylockPost**
> AutolockTrylockRes autolockTrylockPost(body)

尝试锁定文件

trylock时文件未锁定，则锁定文件；文件已被锁定时，返回锁定者的信息。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AutolockTrylockReq body = new AutolockTrylockReq(); // AutolockTrylockReq | 
try {
    AutolockTrylockRes result = apiInstance.autolockTrylockPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autolockTrylockPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutolockTrylockReq**](AutolockTrylockReq.md)|  |

### Return type

[**AutolockTrylockRes**](AutolockTrylockRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autolockUnlockPost"></a>
# **autolockUnlockPost**
> autolockUnlockPost(body)

解锁文件

只有锁定文件的用户才能对文件解锁

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
AutolockUnlockReq body = new AutolockUnlockReq(); // AutolockUnlockReq | 
try {
    apiInstance.autolockUnlockPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autolockUnlockPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutolockUnlockReq**](AutolockUnlockReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configGetPost"></a>
# **configGetPost**
> ConfigGetRes configGetPost(body)

获取配置信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ConfigGetReq body = new ConfigGetReq(); // ConfigGetReq | 
try {
    ConfigGetRes result = apiInstance.configGetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#configGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigGetReq**](ConfigGetReq.md)|  |

### Return type

[**ConfigGetRes**](ConfigGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configGetdocwatermarkconfigPost"></a>
# **configGetdocwatermarkconfigPost**
> ConfigGetdocwatermarkconfigRes configGetdocwatermarkconfigPost()

获取文件水印配置信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    ConfigGetdocwatermarkconfigRes result = apiInstance.configGetdocwatermarkconfigPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#configGetdocwatermarkconfigPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigGetdocwatermarkconfigRes**](ConfigGetdocwatermarkconfigRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="configGetoemconfigbysectionPost"></a>
# **configGetoemconfigbysectionPost**
> ConfigGetoemconfigbysectionRes configGetoemconfigbysectionPost(body)

获取OEM配置信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ConfigGetoemconfigbysectionReq body = new ConfigGetoemconfigbysectionReq(); // ConfigGetoemconfigbysectionReq | 
try {
    ConfigGetoemconfigbysectionRes result = apiInstance.configGetoemconfigbysectionPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#configGetoemconfigbysectionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigGetoemconfigbysectionReq**](ConfigGetoemconfigbysectionReq.md)|  |

### Return type

[**ConfigGetoemconfigbysectionRes**](ConfigGetoemconfigbysectionRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorAddgroupPost"></a>
# **contactorAddgroupPost**
> ContactorAddgroupRes contactorAddgroupPost(body)

添加联系人组

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorAddgroupReq body = new ContactorAddgroupReq(); // ContactorAddgroupReq | 
try {
    ContactorAddgroupRes result = apiInstance.contactorAddgroupPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorAddgroupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorAddgroupReq**](ContactorAddgroupReq.md)|  |

### Return type

[**ContactorAddgroupRes**](ContactorAddgroupRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorAddpersonsPost"></a>
# **contactorAddpersonsPost**
> contactorAddpersonsPost(body)

添加联系人至联系人组

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorAddpersonsReq body = new ContactorAddpersonsReq(); // ContactorAddpersonsReq | 
try {
    apiInstance.contactorAddpersonsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorAddpersonsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorAddpersonsReq**](ContactorAddpersonsReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorDeletegroupPost"></a>
# **contactorDeletegroupPost**
> contactorDeletegroupPost(body)

删除联系人组

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorDeletegroupReq body = new ContactorDeletegroupReq(); // ContactorDeletegroupReq | 
try {
    apiInstance.contactorDeletegroupPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorDeletegroupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorDeletegroupReq**](ContactorDeletegroupReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorDeletepersonsPost"></a>
# **contactorDeletepersonsPost**
> contactorDeletepersonsPost(body)

删除联系人组中的联系人

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorDeletepersonsReq body = new ContactorDeletepersonsReq(); // ContactorDeletepersonsReq | 
try {
    apiInstance.contactorDeletepersonsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorDeletepersonsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorDeletepersonsReq**](ContactorDeletepersonsReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorEditgroupPost"></a>
# **contactorEditgroupPost**
> contactorEditgroupPost(body)

编辑联系人组

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorEditgroupReq body = new ContactorEditgroupReq(); // ContactorEditgroupReq | 
try {
    apiInstance.contactorEditgroupPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorEditgroupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorEditgroupReq**](ContactorEditgroupReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorGetPost"></a>
# **contactorGetPost**
> ContactorGetRes contactorGetPost(body)

获取分组下所有联系人

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorGetReq body = new ContactorGetReq(); // ContactorGetReq | 
try {
    ContactorGetRes result = apiInstance.contactorGetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorGetReq**](ContactorGetReq.md)|  |

### Return type

[**ContactorGetRes**](ContactorGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorGetgroupsPost"></a>
# **contactorGetgroupsPost**
> ContactorGetgroupsRes contactorGetgroupsPost()

获取所有联系人分组

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    ContactorGetgroupsRes result = apiInstance.contactorGetgroupsPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorGetgroupsPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContactorGetgroupsRes**](ContactorGetgroupsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contactorGetpersonsPost"></a>
# **contactorGetpersonsPost**
> ContactorGetpersonsRes contactorGetpersonsPost(body)

获取联系人组中的联系人

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorGetpersonsReq body = new ContactorGetpersonsReq(); // ContactorGetpersonsReq | 
try {
    ContactorGetpersonsRes result = apiInstance.contactorGetpersonsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorGetpersonsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorGetpersonsReq**](ContactorGetpersonsReq.md)|  |

### Return type

[**ContactorGetpersonsRes**](ContactorGetpersonsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorSearchPost"></a>
# **contactorSearchPost**
> ContactorSearchRes contactorSearchPost(body)

在联系人组搜索用户和联系人组信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorSearchReq body = new ContactorSearchReq(); // ContactorSearchReq | 
try {
    ContactorSearchRes result = apiInstance.contactorSearchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorSearchReq**](ContactorSearchReq.md)|  |

### Return type

[**ContactorSearchRes**](ContactorSearchRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorSearchcountPost"></a>
# **contactorSearchcountPost**
> ContactorSearchcountRes contactorSearchcountPost(body)

搜索用户和联系人组信息总数

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorSearchcountReq body = new ContactorSearchcountReq(); // ContactorSearchcountReq | 
try {
    ContactorSearchcountRes result = apiInstance.contactorSearchcountPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorSearchcountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorSearchcountReq**](ContactorSearchcountReq.md)|  |

### Return type

[**ContactorSearchcountRes**](ContactorSearchcountRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contactorSearchpersonsPost"></a>
# **contactorSearchpersonsPost**
> ContactorSearchpersonsRes contactorSearchpersonsPost(body)

搜索联系人组中的联系人

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
ContactorSearchpersonsReq body = new ContactorSearchpersonsReq(); // ContactorSearchpersonsReq | 
try {
    ContactorSearchpersonsRes result = apiInstance.contactorSearchpersonsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#contactorSearchpersonsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactorSearchpersonsReq**](ContactorSearchpersonsReq.md)|  |

### Return type

[**ContactorSearchpersonsRes**](ContactorSearchpersonsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="departmentGetbasicinfoPost"></a>
# **departmentGetbasicinfoPost**
> DepartmentGetbasicinfoRes departmentGetbasicinfoPost(body)

获取部门基本信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DepartmentGetbasicinfoReq body = new DepartmentGetbasicinfoReq(); // DepartmentGetbasicinfoReq | 
try {
    DepartmentGetbasicinfoRes result = apiInstance.departmentGetbasicinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#departmentGetbasicinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepartmentGetbasicinfoReq**](DepartmentGetbasicinfoReq.md)|  |

### Return type

[**DepartmentGetbasicinfoRes**](DepartmentGetbasicinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="departmentGetrootsPost"></a>
# **departmentGetrootsPost**
> DepartmentGetrootsRes departmentGetrootsPost()

获取用户所能访问的根部门信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    DepartmentGetrootsRes result = apiInstance.departmentGetrootsPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#departmentGetrootsPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DepartmentGetrootsRes**](DepartmentGetrootsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="departmentGetsubdepsPost"></a>
# **departmentGetsubdepsPost**
> DepartmentGetsubdepsRes departmentGetsubdepsPost(body)

获取子部门信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DepartmentGetsubusersReq body = new DepartmentGetsubusersReq(); // DepartmentGetsubusersReq | 
try {
    DepartmentGetsubdepsRes result = apiInstance.departmentGetsubdepsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#departmentGetsubdepsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepartmentGetsubusersReq**](DepartmentGetsubusersReq.md)|  |

### Return type

[**DepartmentGetsubdepsRes**](DepartmentGetsubdepsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="departmentGetsubusersPost"></a>
# **departmentGetsubusersPost**
> DepartmentGetsubusersRes departmentGetsubusersPost(body)

获取部门下的子用户信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DepartmentGetsubusersReq body = new DepartmentGetsubusersReq(); // DepartmentGetsubusersReq | 
try {
    DepartmentGetsubusersRes result = apiInstance.departmentGetsubusersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#departmentGetsubusersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepartmentGetsubusersReq**](DepartmentGetsubusersReq.md)|  |

### Return type

[**DepartmentGetsubusersRes**](DepartmentGetsubusersRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="departmentSearchPost"></a>
# **departmentSearchPost**
> DepartmentSearchRes departmentSearchPost(body)

在组织下搜索用户和部门信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DepartmentSearchReq body = new DepartmentSearchReq(); // DepartmentSearchReq | 
try {
    DepartmentSearchRes result = apiInstance.departmentSearchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#departmentSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepartmentSearchReq**](DepartmentSearchReq.md)|  |

### Return type

[**DepartmentSearchRes**](DepartmentSearchRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="departmentSearchcountPost"></a>
# **departmentSearchcountPost**
> DepartmentSearchcountRes departmentSearchcountPost(body)

在组织下搜索获取搜索数目

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DepartmentSearchcountReq body = new DepartmentSearchcountReq(); // DepartmentSearchcountReq | 
try {
    DepartmentSearchcountRes result = apiInstance.departmentSearchcountPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#departmentSearchcountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepartmentSearchcountReq**](DepartmentSearchcountReq.md)|  |

### Return type

[**DepartmentSearchcountRes**](DepartmentSearchcountRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceDisablePost"></a>
# **deviceDisablePost**
> deviceDisablePost(body)

禁用设备

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DeviceDisableReq body = new DeviceDisableReq(); // DeviceDisableReq | 
try {
    apiInstance.deviceDisablePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deviceDisablePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceDisableReq**](DeviceDisableReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deviceEnablePost"></a>
# **deviceEnablePost**
> deviceEnablePost(body)

启用设备

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DeviceEnableReq body = new DeviceEnableReq(); // DeviceEnableReq | 
try {
    apiInstance.deviceEnablePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deviceEnablePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceEnableReq**](DeviceEnableReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deviceErasePost"></a>
# **deviceErasePost**
> deviceErasePost(body)

擦除缓存

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DeviceEraseReq body = new DeviceEraseReq(); // DeviceEraseReq | 
try {
    apiInstance.deviceErasePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deviceErasePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceEraseReq**](DeviceEraseReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deviceGetstatusPost"></a>
# **deviceGetstatusPost**
> DeviceGetstatusRes deviceGetstatusPost(body)

获取设备状态（mobile）

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DeviceGetstatusReq body = new DeviceGetstatusReq(); // DeviceGetstatusReq | 
try {
    DeviceGetstatusRes result = apiInstance.deviceGetstatusPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deviceGetstatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceGetstatusReq**](DeviceGetstatusReq.md)|  |

### Return type

[**DeviceGetstatusRes**](DeviceGetstatusRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceListPost"></a>
# **deviceListPost**
> DeviceListRes deviceListPost()

获取所有设备信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    DeviceListRes result = apiInstance.deviceListPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deviceListPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeviceListRes**](DeviceListRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deviceOnerasesucPost"></a>
# **deviceOnerasesucPost**
> deviceOnerasesucPost(body, userid)

通知AnyShare缓存擦除成功（mobile）

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DeviceOnerasesucReq body = new DeviceOnerasesucReq(); // DeviceOnerasesucReq | 
String userid = "userid_example"; // String | 用户唯一标识
try {
    apiInstance.deviceOnerasesucPost(body, userid);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deviceOnerasesucPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceOnerasesucReq**](DeviceOnerasesucReq.md)|  |
 **userid** | **String**| 用户唯一标识 |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="dirAddtagPost"></a>
# **dirAddtagPost**
> dirAddtagPost(body)

添加目录标签

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirAddtagReq body = new DirAddtagReq(); // DirAddtagReq | 
try {
    apiInstance.dirAddtagPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirAddtagPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirAddtagReq**](DirAddtagReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirAddtagsPost"></a>
# **dirAddtagsPost**
> DirAddtagsRes dirAddtagsPost(body)

添加目录多个标签

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirAddtagsReq body = new DirAddtagsReq(); // DirAddtagsReq | 
try {
    DirAddtagsRes result = apiInstance.dirAddtagsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirAddtagsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirAddtagsReq**](DirAddtagsReq.md)|  |

### Return type

[**DirAddtagsRes**](DirAddtagsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirAttributePost"></a>
# **dirAttributePost**
> DirAttributeRes dirAttributePost(body)

获取目录属性协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirAttributeReq body = new DirAttributeReq(); // DirAttributeReq | 
try {
    DirAttributeRes result = apiInstance.dirAttributePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirAttributePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirAttributeReq**](DirAttributeReq.md)|  |

### Return type

[**DirAttributeRes**](DirAttributeRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirCheckwatermarkPost"></a>
# **dirCheckwatermarkPost**
> DirCheckwatermarkRes dirCheckwatermarkPost(body)

检查是否需要下载水印

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirCheckwatermarkReq body = new DirCheckwatermarkReq(); // DirCheckwatermarkReq | 
try {
    DirCheckwatermarkRes result = apiInstance.dirCheckwatermarkPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirCheckwatermarkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirCheckwatermarkReq**](DirCheckwatermarkReq.md)|  |

### Return type

[**DirCheckwatermarkRes**](DirCheckwatermarkRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirCopyPost"></a>
# **dirCopyPost**
> DirCopyRes dirCopyPost(body)

复制目录协议

无法复制到原位置的子目录下

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirCopyReq body = new DirCopyReq(); // DirCopyReq | 
try {
    DirCopyRes result = apiInstance.dirCopyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirCopyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirCopyReq**](DirCopyReq.md)|  |

### Return type

[**DirCopyRes**](DirCopyRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirCopyprogressPost"></a>
# **dirCopyprogressPost**
> DirCopyprogressRes dirCopyprogressPost(body)

复制目录进度查询协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirCopyprogressReq body = new DirCopyprogressReq(); // DirCopyprogressReq | 
try {
    DirCopyprogressRes result = apiInstance.dirCopyprogressPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirCopyprogressPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirCopyprogressReq**](DirCopyprogressReq.md)|  |

### Return type

[**DirCopyprogressRes**](DirCopyprogressRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirCreatePost"></a>
# **dirCreatePost**
> DirCreateRes dirCreatePost(body)

创建目录协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirCreateReq body = new DirCreateReq(); // DirCreateReq | 
try {
    DirCreateRes result = apiInstance.dirCreatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirCreateReq**](DirCreateReq.md)|  |

### Return type

[**DirCreateRes**](DirCreateRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirCreatemultileveldirPost"></a>
# **dirCreatemultileveldirPost**
> DirCreatemultileveldirRes dirCreatemultileveldirPost(body)

创建多级目录协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirCreatemultileveldirReq body = new DirCreatemultileveldirReq(); // DirCreatemultileveldirReq | 
try {
    DirCreatemultileveldirRes result = apiInstance.dirCreatemultileveldirPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirCreatemultileveldirPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirCreatemultileveldirReq**](DirCreatemultileveldirReq.md)|  |

### Return type

[**DirCreatemultileveldirRes**](DirCreatemultileveldirRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirDeletePost"></a>
# **dirDeletePost**
> DirDeleteRes dirDeletePost(body)

删除目录协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirDeleteReq body = new DirDeleteReq(); // DirDeleteReq | 
try {
    DirDeleteRes result = apiInstance.dirDeletePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirDeleteReq**](DirDeleteReq.md)|  |

### Return type

[**DirDeleteRes**](DirDeleteRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirDeletetagPost"></a>
# **dirDeletetagPost**
> dirDeletetagPost(body)

删除目录标签

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirDeletetagReq body = new DirDeletetagReq(); // DirDeletetagReq | 
try {
    apiInstance.dirDeletetagPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirDeletetagPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirDeletetagReq**](DirDeletetagReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirGetsuggestnamePost"></a>
# **dirGetsuggestnamePost**
> DirGetsuggestnameRes dirGetsuggestnamePost(body)

获取创建目录的建议名称

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirGetsuggestnameReq body = new DirGetsuggestnameReq(); // DirGetsuggestnameReq | 
try {
    DirGetsuggestnameRes result = apiInstance.dirGetsuggestnamePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirGetsuggestnamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirGetsuggestnameReq**](DirGetsuggestnameReq.md)|  |

### Return type

[**DirGetsuggestnameRes**](DirGetsuggestnameRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirIsfileoutboxPost"></a>
# **dirIsfileoutboxPost**
> DirIsfileoutboxRes dirIsfileoutboxPost(body)

检查是否是发件箱协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirIsfileoutboxReq body = new DirIsfileoutboxReq(); // DirIsfileoutboxReq | 
try {
    DirIsfileoutboxRes result = apiInstance.dirIsfileoutboxPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirIsfileoutboxPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirIsfileoutboxReq**](DirIsfileoutboxReq.md)|  |

### Return type

[**DirIsfileoutboxRes**](DirIsfileoutboxRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirListPost"></a>
# **dirListPost**
> DirListRes dirListPost(body)

浏览目录协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirListReq body = new DirListReq(); // DirListReq | 
try {
    DirListRes result = apiInstance.dirListPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirListPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirListReq**](DirListReq.md)|  |

### Return type

[**DirListRes**](DirListRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirMovePost"></a>
# **dirMovePost**
> DirMoveRes dirMovePost(body)

移动目录协议

1. 无法移动到原位置（指定目标父对象为待移动对象的父对象）；  2. 无法移动到原位置的子对象下；  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirMoveReq body = new DirMoveReq(); // DirMoveReq | 
try {
    DirMoveRes result = apiInstance.dirMovePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirMovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirMoveReq**](DirMoveReq.md)|  |

### Return type

[**DirMoveRes**](DirMoveRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirRenamePost"></a>
# **dirRenamePost**
> DirRenameRes dirRenamePost(body)

重命名目录协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirRenameReq body = new DirRenameReq(); // DirRenameReq | 
try {
    DirRenameRes result = apiInstance.dirRenamePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirRenamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirRenameReq**](DirRenameReq.md)|  |

### Return type

[**DirRenameRes**](DirRenameRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirSetcsflevelPost"></a>
# **dirSetcsflevelPost**
> DirSetcsflevelRes dirSetcsflevelPost(body)

设置目录密级

目录没有密级，该协议将目录及子目录下所有文件设置为指定的密级，但无法应用到高于操作者自身密级的文件

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirSetcsflevelReq body = new DirSetcsflevelReq(); // DirSetcsflevelReq | 
try {
    DirSetcsflevelRes result = apiInstance.dirSetcsflevelPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirSetcsflevelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirSetcsflevelReq**](DirSetcsflevelReq.md)|  |

### Return type

[**DirSetcsflevelRes**](DirSetcsflevelRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dirSizePost"></a>
# **dirSizePost**
> DirSizeRes dirSizePost(body)

获取目录大小协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
DirSizeReq body = new DirSizeReq(); // DirSizeReq | 
try {
    DirSizeRes result = apiInstance.dirSizePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dirSizePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirSizeReq**](DirSizeReq.md)|  |

### Return type

[**DirSizeRes**](DirSizeRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="efastV1FileGetcsfinfoPost"></a>
# **efastV1FileGetcsfinfoPost**
> FileGetcsfinfoRes efastV1FileGetcsfinfoPost(body)

获取文件定密信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileGetcsfinfoReq body = new FileGetcsfinfoReq(); // FileGetcsfinfoReq | 
try {
    FileGetcsfinfoRes result = apiInstance.efastV1FileGetcsfinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#efastV1FileGetcsfinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileGetcsfinfoReq**](FileGetcsfinfoReq.md)|  |

### Return type

[**FileGetcsfinfoRes**](FileGetcsfinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entrydoc2GetPost"></a>
# **entrydoc2GetPost**
> Entrydoc2GetRes entrydoc2GetPost(body)

获取文档库

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Entrydoc2GetReq body = new Entrydoc2GetReq(); // Entrydoc2GetReq | 
try {
    Entrydoc2GetRes result = apiInstance.entrydoc2GetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#entrydoc2GetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Entrydoc2GetReq**](Entrydoc2GetReq.md)|  |

### Return type

[**Entrydoc2GetRes**](Entrydoc2GetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entrydoc2GetdocinfoPost"></a>
# **entrydoc2GetdocinfoPost**
> Entrydoc2GetdocinfoRes entrydoc2GetdocinfoPost(body)

获取文档库信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Entrydoc2GetdocinfoReq body = new Entrydoc2GetdocinfoReq(); // Entrydoc2GetdocinfoReq | 
try {
    Entrydoc2GetdocinfoRes result = apiInstance.entrydoc2GetdocinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#entrydoc2GetdocinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Entrydoc2GetdocinfoReq**](Entrydoc2GetdocinfoReq.md)|  |

### Return type

[**Entrydoc2GetdocinfoRes**](Entrydoc2GetdocinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entrydoc2GetdocquotaPost"></a>
# **entrydoc2GetdocquotaPost**
> Entrydoc2GetdocquotaRes entrydoc2GetdocquotaPost(body)

获取文档库配额

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Entrydoc2GetdocquotaReq body = new Entrydoc2GetdocquotaReq(); // Entrydoc2GetdocquotaReq | 
try {
    Entrydoc2GetdocquotaRes result = apiInstance.entrydoc2GetdocquotaPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#entrydoc2GetdocquotaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Entrydoc2GetdocquotaReq**](Entrydoc2GetdocquotaReq.md)|  |

### Return type

[**Entrydoc2GetdocquotaRes**](Entrydoc2GetdocquotaRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="entrydoc2GetmanagedPost"></a>
# **entrydoc2GetmanagedPost**
> Entrydoc2GetmanagedRes entrydoc2GetmanagedPost()

获取用户管理的文档库

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Entrydoc2GetmanagedRes result = apiInstance.entrydoc2GetmanagedPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#entrydoc2GetmanagedPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Entrydoc2GetmanagedRes**](Entrydoc2GetmanagedRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entrydoc2GetuserquotaPost"></a>
# **entrydoc2GetuserquotaPost**
> Entrydoc2GetuserquotaRes entrydoc2GetuserquotaPost()

获取用户配额

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Entrydoc2GetuserquotaRes result = apiInstance.entrydoc2GetuserquotaPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#entrydoc2GetuserquotaPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Entrydoc2GetuserquotaRes**](Entrydoc2GetuserquotaRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="favoritesAddPost"></a>
# **favoritesAddPost**
> favoritesAddPost(body)

添加收藏

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FavoritesAddReq body = new FavoritesAddReq(); // FavoritesAddReq | 
try {
    apiInstance.favoritesAddPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#favoritesAddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FavoritesAddReq**](FavoritesAddReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="favoritesCheckPost"></a>
# **favoritesCheckPost**
> List&lt;FavoritesCheckResItem&gt; favoritesCheckPost(body)

批量查询收藏状态

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FavoritesCheckReq body = new FavoritesCheckReq(); // FavoritesCheckReq | 
try {
    List<FavoritesCheckResItem> result = apiInstance.favoritesCheckPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#favoritesCheckPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FavoritesCheckReq**](FavoritesCheckReq.md)|  |

### Return type

[**List&lt;FavoritesCheckResItem&gt;**](FavoritesCheckResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="favoritesDeletePost"></a>
# **favoritesDeletePost**
> favoritesDeletePost(body)

删除收藏

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FavoritesDeleteReq body = new FavoritesDeleteReq(); // FavoritesDeleteReq | 
try {
    apiInstance.favoritesDeletePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#favoritesDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FavoritesDeleteReq**](FavoritesDeleteReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="favoritesListPost"></a>
# **favoritesListPost**
> List&lt;FavoritesListResItem&gt; favoritesListPost()

获取收藏列表

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    List<FavoritesListResItem> result = apiInstance.favoritesListPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#favoritesListPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;FavoritesListResItem&gt;**](FavoritesListResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fileAddtagPost"></a>
# **fileAddtagPost**
> fileAddtagPost(body)

添加文件标签

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileAddtagReq body = new FileAddtagReq(); // FileAddtagReq | 
try {
    apiInstance.fileAddtagPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileAddtagPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileAddtagReq**](FileAddtagReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileAddtagsPost"></a>
# **fileAddtagsPost**
> FileAddtagsRes fileAddtagsPost(body)

添加文件多个标签

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileAddtagsReq body = new FileAddtagsReq(); // FileAddtagsReq | 
try {
    FileAddtagsRes result = apiInstance.fileAddtagsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileAddtagsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileAddtagsReq**](FileAddtagsReq.md)|  |

### Return type

[**FileAddtagsRes**](FileAddtagsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileAttributePost"></a>
# **fileAttributePost**
> FileAttributeRes fileAttributePost(body)

获取文件属性协议

获取文件属性协议返回的参数,与文件版本无关

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileAttributeReq body = new FileAttributeReq(); // FileAttributeReq | 
try {
    FileAttributeRes result = apiInstance.fileAttributePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileAttributePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileAttributeReq**](FileAttributeReq.md)|  |

### Return type

[**FileAttributeRes**](FileAttributeRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileBatchdownloadPost"></a>
# **fileBatchdownloadPost**
> FileBatchdownloadRes fileBatchdownloadPost(body)

文件及文件夹批量下载

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileBatchdownloadReq body = new FileBatchdownloadReq(); // FileBatchdownloadReq | 
try {
    FileBatchdownloadRes result = apiInstance.fileBatchdownloadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileBatchdownloadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileBatchdownloadReq**](FileBatchdownloadReq.md)|  |

### Return type

[**FileBatchdownloadRes**](FileBatchdownloadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileConvertpathPost"></a>
# **fileConvertpathPost**
> FileConvertpathRes fileConvertpathPost(body)

转换路径协议

由一个gns路径，获取一个名字路径

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileConvertpathReq body = new FileConvertpathReq(); // FileConvertpathReq | 
try {
    FileConvertpathRes result = apiInstance.fileConvertpathPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileConvertpathPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileConvertpathReq**](FileConvertpathReq.md)|  |

### Return type

[**FileConvertpathRes**](FileConvertpathRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileCopyPost"></a>
# **fileCopyPost**
> FileCopyRes fileCopyPost(body)

复制文件协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileCopyReq body = new FileCopyReq(); // FileCopyReq | 
try {
    FileCopyRes result = apiInstance.fileCopyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileCopyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileCopyReq**](FileCopyReq.md)|  |

### Return type

[**FileCopyRes**](FileCopyRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileCustomattributevaluePost"></a>
# **fileCustomattributevaluePost**
> List&lt;FileCustomattributevalueResItem&gt; fileCustomattributevaluePost(body)

获取属性属性值

返回整颗层级树，用于生成层级、枚举属性下拉框

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileCustomattributevalueReq body = new FileCustomattributevalueReq(); // FileCustomattributevalueReq | 
try {
    List<FileCustomattributevalueResItem> result = apiInstance.fileCustomattributevaluePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileCustomattributevaluePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileCustomattributevalueReq**](FileCustomattributevalueReq.md)|  |

### Return type

[**List&lt;FileCustomattributevalueResItem&gt;**](FileCustomattributevalueResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileDeletePost"></a>
# **fileDeletePost**
> fileDeletePost(body)

删除文件协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileDeleteReq body = new FileDeleteReq(); // FileDeleteReq | 
try {
    apiInstance.fileDeletePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileDeleteReq**](FileDeleteReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileDeletecommentPost"></a>
# **fileDeletecommentPost**
> fileDeletecommentPost(body)

删除文件评论

删除一个文件的一条评论

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileDeletecommentReq body = new FileDeletecommentReq(); // FileDeletecommentReq | 
try {
    apiInstance.fileDeletecommentPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileDeletecommentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileDeletecommentReq**](FileDeletecommentReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileDeletetagPost"></a>
# **fileDeletetagPost**
> fileDeletetagPost(body)

删除文件标签

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileDeletetagReq body = new FileDeletetagReq(); // FileDeletetagReq | 
try {
    apiInstance.fileDeletetagPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileDeletetagPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileDeletetagReq**](FileDeletetagReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileDuploadPost"></a>
# **fileDuploadPost**
> FileDuploadRes fileDuploadPost(body)

秒传文件协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileDuploadReq body = new FileDuploadReq(); // FileDuploadReq | 
try {
    FileDuploadRes result = apiInstance.fileDuploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileDuploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileDuploadReq**](FileDuploadReq.md)|  |

### Return type

[**FileDuploadRes**](FileDuploadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileGetappmetadataPost"></a>
# **fileGetappmetadataPost**
> List&lt;FileGetappmetadataResItem&gt; fileGetappmetadataPost(body)

获取应用元数据

用于获取文件的应用元数据和相关的应用信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileGetappmetadataReq body = new FileGetappmetadataReq(); // FileGetappmetadataReq | 
try {
    List<FileGetappmetadataResItem> result = apiInstance.fileGetappmetadataPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileGetappmetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileGetappmetadataReq**](FileGetappmetadataReq.md)|  |

### Return type

[**List&lt;FileGetappmetadataResItem&gt;**](FileGetappmetadataResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileGetcommentPost"></a>
# **fileGetcommentPost**
> FileGetcommentRes fileGetcommentPost(body)

获取文件评论

获取一个文件的所有评论，返回结果不分页。文件评论和版本无关

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileGetcommentReq body = new FileGetcommentReq(); // FileGetcommentReq | 
try {
    FileGetcommentRes result = apiInstance.fileGetcommentPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileGetcommentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileGetcommentReq**](FileGetcommentReq.md)|  |

### Return type

[**FileGetcommentRes**](FileGetcommentRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileGetfilecustomattributePost"></a>
# **fileGetfilecustomattributePost**
> List&lt;FileGetfilecustomattributeResItem&gt; fileGetfilecustomattributePost(body)

获取文件自定义属性

用于展示文件自定义属性页面的生成，返回包含属性及属性值。返回顺序及显示顺序

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileGetfilecustomattributeReq body = new FileGetfilecustomattributeReq(); // FileGetfilecustomattributeReq | 
try {
    List<FileGetfilecustomattributeResItem> result = apiInstance.fileGetfilecustomattributePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileGetfilecustomattributePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileGetfilecustomattributeReq**](FileGetfilecustomattributeReq.md)|  |

### Return type

[**List&lt;FileGetfilecustomattributeResItem&gt;**](FileGetfilecustomattributeResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileGetinfobypathPost"></a>
# **fileGetinfobypathPost**
> FileGetinfobypathRes fileGetinfobypathPost(body)

由名字路径获取对象信息协议

由一个名字全路径，获取一个docid及对象信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileGetinfobypathReq body = new FileGetinfobypathReq(); // FileGetinfobypathReq | 
try {
    FileGetinfobypathRes result = apiInstance.fileGetinfobypathPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileGetinfobypathPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileGetinfobypathReq**](FileGetinfobypathReq.md)|  |

### Return type

[**FileGetinfobypathRes**](FileGetinfobypathRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileGetsuggestnamePost"></a>
# **fileGetsuggestnamePost**
> FileGetsuggestnameRes fileGetsuggestnamePost(body)

获取上传文件的建议名称

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileGetsuggestnameReq body = new FileGetsuggestnameReq(); // FileGetsuggestnameReq | 
try {
    FileGetsuggestnameRes result = apiInstance.fileGetsuggestnamePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileGetsuggestnamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileGetsuggestnameReq**](FileGetsuggestnameReq.md)|  |

### Return type

[**FileGetsuggestnameRes**](FileGetsuggestnameRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileMetadataPost"></a>
# **fileMetadataPost**
> FileMetadataRes fileMetadataPost(body)

获取元数据协议

获取元数据协议返回的参数,与文件版本有关，docid与objectid都为可选，body中可选一种方式获取文件元数据，不能同时为空

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileMetadataReq body = new FileMetadataReq(); // FileMetadataReq | 
try {
    FileMetadataRes result = apiInstance.fileMetadataPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileMetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileMetadataReq**](FileMetadataReq.md)|  |

### Return type

[**FileMetadataRes**](FileMetadataRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileMovePost"></a>
# **fileMovePost**
> FileMoveRes fileMovePost(body)

移动文件协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileMoveReq body = new FileMoveReq(); // FileMoveReq | 无法移动到原位置（指定目标父对象为待移动对象的父对象）
try {
    FileMoveRes result = apiInstance.fileMovePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileMovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileMoveReq**](FileMoveReq.md)| 无法移动到原位置（指定目标父对象为待移动对象的父对象） |

### Return type

[**FileMoveRes**](FileMoveRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileOpstatisticsPost"></a>
# **fileOpstatisticsPost**
> FileOpstatisticsRes fileOpstatisticsPost(body)

批量获取文件操作统计

- 文件的下载量、预览量统计，目前不支持图片及视频的预览统计。 - 因为支持批量操作，可以考虑尽量容忍文件不存在的情况，避免每次批量请求时，因为一个 docid 不存在，而返回异常导致查询失败。 - 因此，如果查询的 docid 中包含文件不存在的，各个统计值会返回-1；如果查询的 docid 中包含权限不足的，将抛出异常。 

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOpstatisticsReq body = new FileOpstatisticsReq(); // FileOpstatisticsReq | 
try {
    FileOpstatisticsRes result = apiInstance.fileOpstatisticsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOpstatisticsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOpstatisticsReq**](FileOpstatisticsReq.md)|  |

### Return type

[**FileOpstatisticsRes**](FileOpstatisticsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileOsbeginuploadPost"></a>
# **fileOsbeginuploadPost**
> FileOsbeginuploadRes fileOsbeginuploadPost(body)

开始上传文件协议

1. 如果reqmethod为PUT，收到响应后，客户端自行发送上传文件http请求到对象存储，填入响应中authrequest字段包含的header，然后15分钟内发送PUT请求            示例：            URL：https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C            Header：      &#x60;&#x60;&#x60;      “Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4&#x3D;”      “Date: Tue, 07 Apr 2015 02:35:36 GMT”      “Content-Length: 42”      “Content-Type: application/octet-stream”      &#x60;&#x60;&#x60;            Body：文件内容  2. 如果reqmethod为POST，收到响应后，客户端自行设置发送上传文件内容的表单请求到对象存储，填入各表单项，然后15分钟内发送POST请求。阿里云OSS和亚马逊S3要求file必须为表单中最后一个域。  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOsbeginuploadReq body = new FileOsbeginuploadReq(); // FileOsbeginuploadReq | 
try {
    FileOsbeginuploadRes result = apiInstance.fileOsbeginuploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOsbeginuploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOsbeginuploadReq**](FileOsbeginuploadReq.md)|  |

### Return type

[**FileOsbeginuploadRes**](FileOsbeginuploadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileOscompleteuploadPost"></a>
# **fileOscompleteuploadPost**
> String fileOscompleteuploadPost(body)

上传大文件的分块完成协议

接口调用成功，收到200响应时，表单中json部分含义：  - authrequest[0]：请求方法  - authrequest[1]: 待上传的资源URL  - authrequest[2]及以后项（如果存在）：请求头，格式为“key: value”    客户端15分钟内自行发送相关分片信息的请求到云存储平台    mothod为：PUT    URL为：https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C?uploadId&#x3D;0004B9895DBBB6EC98E36    Header包含：  “Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4&#x3D;”  “Date: Tue, 07 Apr 2015 02:35:36 GMT”  “Content-Length: 4200”    Body为返回的body内容中除了参数之外的部分：   &#x60;&#x60;&#x60;xml  &lt;CompleteMultipartUpload&gt;  &lt;Part&gt;  &lt;PartNumber&gt;1&lt;/PartNumber&gt;  &lt;ETag&gt;3349DC700140D7F86A078484278075A9&lt;/ETag&gt;  &lt;/Part&gt;  &lt;Part&gt;  &lt;PartNumber&gt;2&lt;/PartNumber&gt;  &lt;ETag&gt;22222C700140D7F86A078484278075A9&lt;/ETag&gt;  &lt;/Part&gt;  &lt;/CompleteMultipartUpload&gt;  &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOscompleteuploadReq body = new FileOscompleteuploadReq(); // FileOscompleteuploadReq | 
try {
    String result = apiInstance.fileOscompleteuploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOscompleteuploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOscompleteuploadReq**](FileOscompleteuploadReq.md)|  |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data, application/json

<a name="fileOsdownloadPost"></a>
# **fileOsdownloadPost**
> FileOsdownloadRes fileOsdownloadPost(body)

下载文件协议

1. 收到请求响应时，客户端自行向对象存储发送下载文件内容的请求  2. 如果authtype为空，则按照下面的方式下载，15分钟内发送GET请求  URL为：https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C  Header包含：  “Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4&#x3D;”  “Date: Tue, 07 Apr 2015 02:35:36 GMT”  Body为：空  3. 如果authtype为QUERY_STRING，则按照下面的方式下载，15分钟内发送GET请求  URL为：https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C?AWSAccessKeyId&#x3D;AKIAJEROARV2UTTADY6A&amp;Expires&#x3D;1428384700&amp;Signature&#x3D;lnOy3CUh9KNknNDX8aB8Mhur7%2Bw%3D  4. 如果想分块下载，请自行在Header中加入Range  5. 发送GET请求后，可能并不能直接获取数据，将获得 HTTP/1.1 307 Temporary Redirect，此时重定向的数据实际下载地址包含在返回的header中，形如：  Location: http://iovip.qbox.me/file/8QhbPDcKueO0ZOEDqnroKw0y478TNADQAwAAACfQem72ulBu9rl6bvYDEHDiumoeFLDnJKS5em72uXpu9rl6bvbWRi-vul_Q0Ckfu5f7PMvE9OoXIdfQ0NDT-tDQ0NDQ0N2pQCrK0NDQcHNHYPbupfOQx9EUBTS5bh6sR1Jtqr4maaq-JmmqviY&#x3D;  对于重定向的情况，客户端需要判断并从新地址下载数据，以C++开发使用curl为例，需要设置：curl_easy_setopt (_curl, CURLOPT_FOLLOWLOCATION, 1); 

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOsdownloadReq body = new FileOsdownloadReq(); // FileOsdownloadReq | 
try {
    FileOsdownloadRes result = apiInstance.fileOsdownloadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOsdownloadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOsdownloadReq**](FileOsdownloadReq.md)|  |

### Return type

[**FileOsdownloadRes**](FileOsdownloadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileOsenduploadPost"></a>
# **fileOsenduploadPost**
> FileOsenduploadRes fileOsenduploadPost(body)

上传文件完成协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOsenduploadReq body = new FileOsenduploadReq(); // FileOsenduploadReq | 
try {
    FileOsenduploadRes result = apiInstance.fileOsenduploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOsenduploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOsenduploadReq**](FileOsenduploadReq.md)|  |

### Return type

[**FileOsenduploadRes**](FileOsenduploadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileOsinitmultiuploadPost"></a>
# **fileOsinitmultiuploadPost**
> FileOsinitmultiuploadRes fileOsinitmultiuploadPost(body)

开始上传大文件协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOsinitmultiuploadReq body = new FileOsinitmultiuploadReq(); // FileOsinitmultiuploadReq | 
try {
    FileOsinitmultiuploadRes result = apiInstance.fileOsinitmultiuploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOsinitmultiuploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOsinitmultiuploadReq**](FileOsinitmultiuploadReq.md)|  |

### Return type

[**FileOsinitmultiuploadRes**](FileOsinitmultiuploadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileOsoptionPost"></a>
# **fileOsoptionPost**
> FileOsoptionRes fileOsoptionPost()

对象存储的选项值

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    FileOsoptionRes result = apiInstance.fileOsoptionPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOsoptionPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FileOsoptionRes**](FileOsoptionRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fileOsuploadpartPost"></a>
# **fileOsuploadpartPost**
> FileOsuploadpartRes fileOsuploadpartPost(body)

上传大文件的分块协议

1. 收到该响应后，客户端自行发送文件分片内容的请求到对象存储。  2. 客户端在请求Header中填入authrequests中的header，15分钟内发送PUT请求        示例：        URL：https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C?partNumber&#x3D;1&amp;uploadId&#x3D;0004B9895DBBB6EC98E36            Header：      &#x60;&#x60;&#x60;      “Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4&#x3D;”      “Date: Tue, 07 Apr 2015 02:35:36 GMT”      “Content-Length: 42”      &#x60;&#x60;&#x60;            Body：分片内容  3. 对象存储返回响应信息时，响应header中可能包含Etag值，用于标识所上传对象分片。如果存在key为ETag/ETAG/etag/Etag等值的header，需要取得其对应的值，作为完成大文件分块上传协议oscompleteupload的传参，见参数partetag及请求示例。            需注意，不同对象存储返回的Etag的header，key大小写可能不同，可能为ETag/ETAG/etag/Etag等。可以对响应header进行遍历，对每个key转为小写，和字符串“etag”对比，获取对应的值。一个可能的响应header示例为：Etag: ce1c8d1c3900c64feaa651052d75acd9    4. 亚马逊S3限定分块大小不能小于5MB，七牛存储限定分块大小为4M的倍数。见“对象存储选项值协议”说明

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOsuploadpartReq body = new FileOsuploadpartReq(); // FileOsuploadpartReq | 
try {
    FileOsuploadpartRes result = apiInstance.fileOsuploadpartPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOsuploadpartPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOsuploadpartReq**](FileOsuploadpartReq.md)|  |

### Return type

[**FileOsuploadpartRes**](FileOsuploadpartRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileOsuploadrefreshPost"></a>
# **fileOsuploadrefreshPost**
> FileOsuploadrefreshRes fileOsuploadrefreshPost(body)

上传文件更新协议

用于更新不完整版本的版本大小，重复获取上传所用的鉴权请求

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileOsuploadrefreshReq body = new FileOsuploadrefreshReq(); // FileOsuploadrefreshReq | 
try {
    FileOsuploadrefreshRes result = apiInstance.fileOsuploadrefreshPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileOsuploadrefreshPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileOsuploadrefreshReq**](FileOsuploadrefreshReq.md)|  |

### Return type

[**FileOsuploadrefreshRes**](FileOsuploadrefreshRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filePlayGet"></a>
# **filePlayGet**
> File filePlayGet(docid, tokenid, reqhost, usehttps)

在线播放协议

在线播放采用HLS（HTTP Live Streaming）方式，转码时对音视频进行切片，并生成用于视频播放索引的m3u8文件。m3u8文件内每一个非注释行指向一个音视频切片，客户端只需获取m3u8文件即可播放

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String docid = "docid_example"; // String | 转码文件id（在线播放请求协议返回）
String tokenid = "tokenid_example"; // String | 鉴权
String reqhost = "reqhost_example"; // String | 从存储服务器下载数据时的请求地址
Boolean usehttps = true; // Boolean | 是否使用https下载数据，默认为true
try {
    File result = apiInstance.filePlayGet(docid, tokenid, reqhost, usehttps);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#filePlayGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docid** | **String**| 转码文件id（在线播放请求协议返回） |
 **tokenid** | **String**| 鉴权 |
 **reqhost** | **String**| 从存储服务器下载数据时的请求地址 | [optional]
 **usehttps** | **Boolean**| 是否使用https下载数据，默认为true | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.apple.mpegurl, application/json

<a name="filePlayinfoPost"></a>
# **filePlayinfoPost**
> FilePlayinfoRes filePlayinfoPost(body)

在线播放请求协议

在线播放的协议请求流程：  ![playinfo-flow-chart][playinfo-flow-chart]  [playinfo-flow-chart]:data:image/png;base64,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u3Z1jzzySJRybtKkSa5JkyYmbhtssIF7/vnnoy3/4EX3rrvuco0aNXLrrruua968udtpp53cdddd5wYNGhTlrExcdL///nu3wgorRKnKjBkzxoTv3XfftfQOO+zgNt10U7fhhhu6JZdc0pax0047zbYn4UV39uzZ7qWXXnIdO3Z0t912W7R1Pv73hiCeyy23XJRaEBoYK620khswYEC0xrnjjjvOrmfWrFnRGiGqBtXFhSPRFQvNWmutZeKB1a1b1zVs2LAiHVooOiNHjjSxxFs988wz3cyZM93EiRPd0ksv7Z588kl3yimnuD322MP98ssvlp9QcO/evd2///1vd/DBB7t33nnHde/e3d1www22/u6773Z77rmnu+qqqyy/B5F67rnn3LXXXmsiyPIrr7ziXn31VdeuXTsTOW8hjz/+uFtllVVMNJ944gl3zz33uCuvvNLEmGVsyJAhUW5n1+LFGENk//Wvf1WkEfxOnTrZsTyh6CKYNFbOOecc16BBA1vGbrrpJtseMmrUKLf22mvbX8pq7ty5rkOHDu7OO++09EUXXRTlLAwaO7xb/OZiKeQYF1xwgVtqqaWsTPPtFhCLFqqLC0eiKxaa6dOnm2iddNJJFkr1IkYYlHCoT4ee2I477uiuv/5699hjj7mNNtrIPGQEtU6dOrbt7LPPNuGbNm2a5ccz/e9//2teIMKFl4yY4fVhiNB6663ntt9++0oh67POOsuOj1eLMGL777+/CROi2KxZM/Nel1lmGTd58uRor/kQKoc77rjDwsB42TQqWMY+//xz2w4ffPCBhcQJ9WL33Xef5fFpjOP4RsRTTz1lv5dnmb/nnXeeXWvfvn0t7M3yMccc41q1amX548yZM8d98cUXJu7AMmV18sknV6vo8izw2/IRUUL1t956q5syZUq0RpQbqosLR6IrUuGzzz4zEfv222+jNc5169bNPNI4P/zwg93Dli1bmogRfiWk+80337hll13WDR482DxTPNoePXpEe83Hh5fxfDk2Ytu0aVN30EEHucaNG5sHixcdgnfbs2fPKDUfxAphB66Tc3ruvfde82SffvppE3r6njE8M0TfpzH/e7kWBPL44483792Hlz00MPCs//rrr2jNguFlvH3Kht8DlCl93B4EGYHGPvnkE1u34oorVgg5rLPOOgv0+YYgrJwTUcfDbNOmjbv5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K4QQtRwvtN7iggv51rv55qutSHSFEKKW48UWSxJcyLfeVf2cHYmuEELUcnIJLkh000GiK4QQtRwvuNn+y5BENx0kukIIUcvJ5//pSnTTQaIrhBC1nHz+j65ENx0kukIIIXIi0U0Hia4QQoicSHTTQaIrhBAiJxLddJDoCiGEyIlENx0kukIIIXIi0U0Hia4QQoicSHTTQaIrahTz5s2LloRIJt9nhHyvvfZalFq0mDFjRrRUdUh006FWiu7PP//sfvjhhyhVWv7++2+3+eabu7lz50Zr5tOjRw/37bffRql0mD17drRUWtq2besmTZoUpZzbYIMN3Mcff+y+//77aE1mJkyY4J5++ukolT4nn3yyu/zyy6NUaajKe+oZNmyY69y5c5QqjEaNGrn33nvPde3a1T388MPR2uKpyvenGFq0aOHGjx9vy9wrrvf99993t99+uzvwwAPd8ssv7z766CPbHhIv4z///NPVr18/SmVn6NChed+fu+++211xxRVRyrmpU6e6OnXqRKkF+e6779xBBx0UpZz7448/3JJLLul++eWXaE3VINFNh1opurx8rVu3rnhoEZEllljCXrDQqKQ8vLhNmjTJad27d4/2mM8777zj1ltvvSjl3MSJE93XX3/tll56affWW2+5ESNG2DrgelZfffVKdsopp9jn2bzx5ZhNN93U8odMmTLFxC+EY3OMOOQ94IADKuzoo4926667rh2bcyy22GIV5+rWrVu0l3Nz5syxv0mie++997o2bdq4n376KVqbDN913XPPPaNU+lCp3n///VHKuS+//NLS3p566qloy3zuueceV7du3Yry5bc3aNDAlqnYevbsGeX8h6q4pxzj008/rbAHH3zQrbPOOpXWYX/99Ve0R2YQXby20aNHu1133dXEZWGoqvdn++23t3c9H0NcPV5077rrLvvtPNvNmzd3O+20k7vuuuvcoEGDopyViYsujcgVVlghSmWnENHlmRowYIB799133fnnn59TdG+99VZ37rnnRilnz3DHjh2jVNVBOedDvvlqK7VSdKFfv37uhBNOsGUqjbFjx9pyJmjZ8zJng8rYV57Tp0+3/Msuu6xV3ixvvPHG7pJLLrFKYPHFFzexwqgIAFHjPKeeeqp5bFwTlcnZZ5/t3n77bcvz6quvLiDsMGTIEPO0qGww9sskujNnzrRrRXCP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KArVxYUj0RWiAObNmxctZYd8r732WpQSomaiurhwJLqirHjjjTdcv379olR2brzxRnfppZdGKed+++03t9pqq7mBAwe6Rx99NFpbmRYtWrjx48fb8t9//+1+/vln9/7777vbb7/dHXjggW755Zd3H330kW0PGTZsmOvcuXOUcu7PP/909evXj1KV+fXXX13r1q2j1HymTp1qx87ETz/95N57770oNZ+hQ4fafkJUF6qLC0eiK8qKo48+2vXv3z9KZadr167ukUceiVLOTZo0yTVp0sSNHTvWbbDBBu7555+PtvyDF9277rrLNWrUyK277rquefPmbqeddnLXXXedGzRoUJSzMnHR/f77790KK6wQpSrjryME8VxuueWi1IIg/CuttJIbMGBAtMa54447zm266aZu1qxZ0RohqhbVxYUj0RWLPGuttZaJFFa3bl3XsGHDinRot912W7SHcyNHjjSxxFs988wz3cyZM93EiRPd0ksv7Z588kl3yimnuD322MP98ssvlp9QcO/eve273QcffLD984zu3bu7G264wdbffffdbs8993RXXXWV5fcghs8995y79tpr3eqrr27Lr7zyinv11Vddu3btTEy9eULRRTBpRJxzzjmuQYMGtozddNNNtj1k1KhRbu2117a//Ia5c+e6Dh06uDvvvNPSF110UZSzMGiE8E7Nnj07WiNEfqguLhyJrljkmT59uonWSSed5Pbdd98KESPcStjVp0OPb8cdd3TXX3+9e+yxx9xGG21kHjKCWqdOHdt29tlnu8cff9xNmzbN8uOZ8ulQvM0nnnjCvGS8SLxLDLFbb7313Pbbb18pZH3WWWfZ8fFqEWls//33NwHk+9/NmjVzSy65pFtmmWXc5MmT3VNPPVXxDzn4e95559kx+vbta+Folo855hjXqlWr6AyVmTNnjvviiy9cx44dLc0yv+Hkk0+W6IoqR3Vx4Uh0RVnw2WefmYh9++230RrnunXrZh5pnB9++MGekZYtW5pn/NJLL7kxY8a4b775xi277LJu8ODB5pni0fbo0SPaaz4+vIzny7ER26ZNm7qDDjrINW7c2DxYvOgQvNuePXtGqfkgigg7cJ2c0xMPL+OFc82cB/it9D17EGQEGvvkk09s3YorrljhpcM666yzQJ9vCMLKORF1+o7btGnjbr755optoejye7h+H1Ho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+rkTTjjBlhHdsWPH2nIm8IxzeYTvvPOO23TTTaNUYTz11FOuffv2rmHDhm7DDTd0Q4YMibZk5/XXX3cdO3a0/dZaay33/PPPR1v+4ZBDDnGXX355lJpPjx493I033riA6M6ZM8cNGzaski211FJ2nnDd77//Hu3h3O67715JkNdbbz27nnAdNmjQoGiP+UyePNktueSSVvaXXnqpXeeYMWNMdMePH2/222+/RblFTUWimw4SXbFIM3PmTDNAdLfddlsTotAmTJhg2yEU3eHDh1cSIGz27NlFi+64ceMqfaOWv8sss4ybNm2apTPBORs1amSe4rx589z7779v6Z9++inKMR9E/OWXX45S88kkuvD222+7ddddt8IWX3xxt/baa1ekr7nmmijnfHx54OWfd955lcpl4403dtddd50t+8iCp3///q5Nmza2vM4661ikYPnll7f3sFmzZma9evWy7aLmItFNB4muWGRZf/31zavcf//9Lb3KKquYKEycONH6Lr/++msTAITME4ouYkDoeeuttzYjfMt+oeiOGDHCrbTSSu60004zT7R58+buzjvvdCeddJJbY401XKtWrdyTTz5pecF7dJyT9TyLI0eONFGMP5cI32OPPWaiy7Xcddddbu7cue6jjz6yMPLgwYOjnM6NHj3aRJP/9ILVrVvX3XDDDVlFd/r06bbeG17rhx9+WJH+9ddfo5yV4Xg+egCErynHpP5gwvUcl/uAB0yZ8HsUXq59SHTTQaIrFlkQ1ccff7yi37Fp06buzDPPtPDsa6+9ZqHYuIcVF91QSHw6Lro8T36Q0IMPPmhp7yWSXnnllW3ZQz9rgwYNLB99nYDIxZ9LL7rwyiuvWPgXoSIfjQDEzrPXXnu5Y489Nko5t9lmm7lnn302o+hSDhtssEEl49icM1zHeeLgYXMsH0Gg8UAEIQ4NhG222cZtt912JrqUBY0ekOjWPuLPdybyzVdbqbGim89/zRCLPlTyiC6VPKILeIgMsKKfETEKKVZ0p0yZYun//e9/lv7zzz8tjRe72GKL2bKH/lQEiUFFBx98sPWbZhNdwt+EoRkYhtDxT8KPPvroirA0I4O55ttuu81C2Jyb34anmkl0EU6uHa+ZkO9hhx1maX4jg6dYJiyM55vEQQcd5C6++GLzWjt06OBeeumlaMs//P333+7CCy90n332mYku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/etfFWlErlOnTnasOHfccYfbYIMNotR8NttsM/fQQw9FqcoUKrq7776769atW4Wtt956rmHDhpXWYYMGDYr2mM/kyZOtkYGHf+mll7pDDjnEGgSI7vjx483yFXohQiS6hSPRFTWeN954w/4iiq1bt3YtWrRwdevWtWXs888/t+3wwQcfuEcffdS8SOy+++6zPD6NcZxffvkl2mM+b775pgnml19+Ga2ZzyeffOKaN29uf+Mgussss4x5095Iv/322xXp0aNHR7mdGz58uBs2bJg1DHiXWPa28cYbu+uuu86W49fWv39/16ZNG1teZ5117DppdPAeNWvWzKxXr162XYhCkOgWjkRX1Fjuvfde82Sffvpp99///tfdeOONZhdccIFbbrnlKtLYt99+a/u88847rlWrVu744493f//9twkf4WXP9ddf79q1a+f++uuvaM18MW/cuLF77bXXojWVee6550zY6FOdNWtWtHa+6CL+cU81tL59+0a5/4HrPeGEE6KUs2MipBwvzs8//2zecPv27c0DXmONNczrV3hZpIFEt3AkuqLGgmAdfPDBJjjPPPOMO/XUU13v3r0XsDPOOMN99dVX0V7OTZs2zTy/rl27uo8++sgtvvji7uWXX3bbbLONW3fddSsNzkLwjjnmGPNC119/fffvf/97AeP8X3/9tevTp0+l/t2k8HI+/PTTT+atz5w509JPPvmk23bbbW05hHNxzdttt51dw4MPPmieMEh0RRpIdAtHoitqNCNGjDDBAbzeRo0a2chlb/Xq1XOjRo2y7XHeeust9/7771t/KH271157bSVPNRNdunSpGOVMOHrttde25TiILh4yf+MWetJJHHTQQe7iiy82r7VDhw42yCsOnvqFF17oPvvsMysDGiBLL710hfEehel+/fpFe4raBpGgYpDoFo5EV9Ro4qKLQJ1++ukVhugliS79uiuvvLKFhtmfcHOPHj0qvMtMMEWoQYMG5knCiy++aIOpksBjxYv2fcveEED6YbPhvd0dd9zR7brrrtHaZHwZIMJcF0a/L56uT2O5fpuouTBYsBjhlegWjkRX1GjiosuUnscee6zCVlxxxUqiSziZvlRGIeOl0qfL/nPmzHEHHHCAjV72U4KS4BxhqHfgwIFur732ilKVYfoO4eo4vCe5RBcPd++997Z34fLLL4/WJhOWgQeRVXhZeHiOaCwWKrzF1MUS3SpAoiuqCy84EyZMsFDrUkstVcmrZCCTF136agk533rrrRV9r150PQykYhDWueeeG635B6bdMAiLkLSHcyYNhoJjjz3WnXTSSVHqH7KJLuKPF77mmmu63XbbzRoJ9CXjTRMOT0KiK3JBnYohvH60fz4UUxdLdKsAia6oLujPRGgZwUs/6OGHHx5tmQ8jkZPCy4guwsQc23ifLKFZ/8END6OE6fdFZL/55hubejR9+nQTQ6YdxWHw07LLLpvoNSeJLsfnIx4tW7Y0kX322WejLfOFmIYCjQg856uvvto+1OGR6IpcUKd6K0R4i6mLJbpVgERXVBdTpkyxsDCjdgn9etEdPHiwTeOh35bRynFYRz8XA62yfbEKeK5XWGEF84Jh5MiRbq211nL169c3EYx/eIKPVay66qoZpxhxvLjo0h975plnVvqQRxxCzvRB88nHEImuyAV1amj5Cm8xdXHaelBuSHRFrQGx+/7776NUevDhi19//TVK5QfeaVXBufTFKZEN6tS45SO85CsUiW4VINEVQohFF+rUJMslvOQpFIluFSDRFUKIRRfq1EyWTXjZXigS3SqgFKLrjymTyWSy0hoD+JhKl7QtybIh0a0CSiG6Qggh0sGLZZLxKVM8XZbzIVc+iW4VINEVQohFF+rUJPOC6/PkQ658Et0qQKIrhBCLLtSpcQsFF1iXD7nySXSrAImuEEIsulCnhhYXXMi33s2VT6JbBUh0hRBi0YU61VuS4EK+9W6ufBLdKkCiK4QQiy7UqVgmwYV8691c+SS6VYBEVwghFl2oUxHcbP9lKN96N1c+iW4VINEVQohFl3z+n65ENx0kukIIUcvJ5//oSnTTQaIrhBAiJxLddJDoCiGEyIlENx0kukIIIXIi0U0Hia4QQoicSHTTQaIrhBAiJxLddJDoCiGEyIlENx0kukIIIXIi0U0Hia6osfz888/uhx9+iFKl480333Qff/yxe/jhh13v3r3dzJkz3QMPPGDb1l57bTdr1ixbjjNs2DDXuXPnKFUcPXv2dK+99lqUys348eNdkyZNopQQ+SPRTQeJrqix3H777a5169bul19+sXTbtm3dEkss4erXr1/JunbtatsBoUaUcln37t2jPeZ/WKBZs2auf//+rlevXm7HHXc08UVsGzVqFOVakFB0eab5DF9oSy65pNt+++1teyZyie4+++zj2rdvX2Grr766q1OnTqV12IUXXhjtIUQy+da7ufJJdKsAia6oLvr16+dOOOEEW0Z0x44da8uZwDNu0aJFlErmnXfecZtuuqktI6wvvfSSO/nkk90xxxzjdtppJ3fIIYe45557zr333ntujTXWsHwhs2fPdkOHDnX33HOPCd4nn3xiIjt16tRK9tRTT1US3T/++MNtvfXWlWz55Zd36623XqV1NDY8G2ywgXvyySftd9999932F/viiy/cjTfeaMuXXXaZNRKEyIZENx0kuqJGQ6gXA0R32223dT169KhkEyZMsO0Qiu7w4cPNGw0NwQxFFyFEGDn2Ukst5VZaaSUTPtadddZZrl69eiaoeNR42XjFf/75p3moW221lWvcuLGJNc/00ksvbcayT5PPM2nSJMuPYHtDcAcMGFCRPuOMM9wpp5wS7eFs+X//+581Cjgf149HToOgQ4cOtm7QoEHuwQcfjPYQIpl8691c+SS6VYBEV1QH66+/vnmS+++/v6VXWWUVE86JEyeagH399dcWKp43b55th1B0CRkTevYeJKLJfqHowuDBg+0811xzjTvooINMyPAuWbfbbrtZHp7966+/3pY9XIsPLyPMHvIi2HE4N9cUQp/x559/HqWcu/POOyuJ7pAhQ8zb3Wuvvdz06dPdqaee6hZbbDH34osvujlz5th5VlxxRffdd99FewiRjEQ3HSS6osaCqD7++OMVwta0aVN35plnurXWWsv6QS+//HLrgw2Jiy5C5/HpUHQRLvpD6Tc+8sgj7fhTpkyxkDaeJMILu+66q3v33Xdt2YPo0ueMp4vo0ijAu/V9zd7z9V5oXHTxsvGk6V+eMWOGrYuLLp71Y4895v766y/7rV26dLFBX+3atbPwMg0Ojj9t2rRoDyGSkeimQ40V3Xz+a4ao+Xhvkj5SRBfwTBE7BiqNGjXK1nkKFV3PiBEjTMw9hx9+uPX1brfddu6DDz6wvleED3799VfzMFu2bGleJg2AYjxd8jFQaptttjFRh7jozp0710QXQT/++OPN2wVC6rvssovr1KmTeb2hty9EEhLddKiRoovg8v8hhfCi+/zzz5vIwEcffeRatWplIrn33ntbP6cnFF28Qe9teps8eXIl0SXN+gYNGpjX6fN5D/qWW26x4xxwwAGWBrzj6667zt1/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

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FilePlayinfoReq body = new FilePlayinfoReq(); // FilePlayinfoReq | 
try {
    FilePlayinfoRes result = apiInstance.filePlayinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#filePlayinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilePlayinfoReq**](FilePlayinfoReq.md)|  |

### Return type

[**FilePlayinfoRes**](FilePlayinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filePlaythumbnailGet"></a>
# **filePlaythumbnailGet**
> File filePlaythumbnailGet(docid, tokenid, rev)

获取视频缩略图协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String docid = "docid_example"; // String | 文件gns路径（列举协议返回）
String tokenid = "tokenid_example"; // String | 鉴权
String rev = "rev_example"; // String | 版本号，为空默认获取最新版本
try {
    File result = apiInstance.filePlaythumbnailGet(docid, tokenid, rev);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#filePlaythumbnailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docid** | **String**| 文件gns路径（列举协议返回） |
 **tokenid** | **String**| 鉴权 |
 **rev** | **String**| 版本号，为空默认获取最新版本 | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/jpeg, application/json

<a name="filePreduploadPost"></a>
# **filePreduploadPost**
> FilePreduploadRes filePreduploadPost(body)

秒传校验码协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FilePreduploadReq body = new FilePreduploadReq(); // FilePreduploadReq | 
try {
    FilePreduploadRes result = apiInstance.filePreduploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#filePreduploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilePreduploadReq**](FilePreduploadReq.md)|  |

### Return type

[**FilePreduploadRes**](FilePreduploadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filePreviewossPost"></a>
# **filePreviewossPost**
> FilePreviewossRes filePreviewossPost(body)

文档预览协议

- 目前支持的格式为：pdf、wps、doc、docx、et、xls、xlsx、dps、ppt、pptx、txt  - 首次预览时会进行转换，会返回提交转换的错误码，需要循环重试，直到发生错误或者返回二进制数据  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FilePreviewossReq body = new FilePreviewossReq(); // FilePreviewossReq | 
try {
    FilePreviewossRes result = apiInstance.filePreviewossPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#filePreviewossPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilePreviewossReq**](FilePreviewossReq.md)|  |

### Return type

[**FilePreviewossRes**](FilePreviewossRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileRenamePost"></a>
# **fileRenamePost**
> FileRenameRes fileRenamePost(body)

重命名文件协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileRenameReq body = new FileRenameReq(); // FileRenameReq | 
try {
    FileRenameRes result = apiInstance.fileRenamePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileRenamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileRenameReq**](FileRenameReq.md)|  |

### Return type

[**FileRenameRes**](FileRenameRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileRestorerevisionPost"></a>
# **fileRestorerevisionPost**
> FileRestorerevisionRes fileRestorerevisionPost(body)

还原文件历史版本协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileRestorerevisionReq body = new FileRestorerevisionReq(); // FileRestorerevisionReq | 
try {
    FileRestorerevisionRes result = apiInstance.fileRestorerevisionPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileRestorerevisionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileRestorerevisionReq**](FileRestorerevisionReq.md)|  |

### Return type

[**FileRestorerevisionRes**](FileRestorerevisionRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileRevisionsPost"></a>
# **fileRevisionsPost**
> List&lt;FileRevisionsResItem&gt; fileRevisionsPost(body)

获取文件历史版本协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileRevisionsReq body = new FileRevisionsReq(); // FileRevisionsReq | 
try {
    List<FileRevisionsResItem> result = apiInstance.fileRevisionsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileRevisionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileRevisionsReq**](FileRevisionsReq.md)|  |

### Return type

[**List&lt;FileRevisionsResItem&gt;**](FileRevisionsResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileSendPost"></a>
# **fileSendPost**
> FileSendRes fileSendPost(body)

发送文件协议

- 将指定文件发到用户个人文档的收件箱中，默认不启用该协议的功能 - 收件箱位于用户个人文档下，名为 \&quot;{接收文件箱}\&quot;  - 用户收件箱不存在时，会自动创建 - 用户收件箱中存在同名文件时，会自动重命名 

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileSendReq body = new FileSendReq(); // FileSendReq | 
try {
    FileSendRes result = apiInstance.fileSendPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileSendReq**](FileSendReq.md)|  |

### Return type

[**FileSendRes**](FileSendRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileSetappmetadataPost"></a>
# **fileSetappmetadataPost**
> fileSetappmetadataPost(body)

设置应用元数据

用于设置文件的应用元数据，可重复调用，每次调用会删除所有该应用保存的元数据，写入新的元数据

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileSetappmetadataReq body = new FileSetappmetadataReq(); // FileSetappmetadataReq | 
try {
    apiInstance.fileSetappmetadataPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileSetappmetadataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileSetappmetadataReq**](FileSetappmetadataReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileSetcsflevelPost"></a>
# **fileSetcsflevelPost**
> FileSetcsflevelRes fileSetcsflevelPost(body)

设置文件密级

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileSetcsflevelReq body = new FileSetcsflevelReq(); // FileSetcsflevelReq | 
try {
    FileSetcsflevelRes result = apiInstance.fileSetcsflevelPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileSetcsflevelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileSetcsflevelReq**](FileSetcsflevelReq.md)|  |

### Return type

[**FileSetcsflevelRes**](FileSetcsflevelRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileSetfilecustomattributePost"></a>
# **fileSetfilecustomattributePost**
> fileSetfilecustomattributePost(body)

设置文件属性值

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileSetfilecustomattributeReq body = new FileSetfilecustomattributeReq(); // FileSetfilecustomattributeReq | 
try {
    apiInstance.fileSetfilecustomattributePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileSetfilecustomattributePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileSetfilecustomattributeReq**](FileSetfilecustomattributeReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileSubmitcommentPost"></a>
# **fileSubmitcommentPost**
> fileSubmitcommentPost(body)

提交文件评论

提交一个文件的一条评论

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FileSubmitcommentReq body = new FileSubmitcommentReq(); // FileSubmitcommentReq | 
try {
    apiInstance.fileSubmitcommentPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileSubmitcommentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileSubmitcommentReq**](FileSubmitcommentReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileThumbnailGet"></a>
# **fileThumbnailGet**
> File fileThumbnailGet(docid, height, width, tokenid, rev, quality)

图片缩略图协议

1. 缩略后的图片以传入的大小按比例缩放，而非拉伸处理。  2. 图片的大小如果小于等于传入的大小，不做缩放处理，仅做质量处理。  3. 目前支持的格式为：bmp、jpg、png、gif、tif。  4. 默认支持对大小小于等于20M的图片进行缩略。  5. tif格式的缩略图为jpg格式用于Web展示，其他为原始格式。  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String docid = "docid_example"; // String | 文件gns路径（列举协议返回）
Long height = 789L; // Long | 缩略图的高度
Long width = 789L; // Long | 缩略图的宽度
String tokenid = "tokenid_example"; // String | 鉴权
String rev = "rev_example"; // String | 版本号，为空默认获取最新版本。
Long quality = 789L; // Long | 缩略图质量，默认为75
try {
    File result = apiInstance.fileThumbnailGet(docid, height, width, tokenid, rev, quality);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fileThumbnailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docid** | **String**| 文件gns路径（列举协议返回） |
 **height** | **Long**| 缩略图的高度 |
 **width** | **Long**| 缩略图的宽度 |
 **tokenid** | **String**| 鉴权 |
 **rev** | **String**| 版本号，为空默认获取最新版本。 | [optional]
 **quality** | **Long**| 缩略图质量，默认为75 | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/_*, application/json

<a name="finderDisablePost"></a>
# **finderDisablePost**
> finderDisablePost(body)

关闭文档发现状态

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FinderDisableReq body = new FinderDisableReq(); // FinderDisableReq | 
try {
    apiInstance.finderDisablePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#finderDisablePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FinderDisableReq**](FinderDisableReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="finderEnablePost"></a>
# **finderEnablePost**
> finderEnablePost(body)

开启文档发现状态

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FinderEnableReq body = new FinderEnableReq(); // FinderEnableReq | 
try {
    apiInstance.finderEnablePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#finderEnablePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FinderEnableReq**](FinderEnableReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="finderGetenabledPost"></a>
# **finderGetenabledPost**
> FinderGetenabledRes finderGetenabledPost()

获取用户开启发现的文档

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    FinderGetenabledRes result = apiInstance.finderGetenabledPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#finderGetenabledPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FinderGetenabledRes**](FinderGetenabledRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="finderGetstatusPost"></a>
# **finderGetstatusPost**
> FinderGetstatusRes finderGetstatusPost(body)

获取文档发现状态

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
FinderGetstatusReq body = new FinderGetstatusReq(); // FinderGetstatusReq | 
try {
    FinderGetstatusRes result = apiInstance.finderGetstatusPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#finderGetstatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FinderGetstatusReq**](FinderGetstatusReq.md)|  |

### Return type

[**FinderGetstatusRes**](FinderGetstatusRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupdocAddPost"></a>
# **groupdocAddPost**
> GroupdocAddRes groupdocAddPost(body)

创建群组文档

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
GroupdocAddReq body = new GroupdocAddReq(); // GroupdocAddReq | 
try {
    GroupdocAddRes result = apiInstance.groupdocAddPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupdocAddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupdocAddReq**](GroupdocAddReq.md)|  |

### Return type

[**GroupdocAddRes**](GroupdocAddRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupdocDeletePost"></a>
# **groupdocDeletePost**
> groupdocDeletePost(body)

删除群组

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
GroupdocDeleteReq body = new GroupdocDeleteReq(); // GroupdocDeleteReq | 
try {
    apiInstance.groupdocDeletePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupdocDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupdocDeleteReq**](GroupdocDeleteReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupdocEditPost"></a>
# **groupdocEditPost**
> groupdocEditPost(body)

编辑群组名称

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
GroupdocEditReq body = new GroupdocEditReq(); // GroupdocEditReq | 
try {
    apiInstance.groupdocEditPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupdocEditPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupdocEditReq**](GroupdocEditReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupdocEditquotaPost"></a>
# **groupdocEditquotaPost**
> groupdocEditquotaPost(body)

编辑群组配额

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
GroupdocEditquotaReq body = new GroupdocEditquotaReq(); // GroupdocEditquotaReq | 
try {
    apiInstance.groupdocEditquotaPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#groupdocEditquotaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupdocEditquotaReq**](GroupdocEditquotaReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationClosePost"></a>
# **invitationClosePost**
> invitationClosePost(body)

关闭共享邀请链接

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationCloseReq body = new InvitationCloseReq(); // InvitationCloseReq | 
try {
    apiInstance.invitationClosePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationClosePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationCloseReq**](InvitationCloseReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationGetPost"></a>
# **invitationGetPost**
> InvitationGetRes invitationGetPost(body)

获取共享邀请信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationGetReq body = new InvitationGetReq(); // InvitationGetReq | 
try {
    InvitationGetRes result = apiInstance.invitationGetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationGetReq**](InvitationGetReq.md)|  |

### Return type

[**InvitationGetRes**](InvitationGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationGetbaseinfobydocidPost"></a>
# **invitationGetbaseinfobydocidPost**
> InvitationGetbaseinfobydocidRes invitationGetbaseinfobydocidPost(body)

获取共享邀请基本信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationGetbaseinfobydocidReq body = new InvitationGetbaseinfobydocidReq(); // InvitationGetbaseinfobydocidReq | 
try {
    InvitationGetbaseinfobydocidRes result = apiInstance.invitationGetbaseinfobydocidPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationGetbaseinfobydocidPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationGetbaseinfobydocidReq**](InvitationGetbaseinfobydocidReq.md)|  |

### Return type

[**InvitationGetbaseinfobydocidRes**](InvitationGetbaseinfobydocidRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationGetnoteinfobydocidPost"></a>
# **invitationGetnoteinfobydocidPost**
> InvitationGetnoteinfobydocidRes invitationGetnoteinfobydocidPost(body)

获取共享邀请图片备注信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationGetnoteinfobydocidReq body = new InvitationGetnoteinfobydocidReq(); // InvitationGetnoteinfobydocidReq | 
try {
    InvitationGetnoteinfobydocidRes result = apiInstance.invitationGetnoteinfobydocidPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationGetnoteinfobydocidPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationGetnoteinfobydocidReq**](InvitationGetnoteinfobydocidReq.md)|  |

### Return type

[**InvitationGetnoteinfobydocidRes**](InvitationGetnoteinfobydocidRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationJoinPost"></a>
# **invitationJoinPost**
> InvitationJoinRes invitationJoinPost(body)

加入共享邀请

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationJoinReq body = new InvitationJoinReq(); // InvitationJoinReq | 
try {
    InvitationJoinRes result = apiInstance.invitationJoinPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationJoinPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationJoinReq**](InvitationJoinReq.md)|  |

### Return type

[**InvitationJoinRes**](InvitationJoinRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationOpenPost"></a>
# **invitationOpenPost**
> InvitationOpenRes invitationOpenPost(body)

开启共享邀请链接

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationOpenReq body = new InvitationOpenReq(); // InvitationOpenReq | 
try {
    InvitationOpenRes result = apiInstance.invitationOpenPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationOpenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationOpenReq**](InvitationOpenReq.md)|  |

### Return type

[**InvitationOpenRes**](InvitationOpenRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationSetbaseinfoPost"></a>
# **invitationSetbaseinfoPost**
> invitationSetbaseinfoPost(body)

设置共享邀请基本信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationSetbaseinfoReq body = new InvitationSetbaseinfoReq(); // InvitationSetbaseinfoReq | 
try {
    apiInstance.invitationSetbaseinfoPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationSetbaseinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationSetbaseinfoReq**](InvitationSetbaseinfoReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invitationSetnoteinfoPost"></a>
# **invitationSetnoteinfoPost**
> invitationSetnoteinfoPost(body)

设置共享邀请图片备注信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
InvitationSetnoteinfoReq body = new InvitationSetnoteinfoReq(); // InvitationSetnoteinfoReq | 
try {
    apiInstance.invitationSetnoteinfoPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invitationSetnoteinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitationSetnoteinfoReq**](InvitationSetnoteinfoReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkBatchdownloadPost"></a>
# **linkBatchdownloadPost**
> LinkBatchdownloadRes linkBatchdownloadPost(body)

文件及文件夹批量下载

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkBatchdownloadReq body = new LinkBatchdownloadReq(); // LinkBatchdownloadReq | 
try {
    LinkBatchdownloadRes result = apiInstance.linkBatchdownloadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkBatchdownloadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkBatchdownloadReq**](LinkBatchdownloadReq.md)|  |

### Return type

[**LinkBatchdownloadRes**](LinkBatchdownloadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkCheckpermPost"></a>
# **linkCheckpermPost**
> LinkCheckpermRes linkCheckpermPost(body)

权限检查

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkCheckpermReq body = new LinkCheckpermReq(); // LinkCheckpermReq | 
try {
    LinkCheckpermRes result = apiInstance.linkCheckpermPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkCheckpermPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkCheckpermReq**](LinkCheckpermReq.md)|  |

### Return type

[**LinkCheckpermRes**](LinkCheckpermRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkCheckwatermarkPost"></a>
# **linkCheckwatermarkPost**
> DirCheckwatermarkRes linkCheckwatermarkPost(body)

检查是否需要水印

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Linkcheckwatermarkreq body = new Linkcheckwatermarkreq(); // Linkcheckwatermarkreq | 
try {
    DirCheckwatermarkRes result = apiInstance.linkCheckwatermarkPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkCheckwatermarkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Linkcheckwatermarkreq**](Linkcheckwatermarkreq.md)|  |

### Return type

[**DirCheckwatermarkRes**](DirCheckwatermarkRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkClosePost"></a>
# **linkClosePost**
> linkClosePost(body)

关闭外链

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkCloseReq body = new LinkCloseReq(); // LinkCloseReq | 
try {
    apiInstance.linkClosePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkClosePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkCloseReq**](LinkCloseReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkCopyPost"></a>
# **linkCopyPost**
> LinkCopyRes linkCopyPost(body)

复制协议

1. 用于复制外链中的对象到其它目录下，外链需要配置下载权限。 2. 用户需要登录，验证用户token并检查用户对复制目标端的权限。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkCopyReq body = new LinkCopyReq(); // LinkCopyReq | 
try {
    LinkCopyRes result = apiInstance.linkCopyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkCopyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkCopyReq**](LinkCopyReq.md)|  |

### Return type

[**LinkCopyRes**](LinkCopyRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkCopyprogressPost"></a>
# **linkCopyprogressPost**
> LinkCopyprogressRes linkCopyprogressPost(body)

复制目录进度查询协议

复制的对象为目录时，copy协议返回复制任务的id，调用该协议查询对应任务的复制进度

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkCopyprogressReq body = new LinkCopyprogressReq(); // LinkCopyprogressReq | 
try {
    LinkCopyprogressRes result = apiInstance.linkCopyprogressPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkCopyprogressPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkCopyprogressReq**](LinkCopyprogressReq.md)|  |

### Return type

[**LinkCopyprogressRes**](LinkCopyprogressRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkGetPost"></a>
# **linkGetPost**
> LinkGetRes linkGetPost(body)

获取外链文件信息

本协议为外链入口。使用外链前请先调用本协议。调用时会增加一次外链使用计数。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkGetReq body = new LinkGetReq(); // LinkGetReq | 
try {
    LinkGetRes result = apiInstance.linkGetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkGetReq**](LinkGetReq.md)|  |

### Return type

[**LinkGetRes**](LinkGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkGetdetailPost"></a>
# **linkGetdetailPost**
> LinkGetdetailRes linkGetdetailPost(body)

获取外链开启信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkGetdetailReq body = new LinkGetdetailReq(); // LinkGetdetailReq | 
try {
    LinkGetdetailRes result = apiInstance.linkGetdetailPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkGetdetailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkGetdetailReq**](LinkGetdetailReq.md)|  |

### Return type

[**LinkGetdetailRes**](LinkGetdetailRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkGetinfoPost"></a>
# **linkGetinfoPost**
> LinkGetinfoRes linkGetinfoPost(body)

获取外链信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkGetinfoReq body = new LinkGetinfoReq(); // LinkGetinfoReq | 
try {
    LinkGetinfoRes result = apiInstance.linkGetinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkGetinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkGetinfoReq**](LinkGetinfoReq.md)|  |

### Return type

[**LinkGetinfoRes**](LinkGetinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkGetlinkedPost"></a>
# **linkGetlinkedPost**
> List&lt;LinkGetlinkedResItem&gt; linkGetlinkedPost()

获取我的外链

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    List<LinkGetlinkedResItem> result = apiInstance.linkGetlinkedPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkGetlinkedPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LinkGetlinkedResItem&gt;**](LinkGetlinkedResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linkListdirPost"></a>
# **linkListdirPost**
> LinkListdirRes linkListdirPost(body)

浏览目录

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkListdirReq body = new LinkListdirReq(); // LinkListdirReq | 
try {
    LinkListdirRes result = apiInstance.linkListdirPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkListdirPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkListdirReq**](LinkListdirReq.md)|  |

### Return type

[**LinkListdirRes**](LinkListdirRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkOpenPost"></a>
# **linkOpenPost**
> LinkOpenRes linkOpenPost(body)

开启外链

四项可选参数，缺失的会用外链模板补齐

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkOpenReq body = new LinkOpenReq(); // LinkOpenReq | 
try {
    LinkOpenRes result = apiInstance.linkOpenPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkOpenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkOpenReq**](LinkOpenReq.md)|  |

### Return type

[**LinkOpenRes**](LinkOpenRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkOpfilesPost"></a>
# **linkOpfilesPost**
> LinkOpfilesRes linkOpfilesPost(body)

获取被访问文件列表

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkOpfilesReq body = new LinkOpfilesReq(); // LinkOpfilesReq | 
try {
    LinkOpfilesRes result = apiInstance.linkOpfilesPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkOpfilesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkOpfilesReq**](LinkOpfilesReq.md)|  |

### Return type

[**LinkOpfilesRes**](LinkOpfilesRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkOpstatisticsPost"></a>
# **linkOpstatisticsPost**
> LinkOpstatisticsRes linkOpstatisticsPost(body)

获取文件访问详情

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkOpstatisticsReq body = new LinkOpstatisticsReq(); // LinkOpstatisticsReq | 
try {
    LinkOpstatisticsRes result = apiInstance.linkOpstatisticsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkOpstatisticsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkOpstatisticsReq**](LinkOpstatisticsReq.md)|  |

### Return type

[**LinkOpstatisticsRes**](LinkOpstatisticsRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkOsbeginuploadPost"></a>
# **linkOsbeginuploadPost**
> LinkOsbeginuploadRes linkOsbeginuploadPost(body)

开始上传文件

1. 如果reqmethod为PUT，收到该请求后，客户端自行发送上传文件内容的请求到云存储平台，填入Authorization和Date，然后15分钟内发送PUT请求        Header包含：      &#x60;&#x60;&#x60;      “Authorization: AWS AKIAJEROARV2UTTADY6A:PkLXjvYrDGDVZgTD8WVbMmS33q4&#x3D;”      “Date: Tue, 07 Apr 2015 02:35:36 GMT”      “Content-Length: 42”      “Content-Type: application/octet-stream”      &#x60;&#x60;&#x60;        URL为：https://s3-ap-northeast-1.amazonaws.com/anyshares3accesstestbucket/21A9B9FD1B524CB49D54BF7399F82EB4/AAA6CBAFE45B4E4D884DC59805E60A5C            Body为：文件内容  2. 如果reqmethod为POST，收到该请求后，客户端自行设置发送上传文件内容的表单请求到云存储平台，填入各表单项，然后15分钟内发送POST请求。阿里云OSS和亚马逊S3要求file必须为表单中最后一个域。  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkOsbeginuploadReq body = new LinkOsbeginuploadReq(); // LinkOsbeginuploadReq | 
try {
    LinkOsbeginuploadRes result = apiInstance.linkOsbeginuploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkOsbeginuploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkOsbeginuploadReq**](LinkOsbeginuploadReq.md)|  |

### Return type

[**LinkOsbeginuploadRes**](LinkOsbeginuploadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkOsdownloadPost"></a>
# **linkOsdownloadPost**
> LinkOsdownloadRes linkOsdownloadPost(body)

获取文件

1. 收到该请求，客户端以返回的url作为参数，15分钟内向云存储平台发送下载文件内容的请求  2. 如果想分块下载，请自行在Header中加入Range  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkOsdownloadReq body = new LinkOsdownloadReq(); // LinkOsdownloadReq | 
try {
    LinkOsdownloadRes result = apiInstance.linkOsdownloadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkOsdownloadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkOsdownloadReq**](LinkOsdownloadReq.md)|  |

### Return type

[**LinkOsdownloadRes**](LinkOsdownloadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkOsenduploadPost"></a>
# **linkOsenduploadPost**
> LinkOsenduploadRes linkOsenduploadPost(body)

上传文件完成

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkOsenduploadReq body = new LinkOsenduploadReq(); // LinkOsenduploadReq | 
try {
    LinkOsenduploadRes result = apiInstance.linkOsenduploadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkOsenduploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkOsenduploadReq**](LinkOsenduploadReq.md)|  |

### Return type

[**LinkOsenduploadRes**](LinkOsenduploadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkPlayGet"></a>
# **linkPlayGet**
> File linkPlayGet(docid, reqhost, usehttps)

在线播放

在线播放采用HLS（HTTP Live Streaming）方式，转码时对音视频进行切片，并生成用于视频播放索引的m3u8文件。m3u8文件内每一个非注释行指向一个音视频切片，客户端只需获取m3u8文件即可播放。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String docid = "docid_example"; // String | 转码文件id（外链在线播放请求返回）
String reqhost = "reqhost_example"; // String | 从存储服务器下载数据时的请求地址
Boolean usehttps = true; // Boolean | 是否使用https下载数据，默认为true
try {
    File result = apiInstance.linkPlayGet(docid, reqhost, usehttps);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkPlayGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docid** | **String**| 转码文件id（外链在线播放请求返回） |
 **reqhost** | **String**| 从存储服务器下载数据时的请求地址 | [optional]
 **usehttps** | **Boolean**| 是否使用https下载数据，默认为true | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.apple.mpegurl, application/json

<a name="linkPlayinfoPost"></a>
# **linkPlayinfoPost**
> LinkPlayinfoRes linkPlayinfoPost(body)

在线播放请求

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkPlayinfoReq body = new LinkPlayinfoReq(); // LinkPlayinfoReq | 
try {
    LinkPlayinfoRes result = apiInstance.linkPlayinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkPlayinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkPlayinfoReq**](LinkPlayinfoReq.md)|  |

### Return type

[**LinkPlayinfoRes**](LinkPlayinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkPlaythumbnailGet"></a>
# **linkPlaythumbnailGet**
> File linkPlaythumbnailGet(docid, rev)

获取视频缩略图

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String docid = "docid_example"; // String | 文件gns路径（列举协议返回）
String rev = "rev_example"; // String | 版本号，为空默认获取最新版本
try {
    File result = apiInstance.linkPlaythumbnailGet(docid, rev);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkPlaythumbnailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docid** | **String**| 文件gns路径（列举协议返回） |
 **rev** | **String**| 版本号，为空默认获取最新版本 | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/jpeg, application/json

<a name="linkPreviewossPost"></a>
# **linkPreviewossPost**
> LinkPreviewossRes linkPreviewossPost(body)

文档预览

- 目前支持的格式为：pdf、wps、doc、docx、et、xls、xlsx、dps、ppt、pptx、txt  - 首次预览时会进行转换，会返回提交转换的错误码，需要循环重试，直到发生错误或者返回二进制数据  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkPreviewossReq body = new LinkPreviewossReq(); // LinkPreviewossReq | 
try {
    LinkPreviewossRes result = apiInstance.linkPreviewossPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkPreviewossPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkPreviewossReq**](LinkPreviewossReq.md)|  |

### Return type

[**LinkPreviewossRes**](LinkPreviewossRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkSetPost"></a>
# **linkSetPost**
> LinkSetRes linkSetPost(body)

修改外链

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
LinkSetReq body = new LinkSetReq(); // LinkSetReq | 
try {
    LinkSetRes result = apiInstance.linkSetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkSetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkSetReq**](LinkSetReq.md)|  |

### Return type

[**LinkSetRes**](LinkSetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkThumbnailGet"></a>
# **linkThumbnailGet**
> File linkThumbnailGet(link, password, height, width, docid, rev, quality)

缩略图预览

1. 缩略后的图片以传入的大小按比例缩放，而非拉伸处理。  2. 图片的大小如果小于等于传入的大小，不做缩放处理，仅做质量处理。  3. 目前支持的格式为：bmp、jpg、png、gif、tif。  4. 默认支持对大小小于等于20M的图片进行缩略。  5. tif格式的缩略图为jpg格式用于Web展示，其他为原始格式。  

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
String link = "link_example"; // String | 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0
String password = "password_example"; // String | 密码
Long height = 789L; // Long | 缩略图的高度
Long width = 789L; // Long | 缩略图的宽度
String docid = "docid_example"; // String | 文件gns路径，通过文件夹外链获取缩略图时，需要该参数，默认为空
String rev = "rev_example"; // String | 版本号，为空默认获取最新版本。
Long quality = 789L; // Long | 缩略图质量，默认为75
try {
    File result = apiInstance.linkThumbnailGet(link, password, height, width, docid, rev, quality);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#linkThumbnailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **link** | **String**| 外链唯一标识，如FC5E038D38A57032085441E7FE7010B0 |
 **password** | **String**| 密码 |
 **height** | **Long**| 缩略图的高度 |
 **width** | **Long**| 缩略图的宽度 |
 **docid** | **String**| 文件gns路径，通过文件夹外链获取缩略图时，需要该参数，默认为空 | [optional]
 **rev** | **String**| 版本号，为空默认获取最新版本。 | [optional]
 **quality** | **Long**| 缩略图质量，默认为75 | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/_*, application/json

<a name="messageGetPost"></a>
# **messageGetPost**
> MessageGetRes messageGetPost(body)

获取消息通知

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
MessageGetReq body = new MessageGetReq(); // MessageGetReq | 
try {
    MessageGetRes result = apiInstance.messageGetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#messageGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageGetReq**](MessageGetReq.md)|  |

### Return type

[**MessageGetRes**](MessageGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageRead2Post"></a>
# **messageRead2Post**
> messageRead2Post(body)

确认消息通知

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
MessageRead2Req body = new MessageRead2Req(); // MessageRead2Req | 
try {
    apiInstance.messageRead2Post(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#messageRead2Post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageRead2Req**](MessageRead2Req.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="messageSendmailPost"></a>
# **messageSendmailPost**
> messageSendmailPost(body)

邮件发送

使用SMTP服务器发送邮件

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
MessageSendmailReq body = new MessageSendmailReq(); // MessageSendmailReq | 
try {
    apiInstance.messageSendmailPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#messageSendmailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessageSendmailReq**](MessageSendmailReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ownerAddPost"></a>
# **ownerAddPost**
> ownerAddPost(body)

添加所有者

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
OwnerAddReq body = new OwnerAddReq(); // OwnerAddReq | 
try {
    apiInstance.ownerAddPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ownerAddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OwnerAddReq**](OwnerAddReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ownerCheckPost"></a>
# **ownerCheckPost**
> OwnerCheckRes ownerCheckPost(body)

检查是否是所有者

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
OwnerCheckReq body = new OwnerCheckReq(); // OwnerCheckReq | 
try {
    OwnerCheckRes result = apiInstance.ownerCheckPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ownerCheckPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OwnerCheckReq**](OwnerCheckReq.md)|  |

### Return type

[**OwnerCheckRes**](OwnerCheckRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ownerDeletePost"></a>
# **ownerDeletePost**
> ownerDeletePost(body)

删除所有者

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
OwnerDeleteReq body = new OwnerDeleteReq(); // OwnerDeleteReq | 
try {
    apiInstance.ownerDeletePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ownerDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OwnerDeleteReq**](OwnerDeleteReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ownerGetPost"></a>
# **ownerGetPost**
> OwnerGetRes ownerGetPost(body)

获取所有者

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
OwnerGetReq body = new OwnerGetReq(); // OwnerGetReq | 
try {
    OwnerGetRes result = apiInstance.ownerGetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ownerGetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OwnerGetReq**](OwnerGetReq.md)|  |

### Return type

[**OwnerGetRes**](OwnerGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ownerSetPost"></a>
# **ownerSetPost**
> OwnerSetRes ownerSetPost(body)

设置所有者

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
OwnerSetReq body = new OwnerSetReq(); // OwnerSetReq | 
try {
    OwnerSetRes result = apiInstance.ownerSetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ownerSetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OwnerSetReq**](OwnerSetReq.md)|  |

### Return type

[**OwnerSetRes**](OwnerSetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="perm1CheckPost"></a>
# **perm1CheckPost**
> Perm1CheckRes perm1CheckPost(body)

检查单个权限

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Perm1CheckReq body = new Perm1CheckReq(); // Perm1CheckReq | 
try {
    Perm1CheckRes result = apiInstance.perm1CheckPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm1CheckPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Perm1CheckReq**](Perm1CheckReq.md)|  |

### Return type

[**Perm1CheckRes**](Perm1CheckRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="perm1CheckallPost"></a>
# **perm1CheckallPost**
> Perm1CheckallRes perm1CheckallPost(body)

检查所有权限

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Perm1CheckallReq body = new Perm1CheckallReq(); // Perm1CheckallReq | 
try {
    Perm1CheckallRes result = apiInstance.perm1CheckallPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm1CheckallPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Perm1CheckallReq**](Perm1CheckallReq.md)|  |

### Return type

[**Perm1CheckallRes**](Perm1CheckallRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="perm1GetexternallinktemplatePost"></a>
# **perm1GetexternallinktemplatePost**
> Perm1GetexternallinktemplateRes perm1GetexternallinktemplatePost()

获取外链共享模板

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Perm1GetexternallinktemplateRes result = apiInstance.perm1GetexternallinktemplatePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm1GetexternallinktemplatePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Perm1GetexternallinktemplateRes**](Perm1GetexternallinktemplateRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="perm1GetinternallinktemplatePost"></a>
# **perm1GetinternallinktemplatePost**
> Perm1GetinternallinktemplateRes perm1GetinternallinktemplatePost()

获取内链共享模板

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Perm1GetinternallinktemplateRes result = apiInstance.perm1GetinternallinktemplatePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm1GetinternallinktemplatePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Perm1GetinternallinktemplateRes**](Perm1GetinternallinktemplateRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="perm1GetsharedPost"></a>
# **perm1GetsharedPost**
> Perm1GetsharedRes perm1GetsharedPost()

获取用户已共享的文档

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Perm1GetsharedRes result = apiInstance.perm1GetsharedPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm1GetsharedPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Perm1GetsharedRes**](Perm1GetsharedRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="perm1GetsharedocconfigPost"></a>
# **perm1GetsharedocconfigPost**
> Perm1GetsharedocconfigRes perm1GetsharedocconfigPost()

获取共享文档开关配置

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    Perm1GetsharedocconfigRes result = apiInstance.perm1GetsharedocconfigPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm1GetsharedocconfigPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Perm1GetsharedocconfigRes**](Perm1GetsharedocconfigRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="perm1ListPost"></a>
# **perm1ListPost**
> Perm1ListRes perm1ListPost(body)

展示各访问者的最终权限

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Perm1ListReq body = new Perm1ListReq(); // Perm1ListReq | 
try {
    Perm1ListRes result = apiInstance.perm1ListPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm1ListPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Perm1ListReq**](Perm1ListReq.md)|  |

### Return type

[**Perm1ListRes**](Perm1ListRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="perm2GetPost"></a>
# **perm2GetPost**
> Perm2GetRes perm2GetPost(body)

获取权限配置

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Perm2GetReq body = new Perm2GetReq(); // Perm2GetReq | 
try {
    Perm2GetRes result = apiInstance.perm2GetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm2GetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Perm2GetReq**](Perm2GetReq.md)|  |

### Return type

[**Perm2GetRes**](Perm2GetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="perm2SetPost"></a>
# **perm2SetPost**
> Perm2SetRes perm2SetPost(body)

设置权限配置

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
Perm2SetReq body = new Perm2SetReq(); // Perm2SetReq | 
try {
    Perm2SetRes result = apiInstance.perm2SetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#perm2SetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Perm2SetReq**](Perm2SetReq.md)|  |

### Return type

[**Perm2SetRes**](Perm2SetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quarantineAppealPost"></a>
# **quarantineAppealPost**
> quarantineAppealPost(body)

浏览协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
QuarantineAppealReq body = new QuarantineAppealReq(); // QuarantineAppealReq | 
try {
    apiInstance.quarantineAppealPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#quarantineAppealPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuarantineAppealReq**](QuarantineAppealReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quarantineListPost"></a>
# **quarantineListPost**
> List&lt;QuarantineListResItem&gt; quarantineListPost()

浏览协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    List<QuarantineListResItem> result = apiInstance.quarantineListPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#quarantineListPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;QuarantineListResItem&gt;**](QuarantineListResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quarantineListreversionPost"></a>
# **quarantineListreversionPost**
> List&lt;QuarantineListreversionRes&gt; quarantineListreversionPost(body)

获取版本协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
QuarantineListreversionReq body = new QuarantineListreversionReq(); // QuarantineListreversionReq | 
try {
    List<QuarantineListreversionRes> result = apiInstance.quarantineListreversionPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#quarantineListreversionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuarantineListreversionReq**](QuarantineListreversionReq.md)|  |

### Return type

[**List&lt;QuarantineListreversionRes&gt;**](QuarantineListreversionRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quarantinePreviewPost"></a>
# **quarantinePreviewPost**
> QuarantinePreviewRes quarantinePreviewPost(body)

获取版本协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
QuarantinePreviewReq body = new QuarantinePreviewReq(); // QuarantinePreviewReq | 
try {
    QuarantinePreviewRes result = apiInstance.quarantinePreviewPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#quarantinePreviewPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QuarantinePreviewReq**](QuarantinePreviewReq.md)|  |

### Return type

[**QuarantinePreviewRes**](QuarantinePreviewRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recycleDeletePost"></a>
# **recycleDeletePost**
> recycleDeletePost(body)

删除回收站资源协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
RecycleDeleteReq body = new RecycleDeleteReq(); // RecycleDeleteReq | 
try {
    apiInstance.recycleDeletePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recycleDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecycleDeleteReq**](RecycleDeleteReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recycleGetretentiondaysPost"></a>
# **recycleGetretentiondaysPost**
> RecycleGetretentiondaysRes recycleGetretentiondaysPost(body)

获取回收站保留天数

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
RecycleGetretentiondaysReq body = new RecycleGetretentiondaysReq(); // RecycleGetretentiondaysReq | 
try {
    RecycleGetretentiondaysRes result = apiInstance.recycleGetretentiondaysPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recycleGetretentiondaysPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecycleGetretentiondaysReq**](RecycleGetretentiondaysReq.md)|  |

### Return type

[**RecycleGetretentiondaysRes**](RecycleGetretentiondaysRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recycleGetsuggestnamePost"></a>
# **recycleGetsuggestnamePost**
> RecycleGetsuggestnameRes recycleGetsuggestnamePost(body)

获取回收站还原后的建议名称协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
RecycleGetsuggestnameReq body = new RecycleGetsuggestnameReq(); // RecycleGetsuggestnameReq | 
try {
    RecycleGetsuggestnameRes result = apiInstance.recycleGetsuggestnamePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recycleGetsuggestnamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecycleGetsuggestnameReq**](RecycleGetsuggestnameReq.md)|  |

### Return type

[**RecycleGetsuggestnameRes**](RecycleGetsuggestnameRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recycleListPost"></a>
# **recycleListPost**
> RecycleListRes recycleListPost(body)

浏览回收站资源协议

当请求中有多个查找的关键词时，将返回根据每个关键词查找的结果的交集。

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
RecycleListReq body = new RecycleListReq(); // RecycleListReq | 
try {
    RecycleListRes result = apiInstance.recycleListPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recycleListPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecycleListReq**](RecycleListReq.md)|  |

### Return type

[**RecycleListRes**](RecycleListRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recycleRestorePost"></a>
# **recycleRestorePost**
> RecycleRestoreRes recycleRestorePost(body)

还原回收站资源协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
RecycleRestoreReq body = new RecycleRestoreReq(); // RecycleRestoreReq | 
try {
    RecycleRestoreRes result = apiInstance.recycleRestorePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recycleRestorePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecycleRestoreReq**](RecycleRestoreReq.md)|  |

### Return type

[**RecycleRestoreRes**](RecycleRestoreRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recycleSetretentiondaysPost"></a>
# **recycleSetretentiondaysPost**
> recycleSetretentiondaysPost(body)

设置回收站保留天数

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
RecycleSetretentiondaysReq body = new RecycleSetretentiondaysReq(); // RecycleSetretentiondaysReq | 
try {
    apiInstance.recycleSetretentiondaysPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recycleSetretentiondaysPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecycleSetretentiondaysReq**](RecycleSetretentiondaysReq.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="redirectGethostinfoPost"></a>
# **redirectGethostinfoPost**
> RedirectGethostinfoRes redirectGethostinfoPost()

获取webclient地址信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    RedirectGethostinfoRes result = apiInstance.redirectGethostinfoPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#redirectGethostinfoPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RedirectGethostinfoRes**](RedirectGethostinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchCustomattributePost"></a>
# **searchCustomattributePost**
> List&lt;SearchCustomattributeResItem&gt; searchCustomattributePost()

获取自定义属性协议

用于获取全文检索高级检索页面中的自定义属性

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    List<SearchCustomattributeResItem> result = apiInstance.searchCustomattributePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#searchCustomattributePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SearchCustomattributeResItem&gt;**](SearchCustomattributeResItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchSearchPost"></a>
# **searchSearchPost**
> SearchSearchRes searchSearchPost(body)

搜索协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
SearchSearchReq body = new SearchSearchReq(); // SearchSearchReq | 
try {
    SearchSearchRes result = apiInstance.searchSearchPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#searchSearchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchSearchReq**](SearchSearchReq.md)|  |

### Return type

[**SearchSearchRes**](SearchSearchRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchTagsuggestPost"></a>
# **searchTagsuggestPost**
> SearchTagsuggestRes searchTagsuggestPost(body)

标签补全协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
SearchTagsuggestReq body = new SearchTagsuggestReq(); // SearchTagsuggestReq | 
try {
    SearchTagsuggestRes result = apiInstance.searchTagsuggestPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#searchTagsuggestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchTagsuggestReq**](SearchTagsuggestReq.md)|  |

### Return type

[**SearchTagsuggestRes**](SearchTagsuggestRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCheckPost"></a>
# **updateCheckPost**
> UpdateCheckRes updateCheckPost(body)

检查客户端是否需要更新

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
UpdateCheckReq body = new UpdateCheckReq(); // UpdateCheckReq | 
try {
    UpdateCheckRes result = apiInstance.updateCheckPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCheckPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCheckReq**](UpdateCheckReq.md)|  |

### Return type

[**UpdateCheckRes**](UpdateCheckRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDownloadPost"></a>
# **updateDownloadPost**
> UpdateDownloadRes updateDownloadPost(body)

下载客户端升级包

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
UpdateDownloadReq body = new UpdateDownloadReq(); // UpdateDownloadReq | 
try {
    UpdateDownloadRes result = apiInstance.updateDownloadPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateDownloadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateDownloadReq**](UpdateDownloadReq.md)|  |

### Return type

[**UpdateDownloadRes**](UpdateDownloadRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userAgreedtotermsofusePost"></a>
# **userAgreedtotermsofusePost**
> UserAgreedtotermsofuseRes userAgreedtotermsofusePost()

同意用户使用协议

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    UserAgreedtotermsofuseRes result = apiInstance.userAgreedtotermsofusePost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userAgreedtotermsofusePost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserAgreedtotermsofuseRes**](UserAgreedtotermsofuseRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userGetPost"></a>
# **userGetPost**
> UserGetRes userGetPost()

获取userid对应的用户信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
try {
    UserGetRes result = apiInstance.userGetPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userGetPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserGetRes**](UserGetRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userGetbasicinfoPost"></a>
# **userGetbasicinfoPost**
> UserGetbasicinfoRes userGetbasicinfoPost(body)

获取用户基本信息

### Example
```java
// Import classes:
//import io.openDocAPI.client.ApiClient;
//import io.openDocAPI.client.ApiException;
//import io.openDocAPI.client.Configuration;
//import io.openDocAPI.client.auth.*;
//import io.openDocAPI.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DefaultApi apiInstance = new DefaultApi();
UserGetbasicinfoReq body = new UserGetbasicinfoReq(); // UserGetbasicinfoReq | 
try {
    UserGetbasicinfoRes result = apiInstance.userGetbasicinfoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userGetbasicinfoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGetbasicinfoReq**](UserGetbasicinfoReq.md)|  |

### Return type

[**UserGetbasicinfoRes**](UserGetbasicinfoRes.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

