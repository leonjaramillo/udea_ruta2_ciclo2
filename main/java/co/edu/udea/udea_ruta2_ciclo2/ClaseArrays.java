package co.edu.udea.udea_ruta2_ciclo2;

public class ClaseArrays {

    public static void main(String[] args) {
        //Se declara y crea el array
        int[] numeros = new int[9];
        //Se asignan valores a (inicializan) los elementos del array
        numeros[0] = 10;
        numeros[1] = 5;
        numeros[2] = 8;
        numeros[3] = 0;
        numeros[4] = -26;
        numeros[5] = 100;
        numeros[6] = 3000;
        numeros[7] = -7;
        numeros[8] = 5;
        //Se acceden los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println(numeros[3] + numeros[7]);
        System.out.println(numeros[6] / numeros[5]);
        //Se cambian los valores de algunos elementos del array
        numeros[7] = -14;
        numeros[3] = numeros[2] * numeros[1];
        //Se imprimen acceden los nuevos valores
        System.out.println(numeros[7]);
        System.out.println(numeros[3]);
    }
}
