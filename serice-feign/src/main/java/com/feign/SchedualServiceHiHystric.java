package com.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName SchedualServiceHiHystric
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/3/11.
 */
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{
    @Override
    public String sayHifromClientOne(@RequestParam(value = "name") String name) {
        return "sorry"+name;
    }
}
