DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
    trabajo enum('Veterano','Junior','Ingeniero','Medico','Enfermero'),
	salario double,
	fecha date
);

insert into empleado (nombre, trabajo, salario, fecha)values('Pepe', 'Veterano', 1000.00, NOW());
insert into empleado (nombre, trabajo, salario, fecha)values('Ibai', 'Streamer', 10000.00, NOW());
insert into empleado (nombre, trabajo, salario, fecha)values('Juan', 'Junior', 340.00, NOW());
insert into empleado (nombre, trabajo, salario, fecha)values('Jesu', 'Ingeniero', 4700.00, NOW());
insert into empleado (nombre, trabajo, salario, fecha)values('Josua', 'Medico', 800.00, NOW());
insert into empleado (nombre, trabajo, salario, fecha)values('Jonatan', 'Enfermero', 500.00, NOW());