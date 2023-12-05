# Protocolo HTTP

O **Protocolo HTTP** (Hypertext Transfer Protocol) é fundamental na web, sendo inicialmente voltado para a transferência de hipertexto, que são textos com links associados. A evolução levou a suportar diversos formatos, como imagens, vídeos, jogos, etc. A maior parte do tráfego web utiliza o HTTP.

## Hipertexto e Web

- **Hipertexto:** Texto com links, inicialmente em HTML (Hypertext Markup Language).
- Referências dentro de documentos HTML a outros formatos (CSS, JavaScript, imagens).

## Características do HTTP

- **Camada de Aplicação:** Integrado à pilha TCP/IP, na camada mais alta.
- **Protocolo Sem Estado:** Cada requisição é tratada como se fosse a primeira, sem informações do estado anterior.
- **Cliente-Servidor:** Baseado em requisição e resposta.
- Opera sobre as técnicas da pilha TCP/IP.

## Métodos HTTP

- **GET:** Parâmetros na própria URL.
  Exemplo: `GET /search?q=web+moderno&hl=pt-BR`

- **POST:** Parâmetros no corpo da requisição.
  Exemplo: `POST /search` (parâmetros no corpo).

Outros métodos incluem PUT, DELETE, OPTIONS, etc.

## Fluxo Básico de Conexão HTTP

1. Usuário insere URL.
2. Requisição é enviada para o servidor.
3. Servidor responde com HTML, CSS, JavaScript, etc.
4. Página é montada com múltiplas requisições.

## Códigos de Status HTTP

- **1xx:** Informação
- **2xx:** Sucesso
- **3xx:** Redirecionamento
- **4xx:** Erros do Cliente
- **5xx:** Erros do Servidor

## Segurança e HTTPS

- Requisições seguras com HTTPS (SSL/TLS).
- Parâmetros criptografados na comunicação.

Lembre-se, a prática será essencial para consolidar esses conceitos.
