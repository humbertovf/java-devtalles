public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    public void popWheelie() {
        System.out.println("Motorcycle is doing a willy.");
    }

    @Override
    public void start() {
        System.out.println("The Motorcycle has been started.");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString(); // calling .toString() from Parent class -> Vehicle
    }
}
