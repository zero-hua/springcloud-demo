package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-16 17:22
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8002.class, args);
  }

}
