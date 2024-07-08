package io.timpac.bootvue.imgshop.member.dao;

import io.timpac.bootvue.imgshop.member.service.MemberRepository;
import io.timpac.bootvue.imgshop.member.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryAdapter implements MemberRepository {
    private final MemberJpaRepository memberJpaRepository;

    @Override
    public void setupAdmin(Member member) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUserId(member.getUserId());
        memberEntity.setUserName(member.getUserName());
        memberEntity.setUserPw(member.getUserPw());
        memberEntity.setJob(member.getJob());
        memberEntity.setCoin(member.getCoin());
        memberJpaRepository.save(memberEntity);
    }
}
