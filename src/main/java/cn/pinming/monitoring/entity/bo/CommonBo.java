package cn.pinming.monitoring.entity.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/2/29 :10:25
 * @Description:
 */
@ApiModel(description = "通用业务实体")
@Data
public class CommonBo {

    @ApiModelProperty(value = "项目id", example = "项目id", required = true)
    private Integer projectId;

    @ApiModelProperty(value = "设备id", example = "设备id", required = true)
    private Integer deviceId;

}
