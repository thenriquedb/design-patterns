import { Vehicle } from './vehicle';

export class Car implements Vehicle {
  constructor(private name: String) {}

  pickUp(customerName: String): void {
    console.log(`${this.name} está buscando ${customerName}`);
  }

  stop(): void {
    console.log(`${this.name} parou.`);
  }
}