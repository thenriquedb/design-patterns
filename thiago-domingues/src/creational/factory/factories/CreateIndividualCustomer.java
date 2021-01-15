package creational.factory.factories;

import creational.factory.customer.Customer;
import creational.factory.customer.EnterpriseCustomer;


public class CreateIndividualCustomer implements CreateCustomer {
    @Override
    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }
}
