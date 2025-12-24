package kr.soft.shopping.mapper;

import kr.soft.shopping.dto.member.MemberLoginDTO;
import kr.soft.shopping.dto.member.MemberRegisterDTO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MemberMapper {

    void register(MemberRegisterDTO memberRegisterDTO);

    MemberLoginDTO login(String userId);

}
