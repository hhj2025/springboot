package kr.soft.shopping.service;

import kr.soft.shopping.dto.member.MemberLoginDTO;
import kr.soft.shopping.dto.member.MemberRegisterDTO;
import kr.soft.shopping.mapper.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public void register(MemberRegisterDTO memberRegisterDTO){
        memberMapper.register(memberRegisterDTO);
    }

    public boolean login(String userId){
        MemberLoginDTO memberLoginDTO = memberMapper.login(userId);
        log.info("memberLoginDTO ok = {}", memberLoginDTO);
        log.info("loginService ok = {}", memberLoginDTO == null ?  false : true);
        return memberLoginDTO == null ?  false : true;
    }
}
