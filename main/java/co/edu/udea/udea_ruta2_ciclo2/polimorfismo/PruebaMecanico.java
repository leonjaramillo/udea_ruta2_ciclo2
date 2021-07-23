package co.edu.udea.udea_ruta2_ciclo2.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class PruebaMecanico {

    public static void main(String[] args) {
        Bicicleta cicla01, cicla02, cicla03, cicla04;
        
        cicla01 = new Bicicleta();
        cicla02 = new BicicletaMontania(5, "Trek", "Rojo", 0, "SRAM");
        cicla03 = new BicicletaRuta(32, "Specialized", "Azul", 0, "Shimano");
        cicla04 = new BicicletaMontania(6, "Scott", "Blanco", 0, "SRAM");
        
        List<Bicicleta> bicicletas = new ArrayList<>();
        bicicletas.add(cicla01);
        bicicletas.add(cicla02);
        bicicletas.add(cicla03);
        bicicletas.add(cicla04);
        
        Mecanico juancho = new Mecanico();
        juancho.getMisPedales().add("Pinarello");
        juancho.getMisPedales().add("Scott");
        juancho.getMisPedales().add("Cannondale");
        juancho.getMisPedales().add("Giant");

        for (Bicicleta miCicla : bicicletas) {
            juancho.ponerPedales(miCicla);
        }

    }

}
