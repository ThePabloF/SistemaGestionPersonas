package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona {
   List<String> cargos;
    List<String> responsabilidades;

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula,nombre,apellido,telefono,correoElectronico);

    }
    public Administrativo() {
        cargos = new ArrayList<String>();
        responsabilidades = new ArrayList<String>();

    }



    public void addCargos(String cargo) {
        System.out.println();
        cargos.add(cargo);
    }
    public List<String> getCargos() {
        return cargos;
    }
    public void addResponsabilidades(String responsabilidad) {
        responsabilidades.add(responsabilidad);
    }
    public List<String> getResponsabilidades() {
        return responsabilidades;
    }


}
