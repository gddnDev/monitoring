
<a name="paths"></a>
## 资源

<a name="basic-error-controller_resource"></a>
### Basic-error-controller
Basic Error Controller


<a name="errorhtmlusingpost"></a>
#### errorHtml
```
POST /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `text/html`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="errorhtmlusingget"></a>
#### errorHtml
```
GET /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `text/html`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="errorhtmlusingput"></a>
#### errorHtml
```
PUT /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `text/html`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="errorhtmlusingdelete"></a>
#### errorHtml
```
DELETE /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `text/html`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="errorhtmlusingpatch"></a>
#### errorHtml
```
PATCH /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `text/html`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="errorhtmlusinghead"></a>
#### errorHtml
```
HEAD /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `text/html`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="errorhtmlusingoptions"></a>
#### errorHtml
```
OPTIONS /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `text/html`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```


<a name="distribution-box-controller_resource"></a>
### Distribution-box-controller
配电箱


<a name="getdevicedetailusingpost"></a>
#### 获取配电箱设备详情
```
POST /deviceDetail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**commonBo**  <br>*必填*|commonBo|[CommonBo](#commonbo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«DistributionBoxVo»](#57fc5f880acaf86aded19a3995460811)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/deviceDetail
```


###### 请求 body
```
json :
{
  "deviceId" : "设备id",
  "projectId" : "项目id"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "atsp" : 0.0,
    "avalue" : 0.0,
    "boxTsp" : "电流温度阀值",
    "deviceArea" : "设备区域",
    "deviceStatus" : "设备状态 0 正常 1 报警'",
    "id" : "主键",
    "insertTime" : "插入时间",
    "monitorId" : "监测器编号",
    "pdxId" : "配电箱编号",
    "pdxName" : "配电箱名称",
    "projectId" : "项目id",
    "residualAValue" : "剩余电流阀值",
    "updateTime" : "修改时间",
    "vendorCode" : "厂商"
  },
  "message" : "string",
  "success" : false
}
```


<a name="getlivedatausingpost"></a>
#### 获取配电箱实时数据
```
POST /liveData
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**commonBo**  <br>*必填*|commonBo|[CommonBo](#commonbo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«DistribubtionBoxLiveDataVo»](#5393caa7c0770900981b2789aa5a9401)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/liveData
```


###### 请求 body
```
json :
{
  "deviceId" : "设备id",
  "projectId" : "项目id"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "currentOfPhaseA" : "A相电流(A)",
    "currentOfPhaseB" : "B相电流(A)",
    "currentOfPhaseC" : "C相电流(A)",
    "currentOfRemain" : "剩余电流(mA)",
    "liveDate" : "数据时间",
    "temperatureOfBox" : "箱体温度(℃)",
    "temperatureOfPhaseA" : "A相温度(℃)",
    "temperatureOfPhaseB" : "B相温度(℃)",
    "temperatureOfPhaseC" : "C相温度(℃)"
  },
  "message" : "string",
  "success" : false
}
```


<a name="getrundatausingpost"></a>
#### 获取配电箱运行数据
```
POST /runData
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**runDataBo**  <br>*必填*|runDataBo|[RunDataBo](#rundatabo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«List«DistribubtionBoxLiveDataVo»»](#85fb44bd97ce4a50be54d7b740008c2a)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/runData
```


###### 请求 body
```
json :
{
  "deviceIds" : "设备id数组",
  "endTime" : "结束时间",
  "granularity" : "数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒",
  "startTime" : "开始时间"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : [ {
    "currentOfPhaseA" : "A相电流(A)",
    "currentOfPhaseB" : "B相电流(A)",
    "currentOfPhaseC" : "C相电流(A)",
    "currentOfRemain" : "剩余电流(mA)",
    "liveDate" : "数据时间",
    "temperatureOfBox" : "箱体温度(℃)",
    "temperatureOfPhaseA" : "A相温度(℃)",
    "temperatureOfPhaseB" : "B相温度(℃)",
    "temperatureOfPhaseC" : "C相温度(℃)"
  } ],
  "message" : "string",
  "success" : false
}
```


<a name="electricity-meter-controller_resource"></a>
### Electricity-meter-controller
电表


<a name="getelectricitymeterdetailusingpost"></a>
#### 获取电表详情
```
POST /electricityDeviceDeatail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**commonBo**  <br>*必填*|commonBo|[CommonBo](#commonbo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«ElectricityMeterVo»](#bf70c63a910233624740972866ccb212)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/electricityDeviceDeatail
```


###### 请求 body
```
json :
{
  "deviceId" : "设备id",
  "projectId" : "项目id"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "ct" : 0.0,
    "deviceSn" : "设备编号",
    "isMaster" : "是否主表 0 不是 1 是",
    "pt" : 0.0
  },
  "message" : "string",
  "success" : false
}
```


<a name="getdevicesusingpost"></a>
#### 获取电表设备列表
```
POST /electricityDevices
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**projectId**  <br>*必填*|projectId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«List«ElectricityMeterVo»»](#7d91ae93ebb3dce27c53525da6989556)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/electricityDevices
```


