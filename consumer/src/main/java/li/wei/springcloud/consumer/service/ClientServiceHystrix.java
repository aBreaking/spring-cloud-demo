package li.wei.springcloud.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ClientServiceHystrix implements ClientService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "failed ,in Hystrix" + name;
    }

    @Override
    public String say() {
        return "failed";
    }
}
