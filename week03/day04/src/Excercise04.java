public class Excercise04 {
    public static void main ( String[] args) {
        System.out.println(power(5,2));

    }

    public static int power (int base, int n) {
        if (n == 1) {
            return base;
        } else {
            return base* power(base, n-1);

        }
    }
}
