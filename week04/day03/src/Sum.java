import java.util.ArrayList;

public class Sum {


    public int sum(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);

        }
        return count;

    }
}
