# 📚 API REST Forum

API REST desenvolvida em Java com Spring Boot para gerenciamento de tópicos de um fórum.

Projeto focado em boas práticas de desenvolvimento backend, arquitetura em camadas e autenticação com Spring Security.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- Hibernate
- Banco de Dados Relacional (MySQL)
- MySQL Workbench 8.0 CE
- Maven
- Lombok
- Bean Validation (Jakarta Validation)
- Postman

---

## 🔐 Segurança

A aplicação utiliza Spring Security com:

- `UserDetailsService` personalizado
- `AuthenticationManager`
- Senhas criptografadas com `BCryptPasswordEncoder`
- API configurada como **STATELESS**
- Endpoint `/login` liberado para autenticação
- Demais endpoints protegidos

---

## 🏗️ Arquitetura

O projeto segue arquitetura em camadas:

- **Controller** → Recebe requisições HTTP
- **Service** → Regras de negócio
- **Repository** → Acesso ao banco de dados (JPA)
- **Entity** → Mapeamento das tabelas
---
### Relacionamentos principais:

- Usuário ↔ Perfil
- Tópico ↔ Usuário
- Tópico ↔ Curso

---

## 📌 Funcionalidades

✔ Cadastro de usuários  
✔ Autenticação de usuário  
✔ Criação de tópicos  
✔ Listagem de tópicos  
✔ Busca por ID  
✔ Relacionamentos entre entidades  
✔ Validação de dados  
✔ API Stateless  

---

## ▶️ Como Executar o Projeto

### ✅ Pré-requisitos

Certifique-se de ter instalado:

- Java 17 ou superior
- Maven 3.8+
- MySQL 8+
- Git (opcional)

---

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-usuario/api-rest-forum.git
cd api-rest-forum
```

2️⃣ Criar o banco de dados no MySQL

Acesse o MySQL e execute:

```CREATE DATABASE forum;```

3️⃣ Configurar o `application.properties`

Edite o arquivo:

src/main/resources/application.properties


Configure a conexão:

```spring.datasource.url=jdbc:mysql://localhost:3306/forum
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
4️⃣ Instalar dependências e compilar
```mvn clean install```

5️⃣ Executar a aplicação
```mvn spring-boot:run```


Ou utilizando o Maven Wrapper:

```./mvnw spring-boot:run```

🚀 A aplicação estará disponível em:
```http://localhost:8080```


---

# 🔎 Observação 

- O `ddl-auto=update` cria/atualiza automaticamente as tabelas.
- Certifique-se de que o MySQL esteja rodando antes de iniciar a aplicação.
- Caso a porta 3306 esteja diferente, ajuste na URL do datasource.

---
---
### 📂 Estrutura do Projeto
src/main/java<br>
📂controller<br>
📂service<br>
📂repository<br>
📂entity <br>
📂config
---
### 📖 Conceitos Aplicados

- Injeção de Dependência

- RESTful API

- Criptografia de senha

- Spring Security 6

- Stateless Session

- Separação de responsabilidades

- Uso de DTO para entrada e saída de dados

---
---
## 👨‍💻 Autor

Desenvolvido por MauricioE  
Projeto criado para prática de desenvolvimento de APIs REST com Spring Boot e aplicação de conceitos de segurança com Spring Security.

