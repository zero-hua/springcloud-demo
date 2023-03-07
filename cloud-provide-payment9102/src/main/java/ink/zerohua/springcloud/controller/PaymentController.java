package ink.zerohua.springcloud.controller;

import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-31 11:48
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Integer, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1,new Payment(1,"1111111111111"));
        hashMap.put(2,new Payment(2,"2222222222222"));
        hashMap.put(3,new Payment(3,"3333333333333"));
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> paymentCommonResult(@PathVariable Integer id) {
        log.info("执行调用。。。");
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200,"执行成功！，端口是\t"+serverPort,payment);
        return result;
    }
}
