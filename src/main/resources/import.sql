/* Populate tables */
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol) VALUES(1, 'Veterinario_1', 'Veterinario_1','111111' ,'Veterinario_1@ohmydog.com', '2017-08-28','VETERINARIO');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol) VALUES(2, 'Veterinario_2', 'Veterinario_2','111111' ,'Veterinari_2o@ohmydog.com', '2017-08-28','VETERINARIO');

/*Clientes*/
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(3, 'JULIO', 'CONTRERAS','111111' ,'julio@ohmydog.com', '2017-08-28','CLIENTE','1234');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(4, 'FRANCO', 'VISCARDI','111111' ,'franco@ohmydog.com', '2017-08-28','CLIENTE','1234');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(5, 'ELIZABETH', 'MINCHACA','111111' ,'elizabeth@ohmydog.com', '2017-08-28','CLIENTE','1234');
INSERT INTO clientes (id_cliente, nombre, apellido,dni ,email, create_at,rol,clave) VALUES(6, 'MATIAS', 'AYUDANTE','111111' ,'matias@ohmydog.com', '2017-08-28','CLIENTE','1234');


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

INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(3, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',2);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(4, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',2);


INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(5, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,observacion,foto,id_cliente) VALUES(6, 'publuto', 'negro','unaRaza','2022-04-10','una ubservacion','lasjdklasd',1);





/* Adopciones */
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(1, 'Terrier', 'pequeño','marron', false, null, null, null, null, 5, now(), null);

INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(2, 'Mestizo', 'mediano','negro', true, '2022-04-10', 'Daniel Perez', '2213456783', 'daniel.perez@gmail.com', 3, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(3, 'Caniche', 'mediano','marrón', true, '2022-04-10', 'Juliana Alvarez', '2213457383', 'juliana.alvarez@gmail.com', 3, now(), null);

INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(4, 'San Bernardo', 'grande','marron con blanco', false, null, null, null, null, 3, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(5, 'Mestizo', 'mediano','marron con blanco', false, null, null, null, null, 3, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(6, 'Mestizo', 'mediano','marrón', true, '2022-04-10', 'Mariana Velez', '2213456783', 'mariana.velez@gmail.com', 4, now(), null);

INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(7, 'Chihuahua', 'pequeño','blanco con marron', false, null, null, null, null, 5, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(8, 'Mestizo', 'grande','blanco', false, null, null, null, null, 4, now(), null);

