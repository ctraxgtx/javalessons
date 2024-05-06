public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Испозование очереди BigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // дополнительные ощибки  при обращение л пчереди smallQ
        System.out.println("Содержимое очереди smallQ: ");
        for (i = 0; i<5; i++){
            ch= smallQ.get();

            if(ch != (char) 0) System.out.println(ch);
        }

    }
}
