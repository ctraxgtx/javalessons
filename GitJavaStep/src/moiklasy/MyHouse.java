package moiklasy;

public class MyHouse {
    public static void main(String[] args) {
        House house = new House(60,4,1);
        house.setFloors(5);
        house.getFloors();
        System.out.println(house.getPlace());
        System.out.println(house.getFloors());
    }
}
