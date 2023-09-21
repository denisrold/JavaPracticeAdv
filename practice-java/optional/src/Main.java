import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Objeto Opcional puede ser valor null o Double
        Optional<Double> result = averageScores();
        if(result.isPresent()){
            System.out.println(result.get());
        }
        else{
            System.out.println("Nothing to See");
        }
    }
    public static Optional<Double> averageScores(Double ...scores){
        if(scores.length == 0){
            return Optional.empty();
        }
        double sum =0;
        for (Double score: scores) sum += score;
        return Optional.of(sum / scores.length);

    }
}