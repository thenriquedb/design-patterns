package creational.abstractFactory.factories;

import creational.abstractFactory.customer.Customer;
import creational.abstractFactory.customer.EnterpriseCustomer;
import creational.abstractFactory.vehicle.EnterpriseVehicle;
import creational.abstractFactory.vehicle.Vehicle;

public class CreateEnterpriseCompany implements Company {
    @Override
    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new EnterpriseVehicle(vehicleName, customer);
    }
}
