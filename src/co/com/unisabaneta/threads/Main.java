package co.com.unisabaneta.threads;

public class Main {

    public static void main(String[] args)  {

        Thread hilo1 = new NameThread("Giovanny");
        hilo1.start();
        Thread hilo2 = new NameThread("Pedro");
        hilo2.start();
        NameThread hilo3 = new NameThread("Maria");
        hilo3.start();

        System.out.println(hilo1.getState());

    }

}
