package co.com.unisabaneta.threads;

public class ParallelProgrammingThreads {

    public static void main(String[] args) {
        ParallelWorker1 parallelWorker1 = new ParallelWorker1();
        //ParallelWorker2 parallelWorker2 = new ParallelWorker2();
        parallelWorker1.start();
        new Thread(new ParallelWorker2()).start();

    }
}

class ParallelWorker1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("ParallelWorker 1 esta ejecutando la tarea # " + i);
        }
    }
}

class ParallelWorker2 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("ParallelWorker 2 esta ejecutando la tarea # " + i);
        }
    }
}
