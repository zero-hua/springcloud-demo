package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-23 18:31
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {

  public static void main(String[] args){
      SpringApplication.run(PaymentMain8004.class,args);
  }

}
