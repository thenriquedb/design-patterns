import { Vehicle } from '../vehicle';

export abstract class VehicleFactory {
  abstract createVehicle(vehicleName: String): Vehicle;

  pickUp(customerName: String, vehicleName: String): Vehicle {
    const car = this.createVehicle(vehicleName);
    car.pickUp(customerName);
    return car;
  }
}