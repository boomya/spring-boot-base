package com.boom.base.service.impl;

import com.boom.base.domain.Member;
import com.boom.base.repository.mapper.MemberMapper;
import com.boom.base.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member findMemberByUid(String uid) throws Exception {
        return memberMapper.findMemberById(uid);
    }

}
