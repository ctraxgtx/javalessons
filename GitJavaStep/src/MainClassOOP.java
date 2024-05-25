public class MainClassOOP {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        ParrentClass parrentClass = new ParrentClass();
        int o = parrentClass.getNumber();
        parrentClass.setNumberOne(15);
        System.out.println("Parrent Class set/get numberOne = " +parrentClass.getNumberOne());

        System.out.println("get number from parrent class = " + o);
    }
    public static String print(String text){
        System.out.println(text);
        return text;
    }
}
