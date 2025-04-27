package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Gabriel";
        String name2 = "Matias";

        System.out.println(name == name2); // compare space in memory = false

        String name3 = new String("Gabriel");

        System.out.println("String comparison 3 = " + (name3 == name));

        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        Person person = new Person("Gabriel", "Chaldu");

        System.out.println(person.toString());
    }
}
