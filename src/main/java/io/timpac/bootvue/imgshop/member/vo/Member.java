package io.timpac.bootvue.imgshop.member.vo;

import lombok.Data;

@Data
public class Member {
    private String userId;
    private String userName;
    private String userPw;
    private String job;
    private int coin;
}
