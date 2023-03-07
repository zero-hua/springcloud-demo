package ink.zerohua.springcloud.service;

import ink.zerohua.springcloud.entities.Payment;

/**
 * @program: springcloud
 * @description: f
 * @author: zerohua
 * @create: 2020-07-17 15:19
 **/
public interface IPaymentService {

    int create(Payment payment);

    Payment getPaymentById(Integer id);
}
