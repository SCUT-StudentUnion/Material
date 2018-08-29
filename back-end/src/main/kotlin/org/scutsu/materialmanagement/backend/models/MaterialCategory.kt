package org.scutsu.materialmanagement.backend.models

import javax.persistence.*

@Entity
data class MaterialCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val name: String
){}
