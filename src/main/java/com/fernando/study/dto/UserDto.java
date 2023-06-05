package com.fernando.study.dto;

public record UserDto(Long id, String name,
        String cpf, String email, String birth) {
}
