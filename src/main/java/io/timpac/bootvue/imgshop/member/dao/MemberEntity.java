package io.timpac.bootvue.imgshop.member.dao;

import io.timpac.bootvue.imgshop.common.entity.DateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="member")
@Getter
@Setter
public class MemberEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;
    private String userId;
    private String userName;
    private String userPw;
    private String job;
    private int coin;
    @Embedded
    private DateEntity dateEntity;
}
