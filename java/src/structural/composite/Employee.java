package structural.composite;

public abstract class Employee {
    protected String name;
    protected double  salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void print();

    public abstract void add(Employee employee);

    public abstract void remove(Employee employee);
}
