# Api Documentation


<a name="overview"></a>
## 概览
Api Documentation


### 版本信息
*版本* : 1.0


### 许可信息
*许可证* : Apache 2.0  
*许可网址* : http://www.apache.org/licenses/LICENSE-2.0  
*服务条款* : urn:tos


### URI scheme
*域名* : localhost:8080  
*基础路径* : /


### 标签

* distribution-box-controller : 配电箱
* electricity-meter-controller : 电表
* project-controller : 项目
* water-meter-controller : 水表




<a name="paths"></a>
## 资源


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



##### 请求格式

* `application/json`



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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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



##### 请求格式

* `application/json`





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




<a name="definitions"></a>
## 定义

<a name="commonbo"></a>
### CommonBo
通用业务实体


|名称|说明|类型|
|---|---|---|
|**deviceId**  <br>*必填*|设备id  <br>**样例** : `"设备id"`|integer (int32)|
|**projectId**  <br>*必填*|项目id  <br>**样例** : `"项目id"`|integer (int32)|


<a name="distribubtionboxlivedatavo"></a>
### DistribubtionBoxLiveDataVo
实时数据


|名称|说明|类型|
|---|---|---|
|**currentOfPhaseA**  <br>*可选*|A相电流(A)  <br>**样例** : `"A相电流(A)"`|number (float)|
|**currentOfPhaseB**  <br>*可选*|B相电流(A)  <br>**样例** : `"B相电流(A)"`|number (float)|
|**currentOfPhaseC**  <br>*可选*|C相电流(A)  <br>**样例** : `"C相电流(A)"`|number (float)|
|**currentOfRemain**  <br>*可选*|剩余电流(mA)  <br>**样例** : `"剩余电流(mA)"`|number (float)|
|**liveDate**  <br>*可选*|数据时间  <br>**样例** : `"数据时间"`|string (date-time)|
|**temperatureOfBox**  <br>*可选*|箱体温度(℃)  <br>**样例** : `"箱体温度(℃)"`|number (float)|
|**temperatureOfPhaseA**  <br>*可选*|A相温度(℃)  <br>**样例** : `"A相温度(℃)"`|number (float)|
|**temperatureOfPhaseB**  <br>*可选*|B相温度(℃)  <br>**样例** : `"B相温度(℃)"`|number (float)|
|**temperatureOfPhaseC**  <br>*可选*|C相温度(℃)  <br>**样例** : `"C相温度(℃)"`|number (float)|


<a name="distributionboxvo"></a>
### DistributionBoxVo
配电箱设备详情


|名称|说明|类型|
|---|---|---|
|**atsp**  <br>*可选*|**样例** : `0.0`|number (float)|
|**avalue**  <br>*可选*|**样例** : `0.0`|number (float)|
|**boxTsp**  <br>*可选*|电流温度阀值  <br>**样例** : `"电流温度阀值"`|number (float)|
|**deviceArea**  <br>*可选*|设备区域  <br>**样例** : `"设备区域"`|string|
|**deviceStatus**  <br>*可选*|设备状态 0 正常 1 报警'  <br>**样例** : `"设备状态 0 正常 1 报警'"`|string|
|**id**  <br>*可选*|主键  <br>**样例** : `"主键"`|integer (int32)|
|**insertTime**  <br>*可选*|插入时间  <br>**样例** : `"插入时间"`|string (date-time)|
|**monitorId**  <br>*可选*|监测器编号  <br>**样例** : `"监测器编号"`|string|
|**pdxId**  <br>*可选*|配电箱编号  <br>**样例** : `"配电箱编号"`|string|
|**pdxName**  <br>*可选*|配电箱名称  <br>**样例** : `"配电箱名称"`|string|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `"项目id"`|string|
|**residualAValue**  <br>*可选*|剩余电流阀值  <br>**样例** : `"剩余电流阀值"`|number (float)|
|**updateTime**  <br>*可选*|修改时间  <br>**样例** : `"修改时间"`|string (date-time)|
|**vendorCode**  <br>*可选*|厂商  <br>**样例** : `"厂商"`|string|


<a name="electricitymetervo"></a>
### ElectricityMeterVo
电表


|名称|说明|类型|
|---|---|---|
|**ct**  <br>*可选*|**样例** : `0.0`|number (float)|
|**deviceSn**  <br>*可选*|设备编号  <br>**样例** : `"设备编号"`|string|
|**isMaster**  <br>*可选*|是否主表 0 不是 1 是  <br>**样例** : `"是否主表 0 不是 1 是"`|integer (int32)|
|**pt**  <br>*可选*|**样例** : `0.0`|number (float)|


<a name="modelandview"></a>
### ModelAndView

