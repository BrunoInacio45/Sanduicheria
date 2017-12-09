CREATE TABLE produto (

codprod serial NOT NULL,
descprod VARCHAR (50) NOT NULL,
vlrprod FLOAT NOT NULL,
qtdprod SMALLINT NOT NULL DEFAULT '0',
PRIMARY KEY (codprod)

);


CREATE TABLE clientes (

codcli SERIAL NOT NULL ,
nomecli VARCHAR(50) NOT NULL,
telefone VARCHAR(20),
email varchar(30),
PRIMARY KEY (codcli)
);


--alter table clientes add column email varchar(30)

CREATE TABLE pedido(
nuped SERIAL NOT NULL ,
vlrnota FLOAT NOT NULL, --CAMPO CALCULADO COM A SOMA DOS VLRTOT DA TABELA itens_pedido
codcli INTEGER NOT NULL DEFAULT '0',
vlrpago float,
PRIMARY KEY (nuped),
CONSTRAINT pedidofk FOREIGN KEY (codcli) REFERENCES clientes(codcli) 
);
--alter table pedido add column vlrpago float 

CREATE TABLE itens_pedido(

nuped serial NOT NULL,
codprod INTEGER NOT NULL,
qtdprod SMALLINT NOT NULL,
CONSTRAINT itens_pedidopk PRIMARY KEY (nuped,codprod),
CONSTRAINT ITEFK1 FOREIGN KEY (nuped) REFERENCES pedido(nuped), 
CONSTRAINT ITEFK2 FOREIGN KEY (codprod) REFERENCES produto(codprod) 

);

--alter table itens_pedido drop column vlrprod

CREATE TABLE fecha_pedido(

nuped INTEGER NOT NULL,
vlrnota FLOAT,
VLRPAGO FLOAT,
VLRTROCO FLOAT,
CONSTRAINT FECHAPK PRIMARY KEY (nuped),
CONSTRAINT FECHAFK FOREIGN KEY (nuped) REFERENCES pedido(nuped)
);

CREATE TABLE public.users
(
  codUser serial ,
  nome character varying(300),
  senha character varying(50),
  tipo character varying(20),
  CONSTRAINT users_pkey PRIMARY KEY (codUser)
);

insert into users(nome,senha,tipo) values ('admin','12345','c');



--select itens_pedido.nuped,descprod,itens_pedido.qtdprod,vlrnota from itens_pedido
--inner join produto on itens_pedido.codprod = produto.codprod
--inner join pedido on itens_pedido.nuped = pedido.nuped where itens_pedido.nuped = '910107860'










