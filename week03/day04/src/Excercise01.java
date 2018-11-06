public class Excercise01 {
    public static void main(String[] args) {
        countDown(6);

    }

    public static int countDown(int n) {
        if (n == 0) {
            System.out.println(n);
            return 0;

        } else {
            System.out.println(n);
            return countDown(n - 1);


        }
    }
}
