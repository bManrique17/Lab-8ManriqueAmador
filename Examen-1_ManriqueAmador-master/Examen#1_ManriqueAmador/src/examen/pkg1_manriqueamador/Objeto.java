
package examen.pkg1_manriqueamador;

public class Objeto {
    protected String color,descripcion,marca,fecha;
    protected int tamano,calidad;
    protected Persona dueno;
    protected double precio;

    public Objeto(String color, String descripcion, String marca, int tamano, int calidad, Persona dueno, double precio) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.dueno = dueno;
        this.precio = precio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Objeto{" + "descripcion=" + descripcion + ", marca=" + marca + ", dueno=" + dueno + '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Objeto() {
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public int getTamano() {
        return tamano;
    }

    public int getCalidad() {
        return calidad;
    }

    public Persona getDueno() {
        return dueno;
    }

    public double getPrecio() {
        return precio;
    }
    
}
