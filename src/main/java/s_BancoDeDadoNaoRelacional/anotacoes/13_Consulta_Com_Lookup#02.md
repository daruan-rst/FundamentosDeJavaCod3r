### Consulta com Lookup #02

### Resumo das Operações

- **`$match`**: Filtra documentos que correspondem aos critérios especificados.
- **`$lookup`**: Realiza a junção entre duas coleções com base nos campos especificados.
- **`$unwind`**: Deconstrói um array de documentos em documentos individuais.
- **`$addFields`**: Adiciona novos campos aos documentos.
- **`$cmp`**: Compara dois valores e retorna -1, 0, ou 1.

#### Preparação

Criação de uma consulta para relacionar empresas com cidades:
```
db.empresas.aggregate([
    {
    $match: { nome: "Vale" }
    }
])
```

#### Realização do Lookup

1. **Configuração do Lookup**

   Utiliza-se o operador `$lookup` para relacionar a coleção `empresas` com a coleção `estados`:
   ```
   db.empresas.aggregate([
    {$match: { nome: "Vale" }},
    {$lookup: {
        from: "estados",
        localField: "cidadeId",
        foreignField: "cidades._id",
        as: "estado"
    }}
   ]).pretty()
   ```
   Essa operação retorna a empresa Vale com um array "estado" contendo o estado relacionado.

2. **Simplificação do Resultado**

   Utiliza-se o operador `$unwind` para transformar o array "estado" em um objeto individual:
   ```
   db.empresas.aggregate([
    {$match: { nome: "Vale" }},
    {$lookup: {
        from: "estados",
        localField: "cidadeId",
        foreignField: "cidades._id",
        as: "estado"
    }},
   {$unwind: "$estado"}
   ]).pretty()
   ```
   Isso transforma o array "estado" em um objeto singular, facilitando o acesso aos seus atributos.

3. **Relacionamento com Cidades**

   Realiza-se uma segunda operação de `$lookup` para relacionar diretamente com a cidade:
   ```
   db.empresas.aggregate([
    {$match: { nome: "Vale" }},
    {$lookup: {
        from: "estados",
        localField: "cidadeId",
        foreignField: "cidades._id",
        as: "estado"
    }},
   {$unwind: "$estado"},
   {$unwind: "$estado.cidades"}
   ]).pretty()
   ```
   
    Mas isso só retorna documentos de estados,  cada um com uma cidade

#### Filtro de Cidades Específicas

1. **Comparação de Valores**

   Utiliza-se o operador `$addFields` e `$cmp` para comparar valores e filtrar apenas a cidade desejada:
    ```
   db.empresas.aggregate([
    {$match: { nome: "Vale" }},
    {$lookup: {
        from: "estados",
        localField: "cidadeId",
        foreignField: "cidades._id",
        as: "estado"
    }},
   {$unwind: "$estado"},
   {$unwind: "$estado.cidades"},
   {$$addFields: {mesmaCidade: {$cmp: ["estado.cidades._id": "$cidadeId"]}}},
   {$match: {mesmaCidade: 0}}
   ]).pretty()
   ```
   Isso adiciona um campo "mesmaCidade" que compara os IDs das cidades e filtra apenas a cidade correspondente.

