package cn.pinming.monitoring.entity.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :10:59
 * @Description:
 */
@ApiModel(description = "运行数据业务")
@Data
public class RunDataBo {

    @ApiModelProperty(value = "设备id数组", example = "设备id数组", required = true)
    private Integer[] deviceIds;

    @ApiModelProperty(value = "数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒", example = "数据粒度 0 无 1 年 2 月 3 日 4 时 5 15分钟 6 分钟 7秒", required = true)
    private String granularity;

    @ApiModelProperty(value = "开始时间", example = "开始时间", required = true)
    private Date startTime;

    @ApiModelProperty(value = "结束时间", example = "结束时间", required = true)
    private Date endTime;
}
