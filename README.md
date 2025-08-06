# Agenda de Contatos - API REST

Este é um projeto simples de uma API REST para gerenciar contatos, desenvolvido para praticar os conceitos básicos do framework **Spring Boot** e da linguagem **Java**. Para o armazenamento e persistência dos dados, o projeto utiliza um **banco de dados SQL**.

-----

## Funcionalidades da API

A API oferece os seguintes endpoints para a manipulação de contatos:

| Método HTTP | Endpoint           | Descrição                                 |
| :---------- | :----------------- | :---------------------------------------- |
| `GET`       | `/contacts`        | Lista todos os contatos.                  |
| `GET`       | `/contacts/{id}`   | Busca um contato específico pelo ID.      |
| `POST`      | `/contacts`        | Cria um novo contato.                     |
| `PUT`       | `/contacts`        | Atualiza um contato existente.            |
| `DELETE`    | `/contacts/{id}`   | Remove um contato pelo ID.                |

-----
## Tecnologias Utilizadas

- **Java**: Linguagem de programação.
- **Spring Boot**: Framework para simplificar o desenvolvimento de aplicações Java.
- **SQL**: Banco de dados relacional para persistência dos dados.
- **Maven**: Ferramenta de gerenciamento de dependências e construção de projetos.

-----

## Como Executar o Projeto

Para executar esta aplicação, você precisa ter o Java instalado em sua máquina.

1.  Clone este repositório para o seu ambiente local.

2.  Navegue até a pasta raiz do projeto.

3.  Execute o seguinte comando para construir e executar a aplicação:

    ```bash
    mvn spring-boot:run
    ```

4.  A aplicação estará acessível em `http://localhost:8080`.

-----

