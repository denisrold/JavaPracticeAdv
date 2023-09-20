import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("London","New York","Tokio","Barcelona","Buenos Aires","Bogota","Ciudad de México","Lima"));

        for(int i = 0 ; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        for(String city : cities){
            System.out.println(city);
        }
        //Con stream para recorrer
        //expresion lambda*1
        cities.stream().forEach(city -> System.out.println(city));
        cities.forEach(city -> System.out.println(city));

        //referencia de metodo.
        //si quiero pasar la funcion directamente
        // :: -> hace referencia al metodo.
        cities.stream().forEach(Main::printCity);

        //ejecucion en varios nucleos -> PARALLEL
        //si el procesador tiene varios nucleos puedo usar el parallel para que ejecute en varios hilos
        cities.stream().parallel().forEach(city -> System.out.println(city));
        //separa la lista endiferentes lotes para procesarlos y luego los procesa esto logra que se procecen mas rapido
        //pero el enlistado sera diferente.


        System.out.println("Hello world!");
    }
    //*1
    //expresion lamba --> hacer funciones lo mas reducida posible
    public static void printCity(String city){
        System.out.println(city);
    };
}