public class Tungl {
    double height;
    double length;

    void setDimens(double height, double length) {
        this.height = height;
        this.length = length;
    }

    double getVolume() {
        return this.height * this.length;
    }

    void showVolume() {
        System.out.println(getVolume());
    }

}
