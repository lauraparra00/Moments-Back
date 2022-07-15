package com.moments.up.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table (name = "climber")
@NoArgsConstructor
@AllArgsConstructor
public class Climber {
    private String title;
    private String description;
    private String url;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "fotographer_id")
    private User fotographer;
    @OneToMany(mappedBy = "climber")
    private List<Comment> comments = new ArrayList<>();
//funció que retorna un int que retorna llista de comentaris i afegim @JasonSerialize pque ejecuti contador i pinti el que retorna //
    @JsonSerialize
    public int commentCount() {
        return this.comments.size();
    }
}