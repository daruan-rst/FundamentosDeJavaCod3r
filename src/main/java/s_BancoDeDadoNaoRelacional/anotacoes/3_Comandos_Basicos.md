### Comandos Básicos

Nesta seção, são apresentados os primeiros exemplos práticos usando o terminal para comandos básicos no MongoDB. O objetivo é criar uma pasta chamada "banco não relacional" e dentro dela, um arquivo onde todos os comandos executados no terminal serão registrados para referência futura.

#### Inicializando o MongoDB

O MongoDB deve estar em execução, iniciado com o comando `mongod`. Em um novo terminal, o comando `mongo` é utilizado para acessar o banco de dados.

#### Comandos Básicos

- `help`: Exibe as opções de ajuda disponíveis.
- `show dbs`: Mostra todos os bancos de dados disponíveis.
- `use [nome_do_banco]`: Seleciona um banco de dados, mesmo que ele ainda não exista.
- `db.createCollection("[nome_da_coleção]")`: Cria uma nova coleção no banco de dados selecionado.
- `show collections`: Mostra todas as coleções do banco de dados atual.
- `db.[nome_da_coleção].drop()`: Remove a coleção especificada.

#### Detalhes Importantes

- O MongoDB é case sensitive, ou seja, diferencia maiúsculas de minúsculas nos nomes de bancos de dados e coleções.
- Após criar uma coleção e inserir dados, o banco de dados aparecerá na lista exibida pelo comando `show dbs`.

#### Exemplos Práticos

1. **Criar e selecionar um banco de dados:**
   ```
   use WM
   ```
   O banco de dados "WM" será utilizado para as operações seguintes.
2. **Criar uma coleção:**
   ```
   db.createCollection("estados")
   ```
   Uma coleção chamada "estados" é criada. Para verificar, use `show collections`.
3. **Remover uma coleção:**
   ```
   db.estados.drop()
   ```
   Exibe os bancos de dados e coleções disponíveis.
4. **Mostrar bancos de dados e coleções:**
   ```
   show dbs
   show collections
   ``` 
Exibe os bancos de dados e coleções disponíveis.

