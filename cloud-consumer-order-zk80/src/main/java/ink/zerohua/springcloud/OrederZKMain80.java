package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-18 14:49
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrederZKMain80 {

  public static void main(String[] args) {
      SpringApplication.run(OrederZKMain80.class,args);
  }

}
