package com.moments.up.models;






import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Criteria;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table (name = "climber")
@NoArgsConstructor

public class Climber {
    //Atributs
    private String title;
    private String description;
    private String url;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    //Relacions
    @ManyToOne
    @JoinColumn(name = "fotographer_id")
    private User fotographer;

    //Comment
    @OneToMany(mappedBy = "climber")
    @JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private List<Comment> comments = new ArrayList<>();


//funció que retorna un int que retorna llista de comentaris i afegim @JasonSerialize pque ejecuti contador i pinti el que retorna //



    @JsonSerialize
    public int commentCount() {
        return this.comments.size();
    }
}