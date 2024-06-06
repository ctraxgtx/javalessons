package myjavelessons2024;

import java.util.Scanner;

public class StringSwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите комманду: connect. cancel. disconnect");

        String command = scanner.nextLine();


        switch (command){
            case "connect":
                System.out.println("Подключение");
                break;
            case "cancel":
                System.out.println("Отмена");
                break;
            case "disconnect":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Неверная команда");
                break;
        }
    }
}
