public class Main {

    public static void main(String[] args) {
        Flower f = new Flower("red");
        Tree tree = new Tree("orange");
        Garden garden = new Garden();
        garden.plant(f);
        garden.plant(tree);
        garden.waterThirsty(100);

    }
}
