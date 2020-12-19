package factory.factories;

import factory.customer.Customer;
import factory.vehicle.Vehicle;

public interface CreateVehicle {
    Vehicle createVehicle(String vehicleName, Customer customer);
}