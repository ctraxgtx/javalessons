public class Guess{
    public static void main(String[] args) throws java.io.IOException{
        char ch, answer = 'K';
        ch = (char) System.in.read();

        if(ch == answer) System.out.println("*** Pravilno ***");
        else System.out.println("Ne ugadali");
    }
}
