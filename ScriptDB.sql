create database mercado;
use mercado;
create table produto(
	codigoProduto int unique not null,
	nomeProduto varchar(64) not null,
    qtdEstoque int,
    valorUnid double not null,
    primary key(codigoProduto)
)engine=innodb;
create table compras(
	codCompra int auto_increment not null unique,
    valorCompra double not null,
    dataCompra datetime,
    formaPagamento varchar(16) not null,
    caixaAtendente varchar(32) not null,
    primary key(codCompra)
)engine=innodb;