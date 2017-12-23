package com.example.demo.service;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Person;
import com.example.demo.model.PersonExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    public PersonMapper mPersonMapper;


    public Map queryUserInfo(Integer id) {
        System.out.println(id);
        Person person =  mPersonMapper.selectByPrimaryKey(id);
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("result", person);
        resMap.put("id", person.getId());
        resMap.put("Name", person.getName());
        resMap.put("Description", person.getDescription());
        System.out.println(resMap.toString());
        return resMap;
    }

}
