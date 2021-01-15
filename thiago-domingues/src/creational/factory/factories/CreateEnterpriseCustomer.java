package creational.factory.factories;

import creational.factory.customer.Customer;
import creational.factory.customer.EnterpriseCustomer;

public class CreateEnterpriseCustomer implements CreateCustomer {
    @Override
    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }
}
