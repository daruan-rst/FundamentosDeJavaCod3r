### Update



#### Atualização de Atributos

1. **Atualizar População de um Estado**

   Utiliza-se o operador `$set` para atualizar a população do estado de São Paulo:
   ```
   db.estados.update(
   { sigla: "SP" },
   { $set: { populacao: 45340000 } }
   )
   ```

2. **Adicionar Nova Cidade em um Estado**

   Utiliza-se o operador `$set` para adicionar a primeira cidade ao estado de Alagoas:
   ```
   db.estados.update(
   { sigla: "AL" },
   { $set: { cidades: [{ nome: "Sergipe" }] } }
   )
   ```
3. **Adicionar Cidade em um Estado Existente**
   
    Utiliza-se o operador `$push` para adicionar uma cidade ao array de cidades no estado de São Paulo:
   ```
   db.estados.update(
   { sigla: "SP" },
   { $push: { cidades: { nome: "Santos", populacao: 4331966 } } }
   )
   ```

#### Consulta de Estados com Atributos Específicos

Para filtrar estados que possuem o atributo população, usa-se o operador `$exists`:
```
db.estados.find(
{ populacao: { $exists: true } },
{ nome: 1 }
)
```
Essa consulta retorna apenas os nomes dos estados que possuem o atributo população.

### Resumo das Operações

- **Visualização de Estados**: Utiliza-se `find()` para visualizar os documentos.
- **Atualização com `$set`**: Permite adicionar ou modificar atributos em um documento.
- **Adicionar ao Array com `$push`**: Adiciona um novo elemento ao array existente.
- **Filtragem com `$exists`**: Filtra documentos que possuem um atributo específico.


