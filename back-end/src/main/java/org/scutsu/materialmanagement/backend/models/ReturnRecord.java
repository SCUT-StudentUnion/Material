package org.scutsu.materialmanagement.backend.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class ReturnRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User handledBy;

    private Date returnTime;

    @OneToMany(mappedBy = "returnRecord")
    private List<ReturnCountedRecord> countedRecords = new ArrayList<>();

    @OneToMany(mappedBy = "returnRecord")
    private List<ReturnNumberedRecord> numberedRecords = new ArrayList<>();
}

@Entity
@Data
class ReturnNumberedRecord implements Serializable {
    @Id
    @ManyToOne
    private ReturnRecord returnRecord;

    @Id
    @ManyToOne
    private MaterialCategory materialCategory;

    @Id
    @Column(length = 20)
    private String number;
}

@Entity
@Data
class ReturnCountedRecord implements Serializable {
    @Id
    @ManyToOne
    private ReturnRecord returnRecord;

    @Id
    @ManyToOne
    private MaterialCategory materialCategory;

    @Column(nullable = false)
    private int count;
}
