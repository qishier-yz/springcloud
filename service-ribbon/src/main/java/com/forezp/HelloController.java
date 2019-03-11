package com.forezp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/3/11.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public  String getHello(@RequestParam String name){
        return helloService.hiService( name );
    }
}
