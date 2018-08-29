package org.scutsu.materialmanagement.backend.models

import javax.persistence.*

@Entity
data class Organization(
    @Column(nullable = false)
    val name: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
) {
}
