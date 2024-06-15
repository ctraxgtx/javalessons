package lessonsfromjavarush;

import java.util.ArrayList;

public class SolutiionTwo {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotEmployees = new ArrayList<>();

    public static void initEmploees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmploees();
        waitingEmployees.add("donald");
        waitingEmployees.add("donald");
        waitingEmployees.add("donald");
        paySalary("donald");
        for (int i = 0; i < 10; i++) {
            System.out.println(waitingEmployees.get(i));
        }
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && !alreadyGotEmployees.contains(name)) {
            alreadyGotEmployees.add(name);
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
    }
}
