
public class Main {

    public static void main(String[] args) {
//        Box box1 = new Box();
//        box1.height = 10;
//        box1.lenght = 10;
//        box1.width = 10;
//        double volume = box1.height * box1.width * box1.lenght;
//        System.out.println(volume);
//        Box box2 = new Box();
//        box2.height = 20;
//        box2.lenght = 20;
//        box2.width = 20;
//        double volume2 = box2.height * box2.width * box2.lenght;
//        System.out.println(volume2);
        Human human1 = new Human();
        human1.name = "Jack1";
        human1.weight = 20;
        human1.age = 26;
        Human human2 = new Human();
        human2.name = "Jack2";
        human2.weight = 22;
        human2.age = 23;
        Human human3 = new Human();
        human3.name = "Jack3";
        human3.weight = 30;
        human3.age = 16;
        double sumage = human1.age + human3.age + human2.age;
        double average = sumage / 3;
        System.out.println(average);


    }

}