package com.forezp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author 芦苇
 * @Date 2019/3/11.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
