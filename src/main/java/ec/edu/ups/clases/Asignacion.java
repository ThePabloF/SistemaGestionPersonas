package ec.edu.ups.clases;

import ec.edu.ups.enums.Rol;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private GregorianCalendar fechaInicio;
    private Rol rol;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Asignacion(Persona persona, GregorianCalendar fechaInicio, Rol rol) {
        this.persona = persona;

        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }



    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio ;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Asignacion {\n" +
                "\tPersona: " + (persona != null ? persona.toString() : "No asignada") + "\n" +
                "\tFecha de Inicio: " + (fechaInicio != null ? fechaInicio.getTime() : "No definida") + "\n" +
                "\tRol: " + rol + "\n" +
                "}";
    }
}
