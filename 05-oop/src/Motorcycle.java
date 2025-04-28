public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private Engine engine;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
        this.engine = new Engine();
    }

    public void popWheelie() {
        System.out.println("Motorcycle is doing a willy.");
    }

    public void start() {
        System.out.println("The Motorcycle has been started.");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString(); // calling .toString() from Parent class -> Vehicle
    }
}
