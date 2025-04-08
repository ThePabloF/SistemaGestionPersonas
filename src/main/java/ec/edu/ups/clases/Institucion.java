package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<Direccion> sedes;
    private Direccion ubicacion;
    private List<Asignacion> asignaciones;

    public Institucion( String nombre,int id) {
        this.nombre = nombre;
        this.id = id;
        this.sedes = new ArrayList<Direccion>();
        this.asignaciones = new ArrayList<Asignacion>();
    }


    public Institucion() {
        this.sedes = new ArrayList<Direccion>();
        this.asignaciones = new ArrayList<Asignacion>();
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
    public void addDireccion(Direccion direccion){
        sedes.add(direccion);
    }
    public List<Direccion> getDirecciones() {
        return sedes;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", ubicacion=" + ubicacion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
