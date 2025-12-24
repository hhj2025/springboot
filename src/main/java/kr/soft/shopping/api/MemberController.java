package kr.soft.shopping.api;

import kr.soft.shopping.dto.member.MemberLoginDTO;
import kr.soft.shopping.dto.member.MemberRegisterDTO;
import kr.soft.shopping.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/member")
public class MemberController {

    @Autowired
    private MemberService memberService;


    @PostMapping("/register")
    public void register(@RequestBody MemberRegisterDTO memberRegisterDTO) {
        memberService.register(memberRegisterDTO);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Map<String, String> body) {
        String userId = body.get("userId");
        boolean ok = memberService.login(userId);

        log.info("받은 userId='{}' len={}", userId, userId == null ? null : userId.length());


        log.info("login ok = {}", ok);
        return ok;
    }
}
