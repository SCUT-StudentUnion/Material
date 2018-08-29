package org.scutsu.materialmanagement.backend

import org.scutsu.materialmanagement.backend.models.Organization
import org.scutsu.materialmanagement.backend.models.User
import org.scutsu.materialmanagement.backend.repositories.OrganizationRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.scutsu.materialmanagement.backend.repositories.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean


@SpringBootApplication
class Application {
    @Bean
    fun test(userRepository: UserRepository, organizationRepository: OrganizationRepository) = CommandLineRunner{ _ ->
        userRepository.save(User("David"))
        userRepository.save(User("Amy"))
        organizationRepository.save(Organization("AAA"))
        organizationRepository.save(Organization("BBB"))
    }

}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
