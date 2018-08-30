package org.scutsu.materialmanagement.backend.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull
    private String name;

    @OneToMany(mappedBy = "organization")
    private List<Person> people = new ArrayList<>();
}
