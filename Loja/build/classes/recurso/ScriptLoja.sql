drop database if exists loja;
create database loja;

use loja;

create table frete (
codigo int primary key,
tipo   varchar(100),
valor decimal(6,2)
);

create table forma_pagamento(
codigo int primary key,
descricao varchar(100)
);

create table venda (
codigo int primary key,
data_venda datetime,
valor decimal(10,2),
cod_frete int,
cod_forma_pagamento int,
numero_parcelas int,
desconto decimal(10,2),
valor_final decimal(10,2),
foreign key(cod_frete) references frete(codigo),
foreign key(cod_forma_pagamento) references forma_pagamento(codigo)
);

