package co.edu.udea.udea_ruta2_ciclo2;

import co.edu.udea.udea_ruta2_ciclo2.poo.Estudiante;
import java.util.ArrayList;

public class PruebaOtroArrayList {
    public static void main(String[] args) {
        //Se declara e instancia un ArrayList de estudiantes
        ArrayList<Estudiante> inscritos = new ArrayList<>();
        //Se declaran e instancian los estudiantes de la clase existente
        Estudiante primero = new Estudiante("Juan", "Pérez", 16, 4.5);
        Estudiante segundo = new Estudiante("Pedro", "Cañas", 19, 3.5);
        Estudiante tercero = new Estudiante("Lucas", "Ruiz", 18, 3.9);
        Estudiante cuarto = new Estudiante("Tomás", "Álvarez", 21, 4.1);
        //Se agregan los estudiantes al ArrayList
        inscritos.add(primero);
        inscritos.add(segundo);
        inscritos.add(tercero);
        inscritos.add(cuarto);
        //Se verifica el tamaño del ArrayList
        System.out.println(inscritos.size());
        //Se elimina un elemento (el segundo)
        inscritos.remove(1);
        //Obtenemos el nombre del primer inscrito
        System.out.println(inscritos.get(0).getNombres());
        //Obtenemos el promedio del tercer inscrito
        System.out.println(inscritos.get(2).getPromedio());
    }
}
