package ec.edu.ups.clases;

import java.util.GregorianCalendar;

public class Vinculacion {
    private Persona persona;
    private Institucion institucion;
    private String rol;
    private GregorianCalendar fechaVinculacion;

    public Vinculacion(Persona persona, Institucion institucion, String rol, GregorianCalendar fechaVinculacion) {
        this.persona = persona;
        this.institucion = institucion;
        this.rol = rol;
        this.fechaVinculacion = fechaVinculacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public GregorianCalendar getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(GregorianCalendar fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }
}
