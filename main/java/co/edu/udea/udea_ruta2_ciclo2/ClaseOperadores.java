package co.edu.udea.udea_ruta2_ciclo2;

public class ClaseOperadores {
    public static void main (String[] args) {
        int resultado = 1 + 2;
        // resultado es ahora 3
        System.out.println("1 + 2 = " + resultado);
        int resultadoOriginal = resultado;

        resultado = resultado - 1;
        // resultado es ahora 2
        System.out.println(resultadoOriginal + " - 1 = " + resultado);
        resultadoOriginal = resultado;

        resultado = resultado * 2;
        // resultado es ahora 4
        System.out.println(resultadoOriginal + " * 2 = " + resultado);
        resultadoOriginal = resultado;

        resultado = resultado / 2;
        // resultado es ahora 2
        System.out.println(resultadoOriginal + " / 2 = " + resultado);
        resultadoOriginal = resultado;

        resultado = resultado + 8;
        // resultado es ahora 10
        System.out.println(resultadoOriginal + " + 8 = " + resultado);
        resultadoOriginal = resultado;

        resultado = resultado % 7;
        // resultado es ahora 3
        System.out.println(resultadoOriginal + " % 7 = " + resultado);
        
        String primeraCadena = "Esta es";
        String segundaCadena = " una cadena de caracteres concatenada.";
        String terceraCadena = primeraCadena+segundaCadena;
        System.out.println(terceraCadena);
        //Imprime la cadena completa
        
        int i = 3;
        i++;
        // Imprime 4
        System.out.println(i);
        ++i;			   
        // Imprime 5
        System.out.println(i);
        // Imprime 6
        System.out.println(++i);
        // Imprime 6
        System.out.println(i++);
        // Imprime 7
        System.out.println(i);
        
        int valor1 = 1;
        int valor2 = 2;
        if(valor1 == valor2)
            System.out.println("valor1 == valor2");
        if(valor1 != valor2)
            System.out.println("valor1 != valor2");
        if(valor1 > valor2)
            System.out.println("valor1 > valor2");
        if(valor1 < valor2)
            System.out.println("valor1 < valor2");
        if(valor1 <= valor2)
            System.out.println("valor1 <= valor2");
        
        valor1 = 1;
        valor2 = 2;
        if((valor1 == 1) && (valor2 == 2))
            System.out.println("valor1 es 1 AND valor2 es 2");
        if((valor1 == 1) || (valor2 == 1))
            System.out.println("valor1 es 1 OR valor2 es 1");
    }
}
