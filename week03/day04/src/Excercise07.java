public class Excercise07 {
    public static void main(String[] args) {
        System.out.println(changingX("exykx"));

    }

    public static String changingX(String xxx) {
        if (xxx.length() == 0) {
            return xxx;
        } else if (xxx.charAt(0) == 'x') {
            return 'y' + changingX(xxx.substring(1));

        } else {
            return xxx.substring(0, 1) + changingX(xxx.substring(1));
        }


    }
}
