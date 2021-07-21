package co.edu.udea.udea_ruta2_ciclo2.poo;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int edad;
    private double promedio;

    public Estudiante() {
        this.nombres = "";
        this.apellidos = "";
        this.edad = 0;
        this.promedio = 0.0;
    }

    public Estudiante(String nombres, String apellidos, int edad, double promedio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
