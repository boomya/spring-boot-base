package com.boom.base.service;

import com.boom.base.repository.domain.Member;

public interface MemberService {

    Member findMemberByUid(String uid) throws Exception;

}
