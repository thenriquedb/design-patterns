package creational.factory.vehicle;

import creational.factory.customer.Customer;

public class IndividualVehicle implements Vehicle {
    private String name;
    private Customer customer;

    public IndividualVehicle(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    @Override
    public void pickup() {
        System.out.println(name + " pegou " + customer.getName());
    }

    @Override
    public void dropCustomer() {
        System.out.println("Soltou o cliente " + customer.getName());
    }
}
