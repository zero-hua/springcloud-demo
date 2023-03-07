package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-21 17:29
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

  public static void main(String[] args) {
      SpringApplication.run(EurekaMain7002.class,args);
  }

}
