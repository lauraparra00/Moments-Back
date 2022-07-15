package com.moments.up.dtos;

import lombok.Data;

@Data
public class CommentRequestDto {
    private String comment;
    private Long climberId;

}
