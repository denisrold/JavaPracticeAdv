import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    //Creo un map que apartir de una aerolinea String me devuelve un precio Double
        private static Map<String,Double> pricesByAirline ;
        public static void main(String[] args) {
            init();
            String from = "BCN";
            String to = "JFK";

            Double lowestPrice = 0.0;
            Double avrPrive = 0.0;

            Double result = getPriceTrip("Delta Airlines",from,to);
                System.out.println(result);
            System.out.println(getLowestPrice(from,to));
    }
        private static Double getLowestPrice(String from, String to){
            //Con atomicReference hago atomico cualquier clase que tenga.
            AtomicReference<Double> lowestPrice = new AtomicReference<>(null);
            pricesByAirline.keySet().stream().parallel().forEach(airline -> {
                Double price = getPriceTrip(airline, from, to);

                if(lowestPrice.get() == null || lowestPrice.get() > price){
                    lowestPrice.set(price);
                };

            });
            return lowestPrice.get();
    };
     private static void init(){
        pricesByAirline  = new HashMap<>();

        pricesByAirline.put("America Airlines",550.0);
        pricesByAirline.put("Delta Airlines",610.0);
        pricesByAirline.put("Signapore AirLines",590.0);
        pricesByAirline.put("Us Airways",612.0);
        pricesByAirline.put("Qatar Airways",610.0);
        pricesByAirline.put("Sky Airline",540.0);
        pricesByAirline.put("Copa Airlines Colombia",610.0);
        pricesByAirline.put("Avianca",580.0);
        pricesByAirline.put("LATAM Aitlines Group",600.0);
        pricesByAirline.put("AeroMexico",740.0);
        pricesByAirline.put("Aerolineas Argentinas",940.0);

    };
     private static Double getPriceTrip(String airLine,String from, String to){
         //Simulo la llamada al servidor.
         try {
             Thread.sleep(1500);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
        return pricesByAirline.get(airLine);
    };
    public static void AtomicVarsExample1() throws Exception{
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