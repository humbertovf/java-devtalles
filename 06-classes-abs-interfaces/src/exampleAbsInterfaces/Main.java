package exampleAbsInterfaces;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000) {
            @Override
            public void drive() {
                System.out.println("I am driving!!");
            }
        };
        System.out.println(vehicle.toString());*/

        Vehicle electric = new ElectricCar("Fiat", "Duna", 2025, Color.RED, VehicleStatus.AVAILABLE, 80);
        System.out.println(electric.toString());
    }
}