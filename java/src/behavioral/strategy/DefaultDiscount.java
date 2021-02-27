package behavioral.strategy;

public class DefaultDiscount implements DiscountStrategy {
    private float discount;
    private Cart cart;

    public DefaultDiscount(Cart cart) {
        this.cart = cart;
        this.discount = 0;
    }

    public void setDiscount(float discount) {
        this.discount = discount / 100;
    }

    public float calculateDiscount() {
        float total = this.cart.getTotal();

        if(total <= 150) {
            this.setDiscount(5);
        } else if(total >= 500) {
            this.setDiscount(50);
        }

        return total  - total * this.discount;
    }
}
