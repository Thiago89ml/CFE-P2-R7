package Ejercicio5;

public class main {
    public static void main(String[] args){
        Conversion conver = new Conversion();

        System.out.println("Metros a centímetros: " + conver.convertir(1.34));
        System.out.println("Kilogramos a gramos: " + conver.convertir(3.0 ,"peso"));
        System.out.println("Celsius a Fahrenheit: "+ conver.convertir(21.3,true));
    }
}
