import CustomException.CustomException;

public class Main {
    public static void main(String[] args) throws Exception {

    }
    public static void exampleCustomException(){
        throw new CustomException();
    }
    //Excepciones controladas.
    public static void twoExceptionChecked(String[] args) throws Exception {
        //Two Diferent Exception
        try {
            checkedTwoException(true);
        }
        //el orden debe seguir el orden del arbol de excepciones. de lo mas especifico a lo mas general.
        catch(RuntimeException e){
            System.out.println("RuntimeException");
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("Exception");
            throw new Exception();
        }
    }
    private static void checkedTwoException(Boolean flag) throws Exception{
        if(flag){
            throw new Exception();
        } else{
            throw new RuntimeException();
        }
    }

    //finally
    private static void finallyExample()throws Exception{
        try {
            checkedException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            throw new Exception();
        }
        finally {
            System.out.println("Finished");
        }
    }

    private static void checkedException ()throws Exception{
        throw new Exception();
    };


    //Uncheked excepetion. no controlada
    public static void twoUnchekedException(String[] args) throws Exception {
        //Two Diferent Exception
        try {
            checkedTwoException(true);
        }
        //el orden debe seguir el orden del arbol de excepciones. de lo mas especifico a lo mas general.
        catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
 }

        private static void UnchekedTwoException(Boolean flag) throws Exception{
            if(flag){
                throw new ArithmeticException();
            } else{
                throw new NullPointerException();
            }
        }



    public static void arithmeticExceptionExample(){
        double number = 10/0;
    }
}