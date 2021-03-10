package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler president = new President();
        Handler vicePresident = new VicePresident();
        Handler director = new Director();
        Handler manager = new Manager();
        Handler employee = new Employee();

        employee.setNext(manager);
        manager.setNext(director);
        director.setNext(vicePresident);
        vicePresident.setNext(president);

        Purchase purchase = new Purchase(50F);
        employee.approve(purchase);
    }

}
