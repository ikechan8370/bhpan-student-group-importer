# SearchSearchReqCustomattr

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attr** | **Long** | 自定义属性id，customattr内每个对象必须有attr |  [optional]
**condition** | **String** | 自定义属性搜索条件，customattr内每个对象必须有condition，可以为：  “&#x3D;”，需要给出value  “&gt;”，需要给出value  “&lt;”，需要给出value  “[]”，需要给出lvalue，rvalue，搜索符合 [lvalue, rvalue] 范围内的记录   |  [optional]
**level** | **Long** | 层级自定义属性的值的层数  默认为0，表示非层级属性   |  [optional]
**value** | **Long** | 自定义属性搜索关键词id或数值，condition为“&#x3D;”、 “&gt;”、 “&lt;”时需要该项值 |  [optional]
**rvalue** | **Long** | 自定义属性搜索数值，condition为”[]”时需要该项值 |  [optional]
**lvalue** | **Long** | 自定义属性搜索数值，condition为”[]”时需要该项值 |  [optional]
