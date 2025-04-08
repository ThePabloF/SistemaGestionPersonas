package ec.edu.ups.clases;

public class Estudiante extends Persona {

    private String carrera;
    private boolean matricula;

    public Estudiante(String Carrera, String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula,nombre,apellido,telefono,correoElectronico);
        this.carrera = Carrera;

    }
    public Estudiante() {

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
