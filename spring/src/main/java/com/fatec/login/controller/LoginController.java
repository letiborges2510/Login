package com.fatec.login.controller;

import com.example.domain.model.Login;
import com.fatec.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private LoginService service;

    @GetMapping("/login")
    public String realizarLogin() {
        return "login";
    }

    @PostMapping
    public ResponseEntity<Login> criar(@RequestBody Login login) {
        Login salvo = service.salvar(login);
        return ResponseEntity.ok(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Login> atualizar(@PathVariable String id, @RequestBody Login login) {
        Login atualizado = service.atualizar(id, login);
        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletar(@PathVariable String id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Login>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}