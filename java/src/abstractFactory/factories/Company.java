package abstractFactory.factories;

import abstractFactory.customer.Customer;
import abstractFactory.vehicle.Vehicle;

public interface Company {
    Vehicle createVehicle(String vehicleName, Customer customer);
    Customer createCustomer(String customerName);
}
