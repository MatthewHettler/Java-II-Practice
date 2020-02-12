import java.util.Arrays;

public class TestIntClass {

    public static void main(String[] args){
        IntClass intClass = new IntClass(4);
        IntClass intClass2 = new IntClass(5);

//        intClass.setValue(4);
//        intClass2.setValue(5);

        int[] numArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(IntClass.sumArray(numArray).getValue());
        // This will add all the numbers in the numArray which outputs 55.

        System.out.println(IntClass.calcSum(intClass, intClass2));
        // This will add intClass  and intClass2 values which outputs 9.
    }
}
