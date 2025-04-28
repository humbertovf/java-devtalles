package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = getNumber(scanner, "Ingrese primer numero: ");
        int secondNumber = getNumber(scanner, "Ingrese segundo numero: ");
        int sum = sum(firstNumber, secondNumber);
        int difference = difference(firstNumber, secondNumber);
        System.out.println("La suma de primer numero + segundo numero = " + sum);
        System.out.println("La diferencia de primer numero - segundo numero = " + difference);

        String result = compareNumber(firstNumber, secondNumber);
        System.out.println(result);
    }

    public  static int getNumber(Scanner scanner, String message) {
        System.out.print(message);
        int number = scanner.nextInt(); // permite ingresar un numero int
        return number;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static void printArithmeticoperations(int firstNumber, int secondNumber) {
        System.out.println("La suma de primer numero + segundo numero = " + (firstNumber + secondNumber));
        System.out.println("La diferencia de primer numero - segundo numero = " + (firstNumber - secondNumber));
    }

    public static String compareNumber(int firstNumber, int secondNumber) {
        return (firstNumber > secondNumber) ? "El primer numero es mayor." : "El segundo numero es mayor o igual.";
    }
}
