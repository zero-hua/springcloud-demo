package ink.zerohua.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-01 17:21
 **/
@Service
public class PaymentService {

    /**
    * @Description: 正常
    * @Param: null
    * @Return: null
    * @Author: zerohua
    * @Date: 2020/8/1 17:24
    */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymeny_OK,id:"+id+"\to(*￣︶￣*)o";
    }

    //该注解设置降级方法(fallback)，假如本方法出错（异常/超时），调用降级方法提供服务
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "6000")
//    })
    public String paymentInfo_TimeOut(Integer id){
        int a = 10/0;
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymeny_TimeOut,id:"+id+"\to(*￣︶￣*)o";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_TimeOutHandler,id:"+id+"\to(╥﹏╥)o";
    }

    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启熔断器
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数（并发超过这个次数，启动熔断器）
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少后熔断
    })
    public String paymentCircuitBreaker(Integer id){
        if(id < 0){
            throw new RuntimeException("==id can't as fushu");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t调用成功，流水号："+serialNumber;
    }

    public String paymentCircuitBreakerFallback(Integer id){
        return "this is breaker fallback method,id is "+id;
    }
}
