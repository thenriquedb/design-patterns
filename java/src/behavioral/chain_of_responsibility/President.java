package behavioral.chain_of_responsibility;

public class President extends Handler {
    @Override
    public void approve(Purchase purchase) {
        if(purchase.getValue() < 100000F) {
            System.out.println("Purchase approved by president!");
        } else {
            System.out.println("Purchase not approved.");
        }
    }
}
