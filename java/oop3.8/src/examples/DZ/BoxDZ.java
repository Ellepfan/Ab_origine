package examples.DZ;

import org.jetbrains.annotations.NotNull;

public class BoxDZ {
    private double length;
    private double width;
    private double height;

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public BoxDZ copy() {
        return new BoxDZ(this.length, this.width, this.height);
    }

    public BoxDZ increase() {
        return  new BoxDZ(this.length * 2, this.width *2 , this.height* 2);
    }
    @org.jetbrains.annotations.Contract(pure = true)
    public BoxDZ(@NotNull BoxDZ another) {
        this(another.length, another.width, another.height);
    }


    public BoxDZ(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    //    void compare(box.Box another) {
//        double currentVolume = getVolume();
//        double anotherVolume = another.getVolume();
//        if (currentVolume > anotherVolume){
//            System.out.println("currentVolume > anotherVolume");
//        } else if (currentVolume < anotherVolume) {
//            System.out.println("currentVolume < anotherVolume");
//        } else {
//            System.out.println("currentVolume = anotherVolume");
//        }
//    }
//    int compare(box.Box another) {
//            double currentVolume = getVolume();
//            double anotherVolume = another.getVolume();
//            if (currentVolume > anotherVolume){
//                return 1;
//            } else if (currentVolume < anotherVolume) {
//                return -1;
//            } else {
//                return 0;
//            }
//
//    }
//    int compare(box.Box another) {
//        int number;
//        double currentVolume = getVolume();
//        double anotherVolume = another.getVolume();
//        if (currentVolume > anotherVolume) {
//            number = 1;
//        } else if (currentVolume < anotherVolume) {
//            number = -1;
//        } else {
//            number = 0;
//        }
//        return number;
//    }
    public int compare(BoxDZ another) {
        int number;
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        number = Double.compare(currentVolume, anotherVolume);
        return number;
    }

    public BoxDZ(double size) {
        this(size, size, size);
    }

    private double getVolume() {
        return this.height * this.height * this.length;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
