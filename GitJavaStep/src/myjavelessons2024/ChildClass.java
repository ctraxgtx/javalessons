package myjavelessons2024;

public class ChildClass extends ParrentClass {
    public String c= MainClassOOP.print("ChildClass.c");
    public String d = MainClassOOP.print("ChildClass.d");

    public ChildClass(){
        MainClassOOP.print("ChildClass.constructor");
    }
}
