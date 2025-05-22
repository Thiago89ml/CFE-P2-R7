package Ejercicio1;

public class main {
    public static void main(String[] args) {

        Producto n1= new Producto();
        n1.mostrarinfo();

        System.out.println("---");

        Producto n2 = new Producto("Queso",25.0);
        n2.mostrarinfo();

        System.out.println("---");

        Producto n3 = new Producto("Arroz",30.0,12);
        n3.mostrarinfo();
    }
}