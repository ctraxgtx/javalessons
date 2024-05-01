public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,19,21);
        Vehicle sportcare = new Vehicle(2,14,12);

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcare.passengers = 2;
        sportcare.fuelcap = 14;
        sportcare.mpg = 12;

        range1 = minivan.range();
        range2 = sportcare.range();

        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " +
                range1 + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " +
                sportcare.passengers + " пассжиров на растояние " +
                range2 + " миль.");
    }
}
