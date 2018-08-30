package org.scutsu.materialmanagement.backend.repositories;

import org.scutsu.materialmanagement.backend.models.InventoryCheck;
import org.springframework.data.repository.CrudRepository;

public interface InventoryCheckRepository extends CrudRepository<InventoryCheck, Long> {
}
