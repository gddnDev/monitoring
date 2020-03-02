package cn.pinming.monitoring.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :11:38
 * @Description:
 */
@ApiModel(description = "水表设备详情")
@Data
public class WaterMeterVo {

    @ApiModelProperty(value = "主键", example = "主键")
    private Integer id;

    @ApiModelProperty(value = "是否主表 0 不是 1 是", example = "是否主表 0 不是 1 是")
    private Integer isMaster;

    @ApiModelProperty(value = "设备编号", example = "设备编号")
    private String deviceSn;

    @ApiModelProperty(value = "设备名称", example = "设备名称")
    private String deviceName;

    @ApiModelProperty(value = "设备区域", example = "设备区域")
    private String deviceArea;
}
