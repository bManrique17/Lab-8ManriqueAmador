/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_manriqueamador;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Familiar extends Persona{
    private String rol,trabajo;
    private int altura,peso;
    ArrayList<Objeto> listObjetos= new ArrayList();

    @Override
    public String toString() {
        return super.toString();
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setListObjetos(ArrayList<Objeto> listObjetos) {
        this.listObjetos = listObjetos;
    }

    public Familiar(String rol, String trabajo, int altura, int peso, String nombre, String ID, String sexo, String estadoCivil, int edad) {
        super(nombre, ID, sexo, estadoCivil, edad);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public Familiar() {
    }

    public String getRol() {
        return rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public ArrayList<Objeto> getListObjetos() {
        return listObjetos;
    }
    
}