|名称|说明|类型|
|---|---|---|
|**empty**  <br>*可选*|**样例** : `true`|boolean|
|**model**  <br>*可选*|**样例** : `"object"`|object|
|**modelMap**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**reference**  <br>*可选*|**样例** : `true`|boolean|
|**status**  <br>*可选*|**样例** : `"string"`|enum (100 CONTINUE, 101 SWITCHING_PROTOCOLS, 102 PROCESSING, 103 CHECKPOINT, 200 OK, 201 CREATED, 202 ACCEPTED, 203 NON_AUTHORITATIVE_INFORMATION, 204 NO_CONTENT, 205 RESET_CONTENT, 206 PARTIAL_CONTENT, 207 MULTI_STATUS, 208 ALREADY_REPORTED, 226 IM_USED, 300 MULTIPLE_CHOICES, 301 MOVED_PERMANENTLY, 302 FOUND, 302 MOVED_TEMPORARILY, 303 SEE_OTHER, 304 NOT_MODIFIED, 305 USE_PROXY, 307 TEMPORARY_REDIRECT, 308 PERMANENT_REDIRECT, 400 BAD_REQUEST, 401 UNAUTHORIZED, 402 PAYMENT_REQUIRED, 403 FORBIDDEN, 404 NOT_FOUND, 405 METHOD_NOT_ALLOWED, 406 NOT_ACCEPTABLE, 407 PROXY_AUTHENTICATION_REQUIRED, 408 REQUEST_TIMEOUT, 409 CONFLICT, 410 GONE, 411 LENGTH_REQUIRED, 412 PRECONDITION_FAILED, 413 PAYLOAD_TOO_LARGE, 413 REQUEST_ENTITY_TOO_LARGE, 414 URI_TOO_LONG, 414 REQUEST_URI_TOO_LONG, 415 UNSUPPORTED_MEDIA_TYPE, 416 REQUESTED_RANGE_NOT_SATISFIABLE, 417 EXPECTATION_FAILED, 418 I_AM_A_TEAPOT, 419 INSUFFICIENT_SPACE_ON_RESOURCE, 420 METHOD_FAILURE, 421 DESTINATION_LOCKED, 422 UNPROCESSABLE_ENTITY, 423 LOCKED, 424 FAILED_DEPENDENCY, 425 TOO_EARLY, 426 UPGRADE_REQUIRED, 428 PRECONDITION_REQUIRED, 429 TOO_MANY_REQUESTS, 431 REQUEST_HEADER_FIELDS_TOO_LARGE, 451 UNAVAILABLE_FOR_LEGAL_REASONS, 500 INTERNAL_SERVER_ERROR, 501 NOT_IMPLEMENTED, 502 BAD_GATEWAY, 503 SERVICE_UNAVAILABLE, 504 GATEWAY_TIMEOUT, 505 HTTP_VERSION_NOT_SUPPORTED, 506 VARIANT_ALSO_NEGOTIATES, 507 INSUFFICIENT_STORAGE, 508 LOOP_DETECTED, 509 BANDWIDTH_LIMIT_EXCEEDED, 510 NOT_EXTENDED, 511 NETWORK_AUTHENTICATION_REQUIRED)|
|**view**  <br>*可选*|**样例** : `"[view](#view)"`|[View](#view)|
|**viewName**  <br>*可选*|**样例** : `"string"`|string|


<a name="rundatabo"></a>
### RunDataBo
运行数据业务


|名称|说明|类型|
|---|---|---|
|**deviceIds**  <br>*必填*|设备id数组  <br>**样例** : `"设备id数组"`|< integer (int32) > array|
|**endTime**  <br>*必填*|结束时间  <br>**样例** : `"结束时间"`|string (date-time)|
|**granularity**  <br>*可选*|数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒  <br>**样例** : `"数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒"`|string|
|**startTime**  <br>*必填*|开始时间  <br>**样例** : `"开始时间"`|string (date-time)|


<a name="statisticscontainmoretotalvobytime"></a>
### StatisticsContainMoreTotalVoByTime
统计时间维度表记信息


|名称|说明|类型|
|---|---|---|
|**statisticsDataByDevice**  <br>*可选*|按设备统计数据  <br>**样例** : `"[statisticsdatabydevice](#statisticsdatabydevice)"`|[StatisticsDataByDevice](#statisticsdatabydevice)|
|**total**  <br>*可选*|总数值  <br>**样例** : `"总数值"`|number (float)|


<a name="statisticscontainmorevobydevice"></a>
### StatisticsContainMoreVoByDevice
统计设备维度表记信息


|名称|说明|类型|
|---|---|---|
|**statisticsDataByTime**  <br>*可选*|按时间统计数据  <br>**样例** : `"[statisticsdatabytime](#statisticsdatabytime)"`|[StatisticsDataByTime](#statisticsdatabytime)|
|**total**  <br>*可选*|总数值  <br>**样例** : `"总数值"`|number (float)|


<a name="statisticsdatabydevice"></a>
### StatisticsDataByDevice
按设备统计数据


|名称|说明|类型|
|---|---|---|
|**dataTime**  <br>*可选*|时间  <br>**样例** : `"时间"`|string (date-time)|
|**deviceId**  <br>*可选*|设备id  <br>**样例** : `"设备id"`|string|
|**deviceName**  <br>*可选*|设备名称  <br>**样例** : `"设备名称"`|string|
|**quantity**  <br>*可选*|读数  <br>**样例** : `"读数"`|number (float)|
|**xname**  <br>*可选*|**样例** : `"string"`|string|


<a name="statisticsdatabytime"></a>
### StatisticsDataByTime
按时间统计数据


|名称|说明|类型|
|---|---|---|
|**dataTime**  <br>*可选*|时间  <br>**样例** : `"时间"`|string (date-time)|
|**endQuantity**  <br>*可选*|读数止码  <br>**样例** : `"读数止码"`|number (float)|
|**pt**  <br>*可选*|**样例** : `0.0`|number (float)|
|**quantity**  <br>*可选*|读数  <br>**样例** : `"读数"`|number (float)|
|**startQuantity**  <br>*可选*|读数起码  <br>**样例** : `"读数起码"`|number (float)|


<a name="totalvo"></a>
### TotalVo
水电表总数

*类型* : object


<a name="view"></a>
### View

|名称|说明|类型|
|---|---|---|
|**contentType**  <br>*可选*|**样例** : `"string"`|string|


<a name="watermetervo"></a>
### WaterMeterVo
水表设备详情


|名称|说明|类型|
|---|---|---|
|**deviceSn**  <br>*可选*|设备编号  <br>**样例** : `"设备编号"`|string|
|**isMaster**  <br>*可选*|是否主表 0 不是 1 是  <br>**样例** : `"是否主表 0 不是 1 是"`|integer (int32)|


<a name="5393caa7c0770900981b2789aa5a9401"></a>
### 成功的请求«DistribubtionBoxLiveDataVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `"[distribubtionboxlivedatavo](#distribubtionboxlivedatavo)"`|[DistribubtionBoxLiveDataVo](#distribubtionboxlivedatavo)|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="57fc5f880acaf86aded19a3995460811"></a>
### 成功的请求«DistributionBoxVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `"[distributionboxvo](#distributionboxvo)"`|[DistributionBoxVo](#distributionboxvo)|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="bf70c63a910233624740972866ccb212"></a>
### 成功的请求«ElectricityMeterVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `"[electricitymetervo](#electricitymetervo)"`|[ElectricityMeterVo](#electricitymetervo)|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="85fb44bd97ce4a50be54d7b740008c2a"></a>
### 成功的请求«List«DistribubtionBoxLiveDataVo»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `[ "[distribubtionboxlivedatavo](#distribubtionboxlivedatavo)" ]`|< [DistribubtionBoxLiveDataVo](#distribubtionboxlivedatavo) > array|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="7d91ae93ebb3dce27c53525da6989556"></a>
### 成功的请求«List«ElectricityMeterVo»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `[ "[electricitymetervo](#electricitymetervo)" ]`|< [ElectricityMeterVo](#electricitymetervo) > array|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="9ead19bd910f3f5fd960537bc1dfb7f9"></a>
### 成功的请求«List«WaterMeterVo»»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `[ "[watermetervo](#watermetervo)" ]`|< [WaterMeterVo](#watermetervo) > array|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="1e34d2cd3afe5389a39b36350ac0e4fc"></a>
### 成功的请求«StatisticsContainMoreTotalVoByTime»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `"[statisticscontainmoretotalvobytime](#statisticscontainmoretotalvobytime)"`|[StatisticsContainMoreTotalVoByTime](#statisticscontainmoretotalvobytime)|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="b97fd187312ee6ef696588041f9eaa05"></a>
### 成功的请求«StatisticsContainMoreVoByDevice»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `"[statisticscontainmorevobydevice](#statisticscontainmorevobydevice)"`|[StatisticsContainMoreVoByDevice](#statisticscontainmorevobydevice)|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="2419bf6afce1de2bc6c728efce2b82e2"></a>
### 成功的请求«TotalVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `"[totalvo](#totalvo)"`|[TotalVo](#totalvo)|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|


<a name="afd85b02958eb52666a2166cdb7eed5b"></a>
### 成功的请求«WaterMeterVo»

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|请求的状态码  <br>**样例** : `"string"`|string|
|**data**  <br>*可选*|请求返回的内容  <br>**样例** : `"[watermetervo](#watermetervo)"`|[WaterMeterVo](#watermetervo)|
|**message**  <br>*可选*|请求的结果信息  <br>**样例** : `"string"`|string|
|**success**  <br>*可选*|请求是否成功  <br>**样例** : `false`|boolean|





