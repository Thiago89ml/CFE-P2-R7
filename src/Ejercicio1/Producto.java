package Ejercicio1;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.nombre= "none";
        this.precio= 0.0;
        this.stock = 0;

    }

    public Producto (String nombre, double precio ) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock =0;
    }

    public Producto (String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock= stock;
    }

    public void mostrarinfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
    }

