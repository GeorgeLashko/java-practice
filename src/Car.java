public class Car {
    private String name;
    private int cost;

    public Car(String name, int cost) {
        this.name = name;
        this.cost = cost;

    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "model: " + getName() +" "+ "Cost " + getCost();
    }
}
