package cn.pinming.monitoring.common.iotresponse;

import lombok.Data;

/**
 * @Auther: 36560
 * @Date: 2020/3/3 :22:32
 * @Description:iot数据平台获取数据通用类
 */
@Data
public class CommonResposne<T> {
    private Integer code;
    private String msg;
    private T data;
}
