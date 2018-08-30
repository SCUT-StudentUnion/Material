package org.scutsu.materialmanagement.backend.models

import java.util.*
import javax.persistence.*

@Entity
data class UseApplication(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val approvedTime: Date,

    @ManyToOne
    val approvedBy: User,

    @ManyToOne
    val applicant: Person
) {
}
