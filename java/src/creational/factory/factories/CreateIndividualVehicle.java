package creational.factory.factories;

import creational.factory.customer.Customer;
import creational.factory.vehicle.IndividualVehicle;

public class CreateIndividualVehicle implements CreateVehicle{
    @Override
    public IndividualVehicle createVehicle(String vehicleName,Customer customer) {
        return new IndividualVehicle(vehicleName, customer);
    }
}

