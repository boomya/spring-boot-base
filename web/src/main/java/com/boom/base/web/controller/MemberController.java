package com.boom.base.web.controller;

import com.boom.base.domain.Member;
import com.boom.base.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/member/{memberId}")
    Member findMemberByMemberId(@PathVariable("memberId") String memberId) throws Exception {
        return memberService.findMemberByUid(memberId);
    }

}
