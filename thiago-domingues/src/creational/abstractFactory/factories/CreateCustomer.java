package creational.abstractFactory.factories;

import creational.abstractFactory.customer.Customer;

public interface CreateCustomer {
    Customer createCustomer(String customerName);
}