package com.moments.up.models;






import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
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

@AllArgsConstructor


public class Climber {
    //Atributs
    private String title;
    private String description;
    private String url;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    //RELACIONS
    @ManyToOne
    @JoinColumn(name = "photographer_id")
    private User photographer;

    //COMMENT
    @OneToMany(mappedBy = "climber")
    @JsonIgnore //Evita bucles a les relacions
    private List<Comment> comments = new ArrayList<>();



    public void addComment(Comment comment) {
        this.comments.add(comment);
    }


//funció que retorna un int que retorna llista de comentaris i afegim @JasonSerialize pque ejecuti contador i pinti el que retorna //



    @JsonSerialize
    public int commentCount() {
        return this.comments.size();
    }
}