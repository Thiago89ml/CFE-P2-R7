package Ejercicio2;

public class main {
    public static void main(String[] args) {
        Empleado num1 = new Empleado();
        System.out.println("Sueldo total" + num1.calcularSueldoTotal());

        System.out.println("-----");

        Empleado num2 = new Empleado ("Jerry",1500.0);
        System.out.println("Sueldo total" + num2.calcularSueldoTotal());

        System.out.println("-----");

        Empleado num3 = new Empleado ("Howard",2500.0,10);
        System.out.println("Sueldo total" + num3.calcularSueldoTotal());
    }
}
