### Consultas #02

#### Consulta Simples com Pipeline de Agregação

Para iniciar, utiliza-se um estágio básico do pipeline de agregação, o `$project`, que permite selecionar e formatar os campos desejados:
```
db.estados.aggregate([
{ $project: { nome: 1, "cidades.nome": 1, _id:0 } }
])
```

Esta consulta seleciona os atributos `nome` e `cidades.nome` - e omite o campo id -dos documentos na coleção `estados`.

- A api do MongoDb usa o símbolo `$` para o que é significativo. Coisas como um estágio no pipeline de agregação, operadores
ou até mesmo quando se busca referenciar uma coluna como documento.

- O Símbolo `$` é usado para referenciar o valor da chave em consultas Key-Value

#### Consulta com Múltiplos Estágios

Adiciona-se um segundo estágio para agregar e somar a população das cidades:
```
db.estados.aggregate([
{ $project: { nome: 1, "cidades.populacao": 1 } },
{ $group: { _id: "$sigla", populacao_total: { $sum: "$cidades.populacao" } } }
])
```

Neste exemplo:
- O primeiro estágio `$project` seleciona os campos `nome` e `cidades.populacao`.
- O segundo estágio `$group` agrega a população total por estado.

#### Utilização de Operadores no Pipeline

Os operadores de agregação são usados para calcular a soma das populações das cidades e agrupar os resultados:

```
db.estados.aggregate([
{ $project: { populacao: { $sum: "$cidades.populacao" }, sigla:1 , _id:0 } },
{ $group: { _id: null, populacaoTotal: { $sum: "$populacao" } } }
])
```

Neste exemplo:
- O primeiro estágio `$project` calcula a soma da população das cidades por estado.
- O segundo estágio `$group` soma a população total de todos os estados.

#### Ajustes Finais e Limpeza dos Resultados

Para exibir apenas o resultado final da soma total, um último estágio `$project` é adicionado:
```
db.estados.aggregate([
{ $project: { sigla: 1, populacao: { $sum: "$cidades.populacao" } } },
{ $group: { _id: null, populacao_total: { $sum: "$populacao" } } },
{ $project: { _id: 0, populacao_total: 1 } }
])
```

Neste estágio, a projeção final remove o campo `_id` e exibe apenas o campo `populacao_total`.

### Resumo dos Comandos Utilizados

- `db.[coleção].aggregate([ estágio ])`: Executa uma consulta com o pipeline de agregação.
- `$project`: Seleciona e formata campos específicos.
- `$group`: Agrupa documentos e realiza operações de agregação, como somas.
- `$sum`: Soma valores dentro dos documentos.
