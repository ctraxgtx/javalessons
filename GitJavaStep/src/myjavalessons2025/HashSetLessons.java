package myjavalessons2025;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetLessons {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Ciao");
        set.add("Прывит");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Namaste");

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if(set.contains(str))
        System.out.println(" Da Spatkanija");

    }
}
