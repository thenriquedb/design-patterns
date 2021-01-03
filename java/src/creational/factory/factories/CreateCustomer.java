package creational.factory.factories;

import creational.factory.customer.Customer;

public interface CreateCustomer {
    Customer createCustomer(String customerName);
}