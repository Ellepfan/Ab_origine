public class Box {
    double height;
    double length;
    double width;

    void setDimens(double height, double length, double width) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    double getVolume() {
        return this.height * this.length * this.width;
    }

    void showVolume() {
        System.out.println(getVolume());
    }

}
