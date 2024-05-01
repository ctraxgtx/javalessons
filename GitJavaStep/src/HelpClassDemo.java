import java.io.IOException;

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        char choise, ignore;
        Help hlpobj = new Help();

        for (;;){
            do {
                hlpobj.showMenu();
                choise = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            }while (!hlpobj.isvalid(choise));
            if(choise == 'q') break;
            System.out.println("\n");
            hlpobj.helpon(choise);
        }

    }
}
