package ec.edu.ups.clases;

import ec.edu.ups.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sedes;
    private Direccion ubicacion;
    private List<Asignacion> asignaciones;

    public Institucion( String nombre,int id) {
        this.nombre = nombre;
        this.id = id;
        this.sedes = sedes = new ArrayList<String>();
        this.asignaciones = new ArrayList<Asignacion>();
    }


    public Institucion() {
        this.asignaciones = new ArrayList<Asignacion>();
    }
    public Direccion getUbicacion() {
        return ubicacion;
    }

    public void addUbicacion(TipoDireccion tipoDireccion, String callePrincipal, String calleSecundaria, String numCasa, String pais, String provincia, String ciudad) {
        this.ubicacion = new Direccion(tipoDireccion,callePrincipal, calleSecundaria, numCasa, pais, provincia, ciudad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAsignacion(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    @Override
    public String toString() {
        return "Institucion {\n" +
                "\tID: " + id + "\n" +
                "\tNombre: " + nombre + "\n" +
                "\tSedes: " + sedes + "\n" +
                "\tUbicacion: " + (ubicacion != null ? ubicacion.toString() : "No definida") + "\n" +
                "\tAsignaciones: " + asignaciones + "\n" +
                "}";
    }
}
