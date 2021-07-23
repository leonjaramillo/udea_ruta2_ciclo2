package co.edu.udea.udea_ruta2_ciclo2.polimorfismo;

public class BicicletaRuta extends Bicicleta {

    private double anchoNeumatico;

    public BicicletaRuta() {
        super();
        this.anchoNeumatico = 28;
    }

    public BicicletaRuta(double anchoNeumatico, String marca, String color, double velocidadInicial, String pedales) {
        super(marca, color, velocidadInicial, pedales);
        if (anchoNeumatico > 17 && anchoNeumatico <= 62) {
            this.anchoNeumatico = anchoNeumatico;
        } else {
            this.anchoNeumatico = 28;
        }
    }

    public double getAnchoNeumatico() {
        return anchoNeumatico;
    }

    public void setAnchoNeumatico(double anchoNeumatico) {
        this.anchoNeumatico = anchoNeumatico;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", y con ancho de neumático " + anchoNeumatico;
    }
}
