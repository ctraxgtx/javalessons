public class Cat {
    String name;
    int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.jump();
        this.sayMeow();
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    static int count = 0;

    public static void main(String[] args) {
        Cat barsik = new Cat("bars", 3);

        count++;

        Cat vasia = new Cat("Debil",5);

        count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);

        System.out.println("Общее количество котов = " + count);
        barsik.jump();
        barsik.sayMeow();

    }
}
