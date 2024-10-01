CREATE DATABASE db_livrariadrachen;
use db_livrariadrachen;

CREATE TABLE CLIENTE (
    cliente_id INT PRIMARY KEY,
    clube_id INT,
    nome varchar(50),
    telefone_1 VARCHAR(50),
    telefone_2 VARCHAR(50),
    email VARCHAR(50),
    rua VARCHAR(50),
    bairro VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(50)
);

CREATE TABLE LIVRO (
    isbn INTEGER PRIMARY KEY,
    editora_id INTEGER,
    rev_id INT,
    valor FLOAT,
    ano_publicacao DATE,
    categoria VARCHAR(50),
    título VARCHAR(50),
    nome_livro VARCHAR(50),
    autor VARCHAR(50),
    avaliacao VARCHAR(50)
);

CREATE TABLE PESSOA_FISICA (
    cpf VARCHAR(50),
    rg INTEGER,
    cliente_id INTEGER,
    PRIMARY KEY (cpf, cliente_id)
);

CREATE TABLE PESSOA_JURIDICA (
    cnpj VARCHAR(50),
    ie INTEGER,
    cliente_id INTEGER,
    PRIMARY KEY (cliente_id, cnpj)
);

CREATE TABLE ITEM_PEDIDO (
    cod_pedido INTEGER,
    isbn INTEGER,
    qdt_pedido INTEGER,
    valor_item INTEGER,
    PRIMARY KEY (cod_pedido, isbn)
);

CREATE TABLE PEDIDO (
    cod_pedido INTEGER PRIMARY KEY,
    cliente_id INTEGER,
    data DATE,
    valor_pedido INTEGER,
    presente_id INTEGER
);

CREATE TABLE ESTOQUE (
    cod_editora INTEGER,
    isbn INTEGER,
    qtd_estoque INTEGER,
    PRIMARY KEY (cod_editora, isbn)
);

CREATE TABLE EDITORA (
    cnpj VARCHAR(50),
    editora_id INTEGER,
    telefone_1 VARCHAR(50),
    telefone_2 VARCHAR(50),
    email VARCHAR(50),
    nome_contato VARCHAR(50),
    nome VARCHAR(50),
    PRIMARY KEY (cnpj, editora_id)
);

CREATE TABLE CLUBE (
    clube_id INTEGER PRIMARY KEY,
    tipo VARCHAR(50),
    assinatura VARCHAR(50)
);

CREATE TABLE PRESENTE (
    presente_id INTEGER PRIMARY KEY,
    tipo VARCHAR(50),
    cliente_id INTEGER
);

CREATE TABLE REVENDEDORA (
    cnpj VARCHAR(50),
    rev_id INTEGER,
    telefone_1 VARCHAR(50),
    telefone_2 VARCHAR(50),
    email VARCHAR(50),
    nome_contato VARCHAR(50),
    nome VARCHAR(50),
    PRIMARY KEY (cnpj, rev_id)
);

CREATE TABLE AVALIAÇÃO (
    avalicao_id INTEGER PRIMARY KEY,
    isbn INTEGER,
    valor FLOAT
);
 
ALTER TABLE CLIENTE ADD CONSTRAINT FK_CLIENTE_CLUBE
    FOREIGN KEY (clube_id)
    REFERENCES CLUBE (clube_id);

ALTER TABLE LIVRO ADD CONSTRAINT FK_LIVRO_EDITORA
    FOREIGN KEY (editora_id)
    REFERENCES EDITORA (editora_id);

ALTER TABLE LIVRO ADD CONSTRAINT FK_LIVRO_REVENDEDORA
    FOREIGN KEY (rev_id)
    REFERENCES REVENDEDORA (rev_id);

ALTER TABLE PESSOA_FISICA ADD CONSTRAINT FK_PF_CLIENTE
    FOREIGN KEY (cliente_id)
    REFERENCES CLIENTE (cliente_id);

ALTER TABLE PESSOA_JURIDICA ADD CONSTRAINT FK_PJ_CLIENTE
    FOREIGN KEY (cliente_id)
    REFERENCES CLIENTE (cliente_id);

ALTER TABLE ITEM_PEDIDO ADD CONSTRAINT FK_ITEM_PEDIDO_LIVRO
    FOREIGN KEY (isbn)
    REFERENCES LIVRO (isbn);

ALTER TABLE PEDIDO ADD CONSTRAINT FK_PEDIDO_CLIENTE
    FOREIGN KEY (cliente_id)
    REFERENCES CLIENTE (cliente_id);

ALTER TABLE ESTOQUE ADD CONSTRAINT FK_ESTOQUE_LIVRO
    FOREIGN KEY (isbn)
    REFERENCES LIVRO (isbn);

ALTER TABLE ESTOQUE ADD CONSTRAINT FK_ESTOQUE_EDITORA
    FOREIGN KEY (cod_editora)
    REFERENCES EDITORA (editora_id);

ALTER TABLE PRESENTE ADD CONSTRAINT FK_PRESENTE_CLIENTE
    FOREIGN KEY (cliente_id)
    REFERENCES CLIENTE (cliente_id);
