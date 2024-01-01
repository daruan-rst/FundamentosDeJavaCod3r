# Resumo - Aula 407: HTTP Seguro (HTTPS)

A segurança é implementada por meio dos protocolos TLS (Transport Layer Security) e SSL (Secure Sockets Layer), sendo o TLS uma evolução do SSL na versão 4.

Principais Pontos:
- HTTPS criptografa os dados entre o cliente e o servidor, protegendo contra interceptações no meio da comunicação.
- A criptografia abrange não apenas a requisição, mas todo o conteúdo, incluindo parâmetros na URL.
- Certificados digitais são essenciais para autenticar a identidade do servidor e são emitidos por Autoridades Certificadoras.
- A Autoridade Certificadora desempenha um papel crucial na emissão e validação dos certificados, garantindo a segurança da comunicação.
- Uma alternativa gratuita para obter certificados é a Let's Encrypt, que simplifica o processo de instalação por meio de um comando de linha.
- Destacam-se incidentes de vazamentos de chave primária de uma Autoridade Certificadora, resultando na revogação de mais de 23 mil certificados.
- O uso de HTTPS traz benefícios significativos, proporcionando uma camada extra de segurança na comunicação entre cliente e servidor.

