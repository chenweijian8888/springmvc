package com.qf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestParamController {

    @GetMapping("/test")
    @ResponseBody   //自动生成JSON数据

    public String test1(@RequestParam("user_name") String username){
        System.out.println(username);
        return "requestparam注解使用";
    }

    //required   必传参数,表示前端一定要传这个参数进来,默认为true;
    //defaultvalue     给参数一个默认值,(类似于实参的作用)
    //value 表示传进来的参数名字和实际不一样,可以使用,或者直接写,传进来的名字写前面

    public String test2(@RequestParam(value = "username", required = false) String name,
            @RequestParam(required = false,defaultValue = "1")int page,
        @RequestParam(required = false,defaultValue = "10")int size){
        System.out.println(page);
        System.out.println(size);
        return "使用方法";
    }
}
