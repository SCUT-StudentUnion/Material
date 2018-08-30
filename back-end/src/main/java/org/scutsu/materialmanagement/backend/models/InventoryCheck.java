package org.scutsu.materialmanagement.backend.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class InventoryCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User handledBy;

    private Date checkTime;

    @OneToMany(mappedBy = "inventoryCheck")
    private List<InventoryCheckCountedRecord> countedRecords = new ArrayList<>();

    @OneToMany(mappedBy = "inventoryCheck")
    private List<InventoryCheckNumberedRecord> numberedRecords = new ArrayList<>();
}

@Entity
@Data
class InventoryCheckNumberedRecord implements Serializable {
    @Id
    @ManyToOne
    private InventoryCheck inventoryCheck;

    @Id
    @ManyToOne
    private MaterialCategory materialCategory;

    @Id
    @Column(length = 20)
    private String number;
}

@Entity
@Data
class InventoryCheckCountedRecord implements Serializable {
    @Id
    @ManyToOne
    private InventoryCheck inventoryCheck;

    @Id
    @ManyToOne
    private MaterialCategory materialCategory;

    @Column(nullable = false)
    private int count;
}
