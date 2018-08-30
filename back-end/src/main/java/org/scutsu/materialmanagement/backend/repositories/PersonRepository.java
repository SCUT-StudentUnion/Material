package org.scutsu.materialmanagement.backend.repositories;

import org.scutsu.materialmanagement.backend.models.Person;
import org.scutsu.materialmanagement.backend.models.PersonProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = PersonProjection.class, path = "people", collectionResourceRel = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
