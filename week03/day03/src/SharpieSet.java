import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpieSet = new ArrayList<>();


    public void countUsable() {
        int count = 0;
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).inkAmount != 0) {
                count++;

            }
        }
        System.out.println(count);


    }

    public void removeTrash() {
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).inkAmount == 0) {
                sharpieSet.remove(i);
                i--;
            }


        }

    }
}
