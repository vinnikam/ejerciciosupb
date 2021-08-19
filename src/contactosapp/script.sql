/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Vinni
 * Created: 19/08/2021
 */

create database `libreta_bd`;
CREATE USER 'elusuario' IDENTIFIED BY 'laclave';
GRANT USAGE ON *.* TO 'elusuario'@'%' IDENTIFIED BY 'laclave';
GRANT ALL privileges ON `libreta_bd`.* TO 'elusuario'@'%';

CREATE TABLE contactos (
    identificador BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) ,
    apellidos VARCHAR(100) ,
    correo VARCHAR(50) ,
    empresa VARCHAR(50) ,
    telefono numeric(10,0));

--postgres
CREATE TABLE contactos
(
  identificador serial NOT NULL,
  nombre text,
  apellidos text,
  telefono numeric(10),
  correo text,
  empresa text,
  CONSTRAINT contactos_pkey PRIMARY KEY (identificador)
)

select * from contactos
WHERE identificador = 1;

select * from contactos;

insert into contactos (nombre, apellidos, correo, telefono, empresa) 
values ('HELIOS', 'FERNANDEZ', 'C@C.COM', 3105252233,'RCN' );

UPDATE contactos set empresa = 'CARACOL' , apellidos = '', correo = '', telefono = 132, nombre = ''
WHERE identificador = 1;

delete from contactos 
WHERE identificador = 1;


