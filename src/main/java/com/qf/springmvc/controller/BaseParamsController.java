package com.qf.springmvc.controller;

import com.qf.springmvc.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseParamsController {
    @GetMapping("/test01")
    @ResponseBody
    public String test1(String username,int id){
        System.out.println(username);
        System.out.println(id);
        return username;

    }

    public String test2(UserDto userDto){
        System.out.println(userDto);
        return "返回路径";
    }

}
