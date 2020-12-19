package abstractFactory.factories;

import abstractFactory.customer.Customer;
import abstractFactory.vehicle.Vehicle;

public interface CreateVehicle {
    Vehicle createVehicle(String vehicleName, Customer customer);
}