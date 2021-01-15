package creational.abstractFactory.factories;

import creational.abstractFactory.customer.Customer;
import creational.abstractFactory.vehicle.Vehicle;

public interface Company {
    Vehicle createVehicle(String vehicleName, Customer customer);
    Customer createCustomer(String customerName);
}
