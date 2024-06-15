package moiklasy;

import java.util.ArrayList;
import java.util.Scanner;

public class ClAssArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            numbers.add(scanner.nextInt());
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i).equals(55)) break;
            }
        }

    }
}
