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
public class Ropa extends Objeto{
    private String talla,material,pais;

    public Ropa(String talla, String material, String pais, String color, String descripcion, String marca, int tamano, int calidad, Persona dueno, double precio) {
        super(color, descripcion, marca, tamano, calidad, dueno, precio);
        this.talla = talla;
        this.material = material;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getTalla() {
        return talla;
    }

    public String getMaterial() {
        return material;
    }

    public Ropa() {
    }

    public String getPais() {
        return pais;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
