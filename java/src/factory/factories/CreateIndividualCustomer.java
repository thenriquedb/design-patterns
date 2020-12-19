package factory.factories;

import factory.customer.Customer;
import factory.customer.EnterpriseCustomer;


public class CreateIndividualCustomer implements CreateCustomer {
    @Override
    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }
}
