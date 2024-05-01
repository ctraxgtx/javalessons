public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range(){
        return mpg * fuelcap;
    }

    double fuelneeded(int milles){
        return (double) milles / mpg;
    }
}
