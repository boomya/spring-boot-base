package com.boom.base.service.remote;

import com.boom.base.repository.domain.Member;
import com.boom.base.service.local.MemberService;
import com.boom.base.share.dto.MemberDTO;
import com.boom.base.share.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jiangshan on 16/6/16.
 */
public class HomePageServiceImpl implements HomePageService {

    @Autowired
    private MemberService memberService;

    @Override
    public MemberDTO getMemberById(String id) {
        MemberDTO memberDTO = new MemberDTO();
//        memberDTO.setId("100");
//        memberDTO.setName("test");

        try {
            Member member = memberService.findMemberByUid(id);
            memberDTO.setId(member.getId());
            memberDTO.setName(member.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return memberDTO;
    }
}
