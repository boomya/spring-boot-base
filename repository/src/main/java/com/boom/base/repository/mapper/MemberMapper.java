package com.boom.base.repository.mapper;

import com.boom.base.domain.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface MemberMapper {
    Member findMemberById(@Param("id") String id) throws Exception;
}
