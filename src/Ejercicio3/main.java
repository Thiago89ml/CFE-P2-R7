package Ejercicio3;

public class main {
    public static void main(String[] args) {

        CuentaBancaria num1= new CuentaBancaria();
        num1.MostrarResumen();

        System.out.println("------");

        CuentaBancaria num2= new CuentaBancaria("Juan",1200);
        num2.MostrarResumen();

        System.out.println("------");

        CuentaBancaria num3 = new CuentaBancaria("Harry",2000,"Cuenta de nómina");
        num3.MostrarResumen();
    }
}