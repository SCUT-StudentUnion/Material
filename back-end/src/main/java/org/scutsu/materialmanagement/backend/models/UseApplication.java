package org.scutsu.materialmanagement.backend.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "useApplication")
    private List<UseApplicationCountedRecord> countedRecords = new ArrayList<>();

    @OneToMany(mappedBy = "useApplication")
    private List<UseApplicationNumberedRecord> numberedRecords = new ArrayList<>();
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
