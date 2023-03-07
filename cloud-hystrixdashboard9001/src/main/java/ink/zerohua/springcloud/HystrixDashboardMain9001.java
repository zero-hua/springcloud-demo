package ink.zerohua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-06 17:29
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

  public static void main(String[] args) {
      SpringApplication.run(HystrixDashboardMain9001.class,args);
  }
}
