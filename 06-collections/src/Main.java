import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] primitiveNumbers = new int[5];
        primitiveNumbers[0] = 10;
        primitiveNumbers[1] = 20;

        int[] newNumbers = new int[primitiveNumbers.length + 1];
        System.arraycopy(primitiveNumbers, 0, newNumbers, 0, primitiveNumbers.length);
        newNumbers[5] = 500;


        Integer[] wrapperNumbers = new Integer[5];
        wrapperNumbers[0] = 30;
        wrapperNumbers[1] = 40;

        System.out.println("Primitive numbers: " + Arrays.toString(primitiveNumbers));
        System.out.println("Wrapper numbers: " + Arrays.toString(wrapperNumbers));

        System.out.println("Tipo int");
        for (int number : primitiveNumbers) {
            System.out.println(number);
        }

        System.out.println("Tipo Integer");
        for (Integer number : wrapperNumbers) {
            System.out.println(number);
        }

        System.out.println("Looping new numbers fixed array");
        for (int number : newNumbers) {
            System.out.println(number);
        }
    }
}