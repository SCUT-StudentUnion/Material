package org.scutsu.materialmanagement.backend.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class InventoryNumberedRecord(
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    @Id
    @Column(length = 20)
    val number: String
): Serializable

@Entity
data class InventoryCountedRecord(
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    val count: Int
): Serializable

@Entity
data class UseApplicationNumberedRecord(
    @Id
    @ManyToOne
    val useApplication: UseApplication,
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    @Id
    @Column(length = 20)
    val number: String
): Serializable

@Entity
data class UseApplicationCountedRecord(
    @Id
    @ManyToOne
    val useApplication: UseApplication,
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    val count: Int
): Serializable

@Entity
data class ReturnNumberedRecord(
    @Id
    @ManyToOne
    val returnRecord: ReturnRecord,
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    @Id
    @Column(length = 20)
    val number: String
): Serializable

@Entity
data class ReturnCountedRecord(
    @Id
    @ManyToOne
    val returnRecord: ReturnRecord,
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    val count: Int
): Serializable

@Entity
data class InventoryCheckNumberedRecord(
    @Id
    @ManyToOne
    val inventoryCheck: InventoryCheck,
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    @Id
    @Column(length = 20)
    val number: String
): Serializable

@Entity
data class InventoryCheckCountedRecord(
    @Id
    @ManyToOne
    val inventoryCheck: InventoryCheck,
    @Id
    @ManyToOne
    val materialCategory: MaterialCategory,
    val count: Int
): Serializable
