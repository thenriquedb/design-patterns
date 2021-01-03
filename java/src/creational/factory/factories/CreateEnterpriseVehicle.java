package creational.factory.factories;

import creational.factory.customer.Customer;
import creational.factory.vehicle.EnterpriseVehicle;
import creational.factory.vehicle.Vehicle;

public class CreateEnterpriseVehicle implements CreateVehicle {
    @Override
    public Vehicle createVehicle(String vehicleName, Customer customer) {
        return new EnterpriseVehicle(vehicleName, customer);
    }
}

