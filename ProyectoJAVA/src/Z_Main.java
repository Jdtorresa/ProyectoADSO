import java.util.ArrayList;
import java.util.Scanner;

public class Z_Main {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);


        gestion_encuentra encuentra = new gestion_encuentra();
        gestion_estado estado = new gestion_estado();
        gestion_incidencia incidencia = new gestion_incidencia();
        gestion_inicio inicio = new gestion_inicio();
        gestion_prioridad prioridad = new gestion_prioridad();
        gestion_tiene tiene = new gestion_tiene();
        gestion_usuarios usuarios = new gestion_usuarios();
        gestion_join_Encuentra_Incidencia_Tiene_Prioridad joinEITP = new gestion_join_Encuentra_Incidencia_Tiene_Prioridad();
        gestion_join_Inicio_Usuarios_Incidencia joinIUI = new gestion_join_Inicio_Usuarios_Incidencia();
        gestion_join_Incidencia_Usuarios joinIU = new gestion_join_Incidencia_Usuarios();
        gestion_join_Usuarios_Inicio joinUI = new gestion_join_Usuarios_Inicio();

        String R1;
        String R2;
        String R3;
        String R4;
        String R5;
        String R6;
        String R7;
        String R8;
        String KEY;

        System.out.println();
        // Menu R1 desde aqui hasta...
        System.out.println("A. Consultas");
        System.out.println("B. CRUD");
        System.out.println("C. Terminar");
        System.out.println();
        System.out.print("Seleccione una opcion --->  ");
        R1 = Entrada.next().toUpperCase();
        System.out.println();
        if (R1.equals("A")) {
            System.out.println("A. Consultas por fecha de inicio");
            System.out.println("B. Consultas por prioridad");
            System.out.println("C. Consultas por estado");
            System.out.println("D. Consultas por ubicacion");
            System.out.println("E. Volver");
            System.out.println();
            System.out.print("Seleccione una opcion --->  ");
            R2 = Entrada.next().toUpperCase();
            System.out.println();
            if (R2.equals("A")) {
                System.out.println(" A. Id del usuario que inicio el sistema el 2021-01-30");
                System.out.println(" B. Numero de incidencias que han sido asignadas al usuario que inicio el sistema el 2021-01-30");
                System.out.println(" C. Ubicacion de las incidencias que se han asignado la fecha del 2020-04-28");
                System.out.println();
                System.out.print("Seleccione una opcion --->  ");
                R3 = Entrada.next().toUpperCase();
                System.out.println();
                if (R3.equals("A")) {
                    String fecha = "2021-01-30";
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("ID_user:    " + inicio.C1(fecha).getIduser());
                    System.out.println("Fecha:      " + inicio.C1(fecha).getFecha());
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println();
                } else if (R3.equals("B")) {
                    String fecha = "2021-01-30";
                    ArrayList<incidencia> res = incidencia.C1(fecha);
                    int count = 0;
                    for (incidencia i : res) {
                        count++;
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("ID_user:                     " + joinUI.C1(fecha).getUser_iduser());
                    System.out.println("Nombre:                      " + joinUI.C1(fecha).getUser_nombre());
                    System.out.println("Fecha:                       " + joinUI.C1(fecha).getIni_fecha());
                    System.out.println("Cantidad de incidencias:     " + count);
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println();
                } else if (R3.equals("C")) {
                    String fecha = "2020-04-28";
                    ArrayList<incidencia> res = incidencia.C1(fecha);
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (incidencia i : res) {
                        System.out.println("Incidencia:    " + i.getNombre());
                        System.out.println("Ubicacion:     " + i.getUbicacion());
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                } else {
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Opcion invalida");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println();
                }
            } else if (R2.equals("B")) {
                System.out.println(" A. Nombre y numero de las incidencias que se encuetran con una prioridad baja");
                System.out.println(" B. Nombre y apellido de los usuarios que se les ha asignado incidencias con prioridad alta");
                System.out.println();
                System.out.print("Seleccione una opcion --->  ");
                R4 = Entrada.next().toUpperCase();
                System.out.println();
                if (R4.equals("A")) {
                    String priori = "P2";
                    ArrayList<incidencia> res = incidencia.C2(priori);
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (incidencia i : res) {
                        System.out.println("Nombre de incidencia: " + i.getNombre());
                        System.out.println("Numero de incidencia: " + i.getNoincidencia());
                        System.out.println("Prioridad: " + i.getIdprioridad());
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                } else if (R4.equals("B")) {
                    String priori = "P1";
                    ArrayList<join_Incidencia_Usuarios> res = joinIU.C1(priori);
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (join_Incidencia_Usuarios i : res) {
                        System.out.println("Nombres: " + i.getUser_nombre());
                        System.out.println("Apellidos: " + i.getUser_apellido());
                        System.out.println("Prioridad: " + i.getInci_idprioridad());
                        System.out.println("Descripcion: " + i.getInci_nombre());
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                } else {
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Opcion invalida");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println();
                }
            } else if (R2.equals("C")) {
                System.out.println(" A. Nombre y numero de las incidencias que se encuentran en estado 'En proceso...'");
                System.out.println(" B. Prioridad y numero de las incidencias que se encuentran en estado 'Nuevo'");
                System.out.println();
                System.out.print("Seleccione una opcion --->  ");
                R5 = Entrada.next().toUpperCase();
                System.out.println();
                if (R5.equals("A")) {
                    String estad = "E1";
                    ArrayList<incidencia> res = incidencia.C3(estad);
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (incidencia i : res) {
                        System.out.println("Nombre de incidencia: " + i.getNombre());
                        System.out.println("Numero de incidencia: " + i.getNoincidencia());
                        System.out.println("Estado: " + estad);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                } else if (R5.equals("B")) {
                    String estad = "E2";
                    ArrayList<join_Encuentra_Incidencia_Tiene_Prioridad> res = joinEITP.C1(estad);
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (join_Encuentra_Incidencia_Tiene_Prioridad i : res) {
                        System.out.println("Prioridad:        " + i.getPrioridad_tipo_prioridad());
                        System.out.println("ID incidencia:    " + i.getIncidencia_noincidencia());
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                } else {
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Opcion invalida");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println();
                }
            } else if (R2.equals("D")) {
                System.out.println(" A. El nombre y el id de inicio de los usuarios que han gestionado incidencias que tengan como ubicación 'aventura'");
                System.out.println();
                System.out.print("Seleccione una opcion --->  ");
                R6 = Entrada.next().toUpperCase();
                System.out.println();
                if (R6.equals("A")) {
                    String ubicaci = "aventura";
                    ArrayList<join_Inicio_Usuarios_Incidencia> res = joinIUI.C1(ubicaci);
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (join_Inicio_Usuarios_Incidencia i : res) {
                        System.out.println("Nombre user:   " + i.getUsuarios_nombre());
                        System.out.println("Id inicio:     " + i.getInicio_idinicio());
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                } else {
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Opcion invalida");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println();
                }
            } else if (!R2.equals("A") && !R2.equals("B") && !R2.equals("C") && !R2.equals("D") && !R2.equals("E")) {
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Opcion invalida");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println();
            }
            while (!R2.equals("E")) {
                System.out.println("A. Consultas por fecha de inicio");
                System.out.println("B. Consultas por prioridad");
                System.out.println("C. Consultas por estado");
                System.out.println("D. Consultas por ubicacion");
                System.out.println("E. Volver");
                System.out.println();
                System.out.print("Seleccione una opcion --->  ");
                R2 = Entrada.next().toUpperCase();
                System.out.println();
                if (R2.equals("A")) {
                    System.out.println(" A. Id del usuario que inicio el sistema el 2021-01-30");
                    System.out.println(" B. Numero de incidencias que han sido asignadas al usuario que inicio el sistema el 2021-01-30");
                    System.out.println(" C. Ubicacion de las incidencias que se han asignado la fecha del 2020-04-28");
                    System.out.println();
                    System.out.print("Seleccione una opcion --->  ");
                    R3 = Entrada.next().toUpperCase();
                    System.out.println();
                    if (R3.equals("A")) {
                        String fecha = "2021-01-30";
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("ID_user:    " + inicio.C1(fecha).getIduser());
                        System.out.println("Fecha:      " + inicio.C1(fecha).getFecha());
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    } else if (R3.equals("B")) {
                        String fecha = "2021-01-30";
                        ArrayList<incidencia> res = incidencia.C1(fecha);
                        int count = 0;
                        for (incidencia i : res) {
                            count++;
                        }
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("ID_user:                     " + joinUI.C1(fecha).getUser_iduser());
                        System.out.println("Nombre:                      " + joinUI.C1(fecha).getUser_nombre());
                        System.out.println("Fecha:                       " + joinUI.C1(fecha).getIni_fecha());
                        System.out.println("Cantidad de incidencias:     " + count);
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    } else if (R3.equals("C")) {
                        String fecha = "2020-04-28";
                        ArrayList<incidencia> res = incidencia.C1(fecha);
                        System.out.println("--------------------------------------------------------------------------------------");
                        for (incidencia i : res) {
                            System.out.println("Incidencia:    " + i.getNombre());
                            System.out.println("Ubicacion:     " + i.getUbicacion());
                            System.out.println();
                        }
                        System.out.println("--------------------------------------------------------------------------------------");
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("Opcion invalida");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                } else if (R2.equals("B")) {
                    System.out.println(" A. Nombre y numero de las incidencias que se encuetran con una prioridad baja");
                    System.out.println(" B. Nombre y apellido de los usuarios que se les ha asignado incidencias con prioridad alta");
                    System.out.println();
                    System.out.print("Seleccione una opcion --->  ");
                    R4 = Entrada.next().toUpperCase();
                    System.out.println();
                    if (R4.equals("A")) {
                        String priori = "P2";
                        ArrayList<incidencia> res = incidencia.C2(priori);
                        System.out.println("--------------------------------------------------------------------------------------");
                        for (incidencia i : res) {
                            System.out.println("Nombre de incidencia: " + i.getNombre());
                            System.out.println("Numero de incidencia: " + i.getNoincidencia());
                            System.out.println("Prioridad: " + i.getIdprioridad());
                            System.out.println();
                        }
                        System.out.println("--------------------------------------------------------------------------------------");
                    } else if (R4.equals("B")) {
                        String priori = "P1";
                        ArrayList<join_Incidencia_Usuarios> res = joinIU.C1(priori);
                        System.out.println("--------------------------------------------------------------------------------------");
                        for (join_Incidencia_Usuarios i : res) {
                            System.out.println("Nombres: " + i.getUser_nombre());
                            System.out.println("Apellidos: " + i.getUser_apellido());
                            System.out.println("Prioridad: " + i.getInci_idprioridad());
                            System.out.println("Descripcion: " + i.getInci_nombre());
                            System.out.println();
                        }
                        System.out.println("--------------------------------------------------------------------------------------");
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("Opcion invalida");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                } else if (R2.equals("C")) {
                    System.out.println(" A. Nombre y numero de las incidencias que se encuentran en estado 'En proceso...'");
                    System.out.println(" B. Prioridad y numero de las incidencias que se encuentran en estado 'Nuevo'");
                    System.out.println();
                    System.out.print("Seleccione una opcion --->  ");
                    R5 = Entrada.next().toUpperCase();
                    System.out.println();
                    if (R5.equals("A")) {
                        String estad = "E1";
                        ArrayList<incidencia> res = incidencia.C3(estad);
                        System.out.println("--------------------------------------------------------------------------------------");
                        for (incidencia i : res) {
                            System.out.println("Nombre de incidencia: " + i.getNombre());
                            System.out.println("Numero de incidencia: " + i.getNoincidencia());
                            System.out.println("Estado: " + estad);
                            System.out.println();
                        }
                        System.out.println("--------------------------------------------------------------------------------------");
                    } else if (R5.equals("B")) {
                        String estad = "E2";
                        ArrayList<join_Encuentra_Incidencia_Tiene_Prioridad> res = joinEITP.C1(estad);
                        System.out.println("--------------------------------------------------------------------------------------");
                        for (join_Encuentra_Incidencia_Tiene_Prioridad i : res) {
                            System.out.println("Prioridad:        " + i.getPrioridad_tipo_prioridad());
                            System.out.println("ID incidencia:    " + i.getIncidencia_noincidencia());
                            System.out.println();
                        }
                        System.out.println("--------------------------------------------------------------------------------------");
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("Opcion invalida");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                } else if (R2.equals("D")) {
                    System.out.println(" A. El nombre y el id de inicio de los usuarios que han gestionado incidencias que tengan como ubicación 'aventura'");
                    System.out.println();
                    System.out.print("Seleccione una opcion --->  ");
                    R6 = Entrada.next().toUpperCase();
                    System.out.println();
                    if (R6.equals("A")) {
                        String ubicaci = "aventura";
                        ArrayList<join_Inicio_Usuarios_Incidencia> res = joinIUI.C1(ubicaci);
                        System.out.println("--------------------------------------------------------------------------------------");
                        for (join_Inicio_Usuarios_Incidencia i : res) {
                            System.out.println("Nombre user:   " + i.getUsuarios_nombre());
                            System.out.println("Id inicio:     " + i.getInicio_idinicio());
                            System.out.println();
                        }
                        System.out.println("--------------------------------------------------------------------------------------");
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("Opcion invalida");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                } else if (!R2.equals("A") && !R2.equals("B") && !R2.equals("C") && !R2.equals("D") && !R2.equals("E")) {
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Opcion invalida");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println();
                }
            }
        }
        else if (R1.equals("B")) {
            // Menu R7 desde aqui hasta...
            System.out.println("A. Insertar resgistro");
            System.out.println("B. Eliminar resgistro");
            System.out.println("C. Actualizar resgistro");
            System.out.println("D. Volver");
            System.out.println();
            System.out.print("Seleccione una opcion --->  ");
            R7 = Entrada.next().toUpperCase();
            System.out.println();
            if (R7.equals("A")) {
                String accion = "Insertar";
                System.out.println("A." + accion + " registro en tabla 'encuentra'");
                System.out.println("B." + accion + " registro en tabla 'estado'");
                System.out.println("C." + accion + " registro en tabla 'incidencia'");
                System.out.println("D." + accion + " registro en tabla 'inicio'");
                System.out.println("E." + accion + " registro en tabla 'prioridad'");
                System.out.println("F." + accion + " registro en tabla 'tiene'");
                System.out.println("G." + accion + " registro en tabla 'usuarios'");
                System.out.println();
                System.out.print("Seleccione una opcion --->  "); R8 = Entrada.next().toUpperCase();
                System.out.println();
        // ---------------------------------------------------------------Insertar encuentra-------------------------------------------------------------------//
                if (R8.equals("A")) {
                    encuentra enc = new encuentra();
                    System.out.print("Ingrese un numero para N°registro: "); enc.setNºregistro(Entrada.next());
                    if(encuentra.ConsultarEncuentra(enc.getNºregistro()) == null){
                        System.out.print("Ingrese un numero de incidencia: "); enc.setNoincidencia(Entrada.next());
                        if(incidencia.consultarIncidencia(enc.getNoincidencia()) != null){
                            if(encuentra.consultarEncuentraPorIncidencia(enc.getNoincidencia()) == null){
                                System.out.print("Ingrese estado: "); enc.setIdestado(Entrada.next().toUpperCase());
                                if(estado.consultarEstado(enc.getIdestado()) != null){
                                    Entrada.nextLine();
                                    System.out.print("Ingrese descripcion: "); enc.setDescripcion(Entrada.nextLine());
                                    System.out.print("Ingrese fecha de inicio(YYYY-MM-DD): "); String fecha = Entrada.next();
                                    System.out.print("Ingrese hora de inicio(Hor:Min:Seg): "); String hora = Entrada.next();
                                    String fh = fecha + " " + hora;
                                    enc.setFecha_registro(fh);
                                    if(encuentra.insertarEncuentra(enc)){
                                        System.out.println();
                                        System.out.println("--------------------------------------------------------------------------------------");
                                        System.out.println("Se ha registrado exitosamente");
                                        System.out.println("--------------------------------------------------------------------------------------");
                                        System.out.println();
                                    }
                                    else{
                                        System.out.println();
                                        System.out.println("--------------------------------------------------------------------------------------");
                                        System.out.println("No fue posible hacer el registro");
                                        System.out.println("--------------------------------------------------------------------------------------");
                                        System.out.println();
                                    }
                                }
                                else{
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("El estado "+enc.getIdestado()+" no existe en la tabla 'estado'");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                            }
                            else{
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("Numero de incidencia ya esta en uso en tabla 'encuentra'");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                        }
                        else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("La incidencia numero "+enc.getNoincidencia()+" no existe en la tabla 'incidencia'");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El registro "+enc.getNºregistro()+" ya existe.");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }

        // ---------------------------------------------------------------Insertar Estado-------------------------------------------------------------------//
                } else if (R8.equals("B")) {
                    estado estad=new estado();
                    System.out.print("Ingrese un id para el nuevo estado: "); estad.setIdestado(Entrada.next().toUpperCase());
                    if(estado.consultarEstado(estad.getIdestado()) == null){
                        Entrada.nextLine();
                        System.out.print("Ingrese el tipo de estado: "); estad.setTipo_estado(Entrada.nextLine());
                        if(estado.insertarEstado(estad)){
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Se ha registrado exitosamente");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("No fue posible hacer el registro");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El id de estado  "+estad.getIdestado()+" ya existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                    // --------------------------------------------------------------- Aqui voy -------------------------------------------------------------------//
                    // ---------------------------------------------------------------Insertar Incidencia-------------------------------------------------------------------
                } else if (R8.equals("C")) {
                    incidencia incid=new incidencia();
                    System.out.print("Ingrese id incidencia: "); incid.setNoincidencia(Entrada.next());
                    if(incidencia.consultarIncidencia(incid.getNoincidencia())==null){
                        System.out.print("Ingrese id usuario: "); incid.setIduser(Entrada.next());
                        if(usuarios.consultarUsuarios(incid.getIduser())!=null){
                            System.out.print("Ingrese id prioridad: "); incid.setIdprioridad(Entrada.next().toUpperCase());
                            if(prioridad.consultarPrioridad(incid.getIdprioridad())!=null){
                                Entrada.nextLine();
                                System.out.print("Ingrese nombre incidencia: "); incid.setNombre(Entrada.nextLine());
                                System.out.print("Ingrese ubicacion incidencia: "); incid.setUbicacion(Entrada.nextLine());
                                if (incidencia.insertarIncidencia(incid)) {
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("Se ha registrado exitosamente");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                } else {
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("No fue posible hacer el registro");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                            }else{
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("El id de prioridad "+incid.getIdprioridad()+" no existe");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("El id de usuario "+incid.getIduser()+" no existe");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El numero de incidencia "+incid.getNoincidencia()+" ya existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();

                    }
                    // ---------------------------------------------------------------Insertar Inicio-------------------------------------------------------------------
                    // ----------Aqui voy
                } else if (R8.equals("D")) {
                    inicio init=new inicio();
                    System.out.println("Ingrese el id de inicio a insertar: "); init.setIdinicio(Entrada.next());
                    if(inicio.ConsultarInicio(init.getIdinicio())==null){
                        System.out.println("Ingrese el id del usuario: "); init.setIduser(Entrada.next());
                        if(usuarios.consultarUsuarios(init.getIduser())!=null){
                            System.out.println("Ingrese la hora de inicio (Hor:Min:Seg) : "); init.setHora(Entrada.next());
                            System.out.print("Ingrese fecha de inicio(YYYY-MM-DD): "); init.setFecha(Entrada.next());
                            if (inicio.insertarInicio(init)) {
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("Se ha registrado exitosamente");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            } else {
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("No fue posible hacer el registro");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("El id de usuario "+init.getIduser()+" no existe");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("El id de inicio "+init.getIdinicio()+" ya existe");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                    }
// ---------------------------------------------------------------Insertar Prioridad-------------------------------------------------------------------
                } else if (R8.equals("E")) {
                    prioridad priori=new prioridad();
                    System.out.print("Ingrese un id para la nueva prioridad: "); priori.setIdprioridad(Entrada.next());
                    if(prioridad.consultarPrioridad(priori.getIdprioridad())==null){
                        System.out.print("Ingrese el tipo de prioridad: "); priori.setTipo_prioridad(Entrada.next());
                        if(prioridad.insertarPrioridad(priori)){
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Se ha registrado exitosamente");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                        else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("No fue posible hacer el registro");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El id de prioridad "+priori.getIdprioridad()+" ya existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                    // ---------------------------------------------------------------Insertar Tiene-------------------------------------------------------------------
                } else if (R8.equals("F")) {
                    tiene tien=new tiene();
                    System.out.print("Ingrese un id para el nuevo registro: "); tien.setNºregitro(Entrada.next());
                    if(tiene.ConsultarTiene(tien.getNºregitro())==null){
                        System.out.print("Ingrese el numero de incidencia: "); tien.setNoincidencia(Entrada.next());
                        if(incidencia.consultarIncidencia(tien.getNoincidencia())!=null) {
                            System.out.print("Ingrese el id de la prioridad (P1, P2, P3): "); tien.setIdprioridad(Entrada.next().toUpperCase());
                            if(prioridad.consultarPrioridad(tien.getIdprioridad())!=null) {
                                System.out.print("Ingrese la descripcion: ");
                                tien.setDescripcion(Entrada.next());
                                System.out.print("Ingrese la fecha de registro: ");
                                tien.setFecha_registro(Entrada.next());
                                if (tiene.insertarTiene(tien)) {
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("Se ha registrado exitosamente");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                } else {
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("No fue posible hacer el registro");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                            }else{
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("El numero de incidencia "+tien.getIdprioridad()+" no existe");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("El numero de incidencia "+tien.getNoincidencia()+" no existe");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El numero de registro "+tien.getNºregitro()+" ya existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
// ---------------------------------------------------------------Insertar Usuarios-------------------------------------------------------------------
                } else if (R8.equals("G")) {
                    usuarios user=new usuarios();
                    System.out.print("Ingrese un id para el nuevo usuario: "); user.setIduser(Entrada.next());
                    if(usuarios.consultarUsuarios(user.getIduser())==null){
                        Entrada.nextLine();
                        System.out.print("Ingrese el nombre: "); user.setNombre(Entrada.nextLine());
                        System.out.print("Ingrese el apellido: "); user.setApellido(Entrada.nextLine());
                        System.out.print("Ingrese el documento: "); user.setDocumento(Entrada.next());
                        if(usuarios.insertarUsuario(user)){
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Se ha registrado exitosamente");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("No fue posible hacer el registro");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El numero de incidencia "+user.getIduser()+" ya existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }

                } else {
                    System.out.println("Opcion invalida");
                    System.out.println();
                }
            }
            else if (R7.equals("B")) {
                String accion = "Eliminar";
                System.out.println("A." + accion + " registro en tabla 'encuentra'");
                System.out.println("B." + accion + " registro en tabla 'estado'");
                System.out.println("C." + accion + " registro en tabla 'incidencia'");
                System.out.println("D." + accion + " registro en tabla 'inicio'");
                System.out.println("E." + accion + " registro en tabla 'prioridad'");
                System.out.println("F." + accion + " registro en tabla 'tiene'");
                System.out.println("G." + accion + " registro en tabla 'usuarios'");
                System.out.println();
                System.out.print("Seleccione una opcion --->  ");
                R8 = Entrada.next().toUpperCase();
                System.out.println();
                if (R8.equals("A")) {
                    System.out.println("Ingrese el Numero de registro a eliminar: ");
                    String nregistro=Entrada.next();
                    if(encuentra.eliminarEncuentra(nregistro)){
                        System.out.println("--Se elimino el registro correctamente--");
                    }else{
                        System.out.println("No se pudo eliminar...");
                    }
                } else if (R8.equals("B")) {
                    System.out.println("Ingrese el ID de estado a eliminar: ");
                    String numeroid=Entrada.next();
                    if(estado.eliminarEstado(numeroid)){
                        System.out.println("--Se elimino el registro correctamente--");
                    }else{
                        System.out.println("No se pudo eliminar...");
                    }
                } else if (R8.equals("C")) {
                    System.out.println("Ingrese el ID de incidencia a eliminar: ");
                    String numeroid=Entrada.next();
                    if(incidencia.eliminarIncidencia(numeroid)){
                        System.out.println("--Se elimino el registro correctamente--");
                    }else{
                        System.out.println("No se pudo eliminar...");
                    }
                } else if (R8.equals("D")) {
                    System.out.println("Ingrese el ID de inicio a eliminar: ");
                    String numeroid=Entrada.next();
                    if(inicio.eliminarInicio(numeroid)){
                        System.out.println("--Se elimino el registro correctamente--");
                    }else{
                        System.out.println("No se pudo eliminar...");
                    }
                } else if (R8.equals("E")) {
                    System.out.println("Ingrese el ID de la prioridad a eliminar: ");
                    String numeroid=Entrada.next();
                    if(prioridad.eliminarPrioridad(numeroid)){
                        System.out.println("--Se elimino el registro correctamente--");
                    }else{
                        System.out.println("No se pudo eliminar...");
                    }
                } else if (R8.equals("F")) {
                    System.out.println("Ingrese el ID de 'tiene' a eliminar: ");
                    String numeroid = Entrada.next();
                    if(tiene.eliminarTiene(numeroid)){
                        System.out.println("--Se elimino el registro correctamente--");
                    }else{
                        System.out.println("No se pudo eliminar...");
                    }
                } else if (R8.equals("G")) {
                    System.out.println("Ingrese el ID del usuario al eliminar: ");
                    String numeroid=Entrada.next();
                    if(usuarios.eliminarUsuario(numeroid)){
                        System.out.println("--Se elimino el registro correctamente--");
                    }else{
                        System.out.println("No se pudo eliminar...");
                    }
                } else {
                    System.out.println("Opcion invalida");
                    System.out.println();
                }
            } else if (R7.equals("C")) {
                String accion = "Actualizar";
                System.out.println("A." + accion + " registro en tabla 'encuentra'");
                System.out.println("B." + accion + " registro en tabla 'estado'");
                System.out.println("C." + accion + " registro en tabla 'incidencia'");
                System.out.println("D." + accion + " registro en tabla 'inicio'");
                System.out.println("E." + accion + " registro en tabla 'prioridad'");
                System.out.println("F." + accion + " registro en tabla 'tiene'");
                System.out.println("G." + accion + " registro en tabla 'usuarios'");
                System.out.println();
                System.out.print("Seleccione una opcion --->  "); R8 = Entrada.next().toUpperCase();
                System.out.println();
                if (R8.equals("A")) {
                    encuentra encuen= new encuentra();
                    System.out.print("Ingrese el numero de registro a actualizar: "); encuen.setNºregistro(Entrada.next());
                    if(encuentra.ConsultarEncuentra(encuen.getNºregistro())!=null){
                        System.out.println("||||| DATOS A ACTUALIZAR |||| id= "+encuen.getNºregistro());
                        System.out.print("Ingrese el numero de incidencia: "); encuen.setNoincidencia(Entrada.next());
                        if(incidencia.consultarIncidencia(encuen.getNoincidencia())!=null){
                            System.out.print("Ingrese el id de estado: "); encuen.setIdestado(Entrada.next());
                            if(estado.consultarEstado(encuen.getIdestado())!=null){
                                System.out.print("Ingrese la descripcion: "); encuen.setDescripcion(Entrada.next());
                                Entrada.nextLine();
                                System.out.print("Ingrese la fecha de registro: "); encuen.setFecha_registro(Entrada.nextLine());
                                if (encuentra.editarEncuentra(encuen)) {
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("Se ha registrado exitosamente");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }else{
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("No fue posible hacer el registro");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                            }else{
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("El id de estado "+encuen.getIdestado()+" no existe");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("El numero de incidencia "+encuen.getNoincidencia()+" no existe");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El numero de registro "+encuen.getNºregistro()+" no existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }

                } else if (R8.equals("B")) {
                    estado est=new estado();
                    System.out.print("Ingrese el id del estado a actualizar: "); est.setIdestado(Entrada.next());
                    if(estado.consultarEstado(est.getIdestado())!=null){
                            System.out.println("||||| DATOS A ACTUALIZAR |||| id= "+est.getIdestado());
                            System.out.print("Ingrese tipo de estado: "); est.setTipo_estado(Entrada.next());
                            if (estado.editarEstado(est)) {
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("Se ha registrado exitosamente");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("No fue posible hacer el registro");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El id de estado"+est.getIdestado()+" no existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();

                    }

                } else if (R8.equals("C")) {
                    incidencia inci=new incidencia();
                    System.out.print("Ingrese el numero de incidencia a actualizar: "); inci.setNoincidencia(Entrada.next());
                    if(incidencia.consultarIncidencia(inci.getNoincidencia())!=null){
                                System.out.println("||||| DATOS A ACTUALIZAR |||| id= "+inci.getNoincidencia());
                                System.out.print("Ingrese el id del usuario: "); inci.setIduser(Entrada.next());
                                if(usuarios.consultarUsuarios(inci.getIduser())!=null){
                                    System.out.print("Ingrese el id de la prioridad: "); inci.setIdprioridad(Entrada.next());
                                    if(prioridad.consultarPrioridad(inci.getIdprioridad())!=null){
                                        System.out.print("Ingrese el nombre de la incidencia: "); inci.setNombre(Entrada.next());
                                        System.out.print("Ingrese el la ubicacion de la incidencia: "); inci.setUbicacion(Entrada.next());
                                        if (incidencia.editarIncidencia(inci)) {
                                            System.out.println();
                                            System.out.println("--------------------------------------------------------------------------------------");
                                            System.out.println("Se ha registrado exitosamente");
                                            System.out.println("--------------------------------------------------------------------------------------");
                                            System.out.println();
                                        }else{
                                            System.out.println();
                                            System.out.println("--------------------------------------------------------------------------------------");
                                            System.out.println("No fue posible hacer el registro");
                                            System.out.println("--------------------------------------------------------------------------------------");
                                            System.out.println();
                                        }
                                    }else{
                                        System.out.println();
                                        System.out.println("--------------------------------------------------------------------------------------");
                                        System.out.println("El id de prioridad "+inci.getIdprioridad()+" no existe");
                                        System.out.println("--------------------------------------------------------------------------------------");
                                        System.out.println();
                                    }
                                }else{
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("El id de usuario "+inci.getIduser()+" no existe");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();

                                }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El numero de incidencia "+inci.getNoincidencia()+" no existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }


                } else if (R8.equals("D")) {
                    inicio inic=new inicio();
                    System.out.print("Ingrese el id de inicio a actualizar: "); inic.setIdinicio(Entrada.next());
                    if(inicio.ConsultarInicio(inic.getIdinicio())!=null){
                        System.out.println("||||| DATOS A ACTUALIZAR |||| id= "+inic.getIdinicio());
                        System.out.print("Ingrese el id del usuario: "); inic.setIduser(Entrada.next());
                        if(usuarios.consultarUsuarios(inic.getIduser())!=null){
                            System.out.print("Ingrese la fecha de inicio: "); inic.setFecha(Entrada.next());
                            System.out.print("Ingrese la hora de inicio: "); inic.setHora(Entrada.next());
                            if (inicio.editarInicio(inic)) {
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("Se ha registrado exitosamente");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("No fue posible hacer el registro");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("El id de usuario " + inic.getIduser() + " no existe");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El id de inicio " + inic.getIdinicio() + " no existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();

                    }
                } else if (R8.equals("E")) {
                    prioridad priori=new prioridad();
                    System.out.print("Ingrese el id de la prioridad a actualizar: "); priori.setIdprioridad(Entrada.next());
                    if(prioridad.consultarPrioridad(priori.getIdprioridad())!=null) {
                                System.out.println("||||| DATOS A ACTUALIZAR |||| id= "+priori.getIdprioridad());
                                System.out.print("Ingrese el tipo de prioridad: ");
                                priori.setTipo_prioridad(Entrada.next());
                                if (prioridad.editarPrioridad(priori)) {
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("Se ha registrado exitosamente");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }else{
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("No fue posible hacer el registro");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El id de prioridad " + priori.getIdprioridad() + " no existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                } else if (R8.equals("F")) {
                    tiene tien=new tiene();
                    System.out.print("Ingrese el numero de registro a actualizar: "); tien.setNºregitro(Entrada.next());
                    if(tiene.ConsultarTiene(tien.getNºregitro())!=null){
                        System.out.println("||||| DATOS A ACTUALIZAR |||| id= "+tien.getNºregitro());
                        System.out.print("Ingrese el numero de incidencia: "); tien.setNoincidencia(Entrada.next());
                        if(incidencia.consultarIncidencia(tien.getNoincidencia())!=null){
                            System.out.print("Ingrese el id de la prioridad: ");
                            if(prioridad.consultarPrioridad(tien.getIdprioridad())!=null){
                                System.out.print("Ingrese la descripcion: "); tien.setDescripcion(Entrada.next());
                                System.out.print("Ingrese la fecha de registro (YYYY-MM-DD Hor:Min:Seg):  "); tien.setFecha_registro(Entrada.next());
                                if (tiene.editarTiene(tien)) {
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("Se ha registrado exitosamente");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }else{
                                    System.out.println();
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println("No fue posible hacer el registro");
                                    System.out.println("--------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                            }else{
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println("El id de prioridad "+tien.getIdprioridad()+" no existe");
                                System.out.println("--------------------------------------------------------------------------------------");
                                System.out.println();
                            }
                        }else{
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("El numero de incidencia "+tien.getNoincidencia()+" no existe");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El numero de registro "+tien.getNºregitro()+" no existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }


                } else if (R8.equals("G")) {
                    usuarios usu = new usuarios();
                    System.out.print("Ingrese el ID del usuario a actualizar: "); usu.setIduser(Entrada.next());
                    if(usuarios.consultarUsuarios(usu.getIduser())!=null) {
                        System.out.print("Ingrese el nombre del usuario: ");
                        usu.setNombre(Entrada.next());
                        System.out.print("Ingrese el apellido del usuario: ");
                        usu.setApellido(Entrada.next());
                        System.out.print("Ingrese el documento del usuario: ");
                        usu.setDocumento(Entrada.next());
                        if (usuarios.editarUsuarios(usu)) {
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Se ha registrado exitosamente");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        } else {
                            System.out.println();
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("No fue posible hacer el registro");
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                    }else{
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("El id de usuario "+usu.getIduser()+" no existe");
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println();
                    }
                } else {
                    System.out.println("Opcion invalida");
                    System.out.println();
                }
            } else if (!R7.equals("A") && !R7.equals("B") && !R7.equals("C") && !R7.equals("D")) {
                System.out.println("Opcion invalida");
                System.out.println();
            }
            // Hasta aqui R7
            while (!R7.equals("D")) {
                /*Aqui va el menu R7 cuando ya no haya mas codigo que ponerle xd*/
            }
        }


        else if (!R1.equals("A") && !R1.equals("B") && !R1.equals("C")){
            System.out.println("Opcion invalida");
            System.out.println();
        }
        // Hasta aqui R1
        while(!R1.equals("C")){
            /*Aqui va el menu R1 cuando ya no haya mas codigo que ponerle xd*/
        }
    }
}