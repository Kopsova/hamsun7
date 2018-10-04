public class Excercise03 {
    public static void main (String[] args){
        System.out.println(sumDigit(3206));

    }


    public static int sumDigit(int n){
        if (n == 0) {
            return n;
        }else {
            return (n % 10) + sumDigit(n / 10);
        }
    }
}
