package io.timpac.bootvue.imgshop.member.service;

import io.timpac.bootvue.imgshop.member.vo.Member;

public interface MemberRepository {
    void setupAdmin(Member member);
}
