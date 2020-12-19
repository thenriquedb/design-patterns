package factory.factories;

import factory.customer.Customer;
import factory.vehicle.IndividualVehicle;

public class CreateIndividualVehicle implements CreateVehicle{
    @Override
    public IndividualVehicle createVehicle(String vehicleName,Customer customer) {
        return new IndividualVehicle(vehicleName, customer);
    }
}

