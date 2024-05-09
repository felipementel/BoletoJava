# Projeto para pagamento de boletos em Java Spring Boot

## Instruções de Configuração

### Pré-requisitos

- Java JDK 11 ou superior
- Maven 3.6.3 ou superior
- MySQL Server 8.0 ou superior (ou qualquer banco de dados compatível)

### Como construir

1. Clone o repositório para sua máquina local usando `git clone https://github.com/felipementel/BoletoJava.git`.
2. Navegue até a pasta do projeto clonado.
3. Execute `mvn clean install` para construir o projeto.

### Como executar

1. Após a construção, navegue até a pasta `target`.
2. Execute `java -jar BoletoJava-0.0.1-SNAPSHOT.jar` para iniciar a aplicação.
3. A aplicação estará disponível em `http://localhost:8080`.

## API Endpoints

A aplicação suporta as seguintes operações CRUD através de APIs RESTful:

- **CRIAR**: POST `/boletos`
- **LER**: GET `/boletos/{id}`
- **ATUALIZAR**: PUT `/boletos/{id}`
- **DELETAR**: DELETE `/boletos/{id}`

Para mais detalhes sobre os endpoints e seus parâmetros, consulte a documentação da API.
