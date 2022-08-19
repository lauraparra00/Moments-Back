package com.moments.up.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LikeRequestDto {
    private Long climberId;
    private Long userId;
}
