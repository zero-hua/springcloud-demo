package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-25 16:48
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OderMain83.class,args);
    }
}
