package co.edu.udea.udea_ruta2_ciclo2.polimorfismo;

public class Bicicleta {

    private String marca;
    private String color;
    private double velocidad;
    private String pedales;

    public Bicicleta() {
        this.marca = "GW";
        this.color = "gris";
        this.velocidad = 0;
        this.pedales = "Shimano";
    }

    public Bicicleta(String marca, String color, double velocidad, String pedales) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
        this.pedales = pedales;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public void pedalear(double aceleracion) {
        this.velocidad = this.velocidad + aceleracion;
    }

    public void frenar() {
        if (this.velocidad > 0) {
            this.velocidad--;
        }
    }

    public String getDescripcion() {
        return "Soy una bicicleta de marca " + marca + ", con color " + color
                + ", a velocidad " + velocidad + " y con pedales " + pedales;
    }

}
