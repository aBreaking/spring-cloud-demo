package li.wei.springcloud.consumer.controller;

import li.wei.springcloud.consumer.service.ClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ClientController {
    @Resource
    ClientService clientService;

    @RequestMapping("index")
    public String index(){
        String jack = clientService.say();
        return jack;
    }
    @RequestMapping("test/{name}")
    public String test(@PathVariable String name){
        String hello = clientService.hello(name);
        return hello;
    }
}

