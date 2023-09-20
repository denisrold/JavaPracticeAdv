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

        System.out.println("Hello world!");
    }
}