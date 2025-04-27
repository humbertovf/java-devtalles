package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.setDoors(3);
        myHouse.setWindows(4);
        myHouse.setSize(10);

        House house2 = new House(4, 6, 20);
//        house2.doors = 4;
//        house2.windows = 6;
//        house2.size = 20;

        double area;

        System.out.println("La cantidad de puertas de la casa es: " + myHouse.getDoors());
        myHouse.openDoor();
        area = myHouse.calculateArea();
        System.out.println("El area de la casa es: " + area);

        System.out.println("La cantidad de puertas de la casa es: " + house2.getDoors());
        house2.openDoor();
        area = house2.calculateArea();
        System.out.println("El area de la casa es: " + area);
    }
}
