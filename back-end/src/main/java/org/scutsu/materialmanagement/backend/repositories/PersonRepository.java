package org.scutsu.materialmanagement.backend.repositories;

import org.scutsu.materialmanagement.backend.models.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
