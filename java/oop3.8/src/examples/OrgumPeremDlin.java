package examples;

public class OrgumPeremDlin {
    public static int sum(int... numbers){ // массив с "..." не определенной длины
        int sum = 0;
        for (int namber: numbers) {
            sum += namber;
        }
        return sum;
    }
}
