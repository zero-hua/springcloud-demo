package ink.zerohua.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-31 11:25
 **/
@RestController
public class RateLimitController {


    /*
    * @SentinelResource 不可以绑定private修饰的
    * blockHandler只对sentienl定义的规则降级
    * blockhandler and fallback 当两个都同时生效时,blockhandler优先生效
    * */

    @GetMapping("/helloFall")
    @SentinelResource(value = "helloFall",blockHandler = "fallMethod")
    public CommonResult helloFall() {
        return new CommonResult(200,"访问成功！",new Payment(2020,"test-----"));
    }

    public CommonResult fallMethod(BlockException e) {
        return new CommonResult(404,e.getClass().getCanonicalName()+"\t服务不可用，这是降级。。。。。");
    }
}
