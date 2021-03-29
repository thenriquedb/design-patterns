package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class ImplZoo extends Zoo {
    private List<Animal> animalList = new ArrayList<Animal>();

    public List<Animal> getAnimals() {
        return this.animalList;
    }

    public void addAnimal(Animal animal) {
        this.animalList.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animalList.remove(animal);
    }

    public Iterator<Animal> createIterator() {
        return this.animalList.iterator();
    }
}
