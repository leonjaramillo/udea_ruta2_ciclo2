package co.edu.udea.udea_ruta2_ciclo2.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Mecanico {

    private List<String> misPedales;
    
    public Mecanico() {
        misPedales = new ArrayList<>();
    }

    public List<String> getMisPedales() {
        return misPedales;
    }

    public void setMisPedales(List<String> misPedales) {
        this.misPedales = misPedales;
    }

    public void ponerPedales(Bicicleta unaCicla) {
        String pedalesAPoner = this.misPedales.get(0);
        unaCicla.setPedales(pedalesAPoner);
        this.misPedales.remove(0);
        System.out.println("Pongo pedales de marca " + pedalesAPoner +
                " a una " + unaCicla.getClass().getSimpleName());
    }
}
