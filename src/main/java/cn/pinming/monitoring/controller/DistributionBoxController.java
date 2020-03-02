package cn.pinming.monitoring.controller;

import cn.pinming.monitoring.common.response.SuccessResponse;
import cn.pinming.monitoring.entity.bo.CommonBo;
import cn.pinming.monitoring.entity.bo.RunDataBo;
import cn.pinming.monitoring.entity.vo.DistribubtionBoxLiveDataVo;
import cn.pinming.monitoring.entity.vo.DistributionBoxVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :9:58
 * @Description:
 */
@RestController
@Api(description = "配电箱")
public class DistributionBoxController {

    /**
     * 获取配电箱设备详情数据
     *
     * @param commonBo
     * @return
     */
    @PostMapping("/distributionBoxDeviceDetail")
    @ApiOperation("获取配电箱设备详情")
    public ResponseEntity<SuccessResponse<DistributionBoxVo>> getDeviceDetail(@RequestBody CommonBo commonBo) {
        return ResponseEntity.ok(new SuccessResponse<DistributionBoxVo>(null));
    }

    /**
     * 获取实时配电箱数据
     * @param commonBo
     * @return
     */
    @ApiOperation("获取配电箱实时数据")
    @PostMapping("/distributionBoxLiveData")
    public ResponseEntity<SuccessResponse<DistribubtionBoxLiveDataVo>> getLiveData(@RequestBody CommonBo commonBo) {
        return ResponseEntity.ok(new SuccessResponse<DistribubtionBoxLiveDataVo>(null));
    }

    /**
     * 获取实时配电箱数据
     * @param runDataBo
     * @return
     */
    @ApiOperation("获取配电箱运行数据")
    @PostMapping("/distributionBoxRunData")
    public ResponseEntity<SuccessResponse<List<DistribubtionBoxLiveDataVo>>> getRunData(@RequestBody RunDataBo runDataBo) {
        return ResponseEntity.ok(new SuccessResponse<List<DistribubtionBoxLiveDataVo>>(null));
    }
}
