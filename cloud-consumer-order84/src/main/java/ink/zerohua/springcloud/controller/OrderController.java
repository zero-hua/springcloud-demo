package ink.zerohua.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.entities.Payment;
import ink.zerohua.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-31 12:02
 **/
@RestController
@Slf4j
public class OrderController {

    public static final String SERVICE_URL = "http://nacos-payment-provider";

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private IPaymentService paymentService;

    @GetMapping("/consumer/payment/{id}")
    public CommonResult payment(@PathVariable Integer id) {
        return paymentService.getCommonResult(id);
    }

//    @GetMapping("/consumer/fallback/{id}")
////    @SentinelResource(value = "fallback",fallback = "handlerFallback")
////    public CommonResult<Payment> fallback(@PathVariable Integer id) {
////        CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL+"/payment/"+id,CommonResult.class,id);
////        if(id == 4) {
////            log.info("Don't fuck!");
////            throw new IllegalArgumentException("不要乱搞！");
////        }else if(result.getData() == null) {
////            log.info("Don't shit!");
////            throw new NullPointerException("空指针异常");
////        }
////        return result;
////    }
////
////    public CommonResult handlerFallback(@PathVariable Integer id,Throwable e) {
////        Payment payment = new Payment(id,"null");
////        return new CommonResult(444,"出错了，这里是fallback,"+e.getMessage(),payment);
////    }
}
