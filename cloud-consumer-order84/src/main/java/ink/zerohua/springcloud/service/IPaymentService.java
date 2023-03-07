package ink.zerohua.springcloud.service;

import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.service.impl.PaymentServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springcloud
 * @description: f
 * @author: zerohua
 * @create: 2020-08-31 13:58
 **/
@FeignClient(value = "nacos-payment-provider",fallback = PaymentServiceImpl.class)
public interface IPaymentService {

    //这里mapping必须和provider端一致,方法名不必须
    @GetMapping("/payment/{id}")
    CommonResult getCommonResult(@PathVariable Integer id);
}
