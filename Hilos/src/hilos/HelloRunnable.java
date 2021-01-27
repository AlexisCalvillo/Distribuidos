package hilos;

public class HelloRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i < 100000; i++)
            System.out.println(i+"Hola, soy el runnable hilo: ".concat(Thread.currentThread().getName()));
    }
}
