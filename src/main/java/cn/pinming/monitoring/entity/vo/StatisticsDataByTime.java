package cn.pinming.monitoring.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :11:44
 * @Description:按时间统计数据
 */
@ApiModel(description = "按时间统计数据")
@Data
public class StatisticsDataByTime {

    /**
     * 读数
     */
    @ApiModelProperty(value = "读数",example = "读数")
    private float quantity;

    /**
     * 起码
     */
    @ApiModelProperty(value = "读数起码",example = "读数起码")
    private float startQuantity;

    /**
     * 止码
     */
    @ApiModelProperty(value = "读数止码",example = "读数止码")
    private float endQuantity;

    /**
     * 时间
     */
    @ApiModelProperty(value = "时间",example = "时间")
    private Date dataTime;

    @ApiModelProperty(value = "倍率",example = "倍率")
    private float PT;
}
