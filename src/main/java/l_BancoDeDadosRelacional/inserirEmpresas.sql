ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas
			(nome, cnpj)
VALUES
	('Bradesco', 34745113000138 ),
	('Vale' , 80851439000167),
	('Cielo' , 94518494000144);
	
desc empresas;
desc prefeitos;

SELECT * FROM empresas;
SELECT * FROM cidades;

INSERT INTO empresas_unidades 
		(empresa_id, cidade_id, sede)
VALUES
	(1,1,1),
	(1,2,0),
	(2,1,0),
	(2,2,1);
	