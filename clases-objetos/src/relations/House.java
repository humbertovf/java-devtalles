package relations;

public class House {
    private Room room; // composition -> House must have rooms
    private Door door; // composition -> House must have doors
    private Owner owner; // asociation -> because House and Owner could exist not depending to each other

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}
