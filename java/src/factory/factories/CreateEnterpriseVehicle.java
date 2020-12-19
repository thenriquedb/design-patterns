package factory.factories;

import factory.customer.Customer;
import factory.vehicle.EnterpriseVehicle;
import factory.vehicle.Vehicle;

public class CreateEnterpriseVehicle implements CreateVehicle {
    @Override
    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new EnterpriseVehicle(vehicleName, customer);
    }
}

