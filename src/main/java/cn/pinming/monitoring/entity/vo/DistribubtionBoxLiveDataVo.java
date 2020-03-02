package cn.pinming.monitoring.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :10:33
 * @Description:
 */
@ApiModel(description = "实时数据")
@Data
public class DistribubtionBoxLiveDataVo {

    @ApiModelProperty(value = "A相电流(A)", example = "A相电流(A)")
    private float currentOfPhaseA;
    @ApiModelProperty(value = "B相电流(A)", example = "B相电流(A)")
    private float currentOfPhaseB;
    @ApiModelProperty(value = "C相电流(A)", example = "C相电流(A)")
    private float currentOfPhaseC;
    @ApiModelProperty(value = "剩余电流(mA)", example = "剩余电流(mA)")
    private float currentOfRemain;
    @ApiModelProperty(value = "A相温度(℃)", example = "A相温度(℃)")
    private float temperatureOfPhaseA;
    @ApiModelProperty(value = "B相温度(℃)", example = "B相温度(℃)")
    private float temperatureOfPhaseB;
    @ApiModelProperty(value = "C相温度(℃)", example = "C相温度(℃)")
    private float temperatureOfPhaseC;
    @ApiModelProperty(value = "箱体温度(℃)", example = "箱体温度(℃)")
    private float temperatureOfBox;
    @ApiModelProperty(value = "数据时间", example = "数据时间")
    private Date liveDate;
}
