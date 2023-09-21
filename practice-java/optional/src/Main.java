import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
    List<String> countries = new ArrayList<>();
    countries.addAll(Arrays.asList("United States","Argentina","Spain","Italy","Colombia","México","Ecuador","Peru"));
    //findFirst devuelve un Optional
    Optional<String> country =  countries.stream()
            .filter(c->c.startsWith("Arg")).findFirst();
    country.ifPresent(System.out::println);
    }
    public static void excampleOptional(Double ...scores){
        Optional<Double> result = averageScores(8.0,8.0,7.0,8.0,9.0);
        if(result.isPresent()){
            System.out.println(result.get());
        }
        else{
            System.out.println("Nothing to See");
        }
    }
    public static Optional<Double> averageScores(Double ...scores){
        //Objeto Opcional puede ser valor null o Double
        if(scores.length == 0){
            return Optional.empty();
        }
        double sum =0;
        for (Double score: scores) sum += score;
        return Optional.of(sum / scores.length);

    }
}