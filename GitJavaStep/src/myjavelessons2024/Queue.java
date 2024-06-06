package myjavelessons2024;

public class Queue {
    char[] q; // массив для хранения элементов очереди
    int putloc, getloc; // индексы для вставки и извлечения
                        // элементов очереди

    Queue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch){
        if(putloc == q.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc] = ch;
    }

    char get(){
        if (getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
