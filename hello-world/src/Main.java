//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo.");
        boolean isLoading = false;
        boolean isActive = true;
        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        short shortMinValue = Short.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        long longMinValue = Long.MIN_VALUE;

        System.out.println("Is loading? " + isLoading);
        System.out.println("Is active? " + isActive);

        System.out.println(byteMaxValue);
        System.out.println(byteMinValue);
        System.out.println(shortMaxValue);
        System.out.println(shortMinValue);
        System.out.println(intMaxValue);
        System.out.println(intMinValue);
        System.out.println(longMaxValue);
        System.out.println(longMinValue);
    }
}