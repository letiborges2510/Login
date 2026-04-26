package com.fatec.login.controller;

import com.fatec.login.model.Login;
import com.fatec.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts") // Define a rota base → todas as requisições começam com /accounts
@CrossOrigin("*")
public class LoginController {

    // Injeta automaticamente o LoginService
    @Autowired
    private LoginService service;

    // Endpoint simples de teste de login
    // GET /accounts/login
    @GetMapping("/login")
    public String realizarLogin() {
        return "login";
    }

    @PostMapping // Endpoint para criar um novo usuário/login
    public ResponseEntity<Login> criar(@RequestBody Login login) {
        Login salvo = service.salvar(login);     // Salva os dados no banco através do service
        return ResponseEntity.ok(salvo);
    }

    @PutMapping("/{id}")     // Endpoint para atualizar um login existente
    public ResponseEntity<Login> atualizar(@PathVariable String id, @RequestBody Login login) {
        Login atualizado = service.atualizar(id, login);
        if (atualizado != null) {         // Verifica se encontrou o registro
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")     // Endpoint para deletar um login
    public ResponseEntity<Object> deletar(@PathVariable String id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping         // Retorna lista com status 200
    public ResponseEntity<List<Login>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}