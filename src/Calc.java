public class Calc {

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        try{
            return num1 / num2;
        }catch (ArithmeticException ae){
//            throws max number of integer since you cant divide by zero
            return  (int) Double.POSITIVE_INFINITY;
        }
    }
}
