package edu.mvc.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=3, max=30)
    private String title;

    @NotNull
    @Size(min = 10, max=255)
    private String description;

    @OneToMany(mappedBy="theme", cascade = CascadeType.ALL)
    private Set<Quote> quotes;

}
