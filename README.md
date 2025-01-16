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
- **jjwt**: criação e manutenção de JWT (JSON Web Tokens)
- **Insomnia** (para testes de API)

---

## 🛠️ Funcionalidades

- **Login***: Simulação de autenticação de usuário com geração de token JWT.
- **Validação de Token**: Validação do JWT para garantir acesso seguro aos recursos.
- **Configuração de Segurança**: Controle de permissões com base em roles.

**Observação sobre o Login***: O projeto utiliza uma simulação de login no endpoint do `LoginController`. Atualmente, as credenciais são validadas diretamente no código (hardcoded) sem o uso de um banco de dados. Em implementações futuras, recomenda-se integrar um banco de dados para validação segura de usuários e credenciais.

---

## 🏁 Como Executar

### Pré-requisitos

1. **Java 21** instalado e configurado.
2. **Maven** instalado e configurado.

### Executando a Aplicação

1. Clone o repositório:
   ```bash
   git clone https://github.com/herik-da-silva/api-basica.git
   cd api-basica
   ```

2. Instale as dependências:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a API:
   - URL base: `http://localhost:8080`.

---

## 📝 Testando a Aplicação

Para testar a funcionalidade de login, utilize o comando `curl` abaixo ou ferramentas como Postman e Insomnia:

```bash
curl --request POST \
  --url http://localhost:8080/api/login \
  --header 'Content-Type: application/x-www-form-urlencoded' \
  --data username=teste \
  --data password=teste123
```

Se as credenciais forem válidas, você receberá um token JWT como resposta:
```json
{
  "token": "<seu-token-jwt>"
}
```

Use o token retornado para acessar recursos protegidos na aplicação.

---

## 🔧 Melhorias Futuras

1. Integrar com um banco de dados para validação de usuários.
2. Adicionar testes unitários para as classes principais.
3. Expandir as permissões e roles para cenários mais complexos.

---

## ✏️ Contribuições

Este é um projeto pessoal e educativo. Sugestões, melhorias e críticas construtivas são sempre bem-vindas!

