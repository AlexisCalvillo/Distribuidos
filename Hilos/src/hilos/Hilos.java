package hilos;

public class Hilos {
    public static void main(String args[]){
        Counter aCounter;
        aCounter= new Counter(0);
        SynchronizedThread hilo3= new SynchronizedThread(aCounter);
        SynchronizedThread hilo4= new SynchronizedThread(aCounter);
        hilo3.start();
        hilo4.start();
        /*
        HelloThread h1 = new HelloThread();
        Thread h2 = new Thread(new HelloRunnable());
        h1.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h2.start();
        */
    }
}
