package myjavelessons2024;

public class UpCase {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // В следующем операторе сбрасываеться шестой бит
            // После этого в переменной ch будет храниться код
            // симбола прописаной буквы

            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }
    }
}
