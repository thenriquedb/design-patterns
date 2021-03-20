package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller("Thiago", 5000);
        System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());

        // Save internal state
        SellState state = new SellState();
        state.setMemento(seller.saveState());
        System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());

        // Update seller infos
       seller.setName("Carlos");
       seller.setSalesAmount(1500);
       System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());

       seller.restoreState(state.getMemento());
       System.out.println(seller.getName() +" - " + "R$" + seller.getSalesAmount());


    }
}
