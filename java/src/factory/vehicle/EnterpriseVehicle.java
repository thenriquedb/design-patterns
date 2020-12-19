package factory.vehicle;

import factory.customer.Customer;

public class EnterpriseVehicle implements Vehicle {
    private String name;
    private Customer customer;


    public EnterpriseVehicle(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    @Override
    public void pickup() {
        System.out.println(name + "pegou " + customer.getName());
    }

    @Override
    public void dropCustomer() {
        System.out.println("Soltou o cliente " + customer.getName());
    }
}
