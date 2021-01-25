package structural.composite;

import java.util.ArrayList;

public class Manager extends  Employee {
private ArrayList<Employee>  subordinates = new ArrayList<Employee>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        for(Employee employee: subordinates) {
            employee.print();
        }
    }

    @Override
    public void add(Employee employee) { subordinates.add(employee); }

    @Override
    public void remove(Employee employee) { subordinates.remove(employee); }
}
