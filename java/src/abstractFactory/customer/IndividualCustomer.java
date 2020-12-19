package abstractFactory.customer;

public  class IndividualCustomer implements Customer {
    private String name;

    public IndividualCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void pay() {
        System.out.println(this.name + "Pagou");
    }
}
