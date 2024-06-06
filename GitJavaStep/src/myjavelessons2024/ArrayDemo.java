package myjavelessons2024;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] simple = new int[10];


        for (int i = 0; i < 10; i++) {
            simple[i] = i;
        }
        for (int i = 0; i < simple.length; i++) {
            System.out.println("Элемент simple[" + i + "]: " + simple[i]);
        }
    }
}
