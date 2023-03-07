package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-31 11:47
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9102 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9102.class,args);
;    }
}
