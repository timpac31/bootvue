package io.timpac.bootvue.imgshop.member.controller;

import io.timpac.bootvue.imgshop.member.service.MemberService;
import io.timpac.bootvue.imgshop.member.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("setup")
    ResponseEntity<String> setupAdmin(@RequestBody Member member) {
        memberService.setupAdmin(member);
        return ResponseEntity.ok("created");
    }
}
