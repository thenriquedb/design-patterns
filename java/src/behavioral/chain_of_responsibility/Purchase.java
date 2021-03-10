package behavioral.chain_of_responsibility;

public class Purchase {
    private float value;

    public Purchase(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
