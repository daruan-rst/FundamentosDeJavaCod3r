# Métodos HTTP 01

## Introdução aos Métodos HTTP

A comunicação entre dois computadores na internet utiliza uma pilha de protocolos, com destaque para o modelo TCP/IP, que inclui as camadas física, de rede, de transporte e de aplicação. O protocolo HTTP (Hypertext Transfer Protocol) opera na camada de aplicação e é essencial para a transferência de hipertexto (HTML) na web.

## Protocolo HTTP

O HTTP é baseado em um modelo de requisição e resposta. Um cliente (como um navegador) faz uma requisição a um servidor, que responde com os dados solicitados. O HTTP possui oito métodos principais, cada um com um propósito específico.

### Métodos HTTP

1. **GET**: Utilizado para obter informações do servidor. Este método é idempotente e não deve causar alterações no estado do servidor.
2. **POST**: Usado para enviar dados ao servidor, como ao submeter um formulário. Pode gerar alterações no banco de dados.
3. **PUT**: Serve para alterar ou criar recursos no servidor. É idempotente, ou seja, múltiplas requisições com o mesmo dado não devem produzir efeitos colaterais diferentes.
4. **PATCH**: Utilizado para alterações parciais de um recurso. Ao contrário do PUT, que substitui o recurso inteiro, o PATCH aplica modificações parciais.
5. **DELETE**: Remove um recurso do servidor.
6. **OPTIONS**: Retorna os métodos HTTP suportados por uma URL específica. É útil para determinar as capacidades de um servidor.
7. **HEAD**: Semelhante ao GET, mas a resposta não contém um corpo. É usado para verificar se um recurso está disponível sem baixar seu conteúdo.
8. **TRACE**: Realiza um teste de loop-back, onde a requisição é retornada pelo servidor, permitindo ver o que foi recebido no lado do servidor. Raramente utilizado em prática.

### Aplicação dos Métodos

Os métodos HTTP são fundamentais para a comunicação entre cliente e servidor na web. Embora a semântica dos métodos seja importante, a implementação prática pode variar. Por exemplo, o GraphQL, uma alternativa ao REST, usa apenas os métodos POST e GET, independentemente da operação realizada (inserção, alteração, leitura, exclusão).

Manter a semântica dos métodos HTTP ajuda a manter a consistência e a aderência aos padrões REST, embora em algumas implementações, como no uso de POST para diversas operações, isso possa ser flexibilizado.

## Considerações Finais

Os métodos HTTP facilitam a comunicação e a interação com recursos web de maneira padronizada. Entender e aplicar corretamente esses métodos contribui para o desenvolvimento de APIs mais robustas e aderentes aos padrões da web.

Na próxima aula, será explorado como implementar esses conceitos na prática dentro de uma aplicação web.
