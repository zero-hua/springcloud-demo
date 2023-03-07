package ink.zerohua.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-21 15:01
 **/
@Configuration
public class ApplicationContextConfig {

    /**
    * @Description:  此bean用于端口调用，如80端口的controller调用另外端口的功能
    * @Param: null
    * @Return: null
    * @Author: zerohua
    * @Date: 2020/7/21 15:34
    */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
