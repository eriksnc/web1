/*Si la Base de datos existe eliminala*/
Drop Schema if exists `fes_ico`;

/*Creacion de la BD*/
CREATE SCHEMA IF NOT EXISTS `fes_ico` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;

USE `fes_ico`;

CREATE TABLE `alumno`(
    `nombre_usuario` text not null,
    `carrera` text not null,
    `no_cuenta` int(10) not null,
    `direccion` text not null,
    `telefono` varchar(12) not null,
    `email` text not null,
    `password` varchar (8) not null,
    `fecha_registro` datetime not null default current_timestamp, 
    `permisos` int(11) not null default '1'

)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Agregar registros*/
INSERT INTO `alumno` (`nombre_usuario`,`carrera`,`no_cuenta`,`direccion`,`telefono`,`email`,`password`) values
('Erik Nájera','ICO','317233252','CD.Azteca 3rd','5511446853','eriknajera317@aragon.unam.mx','123654'),
('Angel Pérez','ICO','315203446' ,'Guerrero 378 G 128', '5576457476', 'correo_ejemplo@gmail.com', '123456'),
('Alejandro Vite','ICO','317031522','Zumpimito 23','5614285315','alexvi.spdr.11@gmail.com','1235678');

/*Definir la llave primaria*/
ALTER TABLE `alumno`
    ADD PRIMARY KEY (`no_cuenta`);



