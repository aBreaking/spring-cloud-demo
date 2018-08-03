package li.wei.springboot.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Value("${server.port}")
    String port;

    @RequestMapping("say")
    public String say(){
        return "hello world";
    }

    @RequestMapping("hello")
    public String hello(@RequestParam String name){
        return "hello "+name+",port is "+port;
    }



}