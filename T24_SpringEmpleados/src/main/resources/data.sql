

DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
    trabajo enum('gestor', 'ingeniero', 'streamer'),
	salario int
);

insert into empleado (nombre, trabajo, salario)values('Carlos', 'gestor', 1500); 