/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_manriqueamador;

/**
 *
 * @author Usuario
 */
public class Zapato extends Objeto{
    private String talla,suela;
    private int confort;

    public Zapato(String talla, String suela, int confort, String color, String descripcion, String marca, int tamano, int calidad, Persona dueno, double precio) {
        super(color, descripcion, marca, tamano, calidad, dueno, precio);
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

    public Zapato() {
    }

    public String getTalla() {
        return talla;
    }

    public String getSuela() {
        return suela;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    public int getConfort() {
        return confort;
    }
    
}
