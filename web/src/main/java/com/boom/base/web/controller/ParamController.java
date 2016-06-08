package com.boom.base.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.boom.base.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by jiangshan on 16/4/22.
 */
@RestController
@RequestMapping("/param")
public class ParamController {

    @Autowired
    private MemberService memberService;

    //http://localhost:9090/boom/param/single/1?name=test
    @RequestMapping(value = "/single/{age}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable int age, @RequestParam(value = "name", required = false) String name) {
        try {
            return memberService.findMemberByUid("1").getName() + " " + name + " " + age;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //http://127.0.0.1:9090/boom/param/posts
    //body: {"result":{"name":"test","age":11}}
    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public String helloWorldJSON(@RequestBody Map<String, Object> map) {
        System.out.println("RequestBody:" + map.toString());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", map);
        return jsonObject.toString();
    }

    @RequestMapping("/jump")
    public String helloRedirect() {
        return "redirect:json";
    }
}
