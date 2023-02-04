-- Criando a tabela estado!
create type regiao_enum as ENUM('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul');

create table estados (
	id SERIAL not null,
	nome VARCHAR(45) not null,
	sigla VARCHAR(2) not null,
	regiao regiao_enum not null,
	populacao DECIMAL(5,2) not null,
	primary KEY(id),
	unique (nome),
	unique (sigla)
);