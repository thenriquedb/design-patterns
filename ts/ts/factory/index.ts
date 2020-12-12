import { Car } from './car';
import { Bike } from './bike';

const fusca = new Car('Fusca');
fusca.pickUp('Ana');
fusca.stop();

const celta = new Car('Celta');
celta.pickUp('Julia');
celta.stop();

const bike = new Bike('Caloi 10');
bike.pickUp('Thiago');
bike.stop();
