CREATE DATABASE IF NOT EXISTS emprestimo_ferramentas
CHARACTER SET utf8mb4
COLLATE utf8mb4-general_ci;

USE emprestimo_ferramentas;

CREATE TABLE IF NOT EXISTS ferramentas(
    id INT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    marca VARCHAR(30) NOT NULL,
    valor DOUBLE NOT NULL,
    stats VARCHAR(30) NOT NULL,
    PRIMARY KEY(id)
)  default char set utf8mb4;

CREATE TABLE IF NOT EXISTS amigos(
    id INT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    fone VARCHAR(30) NOT NULL,
    emprestimos INT NOT NULL,
    PRIMARY KEY(id)
)default char set utf8mb4;

CREATE TABLE IF NOT EXISTS emprestimos(
    id INT NOT NULL,
    id_amigo INT NOT NULL,
    id_ferramenta INT NOT NULL,
    data_emp VARCHAR(30) NOT NULL,
    data_conc VARCHAR(30),
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id_amigo) REFERENCES amigos(id),
    FOREIGN KEY(id_ferramenta) REFERENCES ferramentas(id)
)default char set utf8mb4;