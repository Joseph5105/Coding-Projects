package utsa.edu.cs3443_map_project;

public class Room {

    private final int floor;
    private final String roomNumber;
    private final int x;
    private final int y;

    public Room( int floor, String roomName, int x, int y) {

        this.floor = floor;
        this.roomNumber = roomName;
        this.x = x;
        this.y = y;
    }


    public int getFloor() {
        return floor;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}