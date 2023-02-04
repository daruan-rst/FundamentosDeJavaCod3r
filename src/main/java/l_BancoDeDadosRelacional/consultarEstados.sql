SELECT * FROM estados;

SELECT nome,sigla FROM estados;

-- É possível usar um alias para uma das colunas das consultas, como em 'Nome do Estado':
SELECT sigla,nome as 'Nome do Estado' FROM estados;

-- Filtrando a consulta para somente os estados do sul
SELECT sigla,nome as 'Nome do Estado' FROM estados
WHERE regiao = 'Sul';

-- Filtrando a consulta para somente os estados que tiverem população maior do que 10 milhões
SELECT sigla,nome as 'Nome do Estado' FROM estados
WHERE populacao >= 10;

-- Filtrando a consulta para somente os estados que tiverem população maior do que 10 milhões, mas ordenando de forma ascendente
SELECT sigla,nome as 'Nome do Estado' FROM estados
WHERE populacao >= 10
order by populacao;

-- Filtrando a consulta para somente os estados que tiverem população maior do que 10 milhões, mas ordenando de forma descendente
SELECT sigla,nome as 'Nome do Estado' FROM estados
WHERE populacao >= 10
order by populacao desc;


