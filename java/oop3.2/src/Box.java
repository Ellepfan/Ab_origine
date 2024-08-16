public class Box {
    double lenght;
    double width;
    double height;

    double getvolume() {
        return width * lenght * height;
    }

    void showVolume(){
        System.out.println(getvolume());
    }
}

