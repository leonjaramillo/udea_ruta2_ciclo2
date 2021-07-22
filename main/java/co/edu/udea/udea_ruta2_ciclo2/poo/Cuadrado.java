package co.edu.udea.udea_ruta2_ciclo2.poo;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {
        this.lado = 0;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }

}
