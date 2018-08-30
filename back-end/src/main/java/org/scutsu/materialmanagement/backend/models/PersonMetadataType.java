package org.scutsu.materialmanagement.backend.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class PersonMetadataType {
    @Id
    @Column(length = 20)
    private String name;
}
