package behavioral.memento;

public class Seller implements  MementoI{
    private String name = "";
    private float salesAmount = 0.0F;

    public Seller(String name, float salesAmount) {
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

    public Memento saveState() {
        return new Memento(this.name, this.salesAmount);
    }

    public void restoreState(Memento memento) {
        this.name = memento.getName();
        this.salesAmount = memento.getSalesAmount();
    }
}
