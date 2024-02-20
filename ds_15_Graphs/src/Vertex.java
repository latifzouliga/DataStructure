public class Vertex {

    int value;
    int weight;

    public Vertex(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }
}
