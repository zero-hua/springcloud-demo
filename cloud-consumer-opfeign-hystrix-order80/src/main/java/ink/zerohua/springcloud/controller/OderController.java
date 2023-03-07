package ink.zerohua.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import ink.zerohua.springcloud.service.IOderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-03 18:01
 **/
@RestController
@Slf4j
//该注解能够定义一个默认的fallback方法
//@DefaultProperties(defaultFallback = "paymentInfo_TimeOutHandler")
public class OderController {

    @Resource
    private IOderService oderService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String oderInfoOk(@PathVariable("id") Integer id){
        return oderService.oderInfoOk(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "15000")
//    })
    //调用默认的fallback方法
    @HystrixCommand
    public String oderInfoTimeOut(@PathVariable("id") Integer id){
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return oderService.oderInfoTimeOut(id);
    }


    public String paymentInfo_TimeOutHandler(){
        return "我是消费端，调用provide失败，o(╥﹏╥)o";
    }
}
