
package examen.pkg1_manriqueamador;

public class ObjHogar extends Objeto{
    private String vida,area;

    public ObjHogar(String vida, String area, String color, String descripcion, String marca, int tamano, int calidad, Persona dueno, double precio) {
        super(color, descripcion, marca, tamano, calidad, dueno, precio);
        this.vida = vida;
        this.area = area;
    }

    public ObjHogar() {
    }

    public String getVida() {
        return vida;
    }

    public String getArea() {
        return area;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
