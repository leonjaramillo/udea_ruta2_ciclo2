package co.edu.udea.udea_ruta2_ciclo2.poo;

public class PruebaObjetos {

    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta();
        Estudiante inscrito = new Estudiante("Pepito", "Pérez", 17, 3.5);
        
        System.out.println(miBicicleta.getMarca());
        miBicicleta.setMarca("Specialized");
        System.out.println("La marca de mi bicicleta es " + miBicicleta.getMarca());
        System.out.println("Velocidad inicial: " + miBicicleta.getVelocidad());
        miBicicleta.pedalear(5);
        miBicicleta.pedalear(2);
        System.out.println("Velocidad actual: " + miBicicleta.getVelocidad());
        miBicicleta.frenar(6);
        System.out.println("Velocidad actual: " + miBicicleta.getVelocidad());
        System.out.println("Me llamo " + inscrito.getNombres() + " " + inscrito.getApellidos());
        System.out.println(inscrito.getEdad());
        System.out.println("Promedio: " + inscrito.getPromedio());
        inscrito.setPromedio(4.7);
        System.out.println("Nuevo promedio: " + inscrito.getPromedio());
        System.out.println("Operación loca... velocidad más promedio: " + (miBicicleta.getVelocidad() + inscrito.getPromedio()));
    }
}
