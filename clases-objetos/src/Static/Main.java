package Static;

public class Main {
    static String appName;

    static {
        appName = "Mi app en Java";
        System.out.println("appName = " + appName);
    }

    public static void main(String[] args) {
//        System.out.println("appName = " + appName);
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        // all this show the same count value
        counter1.showCount();
        counter2.showCount();
        counter3.showCount();
        counter4.showCount();

        int result = MathUtils.square(5);
        System.out.println("result = " + result);
    }
}
