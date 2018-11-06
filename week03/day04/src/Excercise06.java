public class Excercise06 {
    public static void main(String[] args) {
        System.out.println(allEars(3));

    }

    public static int allEars(int allbunnies) {
        if (allbunnies == 0) {
            return 0;
        } else if (allbunnies % 2 != 0) {
            return 2 + allEars(allbunnies - 1);
        } else {
            return 3 + allEars(allbunnies - 1);
        }


    }
}




