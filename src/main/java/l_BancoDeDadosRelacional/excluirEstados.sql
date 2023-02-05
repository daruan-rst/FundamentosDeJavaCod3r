--Sintaxe básica de excluir registro: 
--DELETE FROM [nome da tabela] WHERE [somente onde essa condição for verdadeira]

--Deletando estados por sigla. Como a sigla foi definida com Unique, só há margem para uma entrada ser deletada
DELETE FROM estados 
WHERE sigla = 'MN'

SELECT * FROM estados

--Deletando estados por um range de id. Uma gama de entradas dessa tabela podem ser afetadas. Outros critérios, claro, poderiam ter sido utilizados.
DELETE FROM estados 
WHERE id >= 1000