package org.scutsu.materialmanagement.backend.repositories

import org.scutsu.materialmanagement.backend.models.Person
import org.scutsu.materialmanagement.backend.models.PersonMetadata
import org.scutsu.materialmanagement.backend.models.PersonMetadataType
import org.springframework.data.repository.CrudRepository

interface PersonRepository: CrudRepository<Person, Long> {
}

interface PersonMetadataTypeRepository: CrudRepository<PersonMetadataType, Long> {
}
