package com.fatec.login.repository;

import com.example.domain.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface LoginRepository extends MongoRepository<Login, String> {
    Optional<Login> findByUsername(String username);
    Optional<Login> findByEmail(String email);
}