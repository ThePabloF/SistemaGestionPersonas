package ec.edu.ups.clases;

import ec.edu.ups.enums.TipoDireccion;

public class Direccion {
    private TipoDireccion tipoDireccion;
    private String callePrincipal;
    private String calleSecundaria;
    private String numCasa;
    private String pais;
    private String provincia;
    private String ciudad;

    public Direccion(TipoDireccion tipoDireccion, String callePrincipal,String calleSecundaria, String numCasa, String pais, String provincia, String ciudad) {
        this.tipoDireccion = tipoDireccion;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numCasa = numCasa;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public TipoDireccion getTipo() {
        return tipoDireccion;
    }

    public void setTipo(String tipo) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "tipoDireccion=" + tipoDireccion +
                ", callePrincipal='" + callePrincipal + '\'' +
                ", calleSecundaria='" + calleSecundaria + '\'' +
                ", numCasa='" + numCasa + '\'' +
                ", pais='" + pais + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}

