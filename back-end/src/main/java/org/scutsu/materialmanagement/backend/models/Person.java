package org.scutsu.materialmanagement.backend.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull
    private String name;

    @ManyToOne
    private Organization organization;

    @ElementCollection
    private List<PersonMetadata> metadata = new ArrayList<>();
}

@Data
@Embeddable
class PersonMetadata {

    @ManyToOne
    private PersonMetadataType type;

    private String value;
}
