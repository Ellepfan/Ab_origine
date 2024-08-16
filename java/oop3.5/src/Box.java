public class Box {
    double length;
    double width;
    double height;

        void setDimens(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    Box() {
        this(10);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(double size){
       this(size,size,size);
    }

    double getVolume() {
        return this.height * this.height * this.length;
    }

    void showVolume() {
        System.out.println(getVolume());
    }
}
