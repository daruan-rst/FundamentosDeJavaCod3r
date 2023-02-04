--Sintaxe básica de atualizar: 
--UPDATE [nome da tabela] SET [coluna] = [novo valor] WHERE [somente onde essa condição for verdadeira]
UPDATE estados 
SET nome = 'Maranhão'
WHERE sigla = 'MA';

--É possível atualizar mais de uma coluna num mesmo comando:
UPDATE estados 	
SET nome = 'Paraná', 
	populacao = 11.32
WHERE sigla = 'PR';