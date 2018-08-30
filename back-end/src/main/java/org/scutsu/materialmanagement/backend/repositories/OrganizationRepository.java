package org.scutsu.materialmanagement.backend.repositories;

import org.scutsu.materialmanagement.backend.models.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<Organization, Long> {
}
