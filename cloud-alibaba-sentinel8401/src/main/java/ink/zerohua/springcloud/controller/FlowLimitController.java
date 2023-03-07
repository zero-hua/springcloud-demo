package ink.zerohua.springcloud.controller;

import ch.qos.logback.core.util.TimeUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-30 20:43
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "------A";
    }

    @GetMapping("/testB")
    public String testB(){
        return "------B";
    }

    @GetMapping("/testC")
    public String testC(){
        log.info("执行访问-----------");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "------C";
    }

    @GetMapping("/testFall")
    @SentinelResource(value = "hello",fallback = "fallMethod")
    public String testFallback(@RequestParam(value = "one",required = false)String one,
                               @RequestParam(value = "two",required = false)String two){
        return "------Fall,(*^▽^*)";
    }

    public String fallMethod(String one,String two,BlockException e){
        return "-------Method,o(╥﹏╥)o";
    }
}
