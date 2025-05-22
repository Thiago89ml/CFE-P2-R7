package Ejercicio5;

public class Conversion {

    public double convertir(double metros) {
        return metros * 100;
    }

    public double convertir (double kilogramos, String tipo) {
        if (tipo.equals("peso")) {
            return (kilogramos * 100);
        } else {
            System.out.println("El tipo no es reconocido");
            return 0;
        }
    }public double convertir(double temperatura,boolean esTemperatura ) {
            if (esTemperatura){
                return(temperatura * 9/5) + 32;
            } else {
                System.out.println("No es posible la conversion de temperaturas");
                return 0;
            }
        }
    }

