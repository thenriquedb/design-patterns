package creational.facade;

public class Main {
    public static void main(String[] args) {
        SubSystemFacade facade = new SubSystemFacade();

        /*
         * No facade
         *
         * SubSystem1 subSystem1;
         * SubSystem2 subSystem2;
         * SubSystem3 subSystem3;
         *
         *
         * subSystem1.print();
         * subSystem2.print();
         * subSystem3.print();
         *
         * subSystem1.print();
         * subSystem2.print();
         * subSystem3.print();
         */

        facade.methodA();
        facade.methodB();
    }
}
