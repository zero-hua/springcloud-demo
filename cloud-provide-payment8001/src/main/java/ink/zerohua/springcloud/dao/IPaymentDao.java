package ink.zerohua.springcloud.dao;

import ink.zerohua.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud
 * @description: f
 * @author: zerohua
 * @create: 2020-07-16 17:55
 **/
@Mapper
@Component
public interface IPaymentDao {

   public int create(Payment payment);

   public Payment getPaymentById(Integer id);

}
