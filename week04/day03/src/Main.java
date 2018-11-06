public class Main {

    public static void main(String[] args) {


        Anagram anagram = new Anagram();
        anagram.countLetters("ahoj", 'a');

        System.out.println(anagram.countLetters("ahojha", 'a'));
        // write your code here
    }
}
