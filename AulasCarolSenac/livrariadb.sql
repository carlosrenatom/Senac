create database livraria;
use livraria;
create table tbCliente (
primary key (cod_cliente),
cod_cliente varchar(14) not null,
telefone_1 varchar(11) not null,
telefone_2 varchar(11),
rua varchar(50) not null,
bairro varchar(50) not null,
estado varchar(50) not null
);
create table tbPedido (
primary key (cod_pedido),
cod_pedido varchar(14) not null,
valor_pedido double not null,
cod_cliente varchar(14) not null,
foreign key (cod_cliente) references tbCliente(cod_cliente),
data_compra date not null 
);

create table tbPessoa_Juridica (
primary key (cod_cliente),
foreign key (cod_cliente) references tbCliente (cod_cliente),
cod_cliente varchar(20) not null,
cnpj varchar(20) not null,
ie varchar(20) not null
);

create table tbPessoa_Fisica (
primary key (cod_cliente),
foreign key (cod_cliente) references tbCliente (cod_cliente),
cod_cliente varchar(20) not null,
cpf varchar(15) not null,
rg varchar(15) not null
);

create table tbLivro (
primary key (cod_livro),
cod_livro varchar(10) not null,
valor decimal not null,
ano_publicacao int,
categoria varchar(25) not null,
titulo varchar(50) not null,
nome_livro varchar(50) not null,
isbn int not null,
autor varchar(25) not null,
cod_editora varchar(10) not null,
foreign key (cod_editora) references tbEditora(cod_editora)
);

create table tbItemPedido(
primary key (cod_pedido, cod_livro),
foreign key (cod_pedido) references tbPedido(cod_pedido),
foreign key (cod_livro) references tbLivro(cod_livro),
cod_pedido varchar(10) not null,
cod_livro varchar(10) not null,
qtd_pedido int not null,
valor_item decimal not null
);

create table tbEstoque (
primary key (cod_livro),
foreign key (cod_livro) references tbLivro(cod_livro),
cod_livro varchar(10) not null,
qtd_estoque int not null
);

create table tbEditora (
primary key (cod_editora),
cod_editora varchar(14) not null,
telefone_1 varchar(11) not null,
telefone_2 varchar(11) not null,
email varchar(50) not null,
nome_contato varchar(50) not null
);





