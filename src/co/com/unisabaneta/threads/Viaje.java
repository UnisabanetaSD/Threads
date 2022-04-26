package co.com.unisabaneta.threads;

public class Viaje implements Runnable {

    private String name;

    public Viaje(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + name);
            try {
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Su viaje es a :" + name);
    }
}
