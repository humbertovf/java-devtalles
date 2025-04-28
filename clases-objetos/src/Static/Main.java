package Static;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        // all this show the same count value
        counter1.showCount();
        counter2.showCount();
        counter3.showCount();
        counter4.showCount();
    }
}