###### 请求 body
```
json :
{ }
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : [ {
    "ct" : 0.0,
    "deviceSn" : "设备编号",
    "isMaster" : "是否主表 0 不是 1 是",
    "pt" : 0.0
  } ],
  "message" : "string",
  "success" : false
}
```


<a name="getrundatabydeviceusingpost"></a>
#### 获取电表按设备统计数据
```
POST /electricityRunDataByDevice
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**runDataBo**  <br>*必填*|runDataBo|[RunDataBo](#rundatabo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«StatisticsContainMoreVoByDevice»](#b97fd187312ee6ef696588041f9eaa05)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/electricityRunDataByDevice
```


###### 请求 body
```
json :
{
  "deviceIds" : "设备id数组",
  "endTime" : "结束时间",
  "granularity" : "数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒",
  "startTime" : "开始时间"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "statisticsDataByTime" : {
      "dataTime" : "时间",
      "endQuantity" : "读数止码",
      "pt" : 0.0,
      "quantity" : "读数",
      "startQuantity" : "读数起码"
    },
    "total" : "总数值"
  },
  "message" : "string",
  "success" : false
}
```


<a name="getrundatabytimeusingpost"></a>
#### 获取电表按时间统计数据
```
POST /electricityRunDataByTime
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**runDataBo**  <br>*必填*|runDataBo|[RunDataBo](#rundatabo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«StatisticsContainMoreTotalVoByTime»](#1e34d2cd3afe5389a39b36350ac0e4fc)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/electricityRunDataByTime
```


###### 请求 body
```
json :
{
  "deviceIds" : "设备id数组",
  "endTime" : "结束时间",
  "granularity" : "数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒",
  "startTime" : "开始时间"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "statisticsDataByDevice" : {
      "dataTime" : "时间",
      "deviceId" : "设备id",
      "deviceName" : "设备名称",
      "quantity" : "读数",
      "xname" : "string"
    },
    "total" : "总数值"
  },
  "message" : "string",
  "success" : false
}
```


<a name="project-controller_resource"></a>
### Project-controller
项目


<a name="gettotalusingpost"></a>
#### 获取水电表总数
```
POST /metersTotal
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**projectId**  <br>*必填*|projectId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«TotalVo»](#2419bf6afce1de2bc6c728efce2b82e2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/metersTotal
```


###### 请求 body
```
json :
{ }
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : { },
  "message" : "string",
  "success" : false
}
```


<a name="water-meter-controller_resource"></a>
### Water-meter-controller
水表


<a name="getwatermeterdetailusingpost"></a>
#### 获取水表详情
```
POST /waterDeviceDeatail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**commonBo**  <br>*必填*|commonBo|[CommonBo](#commonbo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«WaterMeterVo»](#afd85b02958eb52666a2166cdb7eed5b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/waterDeviceDeatail
```


###### 请求 body
```
json :
{
  "deviceId" : "设备id",
  "projectId" : "项目id"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "deviceSn" : "设备编号",
    "isMaster" : "是否主表 0 不是 1 是"
  },
  "message" : "string",
  "success" : false
}
```


<a name="getdevicesusingpost_1"></a>
#### 获取水表设备列表
```
POST /waterDevices
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**projectId**  <br>*必填*|projectId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«List«WaterMeterVo»»](#9ead19bd910f3f5fd960537bc1dfb7f9)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/waterDevices
```


###### 请求 body
```
json :
{ }
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : [ {
    "deviceSn" : "设备编号",
    "isMaster" : "是否主表 0 不是 1 是"
  } ],
  "message" : "string",
  "success" : false
}
```


<a name="getrundatabydeviceusingpost_1"></a>
#### 获取水表按设备统计数据
```
POST /waterRunDataByDevice
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**runDataBo**  <br>*必填*|runDataBo|[RunDataBo](#rundatabo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«StatisticsContainMoreVoByDevice»](#b97fd187312ee6ef696588041f9eaa05)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/waterRunDataByDevice
```


###### 请求 body
```
json :
{
  "deviceIds" : "设备id数组",
  "endTime" : "结束时间",
  "granularity" : "数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒",
  "startTime" : "开始时间"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "statisticsDataByTime" : {
      "dataTime" : "时间",
      "endQuantity" : "读数止码",
      "pt" : 0.0,
      "quantity" : "读数",
      "startQuantity" : "读数起码"
    },
    "total" : "总数值"
  },
  "message" : "string",
  "success" : false
}
```


<a name="getrundatabytimeusingpost_1"></a>
#### 获取水表按时间统计数据
```
POST /waterRunDataByTime
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**runDataBo**  <br>*必填*|runDataBo|[RunDataBo](#rundatabo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[成功的请求«StatisticsContainMoreTotalVoByTime»](#1e34d2cd3afe5389a39b36350ac0e4fc)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/waterRunDataByTime
```


###### 请求 body
```
json :
{
  "deviceIds" : "设备id数组",
  "endTime" : "结束时间",
  "granularity" : "数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒",
  "startTime" : "开始时间"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : "string",
  "data" : {
    "statisticsDataByDevice" : {
      "dataTime" : "时间",
      "deviceId" : "设备id",
      "deviceName" : "设备名称",
      "quantity" : "读数",
      "xname" : "string"
    },
    "total" : "总数值"
  },
  "message" : "string",
  "success" : false
}
```



