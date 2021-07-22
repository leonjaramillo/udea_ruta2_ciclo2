package co.edu.udea.udea_ruta2_ciclo2.poo;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}
