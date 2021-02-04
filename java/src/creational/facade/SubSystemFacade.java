package creational.facade;

public class SubSystemFacade {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    public  SubSystemFacade() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
        this.subSystem3 = new SubSystem3();
    }

    public void methodA() {
        this.subSystem1.print();
        this.subSystem2.print();
        this.subSystem3.print();
    }

    public void methodB() {
        this.subSystem3.print();
        this.subSystem2.print();
        this.subSystem1.print();
    }
}
