package co.edu.udea.udea_ruta2_ciclo2;

public class ClaseControlFlujo {

    public static void main(String[] args) {
        sentenciaIfThen();
        sentenciaIfThenElse();
        sentenciaSwitch();
        sentenciaWhile();
        sentenciaDoWhile();
        sentenciaFor();
    }

    public static void sentenciaIfThen() {
        double nota = 3.5;
        if (nota >= 3) {
            System.out.println("El estudiante aprobó.");
        }
    }

    public static void sentenciaIfThenElse() {
        double nota = 4.5;
        if (nota >= 0 && nota <= 1) {
            System.out.println("Deficiente");
        } else if (nota > 1 && nota <= 3) {
            System.out.println("Insuficiente");
        } else if (nota > 3 && nota <= 4) {
            System.out.println("Aprobado");
        } else if (nota > 4 && nota <= 5) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota inválida");
        }
    }

    public static void sentenciaSwitch() {
        int dia = 3;
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }
        System.out.println(nombreDia);
    }

    public static void sentenciaWhile() {
        int numero = 3;
        int i = 0;
        while (i <= 10) {
            System.out.println(numero + " * " + i + " = " + numero * i);
            i = i + 1;
        }
    }

    public static void sentenciaDoWhile() {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }

    public static void sentenciaFor() {
        for (int i = 1; i < 11; i++) {
            System.out.println("La cuenta va en: " + i);
        }
    }
}
