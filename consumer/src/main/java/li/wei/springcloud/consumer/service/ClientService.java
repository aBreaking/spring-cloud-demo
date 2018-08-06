package li.wei.springcloud.consumer.service;

/*import org.springframework.cloud.netflix.feign.FeignClient;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*@FeignClient(name = "demo-provider",fallback = ClientServiceHystrix.class)*/
public interface ClientService {

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);

    @RequestMapping("/say")
    String say();

}
