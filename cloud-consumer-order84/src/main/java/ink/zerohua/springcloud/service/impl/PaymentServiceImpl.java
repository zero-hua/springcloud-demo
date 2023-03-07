package ink.zerohua.springcloud.service.impl;

import ink.zerohua.springcloud.entities.CommonResult;
import ink.zerohua.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-31 14:01
 **/
//此标签必须
@Service
public class PaymentServiceImpl implements IPaymentService {
    @Override
    public CommonResult getCommonResult(Integer id) {
        return new CommonResult(404,"这个是fallback类里面");
    }
}
