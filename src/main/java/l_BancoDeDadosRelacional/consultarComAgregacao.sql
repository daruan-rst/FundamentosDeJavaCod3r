--Soma de toda a população de todos os estados por região
SELECT 
	regiao AS 'Região',
	SUM(populacao) AS Total
FROM estados 
GROUP BY regiao
ORDER BY Total DESC;

--Soma de toda a população de todos os estados
SELECT 
	SUM(populacao) AS Total
FROM estados

--Média da população dos estados
SELECT 
	AVG(populacao) AS Total
FROM estados