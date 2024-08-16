public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        box1.showVolume();
        Box box2 = new Box();
        box2.showVolume();

        Rabotnik rabotnik1 = new Rabotnik("Jack", "sisADM", 50_000);
        rabotnik1.showInfo();
    }
}