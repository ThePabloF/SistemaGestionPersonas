import ec.edu.ups.clases.*;
import ec.edu.ups.enums.Rol;
import ec.edu.ups.enums.TipoDireccion;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void  main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Estudiante
        Estudiante estudiante = new Estudiante("Computacion", "0123456789","Pablo", "Feijo", "072805595","pfeijo@mail.com");

        //Profesor
        Profesor profesor = new Profesor("1","2", "3", "4", "");
        profesor.addAreaEspecializacion("Programacion Orientada a Objetos");
        profesor.addTitulosAcademicos("Computacion");

        //Administrativo
        Administrativo administrativo = new Administrativo("0123445423", "Dave", "Siguenza", "094252525113", "tvbdave@mail.com");
        administrativo.addCargos("Director de Carrera");
        administrativo.addResponsabilidades("Area de Computacion");

        //Visitante
        Visitante visitante = new Visitante("Consulta de Carrera",new GregorianCalendar(2023,2,15), new GregorianCalendar(2024, 2,30), "0965432109", "Victor", "Peralta", "1031312313", "Vperalta@mail.com");


        // CREACION DE INSTITUCIONES Y ASIGNACIONES
        Asignacion asignacion1 =  new Asignacion(estudiante,new  GregorianCalendar(2025,1,30),Rol.ESTUDIANTE);
        Asignacion asignacion2 =  new Asignacion(profesor,new  GregorianCalendar(2024,1,30),Rol.DOCENTE);
        Asignacion asignacion3 = new Asignacion(visitante,new  GregorianCalendar(2025,2,15),Rol.VISITANTE);
        Asignacion asignacion4 = new Asignacion(visitante,new  GregorianCalendar(2022,2,8),Rol.ADMINISTRATIVO);

        //INSTITUCIONES 1 Y 2
        Institucion institucion1 = new Institucion("Universidad Salesiana",101);
        Institucion institucion2 = new Institucion("Universidad de Cuenca",102);

        //CREACION INSTITUCION 1
        institucion1.addAsignacion(asignacion1);
        institucion1.getSedes().add("Campus Central");
        institucion1.addUbicacion(TipoDireccion.INSTITUCION,"Calle vieja","No me acuerdo","S/N","ECUADOR", "AZUAY","CUENCA");


        institucion1.addAsignacion(asignacion2);
        institucion1.getSedes().add("Campus Paute");
        institucion1.addUbicacion(TipoDireccion.INSTITUCION,"Calle vieja","No me acuerdo","S/N","ECUADOR", "AZUAY","CUENCA");

        //CREACION INSTITUCION 2
        institucion2.addAsignacion(asignacion3);
        institucion2.getSedes().add("Campus Central");
        institucion2.addUbicacion(TipoDireccion.INSTITUCION,"Av. 10 de agosto","Av. Loja","S/N","ECUADOR", "AZUAY","CUENCA");

        institucion2.addAsignacion(asignacion4);
        institucion2.getSedes().add("Campus Balzay");
        institucion2.addUbicacion(TipoDireccion.INSTITUCION,"Balzay Principal","Balzay Secundaria","S/N","ECUADOR", "AZUAY","CUENCA");



        System.out.println("INSTITUCION 1:");
        System.out.println(institucion1.toString());
        System.out.println("Personas Asociadas: ");
        System.out.println("ESTUDIANTE: "+estudiante.toString());
        System.out.println("PROFESOR: "+profesor.toString());
        System.out.println("INSTITUCION 2:"+"");
        System.out.println(institucion2.toString());
        System.out.println("VISITANTE: "+visitante.toString());
        System.out.println("ADMINISTRATIVO: "+administrativo.toString());
    }
}
