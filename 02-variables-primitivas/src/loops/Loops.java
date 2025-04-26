package loops;

public class Loops {
    public static void main(String[] args) {
        System.out.println("For Loop");
        String text = "Anita| lava19 la tina,";
        String reversedText = "";

        text = text.toLowerCase().replaceAll("[^a-z]", "");
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }

        System.out.println("Original text = " + text);
        System.out.println("Reversed text = " + reversedText);
        boolean isPalindrome = text.equals(reversedText);
        System.out.println("Is palindrome? " + isPalindrome);

        System.out.println("Printing 2s");
        final int MAX_COUNT = 10;
        for (int i = 2; i <= MAX_COUNT; i += 2) {
            System.out.println("Number: " + i);
        }

        System.out.println("While loop");
        int counter = 0;

        while (counter < 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        System.out.println("Do While loop");
        int counter2 = 0;
        do {
            System.out.println("Counter 2: " + counter2);
            counter2++;
        } while (counter2 < 5);
    }
}
