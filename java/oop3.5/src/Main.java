public class Main {
    public static void main(String[] args) {

        System.out.println(MyMath.multiple(10,5));
        System.out.println(MyMath.multiple(12.2, 21.2));
        System.out.println(MyMath.multiple(3, 5.2));
        System.out.println(MyMath.multiple(2.2));
        System.out.println(java.lang.Math.min(15,54));

        Box box1 = new Box(2);
        box1.showVolume();
        Box box2 = new Box();
        box2.showVolume();

        Monster monster1 = new Monster();
        monster1.voice(1);
        System.out.println();

        Monster monster2 = new Monster(6);
        monster2.voice(2);
        System.out.println();

        Monster monster3 = new Monster(2, 5, 8);
        monster3.voice(4, "Grarara");

    }
}








