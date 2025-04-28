public class Bicycle extends Vehicle{
    private boolean hasBell;

    public Bicycle(String brand, String model, int year, boolean hasBell) {
        super(brand, model, year);
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "hasBell=" + hasBell +
                '}' + super.toString();
    }
}
