package myjavelessons2024;

public class PublicStaticProva {
    public static void main(String[] args) {
        DataInfo dataInfo = new DataInfo();
        System.out.println(dataInfo.test());

        test();
        System.out.println(10);

        int a = 2;
        int b = 23;
        int x = Math.max(a, b);
        int c = Math.min(a, b);
        System.out.println(x +" "+ c);
        System.out.println(c + " " +x);
    }

    public static void test() {
        int d = 200 / 2;

    }
}
