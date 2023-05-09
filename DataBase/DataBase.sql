create database automatizacion;
drop database automatizacion;
create table usuarios (
nombre char(20) not null,
apellido char(50)not null,
iduser char(20) not null,
documento char(50)not null,
primary key(iduser)
);
create table estado (
idestado char(20) not null,
tipo_estado char(60)not null,
primary key(idestado)
);
create table prioridad (
idprioridad char(20) not null,
tipo_prioridad char(50)not null,
primary key(idprioridad)
);
create table inicio (
hora time not null,
fecha date not null,
idinicio char(20) not null,
iduser char(20) not null,
primary key(idinicio) ,
foreign key (iduser) references usuarios (iduser)
);
create table incidencia (
nombre varchar(50) not null,
ubicacion varchar(50)not null,
noincidencia varchar(20) not null,
iduser char(20) not null,
idprioridad char(20) not null,
primary key(noincidencia),
foreign key (iduser) references usuarios (iduser),
foreign key (idprioridad) references prioridad (idprioridad)

);
create table encuentra (
N°registro char(20) not null,
noincidencia varchar(20) not null,
idestado char(20) not null,
descripcion char(80) not null,
fecha_registro datetime not null,
primary key(N°registro),
foreign key (idestado) references estado (idestado),
foreign key (noincidencia) references incidencia (noincidencia)
);
create table tiene (
N°registro char(20) not null,
noincidencia varchar(20) not null,
idprioridad char(20) not null,
descripcion char(80) not null,
fecha_registro datetime not null,
primary key(N°registro),
foreign key (idprioridad) references prioridad (idprioridad),
foreign key (noincidencia) references incidencia (noincidencia)
);
insert into usuarios values ('Andres Higuita', 'Gonzalo Benitez', '0001',
'1020467149');
insert into usuarios values ('Anderson Javier', 'Yanelo Fernandez', '0002',
'1415744740');
insert into usuarios values ('Camila Gonzales', 'Pamela Carnita', '0003',
'1476981734');
insert into usuarios values ('Andrea Fernanda', 'Ramira Calderza', '0004',
'1020467149');
insert into usuarios values ('Camilo Romero', 'Guzman Bernar', '0005',
'1024780014');
insert into usuarios values ('Juan Bernardo', 'Estival Gonselo', '0006',
'79304175');
insert into usuarios values ('Julian Hernandez', 'Gonzalo Caballero', '0007',
'456287391');

insert into usuarios values ('Jose Daniel', 'Felipe Armero', '0008',
'120014755');
insert into usuarios values ('Jerson David', 'Higuera Fernan', '0009',
'114777438');
insert into usuarios values ('Daniel Santiago', 'Cabrera Dento', '0010',
'4452103474');
insert into estado values ('E1', 'En proceso...');
insert into estado values ('E2', 'Nuevo');
insert into estado values ('E3', 'Solicitud completa...');
insert into estado values ('E4', 'cerrado verificado');
insert into prioridad values ('P1', 'Alta');
insert into prioridad values ('P2', 'Baja');
insert into prioridad values ('P3', 'normal');
insert into inicio values ('08:00', '2020-03-25', '01', '0001');
insert into inicio values ('08:10', '2020-03-20', '02', '0002');
insert into inicio values ('08:20', '2020-01-31', '03', '0003');
insert into inicio values ('20:02', '2020-04-28', '04', '0004');
insert into inicio values ('16:18', '2020-05-26', '05', '0005');
insert into inicio values ('07:35', '2021-01-30', '06', '0006');
insert into inicio values ('11:25', '2021-09-30', '07', '0007');
insert into inicio values ('12:13', '2021-03-19', '08', '0008');
insert into inicio values ('13:02', '2021-11-11', '09', '0009');
insert into inicio values ('22:34', '2022-10-25', '10', '0010');
insert into incidencia values ('Falla de domino', 'canapro', '00001', '0001','P1');
insert into incidencia values ('actualizacion de host', 'aventura', '00002',
'0001','P2');
insert into incidencia values ('Sincronizacion usuario de red', 'cc mall
plaza','00003',
'0001','P3');
insert into incidencia values ('Actualizacion credenciales', 'aventura',
'00004','0009','P1');
insert into incidencia values ('Instalación de controladores', 'canapro','00005',
'0004','P2');
insert into incidencia values ('Conexión escritorio Citrix', 'cc mall
plaza','00006', '0010','P2');

insert into incidencia values ('Acceso a partner', 'canapro', '00007',
'0010','P3');
insert into incidencia values ('Falla de domino', 'aventura', '00008',
'0006','P1');
insert into incidencia values ('Conexión escritorio Citrix', 'cc mall
plaza','00009', '0006','P3');
insert into incidencia values ('Sincronizacion usuario de red', 'canapro','00010',
'0006','P2');
insert into encuentra values ('19371820', '00001', 'E2', 'Se envia para la
gestion
correspondiente', '2022-07-12 09:55:55');
insert into encuentra values ('10203050', '00002', 'E1', 'Se asigna para
empezar la gestion',
'2022-06-23 09:33:55');
insert into encuentra values ('70707077', '00003', 'E3', 'Se confirma solicitud
resuelta',
'2022-08-19 09:30:55');
insert into encuentra values ('78855341', '00004', 'E1', 'Se asigna para
empezar la gestion',
'2022-07-10 09:22:55');
insert into encuentra values ('46437391', '00005', 'E4', 'Se confirma incidencia
resulta ',
'2022-08-09 09:23:55');
insert into encuentra values ('28246490', '00006', 'E2', 'Se envia para la
gestion
correspondiente', '2022-08-11 09:12:55');
insert into encuentra values ('25895347', '00007', 'E4', 'Se confirma
incidencia resulta',
'2022-07-12 09:34:55');
insert into encuentra values ('18570454', '00008', 'E1', 'Se asigna para
empezar la gestion',
'2022-06-22 09:09:55');
insert into encuentra values ('98653212', '00009', 'E3', 'Se confirma solicitud
resuelta',
'2022-08-23 09:14:55');

insert into encuentra values ('02154835', '00010', 'E2', 'Se envia para la
gestion
correspondiente', '2022-09-15 09:34:55');
insert into tiene values ('19371820', '00001', 'P1', 'prioridad alta ',
'2022-07-12 09:55:55');
insert into tiene values ('10203050', '00002', 'P2', 'prioridad baja',
'2022-06-23 09:33:55');
insert into tiene values ('70707077', '00003', 'P3', 'prioridad normal',
'2022-08-19 09:30:55');
insert into tiene values ('78855341', '00004', 'P1', 'prioridad alta',
'2022-07-10 09:22:55');
insert into tiene values ('46437391', '00005', 'P2', 'prioridad baja ',
'2022-08-09 09:23:55');
insert into tiene values ('28246490', '00006', 'P2', 'prioridad baja',
'2022-08-11 09:12:55');
insert into tiene values ('25895347', '00007', 'P3', 'prioridad normal',
'2022-07-12 09:34:55');
insert into tiene values ('18570454', '00008', 'P1', 'prioridad alta',
'2022-06-22 09:09:55');
insert into tiene values ('98653212', '00009', 'P3', 'prioridad normal',
'2022-08-23 09:14:55');
insert into tiene values ('02154835', '00010', 'P2', 'prioridad baja',
'2022-09-15 09:34:55');