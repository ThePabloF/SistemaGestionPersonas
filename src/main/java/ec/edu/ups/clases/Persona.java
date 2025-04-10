package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private List<Direccion> direcciones;
    private List<Asignacion> asignaciones;


    public Persona(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direcciones = new ArrayList<Direccion>();

    }

    public Persona() {
        this.direcciones = new ArrayList<Direccion>();
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public void addDireccion(Direccion direccion, String callePrincipal, String calleSecundaria, String numCasa, String pais, String provincia, String ciudad) {
        direcciones.add(direccion);

    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    @Override
    public String toString() {
        return "Persona {\n" +
                "\tCédula: '" + cedula + "'\n" +
                "\tNombre: '" + nombre + "'\n" +
                "\tApellido: '" + apellido + "'\n" +
                "\tTeléfono: '" + telefono + "'\n" +
                "\tCorreo Electrónico: '" + correoElectronico + "'\n" +
                "\tDirecciones: " + direcciones + "\n" +
                "}";
    }
}
