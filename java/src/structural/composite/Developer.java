package structural.composite;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println(super.name + " - " + "R$ " + super.salary);
    }

    @Override
    public void add(Employee employee) {
        System.out.println("You cannot add a developer to another developer");
    }

    @Override
    public void remove(Employee employee) {
        System.out.println("You cannot remove a developer to another developer");
    }
}
