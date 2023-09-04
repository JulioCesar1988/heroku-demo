
/* CLIETES */
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave,telefono) VALUES(3, 'JULIO', 'JULIO','111111' ,'julio@ohmydog.com', '2017-08-28','CLIENTE','1234','123123');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave,telefono) VALUES(4, 'FRANCO', 'FRANCO','111111' ,'franco@ohmydog.com', '2017-08-28','CLIENTE','1234','123123');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave,telefono) VALUES(5, 'ELIZABETH', 'ELIZABETH','111111' ,'elizabeth@ohmydog.com', '2017-08-28','CLIENTE','1234','123123');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave,telefono) VALUES(6, 'MATIAS', 'MATIAS','111111' ,'matias@ohmydog.com', '2017-08-28','CLIENTE','1234','123123');



/* VETERINARIOS  */
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave,telefono) VALUES(400,'veterinario1', 'Veterinario1','111111' ,'veterinario1@ohmydog.com', '2017-08-28','VETERINARIO','1234','123123');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave,telefono) VALUES(401,'veterinario2', 'Veterinario2','111111' ,'veterinario2@ohmydog.com', '2017-08-28','VETERINARIO','1234','123123');


/*VETERINARIAS PARA MOSTRAR EN EL LISTADO*/
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(1, '8 am a 13 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(2, '9 am a 15 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(3, '7 am a 12 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(4, '4 am a 17 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(5, '8 am a 16 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(6, '1 am a 5 am', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(7, '7 am a 16 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(8, ' 24 horas', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');


/*CONTACTOS*/
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(1, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','CUIDADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(2, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','PASEADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(3, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','PASEADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(4, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','CUIDADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(5, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','PASEADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(6, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','CUIDADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(7, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','PASEADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(8, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','CUIDADOR','2017-08-28');
INSERT INTO contacto (id_contacto, telefono, direccion,email,tipo, create_at) VALUES(9, '1131234597', 'La Placa calle 1 y 50','matias@ohmydog.com','PASEADOR','2017-08-28');




/* PERROS*/
INSERT INTO perros (color, create_at, nombre, observacion, raza, id_cliente) VALUES('Negro','2022-04-10', 'Rokcy', 'pequeño', 'Pitbul', 3);


