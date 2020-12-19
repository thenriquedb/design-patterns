package abstractFactory.factories;

import abstractFactory.customer.Customer;
import abstractFactory.customer.IndividualCustomer;
import abstractFactory.vehicle.IndividualVehicle;
import abstractFactory.vehicle.Vehicle;

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
