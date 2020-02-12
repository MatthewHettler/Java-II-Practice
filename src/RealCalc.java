public class RealCalc extends Calc {

    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        try{
            return num1 / num2;
        }catch (ArithmeticException ae){
//            throws max number of integer since you cant divide by zero
            return Double.POSITIVE_INFINITY;
        }
    }

}
