package myjavelessons2024;

public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        ch = (char) System.in.read();

        if (ch == answer) System.out.println("*** Pravilno ***");
        else System.out.println("Ne ugadali");

        ProvaGit provaGit = new ProvaGit();
        provaGit.prova = 4;
        SectortOne sectortOne = new SectortOne();
        sectortOne.nameSector = "Sector One";
        sectortOne.placeSector = 55;

        System.out.print(sectortOne.nameSector + " ");
        System.out.println(sectortOne.placeSector);
    }
}
