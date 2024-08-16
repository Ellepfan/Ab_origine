public class Dog {
    String name;
    String poroda;
    double weight;

    int speed;

    String getInfo() {
        return " name: " + name + " poroda: " + poroda + " weight: " + weight;
    }
    void info(){
        System.out.println(" name: " + name + " poroda: " + poroda + " weight: " + weight);
        }

    void run() {
        for (int i = 0; i < speed; i++){
            System.out.println("Бегу ");
        }
    }


}

