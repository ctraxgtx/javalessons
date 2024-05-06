public class MyClass {
    private int alpha; // Закрытый доступ
    public int beta; // Открытый доступ
    int gamma; // тип доступа по умолчанию (по сути, public)

    // Методы доступа к переменной alpha. Члены класса мочут
    // обращаться к закрытым членам того же класса.

    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }


}
