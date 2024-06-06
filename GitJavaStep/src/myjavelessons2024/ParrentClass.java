package myjavelessons2024;

public class ParrentClass {
    public String a = MainClassOOP.print("ParetntClass.a");
    public String b = MainClassOOP.print("ParetntClass.b");

    final private int number = 10;
    private int numberOne;



    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumber() {
        return number;
    }


    public ParrentClass() {
        MainClassOOP.print("ParrentClass.Constructor");
    }
}
