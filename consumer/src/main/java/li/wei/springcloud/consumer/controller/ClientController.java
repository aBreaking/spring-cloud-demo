package li.wei.springcloud.consumer.controller;

import li.wei.springcloud.consumer.service.ClientService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ClientController {

    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;

    @RequestMapping("/ds")
    public String ds(){
        return "测试环境数据源连接信息：url:"+url+",username:"+username+",password:"+password;
    }



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

