package cn.pinming.monitoring.controller;

import cn.pinming.monitoring.common.response.SuccessResponse;
import cn.pinming.monitoring.entity.bo.CommonBo;
import cn.pinming.monitoring.entity.bo.RunDataBo;
import cn.pinming.monitoring.entity.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :10:54
 * @Description:
 */
@RestController
@Api(description = "电表")
public class ElectricityMeterController {

    @ApiOperation("获取电表详情")
    @PostMapping("/electricityDeviceDeatail")
    public ResponseEntity<SuccessResponse<ElectricityMeterVo>> getElectricityMeterDetail(@RequestBody CommonBo commonBo){
        return ResponseEntity.ok(new SuccessResponse<ElectricityMeterVo>(null));
    }

    /**
     * 获取设备
     * @return
     */
    @ApiOperation("获取电表设备列表")
    @PostMapping("/electricityDevices")
    public ResponseEntity<SuccessResponse<List<ElectricityMeterVo>>> getDevices(@RequestBody String projectId){
        return ResponseEntity.ok(new SuccessResponse<List<ElectricityMeterVo>>(null));
    }

    /**
     * 获取电表统计数据
     * @param runDataBo
     * @return
     */
    @PostMapping("/electricityRunDataByTime")
    @ApiOperation("获取电表按时间统计数据")
    public ResponseEntity<SuccessResponse<StatisticsContainMoreTotalVoByTime>> getRunDataByTime(@RequestBody RunDataBo runDataBo){
        return ResponseEntity.ok(new SuccessResponse<StatisticsContainMoreTotalVoByTime>(null));
    }

    /**
     * 获取电表统计数据
     * @param runDataBo
     * @return
     */
    @PostMapping("/electricityRunDataByDevice")
    @ApiOperation("获取电表按设备统计数据")
    public ResponseEntity<SuccessResponse<StatisticsContainMoreVoByDevice>> getRunDataByDevice(@RequestBody RunDataBo runDataBo){
        return ResponseEntity.ok(new SuccessResponse<StatisticsContainMoreVoByDevice>(null));
    }
}
