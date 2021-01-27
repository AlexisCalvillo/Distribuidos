package hilos;

public class HelloThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 100000; i++)
            System.out.println((""+i).concat("Hola, soy el extends hilo: ".concat(Thread.currentThread().getName())));
    }
}
