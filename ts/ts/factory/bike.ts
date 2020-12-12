import { Vehicle } from './vehicle';

export class Bike implements Vehicle {
  constructor(private name: String) {}

  pickUp(customerName: String): void {
    console.log(`${this.name} está pedalando até ${customerName}`);
  }

  stop(): void {
    console.log(`${this.name} parou.`);
  }
}