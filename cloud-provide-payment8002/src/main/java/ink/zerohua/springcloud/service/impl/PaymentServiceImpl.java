package ink.zerohua.springcloud.service.impl;

import ink.zerohua.springcloud.dao.IPaymentDao;
import ink.zerohua.springcloud.entities.Payment;
import ink.zerohua.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-17 15:21
 **/
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private IPaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id){
        return paymentDao.getPaymentById(id);
    }

}
