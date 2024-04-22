public class VehivleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range=minivan.fuelcap* minivan.mpg;

        System.out.println("minivan mozhet perevezti " + minivan.passengers + " " +
                "passangers na rastojanie " + range + " milles ");

        Vehicle car1 = new Vehicle();
        car1.mpg = 25;
        Vehicle car2 = car1;

        System.out.println(car1.mpg);
        System.out.println(car2.mpg);

    }
}
