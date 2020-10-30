package com.qf.springmvc.controller;

import com.qf.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //@GetMapping("/List")
    //value写请求路径      method写请求方式
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<User>users(){
        return new ArrayList<>();

    }

    //@GetMapping("/user")//这里是url窗口的路径
    @RequestMapping(value = "/info",params ="id>1")
    @ResponseBody
    public User user(int id){
        return new User();
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = "application/json")
    public String save(){
        return "";
    }


}


//params    指定参数必须符合条件
/*
### 联合使用 value、method、params
 注解的value、method、params及headers分别指定“请求的URL、请求方法、请求参数及请求头”。
 它们之间是与的关系，联合使用会使得请求的映射更加精细。*/
