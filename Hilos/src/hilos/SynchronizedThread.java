package hilos;

public class SynchronizedThread extends Thread{

    private Counter aC;

    public SynchronizedThread(Counter aC){
        this.aC=aC;
    }

    public void run(){
        aC.increaseAndPrint(Thread.currentThread().getName());
    }
}
