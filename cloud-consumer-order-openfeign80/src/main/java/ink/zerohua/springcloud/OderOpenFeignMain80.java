package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-29 18:28
 **/
@SpringBootApplication
@EnableFeignClients
public class OderOpenFeignMain80 {

  public static void main(String[] args) {
      SpringApplication.run(OderOpenFeignMain80.class,args);
  }
}
