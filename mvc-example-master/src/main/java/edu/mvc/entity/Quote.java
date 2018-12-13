package edu.mvc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private String text;

    @ManyToOne
    @JoinColumn(name = "theme_id")
    private Theme theme;

}
