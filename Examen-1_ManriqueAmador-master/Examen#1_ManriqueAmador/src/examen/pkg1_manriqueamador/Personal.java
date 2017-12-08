
package examen.pkg1_manriqueamador;

public class Personal extends Persona{
    private String ocupacion,horario;
    private String antiguedad;
    private double sueldo;

    public Personal(String ocupacion, String horario, String antiguedad, double sueldo, String nombre, String ID, String sexo, String estadoCivil, int edad) {
        super(nombre, ID, sexo, estadoCivil, edad);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Personal() {
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
