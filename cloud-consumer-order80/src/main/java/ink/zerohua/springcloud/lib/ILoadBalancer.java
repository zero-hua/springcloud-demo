package ink.zerohua.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: springcloud
 * @description: f
 * @author: zerohua
 * @create: 2020-07-25 18:40
 **/
public interface ILoadBalancer {

    /**
    * @Description:  自建轮询算法，传入可用服务器集合，轮询算出本次“该用”的服务实例
    * @Param: 可用服务集合
    * @Return: 服务实例
    * @Author: zerohua
    * @Date: 2020/7/25 18:41
    */
    ServiceInstance serviceInstance(List<ServiceInstance> serviceInstances);

}
