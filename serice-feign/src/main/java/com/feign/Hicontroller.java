package com.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hicontroller
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/3/11.
 */
@RestController
public class Hicontroller {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping(value = "/hi")
    public String  sayHi(@RequestParam String name){
        return schedualServiceHi.sayHifromClientOne(name);
    }
}
