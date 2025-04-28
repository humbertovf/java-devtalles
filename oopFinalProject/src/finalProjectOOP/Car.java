package finalProjectOOP;

public class Car extends Vehicle{
    private CarType type;

    public Car(String brand, String model, int year, CarType type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Car has started.");
    }

    @Override
    public String toString() {
        return super.toString() + "Type: " + type;
    }
}
