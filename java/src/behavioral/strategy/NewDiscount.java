package behavioral.strategy;

public class NewDiscount implements DiscountStrategy {
    private float discount;
    private Cart cart;

    public NewDiscount(Cart cart) {
        this.cart = cart;
        this.discount = 0;
    }

    public void setDiscount(float discount) {
        this.discount = discount / 100;
    }

    public float calculateDiscount() {
        float total = this.cart.getTotal();

        if(total <= 100) {
            this.setDiscount(5);
        } else if(total >= 200) {
            this.setDiscount(15);
        }else if(total >= 500) {
            this.setDiscount(50);
        }

        return total  - total * this.discount;
    }
}
