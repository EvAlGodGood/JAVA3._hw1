package la.fruits;

public class Orange extends Fruit {
    private float weight;

    public Orange() {
        this.weight = 1.5f;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return String.format(String.valueOf(weight));
    }
}
