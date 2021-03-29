package behavioral.iterator;

import java.util.Iterator;

class MammalIterator implements Iterator<Animal> {
    private Zoo zoo;
    private int pos = 0;

    public MammalIterator(Zoo zoo) {
        this.zoo = zoo;
    }

    public boolean hasNext() {
        for (int i = this.pos; i < this.zoo.getAnimals().size(); i++) {
            Animal animal = zoo.getAnimals().get(i);
            if (animal.getclass().equalsIgnoreCase("mammal")) {
                return true;
            }
        }

        return false;
    }

    public Animal next() {
        while (this.pos < this.zoo.getAnimals().size()) {
            Animal animal = zoo.getAnimals().get(this.pos);
            this.pos++;

            if (animal.getclass().equalsIgnoreCase("mammal")) {
                return animal;
            }
        }

        return null;
    }
}
