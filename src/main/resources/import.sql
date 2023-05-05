/* Populate tables */
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at) VALUES(1, 'Andres', 'Guzman','123123' ,'profesor@bolsadeideas.com', '2017-08-28');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at) VALUES(2, 'John', 'Doe','123123' ,'john.doe@gmail.com', '2017-08-28');

/*VETERINARIAS PARA MOSTRAR EN EL LISTADO*/
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(1, '8 am a 13 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(2, '9 am a 15 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(3, '7 am a 12 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(4, '4 am a 17 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(5, '8 am a 16 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(6, '1 am a 5 am', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(7, '7 am a 16 pm', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');
INSERT INTO veterinarias (id , horario , nombre , direccion) VALUES(8, ' 24 horas', 'Veterinaria GONNET ','Calle 1234 entre 321 y 234');


INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(1, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(2, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);


INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(3, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',2);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(4, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',2);


