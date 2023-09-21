import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args)throws Exception {
Counter counter = new Counter();
//creo un proceso - un Hilo
Thread first = new Thread(counter,"First");
Thread second = new Thread(counter,"second");

first.start();
second.start();
//para esperar que finalize el hilo:
first.join();
second.join();
//hago esperar el proceso para que se procese
//Thread.sleep(2000);
        System.out.println(counter.count);
    }
   static class Counter extends Thread{
       public AtomicInteger count= new AtomicInteger(0);
        public void run(){
            for (int i =0 ; i < 1000000; i++){
            count.addAndGet(1);
            }
        }
    }
}