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
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,peso,observacion,foto,id_cliente) VALUES(1, 'Rocky', 'negro','unaRaza','2022-04-10','16Kg','una ubservacion','lasjdklasd',3);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,peso,observacion,foto,id_cliente) VALUES(2, 'Tobby', 'negro','unaRaza','2022-04-10','10Kg','una ubservacion','lasjdklasd',3);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,peso,observacion,foto,id_cliente) VALUES(5, 'Pichichus', 'negro','unaRaza','2022-04-10','17Kg','una ubservacion','lasjdklasd',3);
INSERT INTO perros (id_perro ,nombre,color , raza ,create_at,peso,observacion,foto,id_cliente) VALUES(6, 'Manchita', 'negro','unaRaza','2022-04-10','11Kg','una ubservacion','lasjdklasd',3);




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


/* Adopciones */
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero, adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(1, 'Terrier', 'Pequeño','marron', '5 meses', 'Hembra', false, null, null, null, null, 5, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero,adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(2, 'Mestizo', 'Mediano','negro','9 meses', 'Macho', true, '2022-04-10', 'Daniel Perez', '2213456783', 'daniel.perez@gmail.com', 3, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero,adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(3, 'Caniche', 'Mediano','marrón','1 año', 'Hembra', true, '2022-04-10', 'Juliana Alvarez', '2213457383', 'juliana.alvarez@gmail.com', 3, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero,adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(4, 'San Bernardo', 'Grande','marron con blanco','2 años', 'Macho', false, null, null, null, null, 3, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero,adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(5, 'Mestizo', 'Mediano','marron con blanco','9 meses', 'Hembra', false, null, null, null, null, 3, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero,adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(6, 'Mestizo', 'Mediano','marrón','10 meses', 'Hembra', true, '2022-04-10', 'Mariana Velez', '2213456783', 'mariana.velez@gmail.com', 4, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero,adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(7, 'Chihuahua', 'Pequeño','blanco con marron','1 año y medio', 'Macho', false, null, null, null, null, 5, now(), null);
INSERT INTO adopciones (id_adopcion, raza, tamanio, color, edad, genero,adoptado, fecha_adopcion, nombre_completo_adoptante, telefono_adoptante, email_adoptante, id_cliente, fecha_creacion, fecha_borrado) VALUES(8, 'Mestizo', 'Grande','blanco','1 año', 'Hembra', false, null, null, null, null, 4, now(), null);
