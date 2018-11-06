public abstract class Plant {

    String color;
    double waterAmount;
    double tolerance;

    public Plant(String color, double tolerance) {
        this.color = color;
        this.tolerance = tolerance;
        this.waterAmount = 0;
    }


    public boolean needsWater() {

        return (waterAmount < tolerance);
    }

    public void water(double amount) {
        waterAmount += amount * absorbationlevel();

    }

    public abstract double absorbationlevel();

    {


    }


    public abstract void add();
}
