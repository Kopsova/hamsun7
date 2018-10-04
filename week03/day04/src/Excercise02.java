public class Excercise02 {
    public static void main (String[]args) {
        System.out.println(adding(5));

    }



    public static int adding(int n) {
        if (n == 1) {
            return 1;

        }else {
            return adding((n-1)) + n ;


        }

    }
}
