package examples;

public class Monster {
    int glaza;
    int ruki;
    int nogi;

    Monster() {
        this(2);
    }

    Monster(int count) {
        this(count, count, count);
    }

    Monster(int glaza, int nogi, int ruki) {
        this.glaza = glaza;
        this.nogi = nogi;
        this.ruki = ruki;
    }

    //    void voice() {
//        System.out.println("Grrrrrrrrrr");
//    }
//
//    void voice(int count) {
//        for (int i = 0; i < count; i++) {
//            System.out.println("Grrrrrrrrrr");
//        }
//    }
//
//    void voice(int count, String word) {
//        for (int i = 0; i < count; i++) {
//            System.out.println(word);
//        }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrrr");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

}

