package factory.factories;

import factory.customer.Customer;
import factory.vehicle.EnterpriseVehicle;

public class CreateEnterpriseVehicle {
    @Override
    public EnterpriseVehicle createVehicle(String vehicleName, Customer customer) {
        return new EnterpriseVehicle(vehicleName, customer);
    }
}

