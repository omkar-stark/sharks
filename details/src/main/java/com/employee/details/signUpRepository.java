package com.employee.details;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface signUpRepository extends JpaRepository<signUp, Long> {

    Optional<signUp> findByEmailId(String emailId);

    // boolean existsByEmail(String emailId);
    // If needed, you can declare custom queries here
}