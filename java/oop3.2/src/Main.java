// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Box box1 = new Box();
//        box1.height = 10;
//        box1.lenght = 10;
//        box1.width = 10;
////        double volume = box1.height * box1.width * box1.lenght;
//        double volume = box1.getvolume();
//        System.out.println(volume);
//
//        Box box2 = new Box();
//        box2.height = 20;
//        box2.lenght = 20;
//        box2.width = 20;
//        double volume2 = box2.height * box2.width * box2.lenght;
//        System.out.println(volume2);
//
//        box1.showVolume();


        Dog dog = new Dog();
        dog.name = "Bobik";
        dog.poroda = "dog";
        dog.weight = 10;
        dog.speed = 5;

        String info = dog.getInfo();
        System.out.println(info);

        System.out.println(dog.getInfo());

        dog.info();

        dog.run();


    }
}