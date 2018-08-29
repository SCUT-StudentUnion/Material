package org.scutsu.materialmanagement.backend.models

import java.io.Serializable
import javax.persistence.*

@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val name: String,

    @ManyToOne
    val organization: Organization,

    @ElementCollection
    val metadata: List<PersonMetadata> = ArrayList()
)

@Entity
data class PersonMetadataType(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false)
    val name: String
)

@Embeddable
data class PersonMetadata(
    @ManyToOne
    val type: PersonMetadataType,

    val value: String
): Serializable
