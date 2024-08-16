public class Rabotnik {
    String name;
    String dolznost;
    double money;


    Rabotnik(String name, String dolznost, double money) {
        this.name = name;
        this.dolznost = dolznost;
        this.money = money;
    }

    void showInfo() {
        System.out.println("name: " + this.name + "\n" + "dolznost: " + this.dolznost + "\n" + "money: " + this.money);
    }
}
