package com.moments.up.dtos;

import com.moments.up.models.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClimberResponseDto {
    private Long id;
    private String title;
    private String description;
    private String url;
    private User photographer;

    public int commentsCount;
    public int likesCount;
    private boolean isliked;
}
