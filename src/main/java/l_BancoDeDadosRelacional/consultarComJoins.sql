--Consulta com as cidades que tenham prefeito associado
SELECT * FROM cidades c INNER JOIN prefeitos p ON c.id = p.cidade_id; 

--Mesmo as cidades que não tem prefeito associado retornarão nessa consulta
SELECT * FROM cidades c LEFT JOIN prefeitos p ON c.id = p.cidade_id;

--Mesmo os prefeitos que não tem cidade associada retornarão nessa consulta
SELECT * FROM cidades c RIGHT JOIN prefeitos p ON c.id = p.cidade_id;

/** O MySQL não suporta FULL JOINS
 * SELECT * FROM cidades c FULL JOIN prefeitos p ON c.id = p.cidade_id;
 * 
 * o que deve ser feito é a união de left com right join
 */

SELECT * FROM cidades c LEFT JOIN prefeitos p ON c.id = p.cidade_id
UNION
SELECT * FROM cidades c RIGHT JOIN prefeitos p ON c.id = p.cidade_id;
