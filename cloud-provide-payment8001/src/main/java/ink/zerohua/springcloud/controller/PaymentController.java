package ink.zerohua.springcloud.controller;

import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.entities.Payment;
import ink.zerohua.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-17 15:25
 **/
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        //需要添加@RequestBody注解，否则插入成功但是没有数据
        int result = paymentService.create(payment);
        log.info("******插入结果："+result);

        if(result > 0){
            return new CommonResult(200,"插入数据库成功,执行端口："+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败,执行端口："+serverPort,null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Integer id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果："+id);

        if(payment != null){
            return new CommonResult(200,"查询成功,执行端口："+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id+"执行端口："+serverPort,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String service:services){
            log.info("******service："+service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        //iter快捷键新建foreach循环
        return this.discoveryClient;
    }
}
