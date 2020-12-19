package abstractFactory.factories;

import abstractFactory.customer.Customer;
import abstractFactory.customer.EnterpriseCustomer;
import abstractFactory.vehicle.EnterpriseVehicle;
import abstractFactory.vehicle.Vehicle;

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
