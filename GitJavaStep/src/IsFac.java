import java.util.Scanner;

public class IsFac {
    public static void main(String[] args) {
        Factor x = new Factor();
        Scanner scanner =new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        if(x.isFactor(numOne,numTwo)){
            System.out.println("one");
        }
    }
}
