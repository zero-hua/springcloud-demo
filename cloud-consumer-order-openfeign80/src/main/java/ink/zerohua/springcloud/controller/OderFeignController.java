package ink.zerohua.springcloud.controller;

import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.entities.Payment;
import ink.zerohua.springcloud.service.IPaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-29 18:40
 **/
@RestController
@Slf4j
public class OderFeignController {

    @Resource
    private IPaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Integer id){
        return paymentFeignService.getPaymentById(id);
    }
}
