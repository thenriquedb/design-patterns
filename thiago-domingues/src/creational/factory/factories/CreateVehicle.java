package creational.factory.factories;

import creational.factory.customer.Customer;
import creational.factory.vehicle.Vehicle;

public interface CreateVehicle {
    Vehicle createVehicle(String vehicleName, Customer customer);
}