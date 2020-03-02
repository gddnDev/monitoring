package cn.pinming.monitoring.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :12:24
 * @Description:
 */
@ApiModel(description = "统计设备维度表记信息")
@Data
public class StatisticsContainMoreVoByDevice {

    @ApiModelProperty(value = "总数值",example = "总数值")
    private float total;

    @ApiModelProperty(value = "按时间统计数据",example = "按时间统计数据")
    private StatisticsDataByTime statisticsDataByTime;
}
