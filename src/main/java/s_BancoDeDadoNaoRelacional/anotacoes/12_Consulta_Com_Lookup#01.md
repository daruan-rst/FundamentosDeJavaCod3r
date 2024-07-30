### Consulta com Lookup #01

#### Resumo das Operações

- **`$match`**: Filtra documentos que correspondem aos critérios especificados.
- **`$lookup`**: Realiza a junção entre duas coleções com base nos campos especificados.
- **`$unwind`**: Deconstrói um array de documentos em documentos individuais.

#### Realização do Lookup

1. **Configuração do Lookup**

   Utiliza-se o operador `$lookup` para fazer a relação entre a coleção `empresas` e a coleção `estados`:
   ```
   db.empresas.aggregate([
    {$match: { nome: "Bradesco" }},
    {$lookup: {
        from: "estados",
        localField: "estadoId",
        foreignField: "_id",
        as: "estado"
    }}
   ]).pretty()
   ```
   Essa operação retorna a empresa Bradesco com um array "estado" contendo o estado relacionado.

2. **Simplificação do Resultado**

   Utiliza-se o operador `$unwind` para transformar o array "estado" em um objeto individual:
   ```
   db.empresas.aggregate([
    {$match: { nome: "Bradesco" }},
    {$lookup: {
        from: "estados",
        localField: "estadoId",
        foreignField: "_id",
        as: "estado"
    }},
    {$unwind: "$estado"
   ]).pretty()
   ```
   Isso transforma o array "estado" em um objeto singular, facilitando o acesso aos seus atributos.

#### -

- **Relacionamento Direto**: A consulta exemplifica como relacionar documentos de duas coleções de forma direta
  utilizando `$lookup` e `$unwind`.
- **Manipulação de Dados**: Com o estado diretamente acessível no documento da empresa, torna-se mais simples manipular
  e acessar os dados relacionados.






