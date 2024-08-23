package com.sparta.basicspringsession.dto;

public class MemberSimpleResponseDto {
    private final Long id;
    private final String name;

    public MemberSimpleResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
