# NoSQL: Visão Geral

Os bancos de dados NoSQL, ou "Not Only SQL", representam uma abordagem diferente dos bancos relacionais tradicionais. Estes bancos não relacionais podem eventualmente usar SQL ou variações na consulta e persistência de dados.

## Classificação dos Bancos Não Relacionais

Os bancos NoSQL são classificados em quatro grandes grupos:

1. **Bancos chave-valor**: Exemplos incluem Redis, que é amplamente usado como cache distribuído.
2. **Bancos baseados em documentos**: MongoDB é um exemplo popular, focando em armazenamento de documentos.
3. **Bancos baseados em colunas**: Exemplos são Cassandra e HBase, que armazenam dados em colunas.
4. **Bancos baseados em grafos**: Exemplos incluem Neo4j, que organiza dados como um grafo.

### Exemplos de Bancos Não Relacionais

- **Chave-valor**: Redis é frequentemente usado para cache distribuído, armazenando resultados de consultas para acesso rápido.
- **Documentos**: MongoDB permite armazenar dados em formato JSON, oferecendo flexibilidade na estrutura dos documentos.
- **Colunas**: Cassandra é conhecido por sua capacidade de escalabilidade horizontal e desempenho em grandes volumes de dados.
- **Grafos**: Neo4j é utilizado para armazenar dados que se relacionam de forma complexa, como redes sociais.

## Comparação: Bancos Relacionais vs. Não Relacionais

### Escalonamento

- **Vertical**: Envolve melhorar a capacidade de uma única máquina, aumentando memória, processador e armazenamento.
- **Horizontal**: Distribui os dados em várias máquinas, permitindo escalabilidade mais eficiente. Bancos não relacionais são mais adequados para escalonamento horizontal.

### Desafios de Escalonamento

- Bancos relacionais: Dificuldades no escalonamento horizontal devido à complexidade de separar e sincronizar dados.
- Bancos não relacionais: Mais facilidade em escalonar horizontalmente, replicando dados em várias instâncias para maior disponibilidade e desempenho.

## MongoDB: Organização e Uso

MongoDB é um banco baseado em documentos com estrutura flexível:

- **Banco de dados**: Pode conter várias coleções.
- **Coleções**: Equivalentes às tabelas em bancos relacionais.
- **Documentos**: Correspondem às linhas de uma tabela, mas sem esquema fixo.

### Características do MongoDB

- **Sem esquema fixo**: Permite inserir documentos com diferentes atributos na mesma coleção.
- **Flexibilidade**: Adequado para armazenar dados variados e complexos.
- **API própria**: Simples para operações básicas, mas pode se tornar complexa para consultas avançadas.

## Aplicações e Soluções Mistas

A escolha entre banco relacional e não relacional depende das necessidades específicas do projeto. Em alguns casos, uma solução mista pode ser a melhor abordagem, combinando a flexibilidade dos bancos NoSQL com a robustez dos bancos relacionais.

### Exemplo Prático

No contexto de uma aplicação web, pode-se usar um banco relacional para dados estruturados e um banco NoSQL para dados não estruturados ou de alta demanda, aproveitando o melhor de ambos os mundos para otimizar a performance e a escalabilidade da aplicação.

