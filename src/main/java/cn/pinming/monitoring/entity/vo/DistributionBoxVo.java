package cn.pinming.monitoring.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :10:00
 * @Description:配电箱信息
 */
@ApiModel(description = "配电箱设备详情")
@Data
public class DistributionBoxVo {

    @ApiModelProperty(value = "主键",example = "主键")
    private Integer id;

    @ApiModelProperty(value = "项目id",example = "项目id")
    private String projectId;

    @ApiModelProperty(value = "配电箱编号",example = "配电箱编号")
    private String pdxId;

    @ApiModelProperty(value = "配电箱名称",example = "配电箱名称")
    private String pdxName;

    @ApiModelProperty(value = "监测器编号",example = "监测器编号")
    private String monitorId;

    @ApiModelProperty(value = "厂商",example = "厂商")
    private String vendorCode;

    @ApiModelProperty(value = "设备区域",example = "设备区域")
    private String deviceArea;

    @ApiModelProperty(value = "设备状态 0 正常 1 报警'",example = "设备状态 0 正常 1 报警'")
    private String deviceStatus;

    @ApiModelProperty(value = "电流阀值",example = "电流阀值")
    private Float aValue;

    @ApiModelProperty(value = "剩余电流阀值",example = "剩余电流阀值")
    private Float residualAValue;

    @ApiModelProperty(value = "箱体温度阀值",example = "箱体温度阀值")
    private Float aTsp;

    @ApiModelProperty(value = "电流温度阀值",example = "电流温度阀值")
    private Float boxTsp;

    @ApiModelProperty(value = "插入时间",example = "插入时间")
    private Date insertTime;

    @ApiModelProperty(value = "修改时间",example = "修改时间")
    private Date updateTime;

}
