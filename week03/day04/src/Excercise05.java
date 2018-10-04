public class Excercise05 {
    public static void main(String[]args) {
        System.out.println(numbEars(5));

    }

    public static int numbEars (int nbunny){
        if (nbunny == 0) {
            return 0 ;
        }else {
            return 2+ numbEars(nbunny-1);
        }
    }
}
