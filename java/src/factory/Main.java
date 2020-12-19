package factory;

import factory.customer.Customer;
import factory.factories.*;
import factory.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Enterprise
        CreateCustomer createEnterpriseCustomer = new CreateEnterpriseCustomer();
        Customer enterpriseCustomer = createEnterpriseCustomer.createCustomer("Thiago");

        CreateVehicle createEnterpriseVehicle = new CreateEnterpriseVehicle();
        Vehicle enterpriseVehicleVehicle =  createEnterpriseVehicle.createVehicle("HB20 Branco",enterpriseCustomer);

        enterpriseVehicleVehicle.pickup();
        enterpriseCustomer.pay();
        enterpriseVehicleVehicle.dropCustomer();

        // Individual
        CreateCustomer createIndividualCustomer = new CreateIndividualCustomer();
        Customer individualCustomer = createIndividualCustomer.createCustomer("Tião");

        CreateVehicle createIndividualVehicle = new CreateIndividualVehicle();
        Vehicle individualVehicleVehicle = createIndividualVehicle.createVehicle("Gol G3", individualCustomer);

        individualVehicleVehicle.pickup();
        individualCustomer.pay();
        individualVehicleVehicle.dropCustomer();
    }
}
