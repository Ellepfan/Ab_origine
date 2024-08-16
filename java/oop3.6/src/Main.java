public class Main {
    public static void main(String[] args) {
        Box current = new Box(10);
        Box another = new Box(current);
        Box another1 = new Box(current);
        Box another2 = current.copy();
        Box another3 = current.increase();
//        current.compare(another);
        int number = current.compare(another);
        System.out.println(number);

        another1.setDimens(20,20,20);

        current.showVolume();
        another.showVolume();
        another1.showVolume();
        another2.showVolume();
        another3.showVolume();
    }
}