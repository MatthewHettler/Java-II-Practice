public class IntClass {
//    Exercise 01: The IntClass class.

//    This exercise will test Primitives, Objects, Methods, Arrays, Loops

//    For this exercise we are going to create a wrapper class for the primitive type “int”. The class will have a getter and a setter and other methods for doing operations common to integers.
//    Step 1) Create a class name IntClass in the review folder.
//    Step 2) Add an attribute named “value” of type int.
//    Step 3) Add getters and setters for the attribute.
//    Step 4) Add an instance method named calcSum, to return the sum this instance with the sum of another instance passed as a parameter.
//    public int calcSum(IntClass myInt);
//    Step 5) Create a class method named calcSum to return the sum of two instances of the IntClass.
//    public static int calcSum(IntClass valOne, IntClass valTwo);
//    Step 6) Create a constructor to create a new instance of IntClass based on the value of a passed down int.  public IntClass(int val);
//    Step 7) Create a class method to take in an array of int and return a new instance of IntClass with the value equal to the sum of the array.
//    public static IntClass sumArray(int[] x);
//    Step 8) Create a main method to test each of these methods.
    private int value;

    public IntClass(int val){
        this.value = val;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int calcSum(IntClass myInt){
        return this.value + myInt.getValue();
    }

    public static int calcSum(IntClass valOne, IntClass valTwo){
        return valOne.getValue() + valTwo.getValue();
    }

    public static IntClass sumArray(int[] x){
        int sum = 0;

        for(int number : x){
            sum += number;
        }

        return new IntClass(sum);
    }
}
