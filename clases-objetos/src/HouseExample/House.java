package HouseExample;

public class House {

    int doors;
    int windows;
    double size;

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    void openDoor() {
        System.out.println("The door is open.");
    }

    double calculateArea(){
        return size * size;
    }
}
