package org.scutsu.materialmanagement.backend.repositories

import org.scutsu.materialmanagement.backend.models.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {
}
