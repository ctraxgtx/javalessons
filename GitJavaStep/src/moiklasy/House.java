package moiklasy;

public class House {
    private  int place;
    private int room;
    private int floors;

    public House(int place, int room, int floors) {
        this.place = place;
        this.room = room;
        this.floors = floors;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getPlace() {
        return place;
    }

    public int getRoom() {
        return room;
    }

    public int getFloors() {
        return floors;
    }

    public  void infoCam(int a, int b, int c){
        a = this.floors;
        b = this.place;
        c = this.room;
        System.out.println("floors " + a + ". Place " + b + ". Room " + c);
    }
}
