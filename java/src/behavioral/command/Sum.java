package behavioral.command;

public class Sum implements Command {
    private Calculator calculator;
    private int number;

    public Sum(Calculator calculator, int number) {
        this.calculator = calculator;
        this.number = number;
    }

    @Override
    public void execute() {
        calculator.setValue(calculator.getValue() + number);
        System.out.println(calculator.getValue());
    }

    @Override
    public void undo() {
        calculator.setValue(calculator.getValue() - number);
        System.out.println(calculator.getValue());
    }
}
