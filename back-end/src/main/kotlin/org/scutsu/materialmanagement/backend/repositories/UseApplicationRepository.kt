package org.scutsu.materialmanagement.backend.repositories

import org.scutsu.materialmanagement.backend.models.UseApplication
import org.springframework.data.repository.CrudRepository

interface UseApplicationRepository : CrudRepository<UseApplication, Long>
