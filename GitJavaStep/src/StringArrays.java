
// Демострация использования массивов строк
public class StringArrays {
    public static void main(String[] args) {
        String[] strings = {"Эта", "строка", "являеться", "тестом"};
        System.out.println("Исходный массив: ");
        for (String x : strings) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        strings[2] = "также являеться";
        strings[3] = "тестом!";

        System.out.println("Измененный массив: ");
        for (String x : strings) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
