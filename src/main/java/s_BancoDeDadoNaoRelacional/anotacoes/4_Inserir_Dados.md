### Inserir Dados

Nesta seção, é abordada a inserção de dados em uma coleção no MongoDB.

#### Limpeza do Console

Para começar, é recomendável limpar o console com o comando `cls` para manter o ambiente organizado.

#### Inserção de Dados
A inserção de dados pode ser feita mesmo que a coleção não exista. O MongoDB criará automaticamente a coleção ao inserir o primeiro documento.

Inserir um Documento
Inserindo um documento na coleção "estados":
```
db.estados.insert({
  nome: "Acre",
  sigla: "AC",
  regiao: "Norte"
})
```

Verificando a criação da coleção:
```
show collections
```

Confirmando a existência do banco de dados

```
show dbs
```

#### Atualizar ou Inserir Dados

Use o comando save para inserir ou atualizar um documento:
```
db.estados.save({
  nome: "Alagoas",
  sigla: "AL",
  regiao: "Nordeste",
  populacao: 3337357
})
```
**Consultar Dados**

Para visualizar os documentos inseridos:
```
db.estados.find()
```

Para formatar a saída de dados:

```
db.estados.find().pretty()
```

**Inserir Dados Complexos**

Inserir um documento com subdocumentos (exemplo de estado com cidades):

```
db.estados.insert({
  nome: "Rio de Janeiro",
  sigla: "RJ",
  regiao: "Sudeste",
  cidades: [
    {
      nome: "Niterói",
      area: 133.9,
      populacao: 487562
    }
  ]
})

```


A flexibilidade do MongoDB permite armazenar dados de formas variadas, sem a rigidez dos bancos de dados relacionais. No entanto, deve-se considerar as necessidades específicas do projeto ao decidir a estrutura dos documentos e coleções.
