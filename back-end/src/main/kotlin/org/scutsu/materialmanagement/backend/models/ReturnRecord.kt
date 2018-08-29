package org.scutsu.materialmanagement.backend.models

import java.util.*
import javax.persistence.*

@Entity
data class ReturnRecord(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(optional = false)
    val useApplication: UseApplication,

    @ManyToOne
    val handledBy: User,

    val returnTime: Date
) {
}
