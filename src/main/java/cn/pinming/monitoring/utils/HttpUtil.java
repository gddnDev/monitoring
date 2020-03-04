package cn.pinming.monitoring.utils;

import cn.pinming.monitoring.common.response.AbstractResponse;
import cn.pinming.monitoring.common.response.Response;
import cn.pinming.monitoring.common.response.SuccessResponse;
import cn.pinming.monitoring.entity.bo.CommonBo;
import cn.pinming.monitoring.entity.bo.RunDataBo;
import cn.pinming.monitoring.entity.vo.DistribubtionBoxLiveDataVo;
import cn.pinming.monitoring.entity.vo.DistributionBoxVo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 36560
 * @Date: 2020/3/3 :18:48
 * @Description:
 */
public class HttpUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T restTemplatePostForObject(Object object,Class<T> clazz){
        return null;
    }
    private static <T> ParameterizedTypeReference getReference(Class<T> clazz,Class<?>... parameterClasses) {
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(clazz, parameterClasses);
        return ParameterizedTypeReference.forType(javaType);
    }

    private static <T> ParameterizedTypeReference getListReference(Class<T> clazz,Class<?> parameterClasses) {

        JavaType inner = objectMapper.getTypeFactory().constructParametricType(ArrayList.class,parameterClasses);
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(clazz, inner);
        return ParameterizedTypeReference.forType(javaType);
    }

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        CommonBo commonBo = new CommonBo();
        commonBo.setDeviceId(123456);
        commonBo.setProjectId(123456789);
        HttpEntity<CommonBo> commonBoHttpEntity1 = new HttpEntity<>(commonBo, httpHeaders);
        SuccessResponse<DistributionBoxVo> body1 = (SuccessResponse<DistributionBoxVo>)restTemplate.exchange("http://127.0.0.1:8080/distributionBoxDeviceDetail", HttpMethod.POST, commonBoHttpEntity1, getReference(SuccessResponse.class,DistributionBoxVo.class)).getBody();
        System.out.println(body1);

        RunDataBo runDataBo = new RunDataBo();
        runDataBo.setDeviceIds(new Integer[]{1});
        runDataBo.setEndTime(new Date());
        runDataBo.setStartTime(new Date());
        runDataBo.setGranularity("1");
        HttpEntity<RunDataBo> commonBoHttpEntity2 = new HttpEntity<>(runDataBo, httpHeaders);
        SuccessResponse<DistributionBoxVo> body2 = (SuccessResponse<DistributionBoxVo>)restTemplate.exchange("http://127.0.0.1:8080/distributionBoxRunData", HttpMethod.POST, commonBoHttpEntity2, getListReference(SuccessResponse.class,DistribubtionBoxLiveDataVo.class)).getBody();
        System.out.println(body2);
    }
}
