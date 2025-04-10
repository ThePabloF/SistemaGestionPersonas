package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    List<String> titulosAcademico;
    List<String> areaEspecializacion;
    public Profesor(String cedula, String nombre, String apellido, String telefono, String correoElectronico ) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.titulosAcademico = new ArrayList<String>();
        this.areaEspecializacion = new ArrayList<String>();

    }
    public Profesor() {
        this.titulosAcademico = new ArrayList<String>();
        this.areaEspecializacion = new ArrayList<String>();
    }
    public void addTitulosAcademicos(String titulosAcademicos) {
        titulosAcademico.add(titulosAcademicos);
    }
    public List<String> getTitulosAcademico() {
        return titulosAcademico;
    }

    public void addAreaEspecializacion(String area) {
        areaEspecializacion.add(area);
    }
    public List<String> getAreaEspecializacion() {
        return areaEspecializacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Profesor {\n" +
                "\tTítulos Académicos: " + titulosAcademico + "\n" +
                "\tÁrea de Especialización: " + areaEspecializacion + "\n" +
                "}";
    }
}
