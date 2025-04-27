package HouseExample;

public class ClassWrapper {
    public static void main(String[] args) {
        int number = 10;
        Integer number2 = Integer.valueOf(30);
        Integer number3 = 40;

        System.out.println(number2);

        //metodos mas importantes
        //.paseInt()
        int result = Integer.compare(10, 20);
        System.out.println("Printing result: " + result);


        if (true) {
            double size = 30.0;
        }
    }
}
