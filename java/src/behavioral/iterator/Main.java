package behavioral.iterator;

class Main {
    public static void main(String args[]) {
        Zoo zoo = new ImplZoo();

        zoo.addAnimal(new Animal("tiger", "mammal"));
        zoo.addAnimal(new Animal("penguin", "bird"));
        zoo.addAnimal(new Animal("alligator", "reptile"));
        zoo.addAnimal(new Animal("lion", "mammal"));
        zoo.addAnimal(new Animal("elephant", "mammal"));

        MammalIterator it = new MammalIterator(zoo);

        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}
