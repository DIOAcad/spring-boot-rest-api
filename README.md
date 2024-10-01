# Projeto REST API com Spring Boot

Este projeto é uma API REST simples desenvolvida em **Spring Boot** para demonstrar a implementação de padrões de design e persistência em banco de dados.

## Tecnologias Utilizadas
- Spring Boot
- Spring Data JPA
- H2 Database (Desenvolvimento)
- PostgreSQL (Produção)
- Swagger

## Como Configurar
1. Clone o repositório:
```bash
   git clone https://github.com/seuusuario/nome-do-repositorio.git
   cd nome-do-repositorio
 ```
2. Execute o seguinte comando para instalar as dependências:
 ```bash
  ./mvnw install
 ```
3. Para executar a aplicação em modo de desenvolvimento:
 ```bash
./mvnw spring-boot:run
 ```
4. Acesse a API através do Swagger UI em:
 ```bash
http://localhost:8080/swagger-ui/
 ```
## Endpoints
- Criar Produto: `POST /api/products`
- Buscar Produto por ID: `GET /api/products/{id}`

### Explicação:
- `Estrutura básica`: O `README.md` começa com uma introdução ao projeto e às tecnologias utilizadas.
- `Instruções de configuração`: Fornecemos passos detalhados sobre como clonar, instalar dependências e executar o projeto.
- `Endpoints`: Listamos os endpoints disponíveis na API, facilitando a navegação para quem utilizar o projeto.
## Diagrama de Classes

```mermaid
classDiagram
    class Product {
        +Long id
        +String name
        +Double price
    }

    class ProductService {
        +createProduct(Product product)
        +getProductById(Long id)
    }

    class ProductController {
        +createProduct(Product product)
        +getProductById(Long id)
    }

    ProductController --> ProductService : uses
    ProductService --> Product : manages
