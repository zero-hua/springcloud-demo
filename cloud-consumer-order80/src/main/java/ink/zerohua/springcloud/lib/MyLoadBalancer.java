package ink.zerohua.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-07-25 19:40
 **/
public class MyLoadBalancer implements ILoadBalancer {

    private AtomicInteger atomicInteger;

    public MyLoadBalancer(){
        atomicInteger = new AtomicInteger(0);
    }

    @Override
    public ServiceInstance serviceInstance(List<ServiceInstance> serviceInstances) {

        return null;
    }

    public int getIndex(){
        return 0;
    }

    public int getInt(){
        return atomicInteger.intValue();
    }

    public void setInt(int value){
        atomicInteger.set(value);
    }
}
