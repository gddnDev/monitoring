package cn.pinming.monitoring.controller;

import cn.pinming.monitoring.common.response.SuccessResponse;
import cn.pinming.monitoring.entity.vo.TotalVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :12:48
 * @Description:
 */
@RestController
@Api(description = "项目")
public class ProjectController {

    /**
     * 获取水电表总数
     * @return
     */
    @ApiOperation("获取水电表总数")
    @PostMapping("/metersTotal")
    public ResponseEntity<SuccessResponse<TotalVo>> getTotal(@RequestBody String projectId){
        return ResponseEntity.ok(new SuccessResponse<TotalVo>(null));
    }
}
