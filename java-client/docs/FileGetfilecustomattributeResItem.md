# FileGetfilecustomattributeResItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | 属性唯一ID | 
**name** | **String** | 属性名称 | 
**value** | [**Object**](.md) | 属性值，类型为：string/int/string array    type等于1、3时value类型为string，0为string array, 其余均为int    属性值为空时不存在此字段     |  [optional]
**valueid** | **List&lt;Integer&gt;** | 属性值ID，类型为int/int array    type等于0或1时存在。0时是int array   |  [optional]
**type** | **Long** | 属性类型  - 0：层级  - 1：枚举  - 2：数字  - 3：文本  - 4：时间 （秒）   | 
