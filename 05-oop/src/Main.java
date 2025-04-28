//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);
//
//        vehicle.setYear(2001);
//
//        System.out.println(vehicle.toString());

        Vehicle myCar = new Car("Toyota", "Hilux", 2025, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        // Esto se logra porque ambas clases: Car/Motorcycle heredan de la clase padre Vehicle

        myCar.start();
        motorcycle.start();

        printVehicle(motorcycle);
        printVehicle(myCar);

        // Se ocupa castear porque si no, no se puede setear la cantidad de puertas ya que no aparecen.
        ((Car)myCar).setDoors(5);
        printVehicle(myCar);

    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}