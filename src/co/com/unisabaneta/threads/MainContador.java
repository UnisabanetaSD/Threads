package co.com.unisabaneta.threads;

public class MainContador {

    public static void main(String[] args) {

        Contador c1 = new Contador("Contador 1", 10);
        Contador c2 = new Contador("Contador 2", 20);
        Contador c3 = new Contador("Contador 3", 8);
        Contador c4 = new Contador("Contador 4", 15);

        Thread h1 = new Thread(c1);
        Thread h2 = new Thread(c2);
        Thread h3 = new Thread(c3);
        Thread h4 = new Thread(c4);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Fin del Programa");


    }

}
