
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DominoMain {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        List<Domino> newDominoes = new ArrayList<>();
        newDominoes.add(dominoes.get(0));
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        Collections.sort(dominoes);
        System.out.println(dominoes);

//        for (int i = 0; i < dominoes.size() ; i++) {
//            for (int j = 1; j < dominoes.size() ; j++) {
//                if(newDominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0] ) {
//                    newDominoes.add(dominoes.get(j));
//
//
//                }
//
//            }
//
//        }

        System.out.println(newDominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}