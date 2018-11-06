import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals = new ArrayList<>();
    int freeSlots;


    public void breed() {

        if (freeSlots > 0) {
            animals.add(new Animal());

        }


    }


    public void slaughter() {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger < 50) {
                animals.remove(i);
            }

        }
    }


}
