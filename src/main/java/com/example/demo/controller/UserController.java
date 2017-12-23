package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService mUserService;

    @RequestMapping("/queryUserInfo")
    @ResponseBody
    public Map QueryUserInfo(@RequestBody Map<String, Object> param ){
        int id  = Integer.valueOf(param.get("id").toString());
        return mUserService.queryUserInfo(id);
    }
}
