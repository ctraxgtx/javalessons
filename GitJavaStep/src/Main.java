import moiklasy.House;
import myjavelessons2024.StaticVariablesAndMethods;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StaticVariablesAndMethods staticVariablesAndMethods = new StaticVariablesAndMethods();
        staticVariablesAndMethods.show();
        House house = new House(0,0,0);
        house.setFloors(3);
        house.setPlace(300);
        house.setRoom(50);
        house.infoCam(house.getFloors(), house.getPlace(), house.getRoom());
    }

}
