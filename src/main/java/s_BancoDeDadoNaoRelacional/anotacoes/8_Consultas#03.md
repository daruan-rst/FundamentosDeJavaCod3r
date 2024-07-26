### Consultas # 03



#### Filtragem e Projeção de Dados

Objetivo: Encontrar o estado que contém a cidade de Sorocaba e retornar apenas o `_id` dessa cidade.

1. **Filtragem Inicial**
   Utiliza-se o estágio `$match` para filtrar estados que possuem a cidade de Sorocaba:
   ```
   db.estados.aggregate([
   { $match: { "cidades.nome": "Sorocaba" } }
   ])
   ```

2. **Desmembramento de Documentos**
   Utiliza-se o estágio `$unwind` para desmembrar o array de cidades, criando um documento para cada cidade:
   ```
   db.estados.aggregate([
   { $match: { "cidades.nome": "Sorocaba" } },
   { $unwind: "$cidades" }
   ])
   ```

3. **Filtragem Secundária**
   Um segundo `$match` é utilizado para filtrar novamente por Sorocaba após o desmembramento:
   ```
   db.estados.aggregate([
   { $match: { "cidades.nome": "Sorocaba" } },
   { $unwind: "$cidades" },
   { $match: { "cidades.nome": "Sorocaba" } }
   ])
   ```

4. **Projeção Final**
   Utiliza-se o estágio `$project` para retornar apenas o `_id` da cidade de Sorocaba:
   ```
   db.estados.aggregate([
   { $match: { "cidades.nome": "Sorocaba" } },
   { $unwind: "$cidades" },
   { $match: { "cidades.nome": "Sorocaba" } },
   { $project: { _id: "$cidades._id" } }
   ])
   ```

#### Resumo dos Estágios Utilizados

- **$match**: Filtra documentos com base em critérios especificados.
- **$unwind**: Desmembra arrays, criando um documento separado para cada elemento do array.
- **$project**: Seleciona e formata os campos que serão retornados no resultado.

A consulta exemplifica a flexibilidade do Pipeline de Agregação no MongoDB, permitindo a manipulação e filtragem de dados complexos de forma eficiente. Utilizando estágios como `$match`, `$unwind` e `$project`, é possível realizar operações avançadas que seriam mais complexas em um modelo relacional tradicional. A API do MongoDB oferece diversas possibilidades para consultas agregadas, facilitando a extração de informações específicas e o processamento adicional dentro da aplicação.
