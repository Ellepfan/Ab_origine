package examples;

public class MyMath {
    private static final double PI = 3.14;
    public static double lenght(double radius){
        return 2 * PI * radius;
    }

    public static double area (double radius){
//        pi = 10; - неправильный код так как pi = finali
        return  PI * radius *radius;
    }
    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static double multiple(int a, double b) {
        return a * b;
    }

    public static double multiple(double a) {
        return a * a;
    }
}
