package creational.abstractFactory;

import creational.abstractFactory.customer.Customer;
import creational.abstractFactory.factories.*;
import creational.abstractFactory.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Enterprise
        Company createEnterpriseCompany = new CreateEnterpriseCompany();
        Customer enterpriseCustomer = createEnterpriseCompany.createCustomer("Thiago");
        Vehicle enterpriseVehicleVehicle =  createEnterpriseCompany.createVehicle("HB20 Branco",enterpriseCustomer);

        enterpriseVehicleVehicle.pickup();
        enterpriseCustomer.pay();
        enterpriseVehicleVehicle.dropCustomer();

        // Individual
        Company createIndividualCompany = new CreateIndividualCompany();
        Customer individualCustomer = createIndividualCompany.createCustomer("Tião");
        Vehicle individualVehicleVehicle = createIndividualCompany.createVehicle("Gol G3", individualCustomer);

        individualVehicleVehicle.pickup();
        individualCustomer.pay();
        individualVehicleVehicle.dropCustomer();
    }
}
