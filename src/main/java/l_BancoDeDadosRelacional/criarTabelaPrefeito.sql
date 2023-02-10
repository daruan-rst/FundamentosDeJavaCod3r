CREATE TABLE IF NOT EXISTS prefeitos(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	cidade_id INT UNSIGNED,
	PRIMARY KEY (id),
	UNIQUE KEY (cidade_id), --  o fato de ser UNIQUE garante a relação 1:1 => não aceita duplicação
	FOREIGN KEY REFERENCES cidades(id)
);