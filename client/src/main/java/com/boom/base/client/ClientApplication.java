package com.boom.base.client;

import com.boom.base.share.dto.MemberDTO;
import com.boom.base.share.service.HomePageService;

/**
 * Created by jiangshan on 16/6/7.
 */
public class ClientApplication {

    public static void main(String[] args) throws Exception {
        HomePageService homePageService = ServiceLocator.getHomePageService();
        MemberDTO memberDTO = homePageService.getMemberById("1");
        System.out.println("===:" + memberDTO.getName() + " " + memberDTO.getId());
    }
}
