package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

abstract class Zoo {
    public abstract List<Animal> getAnimals();
    public abstract void addAnimal(Animal animal);
    public abstract void removeAnimal(Animal animal);
    public abstract Iterator<Animal> createIterator();
}
