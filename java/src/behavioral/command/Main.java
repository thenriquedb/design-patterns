package behavioral.command;

public class Main {
    public static void main(String[] args) {
     Calculator calculator = new Calculator(10);

     Invoker invoker = new Invoker();

        invoker.compute(new Sum(calculator,5));
        invoker.compute(new Sum(calculator,2));
        invoker.compute(new Sum(calculator,3));

        invoker.undo(2);
    }
}
