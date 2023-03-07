package ink.zerohua.springcloud.service;

import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springcloud
 * @description: f
 * @author: zerohua
 * @create: 2020-07-29 18:36
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface IPaymentFeignService {

//    int create(Payment payment);

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id);
}
