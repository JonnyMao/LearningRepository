package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*
    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;*/

    /*
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
       // return this.cupSize + this.age;
        return this.girlProperties.getCupSize() + this.girlProperties.getAge();
    }*/
}
