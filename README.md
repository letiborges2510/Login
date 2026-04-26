# API de Login - Spring Boot + MongoDB

Este módulo é responsável pelo gerenciamento de usuários e autenticação básica dentro da arquitetura de microsserviços do sistema.

Ele permite o cadastro, listagem, atualização e remoção de contas, além de consultas por **username** e **email**.

---

##  Objetivo

Implementar um serviço de autenticação e gerenciamento de usuários, utilizando boas práticas de desenvolvimento backend com Spring Boot e integração com MongoDB.

---

##  Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Spring Data MongoDB
* Lombok
* MongoDB

---

##  Estrutura do Módulo

```bash
com.fatec.login
│
├── controller     # Recebe as requisições HTTP
├── service        # Regras de negócio
├── repository     # Acesso ao banco de dados
├── model          # Representação dos dados (Login)
└── LoginApplication.java
```

---

##  Funcionalidades

✔️ Cadastro de usuário
✔️ Listagem de contas
✔️ Atualização de dados
✔️ Remoção de usuário
✔️ Busca por username
✔️ Busca por email

---

##  Endpoints

###  Criar Conta

POST /accounts

```json
{
  "username": "usuario123",
  "email": "usuario@email.com",
  "password": "123456",
  "roles": ["USER"]
}
```

---

### Post Cliente 

<img width="915" height="723" alt="post-cliente" src="https://github.com/user-attachments/assets/50210752-ff41-4d6b-ab11-6f8d511aecec" />


---

###  Token Login

<img width="938" height="767" alt="token-login" src="https://github.com/user-attachments/assets/51c56d26-c6fc-4827-bbbc-4dbfe1e39c1d" />


---


---

###  Buscar por Username (uso interno/service)

```java
findByUsername(String username)
```

---

###  Buscar por Email (uso interno/service)

```java
findByEmail(String email)
```

---

##  Observações sobre autenticação

* O endpoint `/accounts/login` atualmente é utilizado apenas para teste de disponibilidade.
* A autenticação pode ser evoluída com:

  * Validação de credenciais (email/senha)
  * Criptografia de senha (BCrypt)
  * Uso de JWT para segurança

---

##  Integração com o Sistema

Este projeto foi desenvolvido como atividade avaliativa, contemplando a construção de uma arquitetura baseada em microsserviços, dividida em diferentes módulos:

* 🧑‍💼 Cliente → gerenciamento de clientes
* 🔐 Login → autenticação de usuários
* 📦 Produto → controle de produtos
* 🌐 Gateway → centralização das requisições e roteamento entre serviços

---

## Arquitetura do Projeto

A aplicação segue o padrão de microsserviços, onde cada módulo possui sua responsabilidade específica, promovendo:

* Separação de responsabilidades
* Escalabilidade
* Organização do código
* Facilidade de manutenção

O **Gateway** atua como ponto de entrada único, direcionando as requisições para os serviços correspondentes.

---

##  Autoras

* **Yasmin Oliveira**
* **Letícia Borges**

---

##  Considerações Finais

Este módulo demonstra a implementação de um serviço de autenticação básico, com potencial de evolução para um sistema mais seguro e robusto utilizando padrões modernos de segurança.

---



