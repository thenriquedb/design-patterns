package behavioral.chain_of_responsibility;

public class Manager extends Handler {
    @Override
    public void approve(Purchase purchase) {
        if(purchase.getValue() < 1000F) {
            System.out.println("Purchase approved by manager!");
        } else {
            this.next.approve(purchase);
        }
    }
}
