# AuditGetpendingapprovalsReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **Long** | 分页开始号，从0开始 | 
**limit** | **Long** | 条数，表示取多少条记录，-1表示不限制 | 
**type** | **Long** | 用于标识具体获取哪种申请，默认为0  0 表示获取共享申请和定密申请  1 表示获取共享申请(包括共享、外链、所有者和更改继承申请)  2 表示获取定密申请 | 