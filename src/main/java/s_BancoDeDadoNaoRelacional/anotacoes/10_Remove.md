### Remve

#### Remoções Básicas

1. **Remover Estado pela Sigla**
   Remove o estado cuja sigla é "AC":
   ```
   db.estados.remove({ sigla: "AC" })
   ```


2. **Remover Estados sem Atributo de População**
   Utiliza-se o operador `$exists` para remover estados que não possuem o atributo "populacao":
   ```
   db.estados.remove({ populacao: { $exists: false } }, 1)
   ```
   O número 1 indica que só um estado deve ser removido

#### Remoções Condicionais

1. **Remover Estados com População Menor que 20 Milhões**

   Utiliza-se o operador `$lt` para remover estados com população menor que 20 milhões:
   ```
   db.estados.remove({ populacao: { $lt: 20000000 } })
   ```
