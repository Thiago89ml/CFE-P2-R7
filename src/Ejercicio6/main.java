package Ejercicio6;

public class main {
    public static void main(String[] args){
        Notificacion notifiqueishon = new Notificacion();

        notifiqueishon.enviarMensaje("Buen dia");
        notifiqueishon.enviarMensaje("Buen dia","Pepe");
        notifiqueishon.enviarMensaje("Cuidado","Lucas",1);
        notifiqueishon.enviarMensaje("No te olvides","Diego",2,"formulario.png");
    }
}
