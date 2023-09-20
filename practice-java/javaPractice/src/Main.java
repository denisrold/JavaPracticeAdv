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
        cities.stream().forEach(city -> System.out.println(city));
                                //expresion lambda*1

        //si quiero pasar la funcion directamente
        cities.stream().forEach(Main::printCity);
        // :: -> hace referencia al metodo.

        System.out.println("Hello world!");
    }
    //*1
    //expresion lamba --> hacer funciones lo mas reducida posible
    public static void printCity(String city){
        System.out.println(city);
    };
}