# Projeto de Segurança com JWT

Este é um projeto básico para demonstrar a implementação de segurança utilizando JSON Web Tokens (JWT) em uma aplicação Java com Spring Boot.

---

## 🚀 Objetivo do Projeto

O objetivo é apresentar uma estrutura simples para autenticação e autorização utilizando JWT, incluindo as seguintes funcionalidades:

- Configuração de permissões para roles específicas.
- Simulação de login para autenticação e geração de tokens JWT.
- Validação de tokens para acesso seguro aos recursos da aplicação.

---

## ⚙️ Tecnologias Utilizadas

- **Java**: versão 21.
- **Spring Boot**: versão 3.3.4.
- **Spring Security**: para controle de autenticação e autorização.
- **H2 Database**: banco de dados em memória para armazenamento temporário de dados.
- **jjwt**: criação e manutenção de JWT (JSON Web Tokens)
- **Insomnia** (para testes de API)

---

## 🛠️ Funcionalidades

- **Registro de Usuário**: Permite que novos usuários sejam registrados no sistema.
- **Login***: Autenticação com credenciais e geração de token JWT.
- **Validação de Token**: Validação do JWT para garantir acesso seguro aos recursos.
- **Configuração de Segurança**: Controle de permissões com base em roles.

---

## 🏁 Como Executar

### Pré-requisitos

1. **Java 21** instalado e configurado.
2. **Maven** instalado e configurado.

### Executando a Aplicação

1. Clone o repositório:
   ```bash
   git clone https://github.com/herik-da-silva/personaapi.git
   cd personaapi
   ```

2. Defina a variável de ambiente `JWT_SECRET`:
   - No Linux, adicione a variável de ambiente no terminal antes de executar a aplicação:
     ```bash
     export JWT_SECRET="sua_chave_secreta_super_segura"
     ```
   - Você pode verificar se a variável foi configurada corretamente com:
     ```bash
     echo $JWT_SECRET
     ```

3. Instale as dependências:
   ```bash
   mvn clean install
   ```

4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse a API:
   - URL base: `http://localhost:8080`.

---

## 📝 Testando a Aplicação

1. Registro de Usuário
   - Para registrar um novo usuário, utilize o comando `curl` abaixo ou ferramentes como Postman e Insomnia:
   ```bash
   curl --request POST \
     --url http://localhost:8080/auth/register \
     --header 'Content-Type: application/x-www-form-urlencoded' \
     --data username=teste \
     --data password=123
   ```
   Se o registro for bem-sucedido, você receberá uma resposta com status `201 Created`.

2. Login de Usuário
   - Para autenticar um usuário, utilize o comando `curl` abaixo:
   ```bash
   curl --request POST \
     --url http://localhost:8080/auth/login \
     --header 'Content-Type: application/x-www-form-urlencoded' \
     --data username=teste \
     --data password=123
   ```
   Se as credenciais forem válidas, você receberá uma resposta com um token JWT:
   ```bash
   {
     "token": "<seu-token-jwt>"
   }
   ```

3. Acessando Recursos Protegidos
   - Use o token retornado para acessar endpoints protegidos. Inclua o token no cabeçalho da requisição:
   ```bash
   curl --request GET \
     --url http://localhost:8080/protected/resource \
     --header 'Authorization: Bearer <seu-token-jwt>'
   ```
   Se o token for válido, você terá acesso ao recurso solicitado.

---

## ✏️ Contribuições

Este é um projeto pessoal e educativo. Sugestões, melhorias e críticas construtivas são sempre bem-vindas!

