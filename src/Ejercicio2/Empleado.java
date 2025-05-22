package Ejercicio2;

public class Empleado {
    private String nombre;
    private double sueldoBase;
    private int horasExtras;

    public Empleado() {
        this.nombre = "none";
        this.sueldoBase= 0.0;
        this.horasExtras = 0;
    }

    public Empleado(String nombre,double sueldoBase) {
        this.nombre= nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = 0;
    }

    public Empleado(String nombre, double sueldoBase,int horasExtras) {
        this.nombre= nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
    }

    public double calcularSueldoTotal() {
        return sueldoBase + (horasExtras * 250);
    }
}
