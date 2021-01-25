package structural.composite;

public class Main {
    public static void main(String[] args) {
        Manager regionalManager = new Manager("Michael Scott", 5000);
        Manager assistentRegionalManager = new Manager("Jimothy Halpert", 5000);

        Developer developer1 = new Developer("Stanley Hudson", 2500);
        Developer developer2 = new Developer("Kevin Malone", 2500);
        Developer developer3 = new Developer("Andy Bernad", 2500);
        Developer developer4 = new Developer("Pam Beesly", 2500);
        Developer developer5 = new Developer("Creed Bratton", 2500);
        Developer developer6 = new Developer("Kelly Kappor", 2500);


        System.out.println("Assistent Reginal Manager");
        assistentRegionalManager.add(developer2);
        assistentRegionalManager.add(developer5);
        assistentRegionalManager.add(developer4);

        assistentRegionalManager.print();

        System.out.println("-------------------------------------");
        System.out.println("Reginal Manager");

        regionalManager.add(developer1);
        regionalManager.add(developer2);
        regionalManager.add(developer3);
        regionalManager.add(developer4);
        regionalManager.add(developer5);
        regionalManager.add(developer6);
        regionalManager.add(assistentRegionalManager);
        regionalManager.print();



    }
}
