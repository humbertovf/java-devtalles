package constants;

public class PracticaConstantes {
    public static void main(String[] args) {
        int workDays = 10;
        workDays = 20;
        workDays = 30;

        //Declaracion de constantes
        final double ANNUAL_INTEREST_RATE = 0.05;
        final double TAX_RATE = 0.1;

        int grossSalary = 3000;
        double netSalary = grossSalary * (1 - TAX_RATE);
        System.out.println("net salary = " + netSalary);

        String text = "Anita, lava la tina";
        String reversedText = "";
        System.out.println(text);

        text = text.toLowerCase().replaceAll("[^a-z]", "");
        for (int i = text.length()-1; i >=0 ; i--) {
            reversedText += text.charAt(i);
        }
        System.out.println(text.equals(reversedText));
        System.out.println("Original text ~ " + text);
        System.out.println("Reversed text ~ " + reversedText);
    }
}
