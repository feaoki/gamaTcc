
create database gamadb;

use gamadb;

CREATE TABLE gamadb.itmn232_usuario (
    id_usuario INT NOT NULL AUTO_INCREMENT,
    nome_usuario VARCHAR(100) NOT NULL,
    email_usuario VARCHAR(100) NOT NULL,
    racf VARCHAR(7),
    senha VARCHAR(50),
    link_foto VARCHAR(255),
    gestor BIT NOT NULL,
    PRIMARY KEY (id_usuario)
);

CREATE TABLE gamadb.itmn232_atividade (
    id_atividade INT NOT NULL AUTO_INCREMENT primary key,
    nome_atividade VARCHAR(100)
);

CREATE TABLE gamadb.itmn232_ocorrencia (
    num_seq INT NOT NULL AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    id_atividade int not null,
    descricao TEXT NOT NULL,
    data_oc DATETIME NOT NULL,
    num_horas TIME NOT NULL,
    ponto_manual INT NOT NULL,
    status INT NOT NULL,
    PRIMARY KEY (num_seq),
    KEY fk_usuario (id_usuario),
    CONSTRAINT fk_usuario FOREIGN KEY (id_usuario)
        REFERENCES itmn232_usuario (id_usuario),
    KEY fk_atividade (id_atividade),
    CONSTRAINT fk_atividade FOREIGN KEY (id_atividade)
        REFERENCES itmn232_atividade (id_atividade)
);
 
