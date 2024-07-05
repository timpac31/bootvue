package io.timpac.bootvue.imgshop.member.controller;

import io.timpac.bootvue.imgshop.member.vo.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {

    @PostMapping("setup")
    ResponseEntity<String> setupAdmin(@RequestBody Member member) {
        System.out.println(member.getUserId());
        System.out.println(member.getUserName());

        return ResponseEntity.ok("created");
    }
}
