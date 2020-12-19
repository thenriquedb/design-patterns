package abstractFactory.factories;

import abstractFactory.customer.Customer;

public interface CreateCustomer {
    Customer createCustomer(String customerName);
}