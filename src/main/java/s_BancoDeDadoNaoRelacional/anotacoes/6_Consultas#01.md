### Consultas #01

#### Consultas Básicas
- Consultar todos os documentos da coleção "estados":
```
db.estados.find()
```
- Para formatar a saída de dados de forma mais legível:
```
db.estados.find().pretty()

```
- Consultar um único documento:
```
db.estados.findOne()
```

#### Consultas com Filtros
- Consultar documentos com base em um filtro específico:
```
db.estados.find({ sigla: "RJ" })
```
- Para buscar usando múltiplos critérios, utilize operadores como $or:
```
db.estados.find({
  $or: [
    { sigla: "RJ" },
    { sigla: "AC" }
  ]
})
```
- Para buscar documentos onde um atributo específico existe:
```
db.estados.find({ populacao: { $exists: true } })
```

#### Paginação de Resultados
- Para realizar paginação, utilize os métodos skip e limit:
```
db.estados.find().skip(1).limit(2)
```

#### Contagem de Documentos
- Para contar o número de documentos em uma coleção:
```
db.estados.countDocuments()
```

#### Seleção de Campos
- Para retornar apenas campos específicos em uma consulta:
```
db.estados.find({ sigla: "SP" }, { nome: 1, sigla: 1 })
```

-Para omitir campos específicos:
```
db.estados.find({ sigla: "SP" }, { cidades: 0 })
```

#### Consultas Aninhadas
- Para retornar campos específicos de documentos aninhados:
```
db.estados.find(
  { sigla: "SP" },
  { "cidades.nome": 1 }
)
```