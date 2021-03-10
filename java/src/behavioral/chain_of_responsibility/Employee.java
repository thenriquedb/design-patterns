package behavioral.chain_of_responsibility;

public class Employee extends Handler {
    @Override
    public void approve(Purchase purchase) {
        if(purchase.getValue() < 100F) {
            System.out.println("Purchase approved by employee!");
        } else {
            this.next.approve(purchase);
        }
    }
}
