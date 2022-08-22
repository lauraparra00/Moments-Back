package com.moments.up.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "likes")
@NoArgsConstructor
public class Like {
    public Like(User liker, Climber climber) {
        this.liker = liker;
        this.climber = climber;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "liker_id")
    @JsonIgnore
    private User liker;

    @ManyToOne
    @JoinColumn(name = "climber_id")
    @JsonIgnore
    private Climber climber;
}
