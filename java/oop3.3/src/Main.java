public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        int test1 = test.square10();
        System.out.println(test1);
        System.out.println(test.square(20));

        Box box1 = new Box();
        box1.width = 2;
        box1.length = 2;
        box1.height = 2;
        box1.showVolume();

        Box box2 = new Box();
        box2.setDimens(10, 10, 10);
        box2.showVolume();

        Tungl tungl1 = new Tungl();
        tungl1.setDimens(2, 3);
        tungl1.showVolume();


    }
}