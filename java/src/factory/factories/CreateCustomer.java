package factory.factories;

import factory.customer.Customer;

public interface CreateCustomer {
    Customer createCustomer(String customerName);
}