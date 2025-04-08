package ec.edu.ups.clases;

import java.util.GregorianCalendar;

public class Visitante extends Persona {
    GregorianCalendar fechaEntrada;
    GregorianCalendar fechaSalida;
    public Visitante(GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida,String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
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
}
