package org.scutsu.materialmanagement.backend.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class UseApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date approvedTime;

    @ManyToOne
    private User approvedBy;

    @ManyToOne
    private Person applicant;

}

@Entity
@Data
class UseApplicationNumberedRecord implements Serializable {
    @Id
    @ManyToOne
    private UseApplication useApplication;

    @Id
    @ManyToOne
    private MaterialCategory materialCategory;

    @Id
    @Column(length = 20)
    private String number;
}

@Entity
@Data
class UseApplicationCountedRecord implements Serializable {
    @Id
    @ManyToOne
    private UseApplication useApplication;

    @Id
    @ManyToOne
    private MaterialCategory materialCategory;

    @Column(nullable = false)
    private int count;
}
