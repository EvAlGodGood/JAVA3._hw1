package la.fruits;

public class Apple extends Fruit {
    private float weight=1.0f;
    public Apple() {
        this.weight = 1.0f;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return String.format(String.valueOf(weight));
    }

}
