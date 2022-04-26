package co.com.unisabaneta.threads;

public class Contador implements Runnable {

    private int contador;
    private String nombre;
    private int limite;

    public Contador(String nombre, int limite) {
        this.contador = 0;
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    public void run() {
        while (contador <= limite) {
            System.out.println("Hilo " + nombre + ": " + contador);
            contador++;
        }
    }
}
