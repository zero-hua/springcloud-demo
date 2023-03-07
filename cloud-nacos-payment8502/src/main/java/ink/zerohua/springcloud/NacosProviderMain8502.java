package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-25 16:28
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderMain8502 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderMain8502.class,args);
    }
}
