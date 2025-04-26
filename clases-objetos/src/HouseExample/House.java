package HouseExample;

public class House {

    int doors;
    int windows;
    double size;

    void openDoor() {
        System.out.println("The door is open.");
    }

    double calculateArea(){
        return size * size;
    }
}
