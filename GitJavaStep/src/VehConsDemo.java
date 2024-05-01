public class VehConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcare = new Vehicle(2, 14, 12);
        int dist = 252;
        double gallons;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль мини-фургону " +
                "требуеться " + gallons + " галлонов топлева");

        gallons = sportcare.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль споркару " +
                "требуеться " + gallons + " галлонов топлева");

    }
}
