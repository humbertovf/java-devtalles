package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doors = 2;
        myHouse.windows = 4;
        myHouse.size = 10;

        House house2 = new House();
        house2.doors = 4;
        house2.windows = 6;
        house2.size = 20;

        System.out.println("La cantidad de puertas de la casa es: " + house2.doors);
        house2.openDoor();
        double area = house2.calculateArea();
        System.out.println("El area de la casa es: " + area);
    }
}
