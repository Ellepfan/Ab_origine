public class Box {
    double length;
    double width;
    double height;

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    Box increase() {
        return  new Box(this.length * 2, this.width *2 , this.height* 2);
    }
    Box(Box another) {
        this(another.length, another.width, another.height);
    }


    Box(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    //    void compare(Box another) {
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
//    int compare(Box another) {
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
//    int compare(Box another) {
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
    int compare(Box another) {
        int number;
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        number = Double.compare(currentVolume, anotherVolume);
        return number;
    }

    Box(double size) {
        this(size, size, size);
    }

    double getVolume() {
        return this.height * this.height * this.length;
    }

    void showVolume() {
        System.out.println(getVolume());
    }
}
