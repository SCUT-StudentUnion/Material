package org.scutsu.materialmanagement.backend.models

import java.util.*
import javax.persistence.*

@Entity
data class InventoryCheck(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne
    val handledBy: User,

    val checkTime: Date
){
}
