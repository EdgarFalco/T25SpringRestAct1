DROP table IF EXISTS articulo;
DROP table IF EXISTS fabricante;

create table fabricante(
    codigo int auto_increment primary key,
    nombre varchar(250)    
);

create table articulo(
    codigo int auto_increment primary key,
    nombre varchar(250),
    precio int,
    fabricante int,    
    foreign key(fabricante) references fabricante(codigo)
    on delete cascade on update cascade
);

insert into fabricante(nombre)values('Connect');
insert into fabricante(nombre)values('Nike');
insert into fabricante(nombre)values('Supreme');
insert into fabricante(nombre)values('Capcom');
insert into fabricante(nombre)values('Fanta');

insert into articulo (nombre, precio, fabricante) values('botas', 60, 2);
insert into articulo (nombre, precio, fabricante) values('Juego', 50, 4);
insert into articulo (nombre, precio, fabricante) values('ropa', 30, 2);
insert into articulo (nombre, precio, fabricante) values('Refresco', 1, 5);
insert into articulo (nombre, precio, fabricante) values('Raton', 10, 1);
