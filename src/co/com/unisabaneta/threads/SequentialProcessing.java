package co.com.unisabaneta.threads;

public class SequentialProcessing {

    public static void main(String[] args) {
        Worker1 worker1 = new Worker1();
        Worker2 worker2 = new Worker2();
        worker1.executeWork();
        worker2.executeWork();
    }

}

class Worker1 {
    public void executeWork(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Worker 1 esta ejecutando la tarea # " + i);
        }
    }
}

class Worker2 {
    public void executeWork(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Worker 2 esta ejecutando la tarea # " + i);
        }
    }
}

