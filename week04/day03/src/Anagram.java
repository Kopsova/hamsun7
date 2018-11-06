public class Anagram {


    String string1;
    String string2;


    public int countLetters(String ahoj, char a) {
        int countL = 0;
        for (int i = 0; i < ahoj.length(); i++) {
            if (ahoj.charAt(i) == a) {
                countL += 1;

            }


        }
        return countL;
    }


    public boolean areAnagram(String string1, String string2) {
        int len1 = string1.length();
        int len2 = string2.length();

        if (len1 != len2)
            return false;

        return false;
    }


}







