package com.fatec.login.repository;

import com.fatec.login.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface LoginRepository extends MongoRepository<Login, String> {

    // Busca um usuário pelo username
    // O Spring cria automaticamente a query com base no nome do método
    // Retorna Optional para evitar erro caso não encontre resultado
    Optional<Login> findByUsername(String username);

    // Busca um usuário pelo email
    // Também gerado automaticamente pelo Spring Data
    Optional<Login> findByEmail(String email);
}