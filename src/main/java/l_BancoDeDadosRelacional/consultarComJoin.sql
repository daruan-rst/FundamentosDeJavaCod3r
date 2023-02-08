SELECT 
	e.nome as Estado,
	c.nome as Nome, 
	e.regiao as Região 
FROM estados e, cidades c
WHERE e.id  = c.estado_id 

SELECT 
	e.nome as Estado,
	c.nome as Nome,
	regiao as Região
FROM estados e
INNER JOIN cidades c on e.id = c.estado_id 