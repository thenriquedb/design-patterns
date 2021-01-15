package creational.abstractFactory.factories;

import creational.abstractFactory.customer.Customer;
import creational.abstractFactory.vehicle.Vehicle;

public interface CreateVehicle {
    Vehicle createVehicle(String vehicleName, Customer customer);
}