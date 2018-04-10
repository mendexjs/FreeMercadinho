create table if not exists produto(
	codigoProduto bigint unique not null,
	nomeProduto varchar(128) not null,
    qtdEstoque int,
    valorUnid double not null,
    primary key(codigoProduto)
)engine=innodb;
create table if not exists compras(
	codCompra int auto_increment not null unique,
    valorCompra double not null,
    dataCompra datetime,
    formaPagamento varchar(16) not null,
    caixaAtendente varchar(32) not null,
    primary key(codCompra)
)engine=innodb;
drop table cliente;
create table if not exists cliente(
	cpf varchar(13) not null unique,
	nomeCliente varchar(32) not null,
	primary key (cpf)
) engine=innodb;
drop table avaliacoes;
create table if not exists avaliacoes(
	idAvaliacao int auto_increment not null unique,
	avaliacao int not null,
    nomeCaixa varchar(32) not null,
	cpf varchar(13) not null,
	dataAvalia datetime not null,
	foreign key(cpf) references cliente(cpf),
    primary key(idAvaliacao)
)engine=innodb;
