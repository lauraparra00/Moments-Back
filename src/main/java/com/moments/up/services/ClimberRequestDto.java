package com.moments.up.services;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClimberRequestDto {

    private String title;
    private String description;
    private String url;
    private Long userId;
}
