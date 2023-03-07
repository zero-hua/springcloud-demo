package ink.zerohua.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-01 17:20
 **/
@SpringBootApplication
@EnableEurekaClient
//激活服务降级
@EnableCircuitBreaker
public class PaymentHystrixMain8005 {

  public static void main(String[] args) {
      SpringApplication.run(PaymentHystrixMain8005.class,args);
  }

  @Bean
  public ServletRegistrationBean getServlet(){
      HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
      ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
      registrationBean.setLoadOnStartup(1);
      registrationBean.addUrlMappings("/hystrix.stream");
      registrationBean.setName("HystrixMetricsStreamServlet");
      return registrationBean;
  }
}
