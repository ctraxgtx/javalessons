package myjavelessons2024;

import java.util.Scanner;

public class ForEaach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите количестов номеров для суммирования: ");
        int[] nums = new int[scanner.nextInt()];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int x : nums){
            System.out.println("Значение: " + x);
            sum +=x;
        }

        System.out.println("Сумма: " + sum);

    }


}
