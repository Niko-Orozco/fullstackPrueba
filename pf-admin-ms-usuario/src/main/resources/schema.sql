/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Nico
 * Created: 5/08/2022
 */

DROP TABLE IF EXISTS USUARIOS;
CREATE TABLE USUARIOS (
   id INTEGER NOT NULL AUTO_INCREMENT, 
   nombre VARCHAR(10) NOT NULL,
   apellido VARCHAR(10) NOT NULL,
   fechaDeNacimiento VARCHAR(10) NOT NULL,
   estadoCivil VARCHAR(10) NOT NULL,
   tieneHermanos VARCHAR(10) NOT NULL,
   estado VARCHAR(10) NOT NULL,
   roles VARCHAR(10) NOT NULL,
   PRIMARY KEY (id)
);

