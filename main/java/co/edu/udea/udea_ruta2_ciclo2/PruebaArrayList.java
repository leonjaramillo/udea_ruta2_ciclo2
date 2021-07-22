package co.edu.udea.udea_ruta2_ciclo2;

import java.util.ArrayList;

public class PruebaArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(427);
        numeros.add(-75);
        System.out.println(numeros.size());
        System.out.println(numeros.get(1));
        numeros.remove(2);
        System.out.println(numeros.size());
        numeros.clear();
        System.out.println(numeros.size());
    }
}
