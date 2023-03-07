package ink.zerohua.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-03 17:57
 **/
@Component
//可以指定默认fallback类，同名方法为之fall
@FeignClient(value = "CLOUD-PROVIDE-HYSTRIX-PAYMENT",fallback = OderService.class)
public interface IOderService {

  /**
   * @param id
   * @return
   * 必须有参数
   */
  @GetMapping("/payment/hystrix/ok/{id}")
  String oderInfoOk(@PathVariable("id") Integer id);

  /**
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/timeout/{id}")
  String oderInfoTimeOut(@PathVariable("id") Integer id);
}
