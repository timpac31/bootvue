package io.timpac.bootvue.imgshop.member.service;

import io.timpac.bootvue.imgshop.member.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void setupAdmin(Member member) {
        member.setJob("00");
        member.setCoin(0);
        memberRepository.setupAdmin(member);
    }
}
