package factory.customer;

public class EnterpriseCustomer implements Customer {
    private String name;

    public EnterpriseCustomer(String customerName) {
        this.name = customerName;
    }


    @Override
    public void pay() {
        System.out.println(this.getName() + "pagou muito!");
    }


    @Override
    public String getName() {
        return name;
    }
}
