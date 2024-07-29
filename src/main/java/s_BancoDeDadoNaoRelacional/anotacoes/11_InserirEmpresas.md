### Inserir Empresas

1. **Inserindo empresa Bradesco usando ObjectId do estado de São Paulo**
   
   ```
   db.empresas.insert({ 
   nome: "Bradesco" ,
   estadoId: ObjectId("5b76db6e6aa53becb73c5ae7")
   })
   ```
2**Inserindo empresa Vale usando ObjectId da cidade de Sorocaba**

   ```
   db.empresas.insert({ 
   nome: "Vale" ,
   estadoId: ObjectId("5b76db6e6aa53becb73c5ae6")
   })
   ```