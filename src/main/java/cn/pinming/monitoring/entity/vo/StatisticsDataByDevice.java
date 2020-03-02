package cn.pinming.monitoring.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :11:44
 * @Description:统计数据
 */
@ApiModel(description = "按设备统计数据")
@Data
public class StatisticsDataByDevice {

    /**
     * 读数
     */
    @ApiModelProperty(value = "读数",example = "读数")
    private float quantity;

    /**
     * 时间
     */
    @ApiModelProperty(value = "时间",example = "时间")
    private Date dataTime;

    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称",example = "设备名称")
    private String deviceName;

    /**
     * x轴名称
     */
    @ApiModelProperty(value = "x轴名称",example = "x轴名称")
    private String XName;

    /**
     * 设备id
     */
    @ApiModelProperty(value = "设备id",example = "设备id")
    private String deviceId;
}
