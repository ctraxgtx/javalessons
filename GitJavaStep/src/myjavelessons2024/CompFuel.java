package myjavelessons2024;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportcare = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcare.passengers = 2;
        sportcare.fuelcap = 14;
        sportcare.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль мини-фургону " +
                "требуеться " + gallons + " галлонов топлева");

        gallons = sportcare.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль споркару " +
                "требуеться " + gallons + " галлонов топлева");

    }
}
