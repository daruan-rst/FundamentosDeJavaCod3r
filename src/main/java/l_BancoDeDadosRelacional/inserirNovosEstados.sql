--Se criarmos um novo estado, numa inserção com ID 1000
INSERT INTO estados (id, nome, sigla, regiao, populacao)
VALUES (1000, 'Novo', 'NV', 'Sul', 2.54)

select * FROM estados 

--Então, ao tentar adicionar um novo estado à tabela, a nova inserção abaixo virá com ID 1001
INSERT INTO estados (nome, sigla, regiao, populacao)
VALUES ('Mais Novo', 'MN', 'Norte', 2.51)

select * FROM estados 