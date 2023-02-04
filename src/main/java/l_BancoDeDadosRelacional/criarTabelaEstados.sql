-- Criando a tabela estado!
create table estados (
	id INT UNSIGNED not null AUTO_INCREMENT,
	nome VARCHAR(45) not null,
	sigla VARCHAR(2) not null,
	regiao ENUM('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') not null,
	populacao DECIMAL(5,2) not null,
	primary KEY(id),
	unique KEY(nome),
	unique key(sigla)
);