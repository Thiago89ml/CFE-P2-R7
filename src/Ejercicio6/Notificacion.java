package Ejercicio6;

public class Notificacion {
    public void enviarMensaje(String texto) {
        System.out.println("Mensaje simple: " + texto);
    }
    public void enviarMensaje(String texto , String destinatario){
        System.out.println("Mensaje para: " + destinatario +  ":" + texto  );
    }
    public void enviarMensaje(String texto,String destinatario, int prioridad) {
        System.out.println("Mensaje para:" + destinatario + "(Prioridad " + prioridad + "):" + texto );
    }
    public void enviarMensaje(String texto, String destinatario, int prioridad, String archivo) {
        System.out.println("Mensaje para " + destinatario + " (Prioridad " + prioridad + ")" + ", Archivo: " + archivo + "): " + texto);
    }
}

