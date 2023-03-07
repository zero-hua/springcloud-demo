package ink.zerohua.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud
 * @author: zerohua
 * @create: 2020-08-05 19:26
 **/
@Component
public class OderService implements IOderService {
    @Override
    public String oderInfoOk(Integer id) {
        return "This is OderService's fallback.";
    }

    @Override
    public String oderInfoTimeOut(Integer id) {
        return "This is OderService's fallback.";
    }
}
