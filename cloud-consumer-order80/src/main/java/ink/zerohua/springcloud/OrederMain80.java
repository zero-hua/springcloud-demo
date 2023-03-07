package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-18 14:49
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrederMain80 {
  public static void main(String[] args) {
      SpringApplication.run(OrederMain80.class,args);
  }
}
