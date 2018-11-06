public class Counter {
    int value;
    int curentValue;

    public Counter() {
        value = 0;
        curentValue = 0;

    }

    public Counter(int value) {
        this.value = value;
        this.curentValue = value;
    }

    public void add(int number) {
        curentValue = value + number;

    }

    public void add() {
        curentValue++;
    }

    public int get() {
        return curentValue;

    }

    public void reset() {
        value = curentValue;
    }
}
