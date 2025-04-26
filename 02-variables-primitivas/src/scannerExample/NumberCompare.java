package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int firstNumber = scanner.nextInt(); // permite ingresar un numero int
        System.out.print("Ingrese segundo numero: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        System.out.println("La suma de primer numero + segundo numero = " + sum);
        System.out.println("La diferencia de primer numero - segundo numero = " + difference);

        String result = (firstNumber > secondNumber) ? "El primer numero es mayor." : "El segundo numero es mayor o igual.";
        System.out.println(result);
//        System.out.println((firstNumber > secondNumber) ? "El primer numero es mayor." : "El segundo numero es mayor o igual.");

        System.out.println("Fin de la app.");
        scanner.close();
    }
}
