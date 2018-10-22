import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants;

    public Garden(){
        plants = new ArrayList<>();
    }
    public void plant (Plant plants){
        plants.add();
    }


    public void waterThirsty(int waterAmount){
        int count = 0;
        for (Plant onePlantofTheList:plants) {
            if(onePlantofTheList.needsWater()){
                count ++;
            }

        }




        for (int i = 0; i < plants.size() ; i++) {
            Plant onePlantofTheList = plants.get(i);
            if (onePlantofTheList.needsWater()){
                count ++;
            }


        }
        double amountPerThirsty = waterAmount / count;

        for (Plant onePlantofTheList:plants) {
            if(onePlantofTheList.needsWater()){
                onePlantofTheList.water();
                count ++;
            }

        }



    }









}
