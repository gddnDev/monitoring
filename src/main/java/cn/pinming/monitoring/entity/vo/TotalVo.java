package cn.pinming.monitoring.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :12:49
 * @Description:
 */
@ApiModel(description = "水电表总数")
@Data
public class TotalVo {

    /**
     * 水表总数
     */
    @ApiModelProperty(value = "水表总数", example = "水表总数")
    private float waterTotal;

    /**
     * 电表总数
     */
    @ApiModelProperty(value = "电表总数", example = "电表总数")
    private float electricityTotal;

    @ApiModelProperty(value = "起始时间", example = "起始时间")
    private Date startTime;

    @ApiModelProperty(value = "结束时间", example = "结束时间")
    private Date endTime;
}
