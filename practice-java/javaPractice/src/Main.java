import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        cities.stream().parallel().forEach(city -> System.out.println(city));

        //pipeline pasa metodo por metodo en la misma linea
        cities.stream().filter(city->city.startsWith("B")).forEach(city -> System.out.println(city));

        //Expresion lambda con varias lineas
        cities.stream().filter(city-> {
            Boolean result = city.startsWith("B");
            return result;
        }).forEach(city -> System.out.println(city));

        cities.stream().filter(city->city.startsWith("B"))
                .filter(city->city.contains("n"))
                .forEach(city -> System.out.println(city));

        //metodo terminal y no terminal
        List<String> filteredCities = cities.stream().filter(city->city.startsWith("B"))
                .filter(city->city.contains("n"))
                        .collect(Collectors.toList());

        System.out.println("Hello world!");
    }


    //*1
    //expresion lamba --> hacer funciones lo mas reducida posible
    public static void printCity(String city){
        System.out.println(city);
    };

}