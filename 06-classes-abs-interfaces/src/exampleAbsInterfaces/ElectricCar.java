package exampleAbsInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDriving{
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, int batteryLevel) {
        super(brand, model, year);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void drive() {
        System.out.println("Electric car is moving.");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = MAX_BATTERY_CAPACITY;
        System.out.println("Battery is full charged.");
    }

    @Override
    public void activateAutopilot() {

    }
}
