package ec.edu.ups.clases;

import java.util.GregorianCalendar;

public class Visitante extends Persona {
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;
    private String motivo;
    public Visitante(String motivo,GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida,String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {

    }
}
