package com.boom.base.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.boom.base.client.ServiceLocator;
import com.boom.base.share.service.HomePageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiangshan on 16/4/22.
 */
@Controller
public class HelloWorldController extends BaseController {

    private static final Logger logger = LoggerFactory
            .getLogger(HelloWorldController.class);

//    @Autowired
//    private MemberService memberService;

    private HomePageService homePageService = ServiceLocator.getHomePageService();

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {
        try {
//            return memberService.findMemberByUid("1").getName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //http://localhost:9090/boom/json
    @RequestMapping("/json/{id}")
    @ResponseBody
    public String helloWorldJSON(@PathVariable String id) {
        String result = null;
        try {
//            result = memberService.findMemberByUid("1").getName();
            result = homePageService.getMemberById(id).getName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", result);
        return jsonObject.toString();
    }

    @RequestMapping("/jump")
    public String helloRedirect() {
        return "redirect:json";
    }
}
