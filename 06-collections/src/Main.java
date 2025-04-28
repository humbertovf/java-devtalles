import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 100;
        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));

        int[] fixedArray = new int[100];
        System.out.println("Array length ~ " + fixedArray.length);
        System.out.println(Arrays.toString(fixedArray));

        //Dynamic
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(10);
        numbers2.add(100);

        System.out.println("Printing numbers2 -> " + numbers2);
    }
}