public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());
        ob.beta = 88;
        ob.gamma = 99;
        
        System.out.println("ob.beta : " + ob.beta);
        System.out.println("ob.gamma : " + ob.gamma);

    }
}
