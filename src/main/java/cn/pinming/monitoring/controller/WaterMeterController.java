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
@Api(description = "水表")
public class WaterMeterController {

    @ApiOperation("获取水表详情")
    @PostMapping("/waterDeviceDeatail")
    public ResponseEntity<SuccessResponse<WaterMeterVo>> getWaterMeterDetail(@RequestBody CommonBo commonBo){
        return ResponseEntity.ok(new SuccessResponse<WaterMeterVo>(null));
    }

    /**
     * 获取设备
     * @return
     */
    @ApiOperation("获取水表设备列表")
    @PostMapping("/waterDevices")
    public ResponseEntity<SuccessResponse<List<WaterMeterVo>>> getDevices(@RequestBody String projectId){
        return ResponseEntity.ok(new SuccessResponse<List<WaterMeterVo>>(null));
    }

    /**
     * 获取水表统计数据
     * @param runDataBo
     * @return
     */
    @PostMapping("/waterRunDataByTime")
    @ApiOperation("获取水表按时间统计数据")
    public ResponseEntity<SuccessResponse<StatisticsContainMoreTotalVoByTime>> getRunDataByTime(@RequestBody RunDataBo runDataBo){
        return ResponseEntity.ok(new SuccessResponse<StatisticsContainMoreTotalVoByTime>(null));
    }

    /**
     * 获取水表统计数据
     * @param runDataBo
     * @return
     */
    @PostMapping("/waterRunDataByDevice")
    @ApiOperation("获取水表按设备统计数据")
    public ResponseEntity<SuccessResponse<StatisticsContainMoreVoByDevice>> getRunDataByDevice(@RequestBody RunDataBo runDataBo){
        return ResponseEntity.ok(new SuccessResponse<StatisticsContainMoreVoByDevice>(null));
    }
}
