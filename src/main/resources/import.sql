/* Populate tables */
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(1, 'veterinario1', 'Veterinario1','111111' ,'veterinario1@ohmydog.com', '2017-08-28','VETERINARIO','1234');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(2, 'veterinario2', 'Veterinario2','111111' ,'veterinario2@ohmydog.com', '2017-08-28','VETERINARIO','1234');

/*Clientes*/
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(3, 'JULIO', 'JULIO','111111' ,'julio@ohmydog.com', '2017-08-28','CLIENTE','1234');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(4, 'FRANCO', 'FRANCO','111111' ,'franco@ohmydog.com', '2017-08-28','CLIENTE','1234');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(5, 'ELIZABETH', 'ELIZABETH','111111' ,'elizabeth@ohmydog.com', '2017-08-28','CLIENTE','1234');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(6, 'MATIAS', 'MATIAS','111111' ,'matias@ohmydog.com', '2017-08-28','CLIENTE','1234');


/*VETERINARIAS PARA MOSTRAR EN EL LISTADO*/
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(1, '8 am a 13 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(2, '9 am a 15 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(3, '7 am a 12 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(4, '4 am a 17 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(5, '8 am a 16 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(6, '1 am a 5 am', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(7, '7 am a 16 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(8, ' 24 horas', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');


/*PERROS */
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(1, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(2, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(5, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(6, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);



INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(3, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',2);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(4, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',2);


