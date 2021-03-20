package behavioral.memento;

public class Memento implements MementoI{
    private String name = "";
    private float salesAmount = 0.0F;

    public Memento(String name, float salesAmount) {
        this.name = name;
        this.salesAmount = salesAmount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getSalesAmount() {
        return salesAmount;
    }

    @Override
    public void setSalesAmount(float salesAmount) {
        this.salesAmount = salesAmount;
    }
}
