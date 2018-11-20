package com.summer.left.sakila.controller;

import com.summer.left.sakila.mapper.CustomerListMapper;
import com.summer.left.sakila.mapper.CustomerMapper;
import com.summer.left.sakila.model.CustomerListExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerListExample customerListExample;
    private CustomerMapper customerMapper;
    @Autowired
    private CustomerListMapper customerListMapper;


    @RequestMapping(value = {"/customer/register"}, produces = "application/json;charset=utf-8", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public HashMap register(String userName, String password, Integer platform) {

        HashMap resultMap = new  HashMap<String,Integer>();
        resultMap.put("result",1);
        return resultMap;
    }
    @RequestMapping(value = {"/customer/list"}, produces = "application/json;charset=utf-8", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List list() {
        customerListExample = new CustomerListExample();
        customerListExample.createCriteria().andIdGreaterThan((short) 1);
        //customerListExample.createCriteria().andIdIsNull();
        List list = customerListMapper.selectByExample(customerListExample);
        return list;

    }
}
