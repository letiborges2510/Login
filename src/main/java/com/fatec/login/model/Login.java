package com.fatec.login.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "accounts")
public class Login {

    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private List<String> roles;

    // construtor vazio (obrigatório para o Mongo)
    public Login(){}

    // construtor correto
    public Login(String username, String password, String email, List<String> roles){
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
    }

    // GETTERS E SETTERS
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
}