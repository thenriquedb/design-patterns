package creational.abstractFactory.factories;

import creational.abstractFactory.customer.Customer;
import creational.abstractFactory.customer.IndividualCustomer;
import creational.abstractFactory.vehicle.IndividualVehicle;
import creational.abstractFactory.vehicle.Vehicle;

public class CreateIndividualCompany implements Company {
    @Override
    public Customer createCustomer(String customerName) {
        return new IndividualCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new IndividualVehicle(vehicleName, customer);
    }
}
