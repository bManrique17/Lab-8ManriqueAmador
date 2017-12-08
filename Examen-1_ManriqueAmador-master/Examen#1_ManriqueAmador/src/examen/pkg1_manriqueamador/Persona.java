
package examen.pkg1_manriqueamador;

import java.util.ArrayList;

public class Persona {
    protected String nombre,ID,sexo,estadoCivil;
    protected int edad;
    ArrayList<String> listMensajes = new ArrayList();

    public Persona(String nombre, String ID, String sexo, String estadoCivil, int edad) {
        this.nombre = nombre;
        this.ID = ID;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setListMensajes(ArrayList<String> listMensajes) {
        this.listMensajes = listMensajes;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<String> getListMensajes() {
        return listMensajes;
    }
    
}
