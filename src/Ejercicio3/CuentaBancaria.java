package Ejercicio3;

public class CuentaBancaria {
    private String titular;
    private int saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.titular="Invitado";
        this.saldo= 0;
        this.tipoCuenta = "Caja de ahorro";
    }
    public CuentaBancaria(String titular,int saldo){
        this.titular=titular;
        this.saldo=saldo;
        this.tipoCuenta = "Caja de ahorro";
    }
    public CuentaBancaria (String titular,int saldo,String tipoCuenta) {
        this.titular=titular;
        this.saldo =saldo;
        this.tipoCuenta = tipoCuenta;
    }
    public void MostrarResumen() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo " + saldo);
        System.out.println("Tipo de cuenta " + tipoCuenta);

        if(saldo <= 0){
            System.out.println("Estado: Cuenta sobregirada");
        } else {
            System.out.println("Estado : Fondos disponibles");
        }
        }
    }


