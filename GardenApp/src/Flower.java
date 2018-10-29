public class Flower extends Plant{


    public Flower(String color) {
        super(color, 5);
        this.color = color;

    }


    @Override
    public double absorbationlevel() {
        return 0.75;
    }

    @Override
    public void add() {

    }
}
