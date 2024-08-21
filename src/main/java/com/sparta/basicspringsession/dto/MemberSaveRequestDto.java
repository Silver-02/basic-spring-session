package com.sparta.basicspringsession.dto;

import lombok.Getter;

@Getter
public class MemberSaveRequestDto {

    private String name;   // id는 GeneratedValue이기 때문에 추가하지 않음
}
